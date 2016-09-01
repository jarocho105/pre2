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

import com.bydan.erp.inventario.util.AutoriConsepConstantesFunciones;
import com.bydan.erp.inventario.util.AutoriConsepParameterReturnGeneral;
//import com.bydan.erp.inventario.util.AutoriConsepParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.AutoriConsepBean;
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
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class AutoriConsepBeanSwingJInternalFrame extends AutoriConsepJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AutoriConsepBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AutoriConsep> autoriconsepValidator = new ClassValidator<AutoriConsep>(AutoriConsep.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AutoriConsep autoriconsep;	
	public AutoriConsep autoriconsepAux;
	public AutoriConsep autoriconsepAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AutoriConsep autoriconsepTotales;
	public Long idAutoriConsepActual;
	public Long iIdNuevoAutoriConsep=0L;
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

	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboTipoAutoriConsep="";

	public List<TipoAutoriConsep> tipoautoriconsepsForeignKey;

	public List<TipoAutoriConsep> gettipoautoriconsepsForeignKey() {
		return tipoautoriconsepsForeignKey;
	}

	public void settipoautoriconsepsForeignKey(List<TipoAutoriConsep> tipoautoriconsepsForeignKey) {
		this.tipoautoriconsepsForeignKey = tipoautoriconsepsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoAutoriConsep tipoautoriconsepForeignKey;

	public TipoAutoriConsep gettipoautoriconsepForeignKey() {
		return tipoautoriconsepForeignKey;
	}

	public void settipoautoriconsepForeignKey(TipoAutoriConsep tipoautoriconsepForeignKey) {
		this.tipoautoriconsepForeignKey = tipoautoriconsepForeignKey;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
	}
	
	

	public Boolean isTienePermisosDetalleAutoriConsep=false;

	public Boolean getIsTienePermisosDetalleAutoriConsep() {
		return isTienePermisosDetalleAutoriConsep;
	}

	public void setIsTienePermisosDetalleAutoriConsep(Boolean isTienePermisosDetalleAutoriConsep) {
		this.isTienePermisosDetalleAutoriConsep= isTienePermisosDetalleAutoriConsep;
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
	
	public Boolean isPermisoTodoAutoriConsep;
	public Boolean isPermisoNuevoAutoriConsep;
	public Boolean isPermisoActualizarAutoriConsep;
	public Boolean isPermisoActualizarOriginalAutoriConsep;
	public Boolean isPermisoEliminarAutoriConsep;
	public Boolean isPermisoGuardarCambiosAutoriConsep;
	public Boolean isPermisoConsultaAutoriConsep;
	public Boolean isPermisoBusquedaAutoriConsep;
	public Boolean isPermisoReporteAutoriConsep;
	public Boolean isPermisoPaginacionMedioAutoriConsep;
	public Boolean isPermisoPaginacionAltoAutoriConsep;
	public Boolean isPermisoPaginacionTodoAutoriConsep;
	public Boolean isPermisoCopiarAutoriConsep;
	public Boolean isPermisoVerFormAutoriConsep;
	public Boolean isPermisoDuplicarAutoriConsep;
	public Boolean isPermisoOrdenAutoriConsep;
	
	
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
	
	public AutoriConsepParameterReturnGeneral autoriconsepReturnGeneral;
	public AutoriConsepParameterReturnGeneral autoriconsepParameterGeneral;
	
	

	public DetalleAutoriConsepLogic detalleautoriconsepLogic=null;

	public DetalleAutoriConsepLogic getDetalleAutoriConsepLogic() {
		return detalleautoriconsepLogic;
	}

	public void setDetalleAutoriConsepLogic(DetalleAutoriConsepLogic detalleautoriconsepLogic) {
		this.detalleautoriconsepLogic = detalleautoriconsepLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAutoriConsep=false;
	public Boolean esParaAccionDesdeFormularioAutoriConsep=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AutoriConsepSessionBeanAdditional autoriconsepSessionBeanAdditional=null;
	
	public AutoriConsepSessionBeanAdditional getAutoriConsepSessionBeanAdditional() {
		return this.autoriconsepSessionBeanAdditional;
	}
	
	public void setAutoriConsepSessionBeanAdditional(AutoriConsepSessionBeanAdditional autoriconsepSessionBeanAdditional) {
		try {
			this.autoriconsepSessionBeanAdditional=autoriconsepSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AutoriConsepBeanSwingJInternalFrameAdditional autoriconsepBeanSwingJInternalFrameAdditional=null;
	//public class AutoriConsepBeanSwingJInternalFrame
	
	public AutoriConsepBeanSwingJInternalFrameAdditional getAutoriConsepBeanSwingJInternalFrameAdditional() {
		return this.autoriconsepBeanSwingJInternalFrameAdditional;
	}
	
	public void setAutoriConsepBeanSwingJInternalFrameAdditional(AutoriConsepBeanSwingJInternalFrameAdditional autoriconsepBeanSwingJInternalFrameAdditional) {
		try {
			this.autoriconsepBeanSwingJInternalFrameAdditional=autoriconsepBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AutoriConsepLogic autoriconsepLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AutoriConsep autoriconsepBean;
	public AutoriConsepConstantesFunciones autoriconsepConstantesFunciones;
	//public AutoriConsepParameterReturnGeneral autoriconsepReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public UsuarioLogic usuarioLogic;
	public ClienteLogic clienteLogic;
	public TipoAutoriConsepLogic tipoautoriconsepLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<AutoriConsep> autoriconseps;	
	//public List<AutoriConsep> autoriconsepsEliminados;
	//public List<AutoriConsep> autoriconsepsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAutoriConsep=false;
	public Boolean isVisibilidadCeldaDuplicarAutoriConsep=true;
	public Boolean isVisibilidadCeldaCopiarAutoriConsep=true;
	public Boolean isVisibilidadCeldaVerFormAutoriConsep=true;
	public Boolean isVisibilidadCeldaOrdenAutoriConsep=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAutoriConsep=false;
	public Boolean isVisibilidadCeldaModificarAutoriConsep=false;
	public Boolean isVisibilidadCeldaActualizarAutoriConsep=false;
	public Boolean isVisibilidadCeldaEliminarAutoriConsep=false;
	public Boolean isVisibilidadCeldaCancelarAutoriConsep=false;
	public Boolean isVisibilidadCeldaGuardarAutoriConsep=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAutoriConsep=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNumeroAutorizacion=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoAutoriConsep=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoAutoriConsep() {
		return this.iIdNuevoAutoriConsep;
	}

	public void setiIdNuevoAutoriConsep(Long iIdNuevoAutoriConsep) {
		this.iIdNuevoAutoriConsep = iIdNuevoAutoriConsep;
	}
	
	public Long getidAutoriConsepActual() {
		return this.idAutoriConsepActual;
	}

	public void setidAutoriConsepActual(Long idAutoriConsepActual) {
		this.idAutoriConsepActual = idAutoriConsepActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AutoriConsep getautoriconsep() {
		return this.autoriconsep;
	}

	public void setautoriconsep(AutoriConsep autoriconsep) {
		this.autoriconsep = autoriconsep;
	}
	
	public AutoriConsep getautoriconsepAux() {
		return this.autoriconsepAux;
	}

	public void setautoriconsepAux(AutoriConsep autoriconsepAux) {
		this.autoriconsepAux = autoriconsepAux;
	}				
	
	public AutoriConsep getautoriconsepAnterior() {
		return this.autoriconsepAnterior;
	}

	public void setautoriconsepAnterior(AutoriConsep autoriconsepAnterior) {
		this.autoriconsepAnterior = autoriconsepAnterior;
	}	
	
	public AutoriConsep getautoriconsepTotales() {
		return this.autoriconsepTotales;
	}

	public void setautoriconsepTotales(AutoriConsep autoriconsepTotales) {
		this.autoriconsepTotales = autoriconsepTotales;
	}	
	
	public AutoriConsep getautoriconsepBean() {
		return this.autoriconsepBean;
	}

	public void setautoriconsepBean(AutoriConsep autoriconsepBean) {
		this.autoriconsepBean = autoriconsepBean;
	}	
	
	public AutoriConsepParameterReturnGeneral getautoriconsepReturnGeneral() {
		return this.autoriconsepReturnGeneral;
	}

	public void setautoriconsepReturnGeneral(AutoriConsepParameterReturnGeneral autoriconsepReturnGeneral) {
		this.autoriconsepReturnGeneral = autoriconsepReturnGeneral;
	}	
	
	
	public String numero_autorizacionBusquedaPorNumeroAutorizacion="";

	public String getnumero_autorizacionBusquedaPorNumeroAutorizacion() {
		return this.numero_autorizacionBusquedaPorNumeroAutorizacion;
	}

	public void setnumero_autorizacionBusquedaPorNumeroAutorizacion(String numero_autorizacionBusquedaPorNumeroAutorizacion) {
		this.numero_autorizacionBusquedaPorNumeroAutorizacion = numero_autorizacionBusquedaPorNumeroAutorizacion;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
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

	public Long id_tipo_autori_consepFK_IdTipoAutoriConsep=-1L;

	public Long getid_tipo_autori_consepFK_IdTipoAutoriConsep() {
		return this.id_tipo_autori_consepFK_IdTipoAutoriConsep;
	}

	public void setid_tipo_autori_consepFK_IdTipoAutoriConsep(Long id_tipo_autori_consepFK_IdTipoAutoriConsep) {
		this.id_tipo_autori_consepFK_IdTipoAutoriConsep = id_tipo_autori_consepFK_IdTipoAutoriConsep;
	}

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AutoriConsepLogic getAutoriConsepLogic()	{		
		return autoriconsepLogic;
	}

	public void setAutoriConsepLogic(AutoriConsepLogic autoriconsepLogic) {
		this.autoriconsepLogic = autoriconsepLogic;
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
	
	public Boolean getIsEsNuevoAutoriConsep() {
		return isEsNuevoAutoriConsep;
	}

	public void setIsEsNuevoAutoriConsep(Boolean isEsNuevoAutoriConsep) {
		this.isEsNuevoAutoriConsep = isEsNuevoAutoriConsep;
	}

	public Boolean getEsParaAccionDesdeFormularioAutoriConsep() {
		return esParaAccionDesdeFormularioAutoriConsep;
	}
	
	public void setEsParaAccionDesdeFormularioAutoriConsep(Boolean esParaAccionDesdeFormularioAutoriConsep) {
		this.esParaAccionDesdeFormularioAutoriConsep = esParaAccionDesdeFormularioAutoriConsep;
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

			if(this.autoriconsepSessionBean==null) {
				this.autoriconsepSessionBean=new AutoriConsepSessionBean();
			}

			if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(autoriconsepSessionBean.getlidEmpresaActual());
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

	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.autoriconsepSessionBean==null) {
				this.autoriconsepSessionBean=new AutoriConsepSessionBean();
			}

			if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(autoriconsepSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.autoriconsepSessionBean==null) {
				this.autoriconsepSessionBean=new AutoriConsepSessionBean();
			}

			if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(autoriconsepSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

	public void cargarCombosTipoAutoriConsepsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoautoriconsepsForeignKey=new ArrayList<TipoAutoriConsep>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoAutoriConsepLogic tipoautoriconsepLogic=new TipoAutoriConsepLogic();

			//tipoautoriconsepLogic.getTipoAutoriConsepDataAccess().setIsForForeingKeyData(true);

			if(this.autoriconsepSessionBean==null) {
				this.autoriconsepSessionBean=new AutoriConsepSessionBean();
			}

			if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionTipoAutoriConsep()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoautoriconsepLogic.getTipoAutoriConsepDataAccess().setIsForForeingKeyData(true);

					tipoautoriconsepLogic.getTodosTipoAutoriConsepsWithConnection(sFinalQuery,new Pagination());

					this.tipoautoriconsepsForeignKey=tipoautoriconsepLogic.getTipoAutoriConseps();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoAutoriConsep(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoautoriconsepLogic.getEntityWithConnection(autoriconsepSessionBean.getlidTipoAutoriConsepActual());
					this.tipoautoriconsepsForeignKey.add(tipoautoriconsepLogic.getTipoAutoriConsep());
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

			if(this.autoriconsepSessionBean==null) {
				this.autoriconsepSessionBean=new AutoriConsepSessionBean();
			}

			if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(autoriconsepSessionBean.getlidEmpleadoActual());
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

					if(this.autoriconsep!=null) {
						this.autoriconsep.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
						this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAutoriConsep.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
						if(this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAutoriConsepGenerico)throws Exception
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
				jComboBoxid_empresaAutoriConsepGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAutoriConsepGenerico!=null && jComboBoxid_empresaAutoriConsepGenerico.getItemCount()>0) {
					jComboBoxid_empresaAutoriConsepGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.autoriconsep!=null) {
						this.autoriconsep.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
						this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioAutoriConsep.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
						if(this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.setSelectedIndex(0);
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

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioAutoriConsepGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioAutoriConsepGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioAutoriConsepGenerico!=null && jComboBoxid_usuarioAutoriConsepGenerico.getItemCount()>0) {
					jComboBoxid_usuarioAutoriConsepGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.autoriconsep!=null) {
						this.autoriconsep.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
						this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteAutoriConsep.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
						if(this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteAutoriConsep!=null) {
						jComboBoxid_clienteFK_IdClienteAutoriConsep.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteAutoriConsep!=null) {
							//jComboBoxid_clienteFK_IdClienteAutoriConsep.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteAutoriConsep.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteAutoriConsep.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteAutoriConsepGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteAutoriConsepGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteAutoriConsepGenerico!=null && jComboBoxid_clienteAutoriConsepGenerico.getItemCount()>0) {
					jComboBoxid_clienteAutoriConsepGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoAutoriConsepForeignKey(Long idTipoAutoriConsepSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoAutoriConsep  tipoautoriconsepTemp=null;

			for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepsForeignKey) {
				if(tipoautoriconsepAux.getId()!=null && tipoautoriconsepAux.getId().equals(idTipoAutoriConsepSeleccionado)) {
					tipoautoriconsepTemp=tipoautoriconsepAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoautoriconsepTemp!=null) {

					if(this.autoriconsep!=null) {
						this.autoriconsep.setTipoAutoriConsep(tipoautoriconsepTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
						this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.setSelectedItem(tipoautoriconsepTemp);
					}
				} else {
					//jComboBoxid_tipo_autori_consepAutoriConsep.setSelectedItem(tipoautoriconsepTemp);
					if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
						if(this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoAutoriConsep") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoautoriconsepTemp!=null && jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep!=null) {
						jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setSelectedItem(tipoautoriconsepTemp);
					} else {
						if(jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep!=null) {
							//jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setSelectedItem(tipoautoriconsepTemp);
							if(jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.getItemCount()>0) {
								jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setSelectedIndex(0);
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

	public String getActualTipoAutoriConsepForeignKeyDescripcion(Long idTipoAutoriConsepSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoAutoriConsep  tipoautoriconsepTemp=null;

			for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepsForeignKey) {
				if(tipoautoriconsepAux.getId()!=null && tipoautoriconsepAux.getId().equals(idTipoAutoriConsepSeleccionado)) {
					tipoautoriconsepTemp=tipoautoriconsepAux;
					break;
				}
			}


			sDescripcion=TipoAutoriConsepConstantesFunciones.getTipoAutoriConsepDescripcion(tipoautoriconsepTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoAutoriConsepForeignKeyGenerico(Long idTipoAutoriConsepSeleccionado,JComboBox jComboBoxid_tipo_autori_consepAutoriConsepGenerico)throws Exception
	{
		try
		{
			TipoAutoriConsep  tipoautoriconsepTemp=null;

			for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepsForeignKey) {
				if(tipoautoriconsepAux.getId()!=null && tipoautoriconsepAux.getId().equals(idTipoAutoriConsepSeleccionado)) {
					tipoautoriconsepTemp=tipoautoriconsepAux;
					break;
				}
			}

			if(tipoautoriconsepTemp!=null) {
				jComboBoxid_tipo_autori_consepAutoriConsepGenerico.setSelectedItem(tipoautoriconsepTemp);
			} else {
				if(jComboBoxid_tipo_autori_consepAutoriConsepGenerico!=null && jComboBoxid_tipo_autori_consepAutoriConsepGenerico.getItemCount()>0) {
					jComboBoxid_tipo_autori_consepAutoriConsepGenerico.setSelectedIndex(0);
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

					if(this.autoriconsep!=null) {
						this.autoriconsep.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
						this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoAutoriConsep.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
						if(this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoAutoriConsepGenerico)throws Exception
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
				jComboBoxid_empleadoAutoriConsepGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoAutoriConsepGenerico!=null && jComboBoxid_empleadoAutoriConsepGenerico.getItemCount()>0) {
					jComboBoxid_empleadoAutoriConsepGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AutoriConsep autoriconsep,JComboBox jComboBoxid_empresaAutoriConsepGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAutoriConsepGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAutoriConsepGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				autoriconsep.setid_empresa(empresaAux.getId());
				autoriconsep.setempresa_descripcion(AutoriConsepConstantesFunciones.getEmpresaDescripcion(empresaAux));
				autoriconsep.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(AutoriConsep autoriconsep,JComboBox jComboBoxid_usuarioAutoriConsepGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioAutoriConsepGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioAutoriConsepGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				autoriconsep.setid_usuario(usuarioAux.getId());
				autoriconsep.setusuario_descripcion(AutoriConsepConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				autoriconsep.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(AutoriConsep autoriconsep,JComboBox jComboBoxid_clienteAutoriConsepGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteAutoriConsepGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteAutoriConsepGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				autoriconsep.setid_cliente(clienteAux.getId());
				autoriconsep.setcliente_descripcion(AutoriConsepConstantesFunciones.getClienteDescripcion(clienteAux));
				autoriconsep.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoAutoriConsepForeignKey(AutoriConsep autoriconsep,JComboBox jComboBoxid_tipo_autori_consepAutoriConsepGenerico)throws Exception
	{
		try
		{
			TipoAutoriConsep  tipoautoriconsepAux=new TipoAutoriConsep();

			if(jComboBoxid_tipo_autori_consepAutoriConsepGenerico==null) {
				tipoautoriconsepAux=(TipoAutoriConsep)this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.getSelectedItem();
			} else {
				tipoautoriconsepAux=(TipoAutoriConsep)jComboBoxid_tipo_autori_consepAutoriConsepGenerico.getSelectedItem();
			}

			if(tipoautoriconsepAux!=null && tipoautoriconsepAux.getId()!=null) {
				autoriconsep.setid_tipo_autori_consep(tipoautoriconsepAux.getId());
				autoriconsep.settipoautoriconsep_descripcion(AutoriConsepConstantesFunciones.getTipoAutoriConsepDescripcion(tipoautoriconsepAux));
				autoriconsep.setTipoAutoriConsep(tipoautoriconsepAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(AutoriConsep autoriconsep,JComboBox jComboBoxid_empleadoAutoriConsepGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoAutoriConsepGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoAutoriConsepGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				autoriconsep.setid_empleado(empleadoAux.getId());
				autoriconsep.setempleado_descripcion(AutoriConsepConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				autoriconsep.setEmpleado(empleadoAux);			}
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

					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) { 
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriConsep!=null) { 
					}

					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) { 
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriConsep!=null) { 
					}

					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) { 
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriConsep!=null) { 
					}

					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteAutoriConsep.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteAutoriConsep.addItem(cliente);
							}
						}

						if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoAutoriConsepsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoAutoriConsep=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) { 
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.removeAllItems();

							for(TipoAutoriConsep tipoautoriconsep:this.tipoautoriconsepsForeignKey) {
								this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.addItem(tipoautoriconsep);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriConsep!=null) { 
					}

					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoAutoriConsep") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.removeAllItems();

							for(TipoAutoriConsep tipoautoriconsep:this.tipoautoriconsepsForeignKey) {
								this.jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.addItem(tipoautoriconsep);
							}
						}

						if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) { 
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriConsep!=null) { 
					}

					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.addItem(empleado);
							}
						}

						if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteAutoriConsep.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteAutoriConsep.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoAutoriConsepForeignKey(TipoAutoriConsep tipoautoriconsep,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.setSelectedItem(tipoautoriconsep);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setSelectedItem(tipoautoriconsep);
						} else {
							this.jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAutoriConsep() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AutoriConsepConstantesFunciones.refrescarForeignKeysDescripcionesAutoriConsep(this.autoriconsepLogic.getAutoriConseps());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AutoriConsepConstantesFunciones.refrescarForeignKeysDescripcionesAutoriConsep(this.autoriconseps);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoAutoriConsep.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//autoriconsepLogic.setAutoriConseps(this.autoriconseps);
			autoriconsepLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AutoriConsepParameterReturnGeneral getAutoriConsepParameterGeneral() {
		return this.autoriconsepParameterGeneral;
	}
	
	public void setAutoriConsepParameterGeneral(AutoriConsepParameterReturnGeneral autoriconsepParameterGeneral) {
		this.autoriconsepParameterGeneral = autoriconsepParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAutoriConsep() {
		return isPermisoTodoAutoriConsep;
	}

	public void setIsPermisoTodoAutoriConsep(Boolean isPermisoTodoAutoriConsep) {
		this.isPermisoTodoAutoriConsep = isPermisoTodoAutoriConsep;
	}

	public Boolean getIsPermisoNuevoAutoriConsep() {
		return isPermisoNuevoAutoriConsep;
	}

	public void setIsPermisoNuevoAutoriConsep(Boolean isPermisoNuevoAutoriConsep) {
		this.isPermisoNuevoAutoriConsep = isPermisoNuevoAutoriConsep;
	}

	public Boolean getIsPermisoActualizarAutoriConsep() {
		return isPermisoActualizarAutoriConsep;
	}

	public void setIsPermisoActualizarAutoriConsep(Boolean isPermisoActualizarAutoriConsep) {
		this.isPermisoActualizarAutoriConsep = isPermisoActualizarAutoriConsep;
	}

	public Boolean getIsPermisoEliminarAutoriConsep() {
		return isPermisoEliminarAutoriConsep;
	}

	public void setIsPermisoEliminarAutoriConsep(Boolean isPermisoEliminarAutoriConsep) {
		this.isPermisoEliminarAutoriConsep = isPermisoEliminarAutoriConsep;
	}

	public Boolean getIsPermisoGuardarCambiosAutoriConsep() {
		return isPermisoGuardarCambiosAutoriConsep;
	}

	public void setIsPermisoGuardarCambiosAutoriConsep(Boolean isPermisoGuardarCambiosAutoriConsep) {
		this.isPermisoGuardarCambiosAutoriConsep = isPermisoGuardarCambiosAutoriConsep;
	}
	
	public Boolean getIsPermisoConsultaAutoriConsep() {
		return isPermisoConsultaAutoriConsep;
	}

	public void setIsPermisoConsultaAutoriConsep(Boolean isPermisoConsultaAutoriConsep) {
		this.isPermisoConsultaAutoriConsep = isPermisoConsultaAutoriConsep;
	}

	public Boolean getIsPermisoBusquedaAutoriConsep() {
		return isPermisoBusquedaAutoriConsep;
	}

	public void setIsPermisoBusquedaAutoriConsep(Boolean isPermisoBusquedaAutoriConsep) {
		this.isPermisoBusquedaAutoriConsep = isPermisoBusquedaAutoriConsep;
	}

	public Boolean getIsPermisoReporteAutoriConsep() {
		return isPermisoReporteAutoriConsep;
	}

	public void setIsPermisoReporteAutoriConsep(Boolean isPermisoReporteAutoriConsep) {
		this.isPermisoReporteAutoriConsep = isPermisoReporteAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionMedioAutoriConsep() {
		return isPermisoPaginacionMedioAutoriConsep;
	}

	public void setIsPermisoPaginacionMedioAutoriConsep(Boolean isPermisoPaginacionMedioAutoriConsep) {
		this.isPermisoPaginacionMedioAutoriConsep = isPermisoPaginacionMedioAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionTodoAutoriConsep() {
		return isPermisoPaginacionTodoAutoriConsep;
	}

	public void setIsPermisoPaginacionTodoAutoriConsep(Boolean isPermisoPaginacionTodoAutoriConsep) {
		this.isPermisoPaginacionTodoAutoriConsep = isPermisoPaginacionTodoAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionAltoAutoriConsep() {
		return isPermisoPaginacionAltoAutoriConsep;
	}

	public void setIsPermisoPaginacionAltoAutoriConsep(Boolean isPermisoPaginacionAltoAutoriConsep) {
		this.isPermisoPaginacionAltoAutoriConsep = isPermisoPaginacionAltoAutoriConsep;
	}
	
	public Boolean getIsPermisoCopiarAutoriConsep() {
		return isPermisoCopiarAutoriConsep;
	}

	public void setIsPermisoCopiarAutoriConsep(Boolean isPermisoCopiarAutoriConsep) {
		this.isPermisoCopiarAutoriConsep = isPermisoCopiarAutoriConsep;
	}
	
	public Boolean getIsPermisoVerFormAutoriConsep() {
		return isPermisoVerFormAutoriConsep;
	}

	public void setIsPermisoVerFormAutoriConsep(Boolean isPermisoVerFormAutoriConsep) {
		this.isPermisoVerFormAutoriConsep = isPermisoVerFormAutoriConsep;
	}
	
	public Boolean getIsPermisoDuplicarAutoriConsep() {
		return isPermisoDuplicarAutoriConsep;
	}

	public void setIsPermisoDuplicarAutoriConsep(Boolean isPermisoDuplicarAutoriConsep) {
		this.isPermisoDuplicarAutoriConsep = isPermisoDuplicarAutoriConsep;
	}
	
	public Boolean getIsPermisoOrdenAutoriConsep() {
		return isPermisoOrdenAutoriConsep;
	}

	public void setIsPermisoOrdenAutoriConsep(Boolean isPermisoOrdenAutoriConsep) {
		this.isPermisoOrdenAutoriConsep = isPermisoOrdenAutoriConsep;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAutoriConsep() {
		return isVisibilidadCeldaNuevoAutoriConsep;
	}

	public void setIsVisibilidadCeldaNuevoAutoriConsep(Boolean isVisibilidadCeldaNuevoAutoriConsep) {
		this.isVisibilidadCeldaNuevoAutoriConsep = isVisibilidadCeldaNuevoAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAutoriConsep() {
		return isVisibilidadCeldaDuplicarAutoriConsep;
	}

	public void setIsVisibilidadCeldaDuplicarAutoriConsep(Boolean isVisibilidadCeldaDuplicarAutoriConsep) {
		this.isVisibilidadCeldaDuplicarAutoriConsep = isVisibilidadCeldaDuplicarAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAutoriConsep() {
		return isVisibilidadCeldaCopiarAutoriConsep;
	}

	public void setIsVisibilidadCeldaCopiarAutoriConsep(Boolean isVisibilidadCeldaCopiarAutoriConsep) {
		this.isVisibilidadCeldaCopiarAutoriConsep = isVisibilidadCeldaCopiarAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAutoriConsep() {
		return isVisibilidadCeldaVerFormAutoriConsep;
	}

	public void setIsVisibilidadCeldaVerFormAutoriConsep(Boolean isVisibilidadCeldaVerFormAutoriConsep) {
		this.isVisibilidadCeldaVerFormAutoriConsep = isVisibilidadCeldaVerFormAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAutoriConsep() {
		return isVisibilidadCeldaOrdenAutoriConsep;
	}

	public void setIsVisibilidadCeldaOrdenAutoriConsep(Boolean isVisibilidadCeldaOrdenAutoriConsep) {
		this.isVisibilidadCeldaOrdenAutoriConsep = isVisibilidadCeldaOrdenAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAutoriConsep() {
		return isVisibilidadCeldaNuevoRelacionesAutoriConsep;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAutoriConsep(Boolean isVisibilidadCeldaNuevoRelacionesAutoriConsep) {
		this.isVisibilidadCeldaNuevoRelacionesAutoriConsep = isVisibilidadCeldaNuevoRelacionesAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAutoriConsep() {
		return isVisibilidadCeldaModificarAutoriConsep;
	}

	public void setIsVisibilidadCeldaModificarAutoriConsep(Boolean isVisibilidadCeldaModificarAutoriConsep) {
		this.isVisibilidadCeldaModificarAutoriConsep = isVisibilidadCeldaModificarAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAutoriConsep() {
		return isVisibilidadCeldaActualizarAutoriConsep;
	}

	public void setIsVisibilidadCeldaActualizarAutoriConsep(Boolean isVisibilidadCeldaActualizarAutoriConsep) {
		this.isVisibilidadCeldaActualizarAutoriConsep = isVisibilidadCeldaActualizarAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaEliminarAutoriConsep() {
		return isVisibilidadCeldaEliminarAutoriConsep;
	}

	public void setIsVisibilidadCeldaEliminarAutoriConsep(Boolean isVisibilidadCeldaEliminarAutoriConsep) {
		this.isVisibilidadCeldaEliminarAutoriConsep = isVisibilidadCeldaEliminarAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaCancelarAutoriConsep() {
		return isVisibilidadCeldaCancelarAutoriConsep;
	}

	public void setIsVisibilidadCeldaCancelarAutoriConsep(Boolean isVisibilidadCeldaCancelarAutoriConsep) {
		this.isVisibilidadCeldaCancelarAutoriConsep = isVisibilidadCeldaCancelarAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaGuardarAutoriConsep() {
		return isVisibilidadCeldaGuardarAutoriConsep;
	}

	public void setIsVisibilidadCeldaGuardarAutoriConsep(Boolean isVisibilidadCeldaGuardarAutoriConsep) {
		this.isVisibilidadCeldaGuardarAutoriConsep = isVisibilidadCeldaGuardarAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAutoriConsep() {
		return isVisibilidadCeldaGuardarCambiosAutoriConsep;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAutoriConsep(Boolean isVisibilidadCeldaGuardarCambiosAutoriConsep) {
		this.isVisibilidadCeldaGuardarCambiosAutoriConsep = isVisibilidadCeldaGuardarCambiosAutoriConsep;
	}
		
	public AutoriConsepSessionBean getautoriconsepSessionBean() {
		return this.autoriconsepSessionBean;
	}
	
	public void setautoriconsepSessionBean(AutoriConsepSessionBean autoriconsepSessionBean) {
		this.autoriconsepSessionBean=autoriconsepSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNumeroAutorizacion() {
		return this.isVisibilidadBusquedaPorNumeroAutorizacion;
	}

	public void setisVisibilidadBusquedaPorNumeroAutorizacion(Boolean isVisibilidadBusquedaPorNumeroAutorizacion) {
		this.isVisibilidadBusquedaPorNumeroAutorizacion=isVisibilidadBusquedaPorNumeroAutorizacion;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
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

	public Boolean getisVisibilidadFK_IdTipoAutoriConsep() {
		return this.isVisibilidadFK_IdTipoAutoriConsep;
	}

	public void setisVisibilidadFK_IdTipoAutoriConsep(Boolean isVisibilidadFK_IdTipoAutoriConsep) {
		this.isVisibilidadFK_IdTipoAutoriConsep=isVisibilidadFK_IdTipoAutoriConsep;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(AutoriConsep autoriconsep)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(autoriconsep,null);
				this.setActualParaGuardarUsuarioForeignKey(autoriconsep,null);
				this.setActualParaGuardarClienteForeignKey(autoriconsep,null);
				this.setActualParaGuardarTipoAutoriConsepForeignKey(autoriconsep,null);
				this.setActualParaGuardarEmpleadoForeignKey(autoriconsep,null);
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
	
	public void bugActualizarReferenciaActual(AutoriConsep autoriconsep,AutoriConsep autoriconsepAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAutoriConsep(autoriconsep);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		autoriconsepAux.setId(autoriconsep.getId());
		autoriconsepAux.setVersionRow(autoriconsep.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAutoriConsep();
		
			int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = autoriconsepValidator.getInvalidValues(this.autoriconsep);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			autoriconsepLogic.setDatosCliente(datosCliente);
			autoriconsepLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				autoriconsepAux=new  AutoriConsep();
				
				autoriconsepAux.setIsNew(true);
				autoriconsepAux.setIsChanged(true);
				
				autoriconsepAux.setAutoriConsepOriginal(this.autoriconsep);
				
				autoriconsepAux.setId(this.autoriconsep.getId());	
				autoriconsepAux.setVersionRow(this.autoriconsep.getVersionRow());	
				autoriconsepAux.setid_empresa(this.autoriconsep.getid_empresa());	
				autoriconsepAux.setid_usuario(this.autoriconsep.getid_usuario());	
				autoriconsepAux.setes_empresa(this.autoriconsep.getes_empresa());	
				autoriconsepAux.setid_cliente(this.autoriconsep.getid_cliente());	
				autoriconsepAux.setnumero_autorizacion(this.autoriconsep.getnumero_autorizacion());	
				autoriconsepAux.setid_tipo_autori_consep(this.autoriconsep.getid_tipo_autori_consep());	
				autoriconsepAux.setid_empleado(this.autoriconsep.getid_empleado());	
				autoriconsepAux.setfecha_emision(this.autoriconsep.getfecha_emision());	
				autoriconsepAux.setfecha_vencimiento(this.autoriconsep.getfecha_vencimiento());	
				autoriconsepAux.setfecha_ultima(this.autoriconsep.getfecha_ultima());	
				autoriconsepAux.setfecha(this.autoriconsep.getfecha());	
				autoriconsepAux.setdescripcion(this.autoriconsep.getdescripcion());	
				autoriconsepAux.setnombre(this.autoriconsep.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.autoriconsepSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.autoriconsepSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(autoriconsepAux,autoriconsepLogic.getAutoriConseps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autoriconsepAux,autoriconseps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.autoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.autoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepLogic.saveAutoriConseps();//WithConnection
						//autoriconsepLogic.getSetVersionRowAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.autoriconsep,autoriconsepAux);
					
					this.refrescarForeignKeysDescripcionesAutoriConsep();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.autoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps().addAll(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconseps.addAll(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								autoriconsepLogic.saveAutoriConsepRelaciones(autoriconsepAux,this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps());//WithConnection
								//autoriconsepLogic.getSetVersionRowAutoriConseps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.autoriconsep,autoriconsepAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.setDetalleAutoriConseps(new ArrayList<DetalleAutoriConsep>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconseps= new ArrayList<DetalleAutoriConsep>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.quitarFilaTotales();}
							autoriconsepAux.setDetalleAutoriConseps(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.autoriconsepSessionBean.getEstaModoGuardarRelaciones() 
									|| this.autoriconsepSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(autoriconsepAux,autoriconsepLogic.getAutoriConseps());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(autoriconsepAux,autoriconseps);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.autoriconsep,autoriconsepAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				autoriconsepAux=new  AutoriConsep();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.autoriconsepSessionBean.getEsGuardarRelacionado() 
					|| (this.autoriconsepSessionBean.getEsGuardarRelacionado() && this.autoriconsep.getId()>=0)) {
						
					autoriconsepAux.setIsNew(false);
				}
				
				autoriconsepAux.setIsDeleted(false);
			
				autoriconsepAux.setId(this.autoriconsep.getId());	
				autoriconsepAux.setVersionRow(this.autoriconsep.getVersionRow());	
				autoriconsepAux.setid_empresa(this.autoriconsep.getid_empresa());	
				autoriconsepAux.setid_usuario(this.autoriconsep.getid_usuario());	
				autoriconsepAux.setes_empresa(this.autoriconsep.getes_empresa());	
				autoriconsepAux.setid_cliente(this.autoriconsep.getid_cliente());	
				autoriconsepAux.setnumero_autorizacion(this.autoriconsep.getnumero_autorizacion());	
				autoriconsepAux.setid_tipo_autori_consep(this.autoriconsep.getid_tipo_autori_consep());	
				autoriconsepAux.setid_empleado(this.autoriconsep.getid_empleado());	
				autoriconsepAux.setfecha_emision(this.autoriconsep.getfecha_emision());	
				autoriconsepAux.setfecha_vencimiento(this.autoriconsep.getfecha_vencimiento());	
				autoriconsepAux.setfecha_ultima(this.autoriconsep.getfecha_ultima());	
				autoriconsepAux.setfecha(this.autoriconsep.getfecha());	
				autoriconsepAux.setdescripcion(this.autoriconsep.getdescripcion());	
				autoriconsepAux.setnombre(this.autoriconsep.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(autoriconsepAux,autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autoriconsepAux,autoriconseps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.autoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.autoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepLogic.saveAutoriConseps();//WithConnection
						//autoriconsepLogic.getSetVersionRowAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.autoriconsep,autoriconsepAux);
					
					this.refrescarForeignKeysDescripcionesAutoriConsep();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.autoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps().addAll(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconseps.addAll(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								autoriconsepLogic.saveAutoriConsepRelaciones(autoriconsepAux,this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps());//WithConnection
								//autoriconsepLogic.getSetVersionRowAutoriConseps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.autoriconsep,autoriconsepAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.setDetalleAutoriConseps(new ArrayList<DetalleAutoriConsep>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconseps= new ArrayList<DetalleAutoriConsep>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.quitarFilaTotales();}
							autoriconsepAux.setDetalleAutoriConseps(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.autoriconsepSessionBean.getEstaModoGuardarRelaciones() 
									|| this.autoriconsepSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(autoriconsepAux,autoriconsepLogic.getAutoriConseps());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(autoriconsepAux,autoriconseps);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.autoriconsep,autoriconsepAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				autoriconsepAux=new  AutoriConsep();
				
				autoriconsepAux.setIsNew(false);
				autoriconsepAux.setIsChanged(false);
				
				autoriconsepAux.setIsDeleted(true);
				
				autoriconsepAux.setId(this.autoriconsep.getId());	
				autoriconsepAux.setVersionRow(this.autoriconsep.getVersionRow());	
				autoriconsepAux.setid_empresa(this.autoriconsep.getid_empresa());	
				autoriconsepAux.setid_usuario(this.autoriconsep.getid_usuario());	
				autoriconsepAux.setes_empresa(this.autoriconsep.getes_empresa());	
				autoriconsepAux.setid_cliente(this.autoriconsep.getid_cliente());	
				autoriconsepAux.setnumero_autorizacion(this.autoriconsep.getnumero_autorizacion());	
				autoriconsepAux.setid_tipo_autori_consep(this.autoriconsep.getid_tipo_autori_consep());	
				autoriconsepAux.setid_empleado(this.autoriconsep.getid_empleado());	
				autoriconsepAux.setfecha_emision(this.autoriconsep.getfecha_emision());	
				autoriconsepAux.setfecha_vencimiento(this.autoriconsep.getfecha_vencimiento());	
				autoriconsepAux.setfecha_ultima(this.autoriconsep.getfecha_ultima());	
				autoriconsepAux.setfecha(this.autoriconsep.getfecha());	
				autoriconsepAux.setdescripcion(this.autoriconsep.getdescripcion());	
				autoriconsepAux.setnombre(this.autoriconsep.getnombre());	
				
				if(this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.autoriconsepAux.getId()>=0) {	
						this.autoriconsepsEliminados.add(autoriconsepAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(autoriconsepAux,autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autoriconsepAux,autoriconseps);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.autoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.autoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepLogic.saveAutoriConseps();//WithConnection
						//autoriconsepLogic.getSetVersionRowAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.autoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps().addAll(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconseps.addAll(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								autoriconsepLogic.saveAutoriConsepRelaciones(autoriconsepAux,this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps());//WithConnection
								//autoriconsepLogic.getSetVersionRowAutoriConseps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.setDetalleAutoriConseps(new ArrayList<DetalleAutoriConsep>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconseps= new ArrayList<DetalleAutoriConsep>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.quitarFilaTotales();}
							autoriconsepAux.setDetalleAutoriConseps(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.autoriconsepSessionBean.getEstaModoGuardarRelaciones() 
								|| this.autoriconsepSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(autoriconsepAux,autoriconsepLogic.getAutoriConseps());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(autoriconsepAux,autoriconseps);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getAutoriConseps().addAll(this.autoriconsepsEliminados);
					
					autoriconsepLogic.saveAutoriConseps();//WithConnection
					//autoriconsepLogic.getSetVersionRowAutoriConseps();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAutoriConsep();
				
				this.autoriconsepsEliminados= new ArrayList<AutoriConsep>();		
			}
			
			if(this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Autorizaciones Consep GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Autorizaciones Consep",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.autoriconsep=autoriconsepAux;
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
      		//this.finishProcessAutoriConsep();
      	}
		
	}	
	
	public void actualizarRelaciones(AutoriConsep autoriconsepLocal) throws Exception {
		
		if(this.autoriconsepSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				autoriconsepLocal.setDetalleAutoriConseps(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps());
			
			} else {
			
				autoriconsepLocal.setDetalleAutoriConseps(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconseps);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AutoriConsep autoriconsepLocal) throws Exception {	
		if(this.autoriconsepSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				autoriconsepLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				autoriconsepLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				autoriconsepLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoAutoriConsepDetalleFormJInternalFrame.class)) {
				TipoAutoriConsepBeanSwingJInternalFrame tipoautoriconsepBeanSwingJInternalFrameLocal=(TipoAutoriConsepBeanSwingJInternalFrame) ((TipoAutoriConsepDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoautoriconsepBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoAutoriConsep(tipoautoriconsepBeanSwingJInternalFrameLocal.gettipoautoriconsep(),true);
				tipoautoriconsepBeanSwingJInternalFrameLocal.actualizarLista(tipoautoriconsepBeanSwingJInternalFrameLocal.tipoautoriconsep,this.tipoautoriconsepsForeignKey);

				tipoautoriconsepBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoautoriconsepBeanSwingJInternalFrameLocal.tipoautoriconsep);

				autoriconsepLocal.setTipoAutoriConsep(tipoautoriconsepBeanSwingJInternalFrameLocal.tipoautoriconsep);

				this.addItemDefectoCombosForeignKeyTipoAutoriConsep();
				this.cargarCombosFrameTipoAutoriConsepsForeignKey("Formulario");
				this.setActualTipoAutoriConsepForeignKey(tipoautoriconsepBeanSwingJInternalFrameLocal.tipoautoriconsep.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				autoriconsepLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAutoriConsepActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = autoriconsepValidator.getInvalidValues(this.autoriconsep);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AutoriConsep autoriconsep,List<AutoriConsep> autoriconseps) throws Exception {
		try	{		
			AutoriConsepConstantesFunciones.actualizarLista(autoriconsep,autoriconseps,this.autoriconsepSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(AutoriConsep autoriconsep,List<AutoriConsep> autoriconseps) throws Exception {
		try	{			
			AutoriConsepConstantesFunciones.actualizarSelectedLista(autoriconsep,autoriconseps);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AutoriConsep> autoriconsepsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				autoriconsepsLocal=this.autoriconsepLogic.getAutoriConseps();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				autoriconsepsLocal=this.autoriconseps;
			}
			//ARCHITECTURE
		
			for(AutoriConsep autoriconsepLocal:autoriconsepsLocal) {
				if(this.permiteMantenimiento(autoriconsepLocal) && autoriconsepLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AutoriConsepConstantesFunciones.getAutoriConsepLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelid_empresaAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelid_usuarioAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.ESEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabeles_empresaAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelid_clienteAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.NUMEROAUTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelnumero_autorizacionAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.IDTIPOAUTORICONSEP)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelid_tipo_autori_consepAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelid_empleadoAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelfecha_emisionAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelfecha_vencimientoAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.FECHAULTIMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelfecha_ultimaAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelfechaAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabeldescripcionAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriConsepConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelnombreAutoriConsep,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelid_empresaAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelid_usuarioAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabeles_empresaAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelid_clienteAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelnumero_autorizacionAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelid_tipo_autori_consepAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelid_empleadoAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelfecha_emisionAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelfecha_vencimientoAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelfecha_ultimaAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelfechaAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabeldescripcionAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriConsep.jLabelnombreAutoriConsep,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleAutoriConsep")) {
			if(this.autoriconsep==null) {
				this.autoriconsep= new AutoriConsep();
			}

			if(this.autoriconsepSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoAutoriConsep
				this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);

				this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.getdetalleautoriconsep().setAutoriConsep(this.autoriconsep);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoAutoriConsep--;	
		
		
		this.autoriconsepAux=new AutoriConsep();
		
		this.autoriconsepAux.setId(this.iIdNuevoAutoriConsep);
		this.autoriconsepAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.autoriconsepLogic.getAutoriConseps().add(this.autoriconsepAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.autoriconseps.add(this.autoriconsepAux);
		}
		//ARCHITECTURE
		
		this.autoriconsep=this.autoriconsepAux;
		
		if(AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAutoriConsep(this.autoriconsep);
			this.setVariablesObjetoActualToFormularioForeignKeyAutoriConsep(this.autoriconsep);
		}
				
		//this.setDefaultControlesAutoriConsep();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAutoriConsep();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAutoriConsep();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAutoriConsep();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAutoriConsep(this.autoriconsepBean,this.autoriconsep,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AutoriConsepConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.autoriconsepSessionBean.getConGuardarRelaciones()) {
			classes=AutoriConsepConstantesFunciones.getClassesRelationshipsOfAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.autoriconsepReturnGeneral=autoriconsepLogic.procesarEventosAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autoriconsepLogic.getAutoriConseps(),this.autoriconsep,this.autoriconsepParameterGeneral,this.isEsNuevoAutoriConsep,classes);//this.autoriconsepLogic.getAutoriConsep()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAutoriConsep(this.autoriconsepReturnGeneral,this.autoriconsepBean,false);
		
		if(this.autoriconsepReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAutoriConsep(this.autoriconsepReturnGeneral.getAutoriConsep());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAutoriConsep(this.autoriconsepReturnGeneral.getAutoriConsep());
		}
		
		if(this.autoriconsepReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAutoriConsep(this.autoriconsepReturnGeneral.getAutoriConsep(),classes);//this.autoriconsepBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAutoriConsep();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAutoriConsep();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AutoriConsepBeanSwingJInternalFrameAdditional.RecargarFormAutoriConsep(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAutoriConsep(false);
						
			if(autoriconsepSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepSessionBean.getEsGuardarRelacionado() && DetalleAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleAutoriConsepActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutoriConsep();
			}
			
			this.actualizarVisualTableDatosAutoriConsep();
			
			this.jTableDatosAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoAutoriConsep(), this.getIndiceNuevoAutoriConsep());
			
			this.seleccionarFilaTablaAutoriConsepActual();
						
			this.actualizarEstadoCeldasBotonesAutoriConsep("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAutoriConsep(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxes_empresaAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activares_empresaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnumero_autorizacionAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarnumero_autorizacionAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_emisionAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarfecha_emisionAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_vencimientoAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarfecha_vencimientoAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_ultimaAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarfecha_ultimaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfechaAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarfechaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jTextAreadescripcionAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activardescripcionAutoriConsep);//
		this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnombreAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarnombreAutoriConsep);	
		//
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarid_empresaAutoriConsep);//
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarid_usuarioAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarid_clienteAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarid_tipo_autori_consepAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.setEnabled(isHabilitar && this.autoriconsepConstantesFunciones.activarid_empleadoAutoriConsep);
	};
	
	public void setDefaultControlesAutoriConsep() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAutoriConsep(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.autoriconsepSessionBean.setConGuardarRelaciones(true);			
			this.autoriconsepSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAutoriConsep.jTabbedPaneRelacionesAutoriConsep.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.autoriconsepSessionBean.setConGuardarRelaciones(false);			
			this.autoriconsepSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAutoriConsep.jTabbedPaneRelacionesAutoriConsep.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoAutoriConsep() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriConsep autoriconsepAux:this.autoriconsepLogic.getAutoriConseps()) {
				if(autoriconsepAux.getId().equals(this.iIdNuevoAutoriConsep)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriConsep autoriconsepAux:this.autoriconseps) {
				if(autoriconsepAux.getId().equals(this.iIdNuevoAutoriConsep)) {
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
	
	public int getIndiceActualAutoriConsep(AutoriConsep autoriconsep,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriConsep autoriconsepAux:this.autoriconsepLogic.getAutoriConseps()) {
				if(autoriconsepAux.getId().equals(autoriconsep.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriConsep autoriconsepAux:this.autoriconseps) {
				if(autoriconsepAux.getId().equals(autoriconsep.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAutoriConsep(AutoriConsep autoriconsepOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriConsep autoriconsepAux:this.autoriconsepLogic.getAutoriConseps()) {
				if(autoriconsepAux.getAutoriConsepOriginal().getId().equals(autoriconsepOriginal.getId())) {
					existe=true;
					autoriconsepOriginal.setId(autoriconsepAux.getId());
					autoriconsepOriginal.setVersionRow(autoriconsepAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriConsep autoriconsepAux:this.autoriconseps) {
				if(autoriconsepAux.getAutoriConsepOriginal().getId().equals(autoriconsepOriginal.getId())) {
					existe=true;
					autoriconsepOriginal.setId(autoriconsepAux.getId());
					autoriconsepOriginal.setVersionRow(autoriconsepAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAutoriConsep(Boolean esParaCancelar) throws Exception {
		autoriconsepsAux=new ArrayList<AutoriConsep>();
		autoriconsepAux=new AutoriConsep();
		
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AutoriConsep autoriconsepAux:this.autoriconsepLogic.getAutoriConseps()) {
					if(autoriconsepAux.getId()<0) {
						autoriconsepsAux.add(autoriconsepAux);
					}		
				}
				this.iIdNuevoAutoriConsep=0L;
				this.autoriconsepLogic.getAutoriConseps().removeAll(autoriconsepsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriConsep autoriconsepAux:this.autoriconseps) {
					if(autoriconsepAux.getId()<0) {
						autoriconsepsAux.add(autoriconsepAux);
					}		
				}
				this.iIdNuevoAutoriConsep=0L;
				this.autoriconseps.removeAll(autoriconsepsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAutoriConsep 
					&& this.autoriconsepLogic.getAutoriConseps().size()>0
					) {
					autoriconsepAux=this.autoriconsepLogic.getAutoriConseps().get(this.autoriconsepLogic.getAutoriConseps().size() - 1);
				
					if(autoriconsepAux.getId()<0) {
						this.autoriconsepLogic.getAutoriConseps().remove(autoriconsepAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAutoriConsep && this.autoriconseps.size()>0) {
					autoriconsepAux=this.autoriconseps.get(this.autoriconseps.size() - 1);
				
					if(autoriconsepAux.getId()<0) {
						this.autoriconseps.remove(autoriconsepAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAutoriConsep(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(autoriconsep.getId()<0) {
				this.autoriconsepLogic.getAutoriConseps().remove(this.autoriconsep);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(autoriconsep.getId()<0) {
				this.autoriconseps.remove(this.autoriconsep);
			}
		}			
	}
	
	public void setEstadosInicialesAutoriConsep(List<AutoriConsep> autoriconsepsAux) throws Exception {
		AutoriConsepConstantesFunciones.setEstadosInicialesAutoriConsep(autoriconsepsAux);
	}
	
	public void setEstadosInicialesAutoriConsep(AutoriConsep autoriconsepAux) throws Exception {
		AutoriConsepConstantesFunciones.setEstadosInicialesAutoriConsep(autoriconsepAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAutoriConsepActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAutoriConsepActual()) {
				if(!this.isEsNuevoAutoriConsep) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAutoriConsep=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAutoriConsepActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Autorizaciones Consep ?", "MANTENIMIENTO DE Autorizaciones Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AutoriConsep autoriconsep) throws Exception {
		AutoriConsepConstantesFunciones.seleccionarAsignar(this.autoriconsep,autoriconsep);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAutoriConsep=this.isPermisoActualizarOriginalAutoriConsep;
			
			
			this.seleccionarAsignar(autoriconsep);
			
			

			idClienteActual=autoriconsep.getid_cliente();
			this.seleccionarClienteActual();

			idEmpleadoActual=autoriconsep.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AutoriConsepConstantesFunciones.quitarEspaciosAutoriConsep(this.autoriconsep,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.autoriconsepSessionBean.setsFuncionBusquedaRapida(this.autoriconsepSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
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
			if(this.isEsNuevoAutoriConsep) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAutoriConsep(esParaCancelar);				
				this.cancelarNuevoAutoriConsep(esParaCancelar);								
			}
			
			this.autoriconsep=new AutoriConsep();
			
			this.inicializarAutoriConsep();
			
			this.actualizarEstadoCeldasBotonesAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAutoriConsep() throws Exception {
		try {
			AutoriConsepConstantesFunciones.inicializarAutoriConsep(this.autoriconsep);
			
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
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.autoriconsepLogic.getAutoriConseps().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAutoriConseps(String sAccionBusqueda,List<AutoriConsep> autoriconsepsParaReportes) throws Exception {
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
					sPathReporteFinal="AutoriConsep"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AutoriConsepMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AutoriConsepMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AutoriConsep"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Autorizaciones Consepes");		
		parameters.put("busquedapor", AutoriConsepConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleAutoriConsep.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					AutoriConsepLogic autoriconsepLogicAuxiliar=new AutoriConsepLogic();
					autoriconsepLogicAuxiliar.setDatosCliente(autoriconsepLogic.getDatosCliente());				
					autoriconsepLogicAuxiliar.setAutoriConseps(autoriconsepsParaReportes);
					
					autoriconsepLogicAuxiliar.cargarRelacionesLoteForeignKeyAutoriConsepWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					autoriconsepsParaReportes=autoriconsepLogicAuxiliar.getAutoriConseps();
					
					//autoriconsepLogic.getNewConnexionToDeep();
					
					//for (AutoriConsep autoriconsep:autoriconsepsParaReportes) {
					//	autoriconsepLogic.deepLoad(autoriconsep, false, DeepLoadType.INCLUDE, classes);
					//}						
					//autoriconsepLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//autoriconsepLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleAutoriConsep = AuxiliarReportes.class.getResourceAsStream("DetalleAutoriConsepDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleautoriconsep", reportFileDetalleAutoriConsep);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAutoriConsep=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAutoriConsep=new JRBeanArrayDataSource(AutoriConsepJInternalFrame.TraerAutoriConsepBeans(autoriconsepsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAutoriConsep);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AutoriConsepConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AutoriConsepConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AutoriConsepBean.TraerAutoriConsepBeans(autoriconsepsParaReportes).toArray()));
							
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
				this.generarExcelReporteAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,autoriconsepsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,autoriconsepsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAutoriConsepActionPerformed(null);
					//this.generarExcelReporteAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,autoriconsepsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,autoriconsepsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,autoriconsepsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,autoriconsepsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<AutoriConsep> autoriconsepsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriconsep";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutoriConseps");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAutoriConsep("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AutoriConsep autoriconsep : autoriconsepsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AutoriConsepConstantesFunciones.generarExcelReporteDataAutoriConsep("NORMAL",row,workbook,autoriconsep,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAutoriConsep(String sTipo,Row row,Workbook workbook) {
		
		AutoriConsepConstantesFunciones.generarExcelReporteHeaderAutoriConsep(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<AutoriConsep> autoriconsepsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriconsep_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutoriConseps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AutoriConsep autoriconsep : autoriconsepsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AutoriConsepConstantesFunciones.getAutoriConsepDescripcion(autoriconsep));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_ESEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_ESEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(autoriconsep.getes_empresa()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getnumero_autorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.gettipoautoriconsep_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getfecha_ultima());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriConsepConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriconsep.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<AutoriConsep> autoriconsepsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AutoriConsep> autoriconsepsRespaldo=null;
		
		classes=AutoriConsepConstantesFunciones.getClassesRelationshipsOfAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.autoriconsepLogic.setDatosCliente(this.datosCliente);
		this.autoriconsepLogic.setDatosDeep(this.datosDeep);
		this.autoriconsepLogic.setIsConDeep(true);
		
		autoriconsepsRespaldo=this.autoriconsepLogic.getAutoriConseps();
		
		this.autoriconsepLogic.setAutoriConseps(autoriconsepsParaReportes);	
		this.autoriconsepLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		autoriconsepsParaReportes=this.autoriconsepLogic.getAutoriConseps();
		this.autoriconsepLogic.setAutoriConseps(autoriconsepsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriconsep_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutoriConseps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAutoriConsep("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AutoriConsep autoriconsep : autoriconsepsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAutoriConsep("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AutoriConsepConstantesFunciones.generarExcelReporteDataAutoriConsep("NORMAL",row,workbook,autoriconsep,cellStyleDataAux);
		
			
			


				//DetalleAutoriConsep
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO))) {

				if(autoriconsep.getDetalleAutoriConseps()!=null && autoriconsep.getDetalleAutoriConseps().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleAutoriConsepConstantesFunciones.generarExcelReporteHeaderDetalleAutoriConsep("RELACIONADO",row,workbook);
				}

				if(autoriconsep.getDetalleAutoriConseps()!=null) {
					i2=0;
					for(DetalleAutoriConsep detalleautoriconsep : autoriconsep.getDetalleAutoriConseps()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleAutoriConsepConstantesFunciones.generarExcelReporteDataDetalleAutoriConsep("RELACIONADO",row,workbook,detalleautoriconsep,cellStyleDataAuxHijo);
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
		cell.setCellValue(AutoriConsepConstantesFunciones.getAutoriConsepDescripcion(autoriconsep));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAutoriConsep.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAutoriConsep() throws Exception {		
		this.startProcessAutoriConsep(true);
	}
	
	public void startProcessAutoriConsep(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAutoriConsep ,this.jPanelParametrosReportesAutoriConsep, this.jScrollPanelDatosAutoriConsep,this.jPanelPaginacionAutoriConsep, this.jScrollPanelDatosEdicionAutoriConsep, this.jPanelAccionesAutoriConsep,this.jPanelAccionesFormularioAutoriConsep,this.jmenuBarAutoriConsep,this.jmenuBarDetalleAutoriConsep,this.jTtoolBarAutoriConsep,this.jTtoolBarDetalleAutoriConsep);		
		
		final JTabbedPane jTabbedPaneBusquedasAutoriConsep=this.jTabbedPaneBusquedasAutoriConsep; 
		
		final JPanel jPanelParametrosReportesAutoriConsep=this.jPanelParametrosReportesAutoriConsep;
		//final JScrollPane jScrollPanelDatosAutoriConsep=this.jScrollPanelDatosAutoriConsep;
		final JTable jTableDatosAutoriConsep=this.jTableDatosAutoriConsep;		
		final JPanel jPanelPaginacionAutoriConsep=this.jPanelPaginacionAutoriConsep;
		//final JScrollPane jScrollPanelDatosEdicionAutoriConsep=this.jScrollPanelDatosEdicionAutoriConsep;
		final JPanel jPanelAccionesAutoriConsep=this.jPanelAccionesAutoriConsep;
		
		JPanel jPanelCamposAuxiliarAutoriConsep=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAutoriConsep=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			jPanelCamposAuxiliarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jPanelCamposAutoriConsep;
			jPanelAccionesFormularioAuxiliarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jPanelAccionesFormularioAutoriConsep;
		}
		
		final JPanel jPanelCamposAutoriConsep=jPanelCamposAuxiliarAutoriConsep;
		final JPanel jPanelAccionesFormularioAutoriConsep=jPanelAccionesFormularioAuxiliarAutoriConsep;
		
		
		final JMenuBar jmenuBarAutoriConsep=this.jmenuBarAutoriConsep;
		final JToolBar jTtoolBarAutoriConsep=this.jTtoolBarAutoriConsep;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAutoriConsep=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAutoriConsep=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			jmenuBarDetalleAuxiliarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jmenuBarDetalleAutoriConsep;
			jTtoolBarDetalleAuxiliarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jTtoolBarDetalleAutoriConsep;
		}
		
		final JMenuBar jmenuBarDetalleAutoriConsep=jmenuBarDetalleAuxiliarAutoriConsep;
		final JToolBar jTtoolBarDetalleAutoriConsep=jTtoolBarDetalleAuxiliarAutoriConsep;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAutoriConsep;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAutoriConsep;
			processRunnable.jTableDatos=jTableDatosAutoriConsep;
			processRunnable.jPanelCampos=jPanelCamposAutoriConsep;
			processRunnable.jPanelPaginacion=jPanelPaginacionAutoriConsep;
			processRunnable.jPanelAcciones=jPanelAccionesAutoriConsep;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAutoriConsep;
			
			
			processRunnable.jmenuBar=jmenuBarAutoriConsep;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAutoriConsep;
			processRunnable.jTtoolBar=jTtoolBarAutoriConsep;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAutoriConsep;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAutoriConsep ,jPanelParametrosReportesAutoriConsep,jTableDatosAutoriConsep, /*jScrollPanelDatosAutoriConsep,*/jPanelCamposAutoriConsep,jPanelPaginacionAutoriConsep, /*jScrollPanelDatosEdicionAutoriConsep,*/ jPanelAccionesAutoriConsep,jPanelAccionesFormularioAutoriConsep,jmenuBarAutoriConsep,jmenuBarDetalleAutoriConsep,jTtoolBarAutoriConsep,jTtoolBarDetalleAutoriConsep);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAutoriConsep ,jPanelParametrosReportesAutoriConsep, jScrollPanelDatosAutoriConsep,jPanelPaginacionAutoriConsep, jScrollPanelDatosEdicionAutoriConsep, jPanelAccionesAutoriConsep,jPanelAccionesFormularioAutoriConsep,jmenuBarAutoriConsep,jmenuBarDetalleAutoriConsep,jTtoolBarAutoriConsep,jTtoolBarDetalleAutoriConsep);
						
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
	
	public void finishProcessAutoriConsep() {// throws Exception 
		this.finishProcessAutoriConsep(true);
	}
	
	public void finishProcessAutoriConsep(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAutoriConsep ,this.jPanelParametrosReportesAutoriConsep, this.jScrollPanelDatosAutoriConsep,this.jPanelPaginacionAutoriConsep, this.jScrollPanelDatosEdicionAutoriConsep, this.jPanelAccionesAutoriConsep,this.jPanelAccionesFormularioAutoriConsep,this.jmenuBarAutoriConsep,this.jmenuBarDetalleAutoriConsep,this.jTtoolBarAutoriConsep,this.jTtoolBarDetalleAutoriConsep);		
		
		final JTabbedPane jTabbedPaneBusquedasAutoriConsep=this.jTabbedPaneBusquedasAutoriConsep; 
		
		final JPanel jPanelParametrosReportesAutoriConsep=this.jPanelParametrosReportesAutoriConsep;
		//final JScrollPane jScrollPanelDatosAutoriConsep=this.jScrollPanelDatosAutoriConsep;
		final JTable jTableDatosAutoriConsep=this.jTableDatosAutoriConsep;		
		final JPanel jPanelPaginacionAutoriConsep=this.jPanelPaginacionAutoriConsep;
		//final JScrollPane jScrollPanelDatosEdicionAutoriConsep=this.jScrollPanelDatosEdicionAutoriConsep;
		final JPanel jPanelAccionesAutoriConsep=this.jPanelAccionesAutoriConsep;
		
		JPanel jPanelCamposAuxiliarAutoriConsep=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAutoriConsep=new JPanel();
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			jPanelCamposAuxiliarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jPanelCamposAutoriConsep;
			jPanelAccionesFormularioAuxiliarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jPanelAccionesFormularioAutoriConsep;
		}
		
		final JPanel jPanelCamposAutoriConsep=jPanelCamposAuxiliarAutoriConsep;
		final JPanel jPanelAccionesFormularioAutoriConsep=jPanelAccionesFormularioAuxiliarAutoriConsep;
		
		
		final JMenuBar jmenuBarAutoriConsep=this.jmenuBarAutoriConsep;		
		final JToolBar jTtoolBarAutoriConsep=this.jTtoolBarAutoriConsep;
				
		JMenuBar jmenuBarDetalleAuxiliarAutoriConsep=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAutoriConsep=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			jmenuBarDetalleAuxiliarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jmenuBarDetalleAutoriConsep;
			jTtoolBarDetalleAuxiliarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jTtoolBarDetalleAutoriConsep;		
		}
		
		final JMenuBar jmenuBarDetalleAutoriConsep=jmenuBarDetalleAuxiliarAutoriConsep;
		final JToolBar jTtoolBarDetalleAutoriConsep=jTtoolBarDetalleAuxiliarAutoriConsep;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAutoriConsep;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAutoriConsep;
			processRunnable.jTableDatos=jTableDatosAutoriConsep;
			processRunnable.jPanelCampos=jPanelCamposAutoriConsep;
			processRunnable.jPanelPaginacion=jPanelPaginacionAutoriConsep;
			processRunnable.jPanelAcciones=jPanelAccionesAutoriConsep;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAutoriConsep;
			
			
			processRunnable.jmenuBar=jmenuBarAutoriConsep;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAutoriConsep;
			processRunnable.jTtoolBar=jTtoolBarAutoriConsep;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAutoriConsep;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAutoriConsep ,jPanelParametrosReportesAutoriConsep, jTableDatosAutoriConsep,/*jScrollPanelDatosAutoriConsep,*/jPanelCamposAutoriConsep,jPanelPaginacionAutoriConsep, /*jScrollPanelDatosEdicionAutoriConsep,*/ jPanelAccionesAutoriConsep,jPanelAccionesFormularioAutoriConsep,jmenuBarAutoriConsep,jmenuBarDetalleAutoriConsep,jTtoolBarAutoriConsep,jTtoolBarDetalleAutoriConsep));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAutoriConsep(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAutoriConsep(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAutoriConsep,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAutoriConsep,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAutoriConsep,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAutoriConsep,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.autoriconsepConstantesFunciones.getsFinalQueryAutoriConsep();
		String  finalQueryPaginacionTodos=this.autoriconsepConstantesFunciones.getsFinalQueryAutoriConsep();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AutoriConsepConstantesFunciones.getArrayColumnasGlobalesNoAutoriConsep(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AutoriConsepConstantesFunciones.getArrayColumnasGlobalesAutoriConsep(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AutoriConsepConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.autoriconsepsEliminados= new ArrayList<AutoriConsep>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAutoriConsep();
		
				///*AutoriConsepSessionBean*/this.autoriconsepSessionBean=new AutoriConsepSessionBean();
			
			if(this.autoriconsepSessionBean==null) {
				this.autoriconsepSessionBean=new AutoriConsepSessionBean();
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
					this.iNumeroPaginacion=AutoriConsepConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AutoriConsepConstantesFunciones.getClassesForeignKeysOfAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/autoriconsep."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			autoriconsepsAux= new ArrayList<AutoriConsep>();
			
				
			autoriconsepLogic.setDatosCliente(this.datosCliente);
			autoriconsepLogic.setDatosDeep(this.datosDeep);
			autoriconsepLogic.setIsConDeep(true);
			
			
			autoriconsepLogic.getAutoriConsepDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					autoriconsepLogic.getTodosAutoriConseps(finalQueryGlobal,pagination);
					
					//autoriconsepLogic.getTodosAutoriConsepsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(autoriconsepLogic.getAutoriConseps()==null|| autoriconsepLogic.getAutoriConseps().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							autoriconsepsAux= new ArrayList<AutoriConsep>();
							autoriconsepsAux.addAll(autoriconsepLogic.getAutoriConseps());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconsepsAux= new ArrayList<AutoriConsep>();
							autoriconsepsAux.addAll(autoriconseps);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							autoriconsepLogic.getTodosAutoriConseps(finalQueryGlobal+"",this.pagination);												
							
							//autoriconsepLogic.getTodosAutoriConsepsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAutoriConseps("Todos",autoriconsepLogic.getAutoriConseps() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							autoriconsepLogic.setAutoriConseps(new ArrayList<AutoriConsep>());					
							autoriconsepLogic.getAutoriConseps().addAll(autoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconseps=new ArrayList<AutoriConsep>();
							autoriconseps.addAll(autoriconsepsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAutoriConsep=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAutoriConsep=this.idActual;
				
				} else if(this.idAutoriConsepActual!=null && this.idAutoriConsepActual!=0L) {
					idAutoriConsep=idAutoriConsepActual;
				}
				
					
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndicePorId(idAutoriConsep);
				
				this.autoriconseps=new ArrayList<AutoriConsep>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					autoriconsepLogic.getEntity(idAutoriConsep);
					
					//autoriconsepLogic.getEntityWithConnection(idAutoriConsep);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriconsepLogic.setAutoriConseps(new ArrayList<AutoriConsep>());
					autoriconsepLogic.getAutoriConseps().add(autoriconsepLogic.getAutoriConsep());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriconseps=new ArrayList<AutoriConsep>();
					this.autoriconseps.add(autoriconsep);
				}
				
				if(autoriconsepLogic.getAutoriConsep()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNumeroAutorizacion")) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorNumeroAutorizacion(numero_autorizacionBusquedaPorNumeroAutorizacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autoriconsepLogic.getAutoriConsepsBusquedaPorNumeroAutorizacion(finalQueryGlobal,pagination,numero_autorizacionBusquedaPorNumeroAutorizacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorNumeroAutorizacion(numero_autorizacionBusquedaPorNumeroAutorizacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorNumeroAutorizacion(numero_autorizacionBusquedaPorNumeroAutorizacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autoriconsepLogic.getAutoriConseps()==null||autoriconsepLogic.getAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autoriconseps==null|| autoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepsAux=new ArrayList<AutoriConsep>();
						autoriconsepsAux.addAll(autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconsepsAux=new ArrayList<AutoriConsep>();
							autoriconsepsAux.addAll(autoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autoriconsepLogic.getAutoriConsepsBusquedaPorNumeroAutorizacion(finalQueryGlobal,pagination,numero_autorizacionBusquedaPorNumeroAutorizacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorNumeroAutorizacion(numero_autorizacionBusquedaPorNumeroAutorizacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorNumeroAutorizacion(numero_autorizacionBusquedaPorNumeroAutorizacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriConseps("BusquedaPorNumeroAutorizacion",autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriConseps("BusquedaPorNumeroAutorizacion",autoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepLogic.setAutoriConseps(new ArrayList<AutoriConsep>());
						autoriconsepLogic.getAutoriConseps().addAll(autoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconseps=new ArrayList<AutoriConsep>();
							autoriconseps.addAll(autoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autoriconsepLogic.getAutoriConsepsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autoriconsepLogic.getAutoriConseps()==null||autoriconsepLogic.getAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autoriconseps==null|| autoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepsAux=new ArrayList<AutoriConsep>();
						autoriconsepsAux.addAll(autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconsepsAux=new ArrayList<AutoriConsep>();
							autoriconsepsAux.addAll(autoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autoriconsepLogic.getAutoriConsepsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriConseps("FK_IdCliente",autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriConseps("FK_IdCliente",autoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepLogic.setAutoriConseps(new ArrayList<AutoriConsep>());
						autoriconsepLogic.getAutoriConseps().addAll(autoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconseps=new ArrayList<AutoriConsep>();
							autoriconseps.addAll(autoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autoriconsepLogic.getAutoriConsepsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autoriconsepLogic.getAutoriConseps()==null||autoriconsepLogic.getAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autoriconseps==null|| autoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepsAux=new ArrayList<AutoriConsep>();
						autoriconsepsAux.addAll(autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconsepsAux=new ArrayList<AutoriConsep>();
							autoriconsepsAux.addAll(autoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autoriconsepLogic.getAutoriConsepsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriConseps("FK_IdEmpleado",autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriConseps("FK_IdEmpleado",autoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepLogic.setAutoriConseps(new ArrayList<AutoriConsep>());
						autoriconsepLogic.getAutoriConseps().addAll(autoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconseps=new ArrayList<AutoriConsep>();
							autoriconseps.addAll(autoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autoriconsepLogic.getAutoriConsepsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autoriconsepLogic.getAutoriConseps()==null||autoriconsepLogic.getAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autoriconseps==null|| autoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepsAux=new ArrayList<AutoriConsep>();
						autoriconsepsAux.addAll(autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconsepsAux=new ArrayList<AutoriConsep>();
							autoriconsepsAux.addAll(autoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autoriconsepLogic.getAutoriConsepsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriConseps("FK_IdEmpresa",autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriConseps("FK_IdEmpresa",autoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepLogic.setAutoriConseps(new ArrayList<AutoriConsep>());
						autoriconsepLogic.getAutoriConseps().addAll(autoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconseps=new ArrayList<AutoriConsep>();
							autoriconseps.addAll(autoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoAutoriConsep")) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdTipoAutoriConsep(id_tipo_autori_consepFK_IdTipoAutoriConsep);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autoriconsepLogic.getAutoriConsepsFK_IdTipoAutoriConsep(finalQueryGlobal,pagination,id_tipo_autori_consepFK_IdTipoAutoriConsep);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdTipoAutoriConsep(id_tipo_autori_consepFK_IdTipoAutoriConsep);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdTipoAutoriConsep(id_tipo_autori_consepFK_IdTipoAutoriConsep);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autoriconsepLogic.getAutoriConseps()==null||autoriconsepLogic.getAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autoriconseps==null|| autoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepsAux=new ArrayList<AutoriConsep>();
						autoriconsepsAux.addAll(autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconsepsAux=new ArrayList<AutoriConsep>();
							autoriconsepsAux.addAll(autoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autoriconsepLogic.getAutoriConsepsFK_IdTipoAutoriConsep(finalQueryGlobal,pagination,id_tipo_autori_consepFK_IdTipoAutoriConsep);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdTipoAutoriConsep(id_tipo_autori_consepFK_IdTipoAutoriConsep);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdTipoAutoriConsep(id_tipo_autori_consepFK_IdTipoAutoriConsep);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriConseps("FK_IdTipoAutoriConsep",autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriConseps("FK_IdTipoAutoriConsep",autoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepLogic.setAutoriConseps(new ArrayList<AutoriConsep>());
						autoriconsepLogic.getAutoriConseps().addAll(autoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconseps=new ArrayList<AutoriConsep>();
							autoriconseps.addAll(autoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autoriconsepLogic.getAutoriConsepsFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autoriconsepLogic.getAutoriConseps()==null||autoriconsepLogic.getAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autoriconseps==null|| autoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepsAux=new ArrayList<AutoriConsep>();
						autoriconsepsAux.addAll(autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconsepsAux=new ArrayList<AutoriConsep>();
							autoriconsepsAux.addAll(autoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autoriconsepLogic.getAutoriConsepsFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriConsepConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriConseps("FK_IdUsuario",autoriconsepLogic.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriConseps("FK_IdUsuario",autoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepLogic.setAutoriConseps(new ArrayList<AutoriConsep>());
						autoriconsepLogic.getAutoriConseps().addAll(autoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconseps=new ArrayList<AutoriConsep>();
							autoriconseps.addAll(autoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAutoriConsep();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAutoriConsep();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=autoriconsepLogic.getAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autoriconseps.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=autoriconsepLogic.getAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autoriconseps.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AutoriConsep autoriconsep) {
		Boolean permite=true;
		
		if(this.autoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AutoriConsepConstantesFunciones.getOrderByListaAutoriConsep();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AutoriConsepConstantesFunciones.getOrderByListaAutoriConsep();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriConsep autoriconsep:autoriconsepLogic.getAutoriConseps()) {
				if(autoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					autoriconsepTotales=autoriconsep;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriConsep autoriconsep:this.autoriconseps) {
				if(autoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					autoriconsepTotales=autoriconsep;
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
			this.autoriconsepAux=new AutoriConsep();
			this.autoriconsepAux.setsType(Constantes2.S_TOTALES);
			this.autoriconsepAux.setIsNew(false);
			this.autoriconsepAux.setIsChanged(false);
			this.autoriconsepAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AutoriConsepConstantesFunciones.TotalizarValoresFilaAutoriConsep(this.autoriconsepLogic.getAutoriConseps(),this.autoriconsepAux);
				
				this.autoriconsepLogic.getAutoriConseps().add(this.autoriconsepAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AutoriConsepConstantesFunciones.TotalizarValoresFilaAutoriConsep(this.autoriconseps,this.autoriconsepAux);
				
				this.autoriconseps.add(this.autoriconsepAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		autoriconsepTotales=new AutoriConsep();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.autoriconsepLogic.getAutoriConseps().remove(autoriconsepTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.autoriconseps.remove(autoriconsepTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		autoriconsepTotales=new AutoriConsep();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriConsep autoriconsep:autoriconsepLogic.getAutoriConseps()) {
				if(autoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					autoriconsepTotales=autoriconsep;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AutoriConsepConstantesFunciones.TotalizarValoresFilaAutoriConsep(this.autoriconsepLogic.getAutoriConseps(),autoriconsepTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriConsep autoriconsep:this.autoriconseps) {
				if(autoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					autoriconsepTotales=autoriconsep;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AutoriConsepConstantesFunciones.TotalizarValoresFilaAutoriConsep(this.autoriconseps,autoriconsepTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAutoriConsepsBusquedaPorNumeroAutorizacion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNumeroAutorizacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriConsepsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriConsepsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriConsepsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriConsepsFK_IdTipoAutoriConsep()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoAutoriConsep";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriConsepsFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAutoriConsepsBusquedaPorNumeroAutorizacion(String sFinalQuery,String numero_autorizacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriconsepLogic.getAutoriConsepsBusquedaPorNumeroAutorizacion(sFinalQuery,this.pagination,numero_autorizacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriConsepsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriconsepLogic.getAutoriConsepsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriConsepsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriconsepLogic.getAutoriConsepsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriConsepsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriconsepLogic.getAutoriConsepsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriConsepsFK_IdTipoAutoriConsep(String sFinalQuery,Long id_tipo_autori_consep)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriconsepLogic.getAutoriConsepsFK_IdTipoAutoriConsep(sFinalQuery,this.pagination,id_tipo_autori_consep);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriConsepsFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriconsepLogic.getAutoriConsepsFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosAutoriConsep() {
		this.isPermisoTodoAutoriConsep=false;
		this.isPermisoNuevoAutoriConsep=false;
		this.isPermisoActualizarAutoriConsep=false;
		this.isPermisoActualizarOriginalAutoriConsep=false;
		this.isPermisoEliminarAutoriConsep=false;
		this.isPermisoGuardarCambiosAutoriConsep=false;
		this.isPermisoConsultaAutoriConsep=false;
		this.isPermisoBusquedaAutoriConsep=false;
		this.isPermisoReporteAutoriConsep=false;		
		this.isPermisoOrdenAutoriConsep=false;		
		this.isPermisoPaginacionMedioAutoriConsep=false;		
		this.isPermisoPaginacionAltoAutoriConsep=false;
		this.isPermisoPaginacionTodoAutoriConsep=false;
		this.isPermisoCopiarAutoriConsep=false;		
		this.isPermisoVerFormAutoriConsep=false;		
		this.isPermisoDuplicarAutoriConsep=false;		
		this.isPermisoOrdenAutoriConsep=false;		
	}
	
	public void setPermisosUsuarioAutoriConsep(Boolean isPermiso) {
		this.isPermisoTodoAutoriConsep=isPermiso;
		this.isPermisoNuevoAutoriConsep=isPermiso;
		this.isPermisoActualizarAutoriConsep=isPermiso;
		this.isPermisoActualizarOriginalAutoriConsep=isPermiso;
		this.isPermisoEliminarAutoriConsep=isPermiso;
		this.isPermisoGuardarCambiosAutoriConsep=isPermiso;
		this.isPermisoConsultaAutoriConsep=isPermiso;
		this.isPermisoBusquedaAutoriConsep=isPermiso;
		this.isPermisoReporteAutoriConsep=isPermiso;
		this.isPermisoOrdenAutoriConsep=isPermiso;		
		this.isPermisoPaginacionMedioAutoriConsep=isPermiso;		
		this.isPermisoPaginacionAltoAutoriConsep=isPermiso;		
		this.isPermisoPaginacionTodoAutoriConsep=isPermiso;		
		this.isPermisoCopiarAutoriConsep=isPermiso;		
		this.isPermisoVerFormAutoriConsep=isPermiso;		
		this.isPermisoDuplicarAutoriConsep=isPermiso;
		this.isPermisoOrdenAutoriConsep=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAutoriConsep(Boolean isPermiso) {
		//this.isPermisoTodoAutoriConsep=isPermiso;
		this.isPermisoNuevoAutoriConsep=isPermiso;
		this.isPermisoActualizarAutoriConsep=isPermiso;
		this.isPermisoActualizarOriginalAutoriConsep=isPermiso;
		this.isPermisoEliminarAutoriConsep=isPermiso;
		this.isPermisoGuardarCambiosAutoriConsep=isPermiso;
		//this.isPermisoConsultaAutoriConsep=isPermiso;
		//this.isPermisoBusquedaAutoriConsep=isPermiso;
		//this.isPermisoReporteAutoriConsep=isPermiso;
		//this.isPermisoOrdenAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionMedioAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionAltoAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionTodoAutoriConsep=isPermiso;		
		//this.isPermisoCopiarAutoriConsep=isPermiso;		
		//this.isPermisoDuplicarAutoriConsep=isPermiso;
		//this.isPermisoOrdenAutoriConsep=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAutoriConsepClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleAutoriConsepConstantesFunciones.SNOMBREOPCION);
		
		if(AutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleAutoriConsep=false;
		this.isTienePermisosDetalleAutoriConsep=this.verificarGetPermisosUsuarioOpcionAutoriConsepClaseRelacionada(this.opcionsRelacionadas,DetalleAutoriConsepConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebAutoriConsep(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAutoriConsepClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleAutoriConsep=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioAutoriConsepClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAutoriConsepClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAutoriConsepClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleAutoriConsep && this.jInternalFrameDetalleFormAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormAutoriConsep.jTabbedPaneRelacionesAutoriConsep.remove(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioAutoriConsep() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AutoriConsepConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAutoriConsep=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAutoriConsep=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAutoriConsep=this.isPermisoActualizarAutoriConsep;
			this.isPermisoEliminarAutoriConsep=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAutoriConsep=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAutoriConsep=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAutoriConsep=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAutoriConsep=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAutoriConsep=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAutoriConsep=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAutoriConsep=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAutoriConsep=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAutoriConsep=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAutoriConsep=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAutoriConsep=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAutoriConsep=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAutoriConsep=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAutoriConsep.setToolTipText(this.jTableDatosAutoriConsep.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAutoriConsep(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAutoriConsep(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAutoriConsep() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleAutoriConsep && this.autoriconsepConstantesFunciones.mostrarDetalleAutoriConsepAutoriConsep && !AutoriConsepConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Autorizacion Consep");
			reporte.setsDescripcion("Detalle Autorizacion Consep");
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
	public void inicializarCombosForeignKeyAutoriConsepListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tipoautoriconsepsForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAutoriConsepListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AutoriConsepJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAutoriConsepListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoAutoriConsepListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoAutoriConsepListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoautoriconsepsForeignKey==null||this.tipoautoriconsepsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoAutoriConsepConstantesFunciones.getArrayColumnasGlobalesTipoAutoriConsep(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoAutoriConsepConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoAutoriConsepConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoAutoriConsepsForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyAutoriConsepListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AutoriConsepParameterReturnGeneral autoriconsepReturnGeneral=new AutoriConsepParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.autoriconsepConstantesFunciones.cargarid_empresaAutoriConsep)
					 || (this.esRecargarFks && this.autoriconsepConstantesFunciones.cargarid_empresaAutoriConsep)) {

					if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+autoriconsepSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.autoriconsepConstantesFunciones.cargarid_usuarioAutoriConsep)
					 || (this.esRecargarFks && this.autoriconsepConstantesFunciones.cargarid_usuarioAutoriConsep)) {

					if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+autoriconsepSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.autoriconsepConstantesFunciones.cargarid_clienteAutoriConsep)
					 || (this.esRecargarFks && this.autoriconsepConstantesFunciones.cargarid_clienteAutoriConsep)) {

					if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+autoriconsepSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoAutoriConsep="";

				if(((this.tipoautoriconsepsForeignKey==null||this.tipoautoriconsepsForeignKey.size()<=0) && this.autoriconsepConstantesFunciones.cargarid_tipo_autori_consepAutoriConsep)
					 || (this.esRecargarFks && this.autoriconsepConstantesFunciones.cargarid_tipo_autori_consepAutoriConsep)) {

					if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionTipoAutoriConsep()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoAutoriConsepConstantesFunciones.getArrayColumnasGlobalesTipoAutoriConsep(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoAutoriConsep=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoAutoriConsepConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoAutoriConsep=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoAutoriConsep, "");
						finalQueryGlobalTipoAutoriConsep+=TipoAutoriConsepConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoAutoriConsepsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoAutoriConsep=" WHERE " + ConstantesSql.ID + "="+autoriconsepSessionBean.getlidTipoAutoriConsepActual();
					}
				} else {
					finalQueryGlobalTipoAutoriConsep="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.autoriconsepConstantesFunciones.cargarid_empleadoAutoriConsep)
					 || (this.esRecargarFks && this.autoriconsepConstantesFunciones.cargarid_empleadoAutoriConsep)) {

					if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+autoriconsepSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				autoriconsepReturnGeneral=autoriconsepLogic.cargarCombosLoteForeignKeyAutoriConsep(finalQueryGlobalEmpresa,finalQueryGlobalUsuario,finalQueryGlobalCliente,finalQueryGlobalTipoAutoriConsep,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=autoriconsepReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=autoriconsepReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=autoriconsepReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoAutoriConsep.equals("NONE")) {
				this.tipoautoriconsepsForeignKey=autoriconsepReturnGeneral.gettipoautoriconsepsForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=autoriconsepReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAutoriConsep()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoAutoriConsep();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.autoriconsepSessionBean==null) {
				this.autoriconsepSessionBean=new AutoriConsepSessionBean();
			}

			if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoAutoriConsep()throws Exception {
		try {

			if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionTipoAutoriConsep()) {
				TipoAutoriConsep tipoautoriconsep=new TipoAutoriConsep();
				TipoAutoriConsepConstantesFunciones.setTipoAutoriConsepDescripcion(tipoautoriconsep,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoautoriconsep.setId(null);

				if(!TipoAutoriConsepConstantesFunciones.ExisteEnLista(this.tipoautoriconsepsForeignKey,tipoautoriconsep,true)) {

					this.tipoautoriconsepsForeignKey.add(0,tipoautoriconsep);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.autoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyAutoriConsep()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAutoriConsep(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAutoriConsep()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.autoriconsep.setfecha_emision(this.parametroGeneralUsuario.getfecha_sistema());
				this.autoriconsep.setfecha_vencimiento(this.parametroGeneralUsuario.getfecha_sistema());
				this.autoriconsep.setfecha_ultima(this.parametroGeneralUsuario.getfecha_sistema());
				this.autoriconsep.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAutoriConsep();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAutoriConsep(AutoriConsep autoriconsep)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(autoriconsep.getid_cliente(),false,"Formulario");
			this.setActualTipoAutoriConsepForeignKey(autoriconsep.getid_tipo_autori_consep(),false,"Formulario");
			this.setActualEmpleadoForeignKey(autoriconsep.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAutoriConsep(AutoriConsep autoriconsep,String sTipoEvento)throws Exception {	
		try {
			
			

				if(autoriconsep.getCliente()!=null && !sTipoEvento.equals("id_clienteAutoriConsep")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(autoriconsep.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				if(autoriconsep.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoAutoriConsep")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(autoriconsep.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAutoriConsep()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.autoriconsepConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTipoAutoriConsepForeignKey(this.autoriconsepConstantesFunciones.getid_tipo_autori_consep(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.autoriconsepConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAutoriConsep()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAutoriConsep()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAutoriConsep()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAutoriConsep()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAutoriConsep()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoAutoriConsepsForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAutoriConsep(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoAutoriConsepsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAutoriConsep()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public AutoriConsepBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AutoriConsepBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AutoriConsepBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.autoriconsepSessionBean=new AutoriConsepSessionBean(); 
		this.autoriconsepConstantesFunciones=new AutoriConsepConstantesFunciones(); 
		this.autoriconsepBean=new AutoriConsep();//(this.autoriconsepConstantesFunciones); 		
		this.autoriconsepReturnGeneral=new AutoriConsepParameterReturnGeneral(); 
		
		this.autoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAutoriConsep(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
			
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
			
			this.autoriconsepConstantesFunciones=new AutoriConsepConstantesFunciones(); 
			this.autoriconsepBean=new AutoriConsep();//this.autoriconsepConstantesFunciones); 			
			this.autoriconsepReturnGeneral=new AutoriConsepParameterReturnGeneral(); 
		
			AutoriConsepBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Autorizaciones Consep Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.autoriconsep=new AutoriConsep();
			this.autoriconseps = new ArrayList<AutoriConsep>();
			this.autoriconsepsAux = new ArrayList<AutoriConsep>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic=new AutoriConsepLogic();
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}
			
			//this.autoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.autoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAutoriConsep);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAutoriConsep);	
					}
					
					if(this.jInternalFrameImportacionAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAutoriConsep);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAutoriConsep);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAutoriConsep);
				this.jInternalFrameDetalleFormAutoriConsep.setVisible(false);
				this.jInternalFrameDetalleFormAutoriConsep.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAutoriConsep);
					this.jInternalFrameReporteDinamicoAutoriConsep.setVisible(false);
					this.jInternalFrameReporteDinamicoAutoriConsep.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAutoriConsep);
					this.jInternalFrameImportacionAutoriConsep.setVisible(false);
					this.jInternalFrameImportacionAutoriConsep.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAutoriConsep);
					this.jInternalFrameOrderByAutoriConsep.setVisible(false);
					this.jInternalFrameOrderByAutoriConsep.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAutoriConsepActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AutoriConsepConstantesFunciones.INUMEROPAGINACION;
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
			
			this.autoriconsepReturnGeneral=new AutoriConsepParameterReturnGeneral();
			
			this.autoriconsepParameterGeneral=new AutoriConsepParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.autoriconsepLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleAutoriConsepConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AutoriConsepConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.autoriconsepSessionBean.getEsGuardarRelacionado(),this.autoriconsepSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AutoriConsepConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.autoriconsepSessionBean.getEsGuardarRelacionado(),this.autoriconsepSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAutoriConsep=false;
			this.isVisibilidadCeldaDuplicarAutoriConsep=true;
			this.isVisibilidadCeldaCopiarAutoriConsep=true;
			this.isVisibilidadCeldaVerFormAutoriConsep=true;
			this.isVisibilidadCeldaOrdenAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=false;
			this.isVisibilidadCeldaModificarAutoriConsep=false;
			this.isVisibilidadCeldaActualizarAutoriConsep=false;
			this.isVisibilidadCeldaEliminarAutoriConsep=false;
			this.isVisibilidadCeldaCancelarAutoriConsep=false;
			this.isVisibilidadCeldaGuardarAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=false;
			
			
			this.isVisibilidadBusquedaPorNumeroAutorizacion=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoAutoriConsep=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAutoriConsep();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAutoriConsep(false);
			
			this.setPermisosUsuarioAutoriConsep();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autoriconsepSessionBean.getEsGuardarRelacionado() 
				|| (this.autoriconsepSessionBean.getEsGuardarRelacionado() && this.autoriconsepSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAutoriConsepClasesRelacionadas();
			}
			
			if(this.autoriconsepSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAutoriConsepClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAutoriConsep();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAutoriConsep();
			}
			
			if(!this.isPermisoBusquedaAutoriConsep) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAutoriConsep.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAutoriConsep,this.isPermisoPaginacionMedioAutoriConsep,this.isPermisoPaginacionTodoAutoriConsep);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AutoriConsepConstantesFunciones.getTiposSeleccionarAutoriConsep());
				
				this.tiposColumnasSelect=AutoriConsepConstantesFunciones.getTiposSeleccionarAutoriConsep(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectAutoriConsep();				
				//this.tiposRelacionesSelect=AutoriConsepConstantesFunciones.getTiposRelacionesAutoriConsep(true);
				
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
			//if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAutoriConsep();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioAutoriConsep(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioAutoriConsep(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAutoriConsep() ;
			
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
			
			
			this.detalleautoriconsepLogic=new DetalleAutoriConsepLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.usuarioLogic=new UsuarioLogic();
			this.clienteLogic=new ClienteLogic();
			this.tipoautoriconsepLogic=new TipoAutoriConsepLogic();
			this.empleadoLogic=new EmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				autoriconsepImplementable= (AutoriConsepImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AutoriConsepConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				autoriconsepImplementableHome= (AutoriConsepImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AutoriConsepConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.autoriconseps= new ArrayList<AutoriConsep>();
			this.autoriconsepsEliminados= new ArrayList<AutoriConsep>();
						
			this.isEsNuevoAutoriConsep=false;
			this.esParaAccionDesdeFormularioAutoriConsep=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipoautoriconsepsForeignKey=new ArrayList<TipoAutoriConsep>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAutoriConsep(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAutoriConsep();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AutoriConsepBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AutoriConsepConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAutoriConsep(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAutoriConsep();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAutoriConsep();
			}
			
			AutoriConsepBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAutoriConsep.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAutoriConsep.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAutoriConsep.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAutoriConsep(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AutoriConsep: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAutoriConsep() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAutoriConsep")) {
				iIndex=this.jInternalFrameDetalleFormAutoriConsep.jTabbedPaneRelacionesAutoriConsep.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAutoriConsep.jTabbedPaneRelacionesAutoriConsep.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Autorizacion Consepes")) {
					if(!DetalleAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessAutoriConsep();

						this.cargarParteTabPanelRelacionadaDetalleAutoriConsep(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAutoriConsep();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleAutoriConsep(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormAutoriConsep.cargarSessionConBeanSwingJInternalFrameDetalleAutoriConsep(false,true,iIndex);
		this.jButtonDetalleAutoriConsepActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleAutoriConsep();

		//this.jTabbedPaneRelacionesAutoriConsep.updateUI();
		//this.jTabbedPaneRelacionesAutoriConsep.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesAutoriConsep.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleAutoriConsep")) {
				int row=this.jTableDatosAutoriConsep.getSelectedRow();
				jButtonDetalleAutoriConsepActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Autorizacion Consep")) {

					if(this.isTienePermisosDetalleAutoriConsep && this.autoriconsepConstantesFunciones.mostrarDetalleAutoriConsepAutoriConsep && !AutoriConsepConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Autorizacion Consepes"+"("+DetalleAutoriConsepConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Autorizacion Consepes");

						if(autoriconsepConstantesFunciones.resaltarDetalleAutoriConsepAutoriConsep!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(autoriconsepConstantesFunciones.resaltarDetalleAutoriConsepAutoriConsep);
						}

						jmenuItem.setEnabled(this.autoriconsepConstantesFunciones.activarDetalleAutoriConsepAutoriConsep);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleAutoriConsep"));

						

						this.jInternalFrameDetalleFormAutoriConsep.jmenuDetalleAutoriConsep.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyAutoriConsep(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAutoriConsep(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAutoriConsep(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAutoriConsepListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAutoriConsep();
		
		this.cargarCombosFrameForeignKeyAutoriConsep();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAutoriConsep();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAutoriConsep();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoAutoriConsep(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoAutoriConsepListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoAutoriConsep();
				this.cargarCombosFrameTipoAutoriConsepsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoAutoriConsep(this.tipoautoriconsepsForeignKey);

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
	
	public void jButtonNuevoAutoriConsepActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.autoriconsepSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
			
			if(jTableDatosAutoriConsep.getRowCount()>=1) {
				jTableDatosAutoriConsep.removeRowSelectionInterval(0, jTableDatosAutoriConsep.getRowCount()-1);						
			}
			
			this.isEsNuevoAutoriConsep=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAutoriConsep(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAutoriConsep(true);			
			//this.autoriconsep=new AutoriConsep();
			//this.autoriconsep.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutoriConsep(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriConsep() ;
			
			if(AutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutoriConsep(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.autoriconsep);	
			this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);				
			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
			if(this.autoriconsepSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AutoriConsep: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAutoriConsepActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAutoriConsep.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAutoriConsep.getSelectedRows().length;			
			}
			
			autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAutoriConsep--;			
				//AutoriConsep autoriconsepAux= new AutoriConsep();			
				//autoriconsepAux.setId(this.iIdNuevoAutoriConsep);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AutoriConsep autoriconsepOrigen=new AutoriConsep();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AutoriConsep autoriconsepOrigen : autoriconsepsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							autoriconsepOrigen =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriconsepOrigen =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAutoriConsep();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.autoriconsep.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAutoriConsep(autoriconsepOrigen,this.autoriconsep,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.autoriconsepLogic.getAutoriConseps().add(this.autoriconsepAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.autoriconseps.add(this.autoriconsepAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAutoriConsep(false);
				
				this.jTableDatosAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoAutoriConsep(), this.getIndiceNuevoAutoriConsep());
				
				int iLastRow =  this.jTableDatosAutoriConsep.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAutoriConsep.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAutoriConsep.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAutoriConsep(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();									
		
			AutoriConsep autoriconsepOrigen=new AutoriConsep();
			AutoriConsep autoriconsepDestino=new AutoriConsep();
				
			autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAutoriConsep.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || autoriconsepsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAutoriConsep.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepOrigen =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						autoriconsepOrigen =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriconsepDestino =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						autoriconsepDestino =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				autoriconsepOrigen =autoriconsepsSeleccionados.get(0);
				autoriconsepDestino =autoriconsepsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAutoriConsep(autoriconsepOrigen,autoriconsepDestino,true,false);
				
				autoriconsepDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(autoriconsepDestino,autoriconsepLogic.getAutoriConseps());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autoriconsepDestino,autoriconseps);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAutoriConsep(false);
				
				//this.jTableDatosAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoAutoriConsep(), this.getIndiceNuevoAutoriConsep());
				
				int iLastRow =  this.jTableDatosAutoriConsep.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAutoriConsep.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAutoriConsep.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAutoriConsep(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAutoriConsep.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAutoriConsep.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAutoriConsep.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAutoriConsep.setVisible(!isVisible);
			this.jPanelPaginacionAutoriConsep.setVisible(!isVisible);
			this.jPanelAccionesAutoriConsep.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAutoriConsep();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAutoriConsep();
			
			this.abrirFrameOrderByAutoriConsep();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAutoriConsep(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAutoriConsep);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAutoriConsep.isMaximum()) {
					this.jInternalFrameDetalleFormAutoriConsep.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAutoriConsep.setSize(this.jInternalFrameDetalleFormAutoriConsep.iWidthFormulario,this.jInternalFrameDetalleFormAutoriConsep.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAutoriConsep.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAutoriConsep.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAutoriConsep.isMaximum()) {
						this.jInternalFrameDetalleFormAutoriConsep.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAutoriConsep.jContentPaneDetalleAutoriConsep.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAutoriConsep.jTabbedPaneRelacionesAutoriConsep.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAutoriConsep.jContentPaneDetalleAutoriConsep.getWidth(),AutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAutoriConsep.jTabbedPaneRelacionesAutoriConsep.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAutoriConsep.jContentPaneDetalleAutoriConsep.getWidth(),AutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAutoriConsep.jTabbedPaneRelacionesAutoriConsep.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAutoriConsep.jContentPaneDetalleAutoriConsep.getWidth(),AutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleAutoriConsep();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAutoriConsep.setVisible(true);
	        this.jInternalFrameDetalleFormAutoriConsep.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAutoriConsep() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAutoriConsep==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriConsep,false,this);
				} else {
					this.jInternalFrameOrderByAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriConsep,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAutoriConsep);
				this.jInternalFrameOrderByAutoriConsep.setVisible(false);
				this.jInternalFrameOrderByAutoriConsep.setSelected(false);
				
				this.jInternalFrameOrderByAutoriConsep.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAutoriConsep"));
				
				this.inicializarActualizarBindingTablaOrderByAutoriConsep();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAutoriConsep() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAutoriConsep==null) {
				
				this.jInternalFrameImportacionAutoriConsep=new ImportacionJInternalFrame(AutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAutoriConsep);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAutoriConsep);
				this.jInternalFrameImportacionAutoriConsep.setVisible(false);
				this.jInternalFrameImportacionAutoriConsep.setSelected(false);


				this.jInternalFrameImportacionAutoriConsep.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAutoriConsep"));
				this.jInternalFrameImportacionAutoriConsep.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAutoriConsep"));
				this.jInternalFrameImportacionAutoriConsep.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAutoriConsep"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAutoriConsep() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAutoriConsep==null) {
				this.jInternalFrameReporteDinamicoAutoriConsep=new ReporteDinamicoJInternalFrame(AutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAutoriConsep);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAutoriConsep);
				this.jInternalFrameReporteDinamicoAutoriConsep.setVisible(false);
				this.jInternalFrameReporteDinamicoAutoriConsep.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAutoriConsep.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutoriConsep"));
				this.jInternalFrameReporteDinamicoAutoriConsep.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutoriConsep"));
				this.jInternalFrameReporteDinamicoAutoriConsep.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutoriConsep"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutoriConsep();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleAutoriConsep() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.jScrollPanelDatosDetalleAutoriConsep.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormAutoriConsep.jContentPaneDetalleAutoriConsep.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.jScrollPanelDatosDetalleAutoriConsep.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.jScrollPanelDatosDetalleAutoriConsep.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.jScrollPanelDatosDetalleAutoriConsep.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleAutoriConsep() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAutoriConsep);
			
	       	this.jInternalFrameDetalleFormAutoriConsep.setVisible(false);
	        this.jInternalFrameDetalleFormAutoriConsep.setSelected(false);
			
			//this.jInternalFrameDetalleFormAutoriConsep.dispose();
			//this.jInternalFrameDetalleFormAutoriConsep=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAutoriConsep() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAutoriConsep.setVisible(true);
	        this.jInternalFrameReporteDinamicoAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAutoriConsep() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAutoriConsep.setVisible(true);
	        this.jInternalFrameImportacionAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAutoriConsep() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAutoriConsep.setVisible(true);
	        this.jInternalFrameOrderByAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAutoriConsep() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAutoriConsep.setVisible(false);
	        this.jInternalFrameOrderByAutoriConsep.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAutoriConsep() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAutoriConsep.setVisible(false);
	        this.jInternalFrameReporteDinamicoAutoriConsep.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAutoriConsep() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAutoriConsep.setVisible(false);
	        this.jInternalFrameImportacionAutoriConsep.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAutoriConsep(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAutoriConsep(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAutoriConsep(true);
			//this.isEsNuevoAutoriConsep=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutoriConsep(false) ;
			
			if(autoriconsepSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepSessionBean.getEsGuardarRelacionado() && DetalleAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleAutoriConsepActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(AutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutoriConsep(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriConsep(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAutoriConsepActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAutoriConsep(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAutoriConsep(true);
			//this.isEsNuevoAutoriConsep=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.autoriconsep.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAutoriConsep(false) ;
			
			if(AutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutoriConsep(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriConsep(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.autoriconsepConstantesFunciones.cargarid_clienteAutoriConsep) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingAutoriConsep(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
			
			if(sType.equals("Empleado")) {
				if(!this.autoriconsepConstantesFunciones.cargarid_empleadoAutoriConsep) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingAutoriConsep(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAutoriConsep.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoAutoriConsep(List<TipoAutoriConsep> tipoautoriconsepsForeignKey)throws Exception{
		TableColumn tableColumnTipoAutoriConsep=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP));
		TableCellEditor tableCellEditorTipoAutoriConsep =tableColumnTipoAutoriConsep.getCellEditor();

		TipoAutoriConsepTableCell tipoautoriconsepTableCellFk=(TipoAutoriConsepTableCell)tableCellEditorTipoAutoriConsep;

		if(tipoautoriconsepTableCellFk!=null) {
			tipoautoriconsepTableCellFk.settipoautoriconsepsForeignKey(tipoautoriconsepsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAutoriConsep.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoautoriconsepTableCellFk.setRowActual(intSelectedRow);
			//tipoautoriconsepTableCellFk.settipoautoriconsepsForeignKeyActual(tipoautoriconsepsForeignKey);
		//}


		if(tipoautoriconsepTableCellFk!=null) {
			tipoautoriconsepTableCellFk.RecargarTipoAutoriConsepsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAutoriConsep.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAutoriConsep(false);
			
			//if(!this.isEsNuevoAutoriConsep) {								
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				
			}
			
			if(this.permiteMantenimiento(this.autoriconsep)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAutoriConsep=true;
					this.inicializarActualizarBindingTablaAutoriConsep(false);
					this.isEsNuevoAutoriConsep=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAutoriConsep=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAutoriConsep=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAutoriConsep(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutoriConsep(false);
				
				this.habilitarDeshabilitarControlesAutoriConsep(false);
			
												
				
				if(AutoriConsepJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAutoriConsep();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAutoriConsepActionPerformed(evt,autoriconsepSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAutoriConsep(this.autoriconsep,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAutoriConsep.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,autoriconsepSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.autoriconsep.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				this.autoriconsep.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				this.autoriconsep.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.autoriconsep)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AutoriConsepModel) this.jTableDatosAutoriConsep.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAutoriConsep=true;
				this.inicializarActualizarBindingTablaAutoriConsep(false);
				this.isEsNuevoAutoriConsep=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAutoriConsep(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutoriConsep(false);
				
				this.habilitarDeshabilitarControlesAutoriConsep(false);
				
				
				
				if(AutoriConsepJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAutoriConsep();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAutoriConsepActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAutoriConsep.getRowCount()>=1) {
				jTableDatosAutoriConsep.removeRowSelectionInterval(0, jTableDatosAutoriConsep.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAutoriConsep(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAutoriConsep(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutoriConsep(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriConsep(false) ;
			
			this.isEsNuevoAutoriConsep=false;
			
			if(AutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAutoriConsep();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAutoriConsep(false);
				
				//SI ES MANUAL
				if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAutoriConsep();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAutoriConsep--;			
			//AutoriConsep autoriconsepAux= new AutoriConsep();			
			//autoriconsepAux.setId(this.iIdNuevoAutoriConsep);
			
			if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAutoriConsep();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
			
			this.autoriconsep.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.autoriconsepLogic.getAutoriConseps().add(this.autoriconsepAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.autoriconseps.add(this.autoriconsepAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAutoriConsep(false);
			
			this.jTableDatosAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoAutoriConsep(), this.getIndiceNuevoAutoriConsep());
			
			int iLastRow =  this.jTableDatosAutoriConsep.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAutoriConsep.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAutoriConsep.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAutoriConsep(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAutoriConsep(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriConsep(false);
			
			//SI ES MANUAL
			if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutoriConsep();
			}
			
			//this.abrirFrameTreeAutoriConsep();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Autorizaciones ConsepES ?", "MANTENIMIENTO DE Autorizaciones Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAutoriConsep.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAutoriConsep();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.autoriconsepReturnGeneral=autoriconsepLogic.procesarImportacionAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.autoriconsepParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAutoriConsepReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAutoriConsep.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAutoriConsep.setFileImportacion(this.jInternalFrameImportacionAutoriConsep.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAutoriConsep.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAutoriConsep.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAutoriConsep.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAutoriConsep.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();		

		autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AutoriConsepBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AutoriConsepBaseDesign.jrxml";
			
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
			
			this.generarReporteAutoriConseps("Todos",autoriconsepsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Consep",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AutoriConsepConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_ESEMPRESA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAutorizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAutorizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAutorizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAutorizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoAutoriConsep_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoAutoriConsep_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoAutoriConsep_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoAutoriConsep_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaUltima_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaUltima_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaUltima_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaUltima_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriConsepConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoAutoriConsep.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AutoriConsepConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case AutoriConsepConstantesFunciones.LABEL_ESEMPRESA:
					sNombreCampoCategoria="es_empresa";
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoria="numero_autorizacion";
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP:
					sNombreCampoCategoria="id_tipo_autori_consep";
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA:
					sNombreCampoCategoria="fecha_ultima";
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case AutoriConsepConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case AutoriConsepConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AutoriConsepConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case AutoriConsepConstantesFunciones.LABEL_ESEMPRESA:
					sNombreCampoCategoriaValor="es_empresa";
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoriaValor="numero_autorizacion";
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP:
					sNombreCampoCategoriaValor="id_tipo_autori_consep";
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA:
					sNombreCampoCategoriaValor="fecha_ultima";
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case AutoriConsepConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case AutoriConsepConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AutoriConsepConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case AutoriConsepConstantesFunciones.LABEL_ESEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_empresa");
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nro Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_autorizacion");
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_autori_consep");
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ult Modificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ultima");
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case AutoriConsepConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case AutoriConsepConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();		
		
		autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriconsep";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AutoriConseps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AutoriConsepConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_ESEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_ESEMPRESA);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getes_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getnumero_autorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.gettipoautoriconsep_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getfecha_ultima());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriConsepConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(AutoriConsep autoriconsep:autoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriconsep.getnombre());
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
			//	this.getFilaCabeceraExportarExcelAutoriConsep(row);				
			//	iRow++;
			//}				
			
			//for(AutoriConsep autoriconsepAux:autoriconsepsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAutoriConsep(autoriconsepAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Consep",JOptionPane.INFORMATION_MESSAGE);
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
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriConsep(false);
			
			//SI ES MANUAL
			if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutoriConsep();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriConsep(false);
			
			//SI ES MANUAL
			if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAutoriConsep();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriConsep(false);
			
			//SI ES MANUAL
			if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAutoriConsep();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAutoriConsep() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAutoriConsep.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAutoriConsep.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAutoriConsep.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAutoriConsep.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAutoriConsep.setMinimumSize(dimensionMinimum);
		this.jTableDatosAutoriConsep.setMaximumSize(dimensionMaximum);
		this.jTableDatosAutoriConsep.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAutoriConsep(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAutoriConsep(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAutoriConsep(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAutoriConsep(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAutoriConsep(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAutoriConsep(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAutoriConsep(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAutoriConsep(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAutoriConsep() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAutoriConsep();
		
		this.inicializarActualizarBindingBotonesManualAutoriConsep(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAutoriConsep();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAutoriConsep() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAutoriConsep(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAutoriConsep(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAutoriConsep.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAutoriConsep.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAutoriConsep.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxPostAccionNuevoAutoriConsep.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxPostAccionSinCerrarAutoriConsep.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxPostAccionSinMensajeAutoriConsep.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAutoriConsep.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAutoriConsep.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAutoriConsep.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
				this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxPostAccionNuevoAutoriConsep.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxPostAccionSinCerrarAutoriConsep.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxPostAccionSinMensajeAutoriConsep.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAutoriConsep.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAutoriConsep.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAutoriConsep.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAutoriConsep!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAutoriConsep.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAutoriConsep.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAutoriConsep.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAutoriConsep.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAutoriConsep!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAutoriConsep.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAutoriConsep.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAutoriConsep(Boolean esInicializar) throws Exception {
		try	{	
			if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAutoriConsep(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAutoriConsep() throws Exception {
		try	{
			if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAutoriConsep();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAutoriConsep() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAutoriConsep() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAutoriConsep.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAutoriConsep.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAutoriConsep.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAutoriConsep.addItem(reporte);
			}
			
			
			if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAutoriConsep.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAutoriConsep.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAutoriConsep.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAutoriConsep.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAutoriConsep.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAutoriConsep.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutoriConsep();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutoriConsep() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAutoriConsep.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAutoriConsep!=null) {
				
				if(this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAutoriConsep.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAutoriConsep.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAutoriConsep.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAutoriConsep.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAutoriConsep()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.numero_autorizacionBusquedaPorNumeroAutorizacion=this.jTextFieldnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep.getText();
		if(this.jComboBoxid_clienteFK_IdClienteAutoriConsep.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteAutoriConsep.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.getSelectedItem()!=null){this.id_tipo_autori_consepFK_IdTipoAutoriConsep=((TipoAutoriConsep)this.jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAutoriConsep(Boolean esInicializar) throws Exception {				
		if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAutoriConsep();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAutoriConsep() throws Exception {
		this.inicializarActualizarBindingTablaAutoriConsep(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAutoriConsep() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAutoriConsepOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsepOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAutoriConsep(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=autoriconsepLogic.getAutoriConseps().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=autoriconseps.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAutoriConsep.setModel(new AutoriConsepModel(this.autoriconsepLogic.getAutoriConseps(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAutoriConsep.setModel(new AutoriConsepModel(this.autoriconseps,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAutoriConsep!=null && this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAutoriConsep();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO,autoriconsepConstantesFunciones.resaltarSeleccionarAutoriConsep,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO,autoriconsepConstantesFunciones.resaltarSeleccionarAutoriConsep,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_ID));

		if(this.autoriconsepConstantesFunciones.mostraridAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.autoriconsepConstantesFunciones.resaltaridAutoriConsep,this.autoriconsepConstantesFunciones.activaridAutoriConsep,this,true,"idAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autoriconsepConstantesFunciones.resaltaridAutoriConsep,this.autoriconsepConstantesFunciones.activaridAutoriConsep,this,true,"idAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_IDEMPRESA));

		if(this.autoriconsepConstantesFunciones.mostrarid_empresaAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.autoriconsepConstantesFunciones.resaltarid_empresaAutoriConsep,this,this.autoriconsepConstantesFunciones.activarid_empresaAutoriConsep));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.autoriconsepConstantesFunciones.resaltarid_empresaAutoriConsep,this,this.autoriconsepConstantesFunciones.activarid_empresaAutoriConsep,false,"id_empresaAutoriConsep","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_IDUSUARIO));

		if(this.autoriconsepConstantesFunciones.mostrarid_usuarioAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.autoriconsepConstantesFunciones.resaltarid_usuarioAutoriConsep,this,this.autoriconsepConstantesFunciones.activarid_usuarioAutoriConsep));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.autoriconsepConstantesFunciones.resaltarid_usuarioAutoriConsep,this,this.autoriconsepConstantesFunciones.activarid_usuarioAutoriConsep,false,"id_usuarioAutoriConsep","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_ESEMPRESA));

		if(this.autoriconsepConstantesFunciones.mostrares_empresaAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_ESEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.autoriconsepConstantesFunciones.resaltares_empresaAutoriConsep,this.autoriconsepConstantesFunciones.activares_empresaAutoriConsep));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.autoriconsepConstantesFunciones.resaltares_empresaAutoriConsep,this.autoriconsepConstantesFunciones.activares_empresaAutoriConsep,this,true,"es_empresaAutoriConsep","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_IDCLIENTE));

		if(this.autoriconsepConstantesFunciones.mostrarid_clienteAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.autoriconsepConstantesFunciones.resaltarid_clienteAutoriConsep,this,this.autoriconsepConstantesFunciones.activarid_clienteAutoriConsep));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.autoriconsepConstantesFunciones.resaltarid_clienteAutoriConsep,this,this.autoriconsepConstantesFunciones.activarid_clienteAutoriConsep,true,"id_clienteAutoriConsep","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION));

		if(this.autoriconsepConstantesFunciones.mostrarnumero_autorizacionAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autoriconsepConstantesFunciones.resaltarnumero_autorizacionAutoriConsep,this.autoriconsepConstantesFunciones.activarnumero_autorizacionAutoriConsep,this,true,"numero_autorizacionAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autoriconsepConstantesFunciones.resaltarnumero_autorizacionAutoriConsep,this.autoriconsepConstantesFunciones.activarnumero_autorizacionAutoriConsep,this,true,"numero_autorizacionAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP));

		if(this.autoriconsepConstantesFunciones.mostrarid_tipo_autori_consepAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoAutoriConsepTableCell(this.tipoautoriconsepsForeignKey,this.autoriconsepConstantesFunciones.resaltarid_tipo_autori_consepAutoriConsep,this,this.autoriconsepConstantesFunciones.activarid_tipo_autori_consepAutoriConsep));
			tableColumn.setCellEditor(new TipoAutoriConsepTableCell(this.tipoautoriconsepsForeignKey,this.autoriconsepConstantesFunciones.resaltarid_tipo_autori_consepAutoriConsep,this,this.autoriconsepConstantesFunciones.activarid_tipo_autori_consepAutoriConsep,true,"id_tipo_autori_consepAutoriConsep","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.autoriconsepConstantesFunciones.mostrarid_empleadoAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.autoriconsepConstantesFunciones.resaltarid_empleadoAutoriConsep,this,this.autoriconsepConstantesFunciones.activarid_empleadoAutoriConsep));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.autoriconsepConstantesFunciones.resaltarid_empleadoAutoriConsep,this,this.autoriconsepConstantesFunciones.activarid_empleadoAutoriConsep,true,"id_empleadoAutoriConsep","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_FECHAEMISION));

		if(this.autoriconsepConstantesFunciones.mostrarfecha_emisionAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.autoriconsepConstantesFunciones.resaltarfecha_emisionAutoriConsep,this.autoriconsepConstantesFunciones.activarfecha_emisionAutoriConsep,this,true,"fecha_emisionAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.autoriconsepConstantesFunciones.resaltarfecha_emisionAutoriConsep,this.autoriconsepConstantesFunciones.activarfecha_emisionAutoriConsep,this,true,"fecha_emisionAutoriConsep","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.autoriconsepConstantesFunciones.mostrarfecha_vencimientoAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.autoriconsepConstantesFunciones.resaltarfecha_vencimientoAutoriConsep,this.autoriconsepConstantesFunciones.activarfecha_vencimientoAutoriConsep,this,true,"fecha_vencimientoAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.autoriconsepConstantesFunciones.resaltarfecha_vencimientoAutoriConsep,this.autoriconsepConstantesFunciones.activarfecha_vencimientoAutoriConsep,this,true,"fecha_vencimientoAutoriConsep","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA));

		if(this.autoriconsepConstantesFunciones.mostrarfecha_ultimaAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.autoriconsepConstantesFunciones.resaltarfecha_ultimaAutoriConsep,this.autoriconsepConstantesFunciones.activarfecha_ultimaAutoriConsep,this,true,"fecha_ultimaAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.autoriconsepConstantesFunciones.resaltarfecha_ultimaAutoriConsep,this.autoriconsepConstantesFunciones.activarfecha_ultimaAutoriConsep,this,true,"fecha_ultimaAutoriConsep","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_FECHA));

		if(this.autoriconsepConstantesFunciones.mostrarfechaAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.autoriconsepConstantesFunciones.resaltarfechaAutoriConsep,this.autoriconsepConstantesFunciones.activarfechaAutoriConsep,this,true,"fechaAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.autoriconsepConstantesFunciones.resaltarfechaAutoriConsep,this.autoriconsepConstantesFunciones.activarfechaAutoriConsep,this,true,"fechaAutoriConsep","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,AutoriConsepConstantesFunciones.LABEL_DESCRIPCION));

		if(this.autoriconsepConstantesFunciones.mostrardescripcionAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriConsepConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autoriconsepConstantesFunciones.resaltardescripcionAutoriConsep,this.autoriconsepConstantesFunciones.activardescripcionAutoriConsep,this,true,"descripcionAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autoriconsepConstantesFunciones.resaltardescripcionAutoriConsep,this.autoriconsepConstantesFunciones.activardescripcionAutoriConsep,this,true,"descripcionAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200);
			//tableColumn.addPropertyChangeListener(new AutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleAutoriConsep && this.autoriconsepConstantesFunciones.mostrarDetalleAutoriConsepAutoriConsep && !AutoriConsepConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Autorizacion Consepes");
				tableColumn.setHeaderValue("Detalle Autorizacion Consepes");
				tableColumn.setCellRenderer(new DetalleAutoriConsepTableCell(autoriconsepConstantesFunciones.resaltarDetalleAutoriConsepAutoriConsep,this,this.autoriconsepConstantesFunciones.activarDetalleAutoriConsepAutoriConsep));
				tableColumn.setCellEditor(new DetalleAutoriConsepTableCell(autoriconsepConstantesFunciones.resaltarDetalleAutoriConsepAutoriConsep,this,this.autoriconsepConstantesFunciones.activarDetalleAutoriConsepAutoriConsep));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosAutoriConsep.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.autoriconsepSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.autoriconsepSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAutoriConsep.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				//tableColumn= new TableColumn();
				//tableColumn.setIdentifier(sLabelColumnAccion);
				//tableColumn.setHeaderValue(sLabelColumnAccion);
				//tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.autoriconsepSessionBean.getEsGuardarRelacionado()));
				//tableColumn.setCellEditor(new IdTableCell(this,false,false,this.autoriconsepSessionBean.getEsGuardarRelacionado()));
		
				//tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				//tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				//tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				//tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				//this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				//this.jTableDatosAutoriConsep.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep) {
					//tableColumn= new TableColumn();
					//tableColumn.setIdentifier(Constantes2.S_ELI);
					//tableColumn.setHeaderValue(sLabelColumnAccionEli);
					//tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.autoriconsepSessionBean.getEsGuardarRelacionado()));
					//tableColumn.setCellEditor(new IdTableCell(this,false,true,this.autoriconsepSessionBean.getEsGuardarRelacionado()));
			
					//tableColumn.setPreferredWidth(65); 	 
					//tableColumn.setWidth(65); 	 
					//tableColumn.setMinWidth(65); 
					//tableColumn.setMaxWidth(65);
					
					//this.iWidthTableDefinicion+=65;
						
					//this.jTableDatosAutoriConsep.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.autoriconsepSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosAutoriConsep.addColumn(tableColumn);
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
			
			this.jTableDatosAutoriConsep.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep) {
				//iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		//iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.autoriconsepSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep) {
				////REUBICA ELIMINAR SIMPLE
				//jTableDatosAutoriConsep.moveColumn(this.jTableDatosAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				//iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		//jTableDatosAutoriConsep.moveColumn(this.jTableDatosAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.autoriconsepSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosAutoriConsep.moveColumn(this.jTableDatosAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAutoriConsep.moveColumn(this.jTableDatosAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAutoriConsep.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAutoriConsep.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAutoriConsep,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAutoriConsep.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAutoriConsep.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAutoriConsep.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAutoriConsep.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAutoriConsep.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=autoriconsepLogic.getAutoriConseps().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=autoriconseps.size()-1;
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
		//this.jTableDatosAutoriConsep.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAutoriConsep();
			
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
				
				//this.isEsNuevoAutoriConsep=false;
					
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
				if(this.autoriconsepSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAutoriConsep==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAutoriConsep.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAutoriConsep.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.autoriconsep.getsType().equals("DUPLICADO")
				   || this.autoriconsep.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAutoriConsep=true;
				
				} else {
					this.isEsNuevoAutoriConsep=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
					if(this.autoriconsep.getId()>=0 && !this.autoriconsep.getIsNew()) {						
						this.isEsNuevoAutoriConsep=false;
						
					} else {
						this.isEsNuevoAutoriConsep=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAutoriConsep(esRelaciones);						
				
				this.seleccionarAutoriConsep(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.autoriconsep.getId()<0) {
					this.isEsNuevoAutoriConsep=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAutoriConsep(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAutoriConsep(evt,rowIndex);
				}	
				
				if(this.autoriconsepSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AutoriConsep: " + this.dDif); 
					}
				}								
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAutoriConsep(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.autoriconsep)) {
					if(this.autoriconsep.getId()>0) {
						this.autoriconsep.setIsDeleted(true);
						
						this.autoriconsepsEliminados.add(this.autoriconsep);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.autoriconsepLogic.getAutoriConseps().remove(this.autoriconsep);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.autoriconseps.remove(this.autoriconsep);				
					}
					
					
					((AutoriConsepModel) this.jTableDatosAutoriConsep.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAutoriConsep(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAutoriConsep(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAutoriConsep) {
			
			if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAutoriConsep.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAutoriConsep.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAutoriConsep(this.autoriconsep);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.autoriconsepConstantesFunciones.cargarid_empresaAutoriConsep || this.autoriconsepConstantesFunciones.event_dependid_empresaAutoriConsep) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.autoriconsep.getid_empresa());
									//this.inicializarActualizarBindingAutoriConsep(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(autoriconsep.getEmpresa()!=null) {
							this.empresasForeignKey.add(autoriconsep.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.autoriconsep.getid_empresa(),false,"Formulario");

					//Usuario
					if(!this.autoriconsepConstantesFunciones.cargarid_usuarioAutoriConsep || this.autoriconsepConstantesFunciones.event_dependid_usuarioAutoriConsep) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.autoriconsep.getid_usuario());
									//this.inicializarActualizarBindingAutoriConsep(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(autoriconsep.getUsuario()!=null) {
							this.usuariosForeignKey.add(autoriconsep.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.autoriconsep.getid_usuario(),false,"Formulario");

					//Cliente
					if(!this.autoriconsepConstantesFunciones.cargarid_clienteAutoriConsep || this.autoriconsepConstantesFunciones.event_dependid_clienteAutoriConsep) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.autoriconsep.getid_cliente());
									//this.inicializarActualizarBindingAutoriConsep(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(autoriconsep.getCliente()!=null) {
							this.clientesForeignKey.add(autoriconsep.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.autoriconsep.getid_cliente(),false,"Formulario");

					//TipoAutoriConsep
					if(!this.autoriconsepConstantesFunciones.cargarid_tipo_autori_consepAutoriConsep || this.autoriconsepConstantesFunciones.event_dependid_tipo_autori_consepAutoriConsep) {
						//this.cargarCombosTipoAutoriConsepsForeignKeyLista(" where id="+this.autoriconsep.getid_tipo_autori_consep());
									//this.inicializarActualizarBindingAutoriConsep(false,false);
						this.tipoautoriconsepsForeignKey=new ArrayList<TipoAutoriConsep>();

						if(autoriconsep.getTipoAutoriConsep()!=null) {
							this.tipoautoriconsepsForeignKey.add(autoriconsep.getTipoAutoriConsep());
						}

						this.addItemDefectoCombosForeignKeyTipoAutoriConsep();
						this.cargarCombosFrameTipoAutoriConsepsForeignKey("Todos");
					}
					this.setActualTipoAutoriConsepForeignKey(this.autoriconsep.getid_tipo_autori_consep(),false,"Formulario");

					//Empleado
					if(!this.autoriconsepConstantesFunciones.cargarid_empleadoAutoriConsep || this.autoriconsepConstantesFunciones.event_dependid_empleadoAutoriConsep) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.autoriconsep.getid_empleado());
									//this.inicializarActualizarBindingAutoriConsep(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(autoriconsep.getEmpleado()!=null) {
							this.empleadosForeignKey.add(autoriconsep.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.autoriconsep.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAutoriConsep("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAutoriConsep(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutoriConsep() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAutoriConsep(AutoriConsep autoriconsep) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAutoriConsep(autoriconsep,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAutoriConsep(AutoriConsep autoriconsep,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAutoriConsep(autoriconsep);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAutoriConsep(autoriconsep,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAutoriConsep(autoriconsep);
	}
	
	public void setVariablesObjetoActualToFormularioAutoriConsep(AutoriConsep autoriconsep) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.setText(autoriconsep.getId().toString());
			this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxes_empresaAutoriConsep.setSelected(autoriconsep.getes_empresa());
			this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnumero_autorizacionAutoriConsep.setText(autoriconsep.getnumero_autorizacion());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_emisionAutoriConsep.setDate(autoriconsep.getfecha_emision());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_vencimientoAutoriConsep.setDate(autoriconsep.getfecha_vencimiento());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_ultimaAutoriConsep.setDate(autoriconsep.getfecha_ultima());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfechaAutoriConsep.setDate(autoriconsep.getfecha());
			this.jInternalFrameDetalleFormAutoriConsep.jTextAreadescripcionAutoriConsep.setText(autoriconsep.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AutoriConsep autoriconsepLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,autoriconsepLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AutoriConsep autoriconsepLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				autoriconsepLocal=this.autoriconsep;
			} else {
				autoriconsepLocal=this.autoriconsepAnterior;
			}
		}
		
		if(this.permiteMantenimiento(autoriconsepLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAutoriConsep(autoriconsepLocal,true);
					
					if(autoriconsepSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(autoriconsepLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(autoriconsepLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAutoriConsep(AutoriConsep autoriconsep,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAutoriConsep(autoriconsep,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(autoriconsep);
	}
	
	public void setVariablesFormularioToObjetoActualAutoriConsep(AutoriConsep autoriconsep,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAutoriConsep(autoriconsep,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAutoriConsep(AutoriConsep autoriconsep,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.getText()==null || this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.getText()=="" || this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.getText()=="Id") {
				this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.setText("0");
			}

			if(conColumnasBase) {autoriconsep.setId(Long.parseLong(this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriConsepConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelIdAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriconsep.setes_empresa(this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxes_empresaAutoriConsep.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriConsepConstantesFunciones.LABEL_ESEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabeles_empresaAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriconsep.setnumero_autorizacion(this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnumero_autorizacionAutoriConsep.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelnumero_autorizacionAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriconsep.setfecha_emision(this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_emisionAutoriConsep.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriConsepConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelfecha_emisionAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriconsep.setfecha_vencimiento(this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_vencimientoAutoriConsep.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelfecha_vencimientoAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriconsep.setfecha_ultima(this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_ultimaAutoriConsep.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelfecha_ultimaAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriconsep.setfecha(this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfechaAutoriConsep.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriConsepConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabelfechaAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriconsep.setdescripcion(this.jInternalFrameDetalleFormAutoriConsep.jTextAreadescripcionAutoriConsep.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriConsepConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriConsep.jLabeldescripcionAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAutoriConsep(AutoriConsep autoriconsepBean,AutoriConsep autoriconsep,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && autoriconsepBean.getid_cliente()!=null && !autoriconsepBean.getid_cliente().equals(-1L))) {autoriconsep.setid_cliente(autoriconsepBean.getid_cliente());}
			if(conDefault || (!conDefault && autoriconsepBean.getid_tipo_autori_consep()!=null && !autoriconsepBean.getid_tipo_autori_consep().equals(-1L))) {autoriconsep.setid_tipo_autori_consep(autoriconsepBean.getid_tipo_autori_consep());}
			if(conDefault || (!conDefault && autoriconsepBean.getid_empleado()!=null && !autoriconsepBean.getid_empleado().equals(-1L))) {autoriconsep.setid_empleado(autoriconsepBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAutoriConsep(AutoriConsep autoriconsepOrigen,AutoriConsep autoriconsep,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && autoriconsepOrigen.getId()!=null && !autoriconsepOrigen.getId().equals(0L))) {autoriconsep.setId(autoriconsepOrigen.getId());}}
			if(conDefault || (!conDefault && autoriconsepOrigen.getes_empresa()!=null && !autoriconsepOrigen.getes_empresa().equals(false))) {autoriconsep.setes_empresa(autoriconsepOrigen.getes_empresa());}
			if(conDefault || (!conDefault && autoriconsepOrigen.getid_cliente()!=null && !autoriconsepOrigen.getid_cliente().equals(-1L))) {autoriconsep.setid_cliente(autoriconsepOrigen.getid_cliente());}
			if(conDefault || (!conDefault && autoriconsepOrigen.getnumero_autorizacion()!=null && !autoriconsepOrigen.getnumero_autorizacion().equals(""))) {autoriconsep.setnumero_autorizacion(autoriconsepOrigen.getnumero_autorizacion());}
			if(conDefault || (!conDefault && autoriconsepOrigen.getid_tipo_autori_consep()!=null && !autoriconsepOrigen.getid_tipo_autori_consep().equals(-1L))) {autoriconsep.setid_tipo_autori_consep(autoriconsepOrigen.getid_tipo_autori_consep());}
			if(conDefault || (!conDefault && autoriconsepOrigen.getid_empleado()!=null && !autoriconsepOrigen.getid_empleado().equals(-1L))) {autoriconsep.setid_empleado(autoriconsepOrigen.getid_empleado());}
			if(conDefault || (!conDefault && autoriconsepOrigen.getfecha_emision()!=null && !autoriconsepOrigen.getfecha_emision().equals(new Date()))) {autoriconsep.setfecha_emision(autoriconsepOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && autoriconsepOrigen.getfecha_vencimiento()!=null && !autoriconsepOrigen.getfecha_vencimiento().equals(new Date()))) {autoriconsep.setfecha_vencimiento(autoriconsepOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && autoriconsepOrigen.getfecha_ultima()!=null && !autoriconsepOrigen.getfecha_ultima().equals(new Date()))) {autoriconsep.setfecha_ultima(autoriconsepOrigen.getfecha_ultima());}
			if(conDefault || (!conDefault && autoriconsepOrigen.getfecha()!=null && !autoriconsepOrigen.getfecha().equals(new Date()))) {autoriconsep.setfecha(autoriconsepOrigen.getfecha());}
			if(conDefault || (!conDefault && autoriconsepOrigen.getdescripcion()!=null && !autoriconsepOrigen.getdescripcion().equals(""))) {autoriconsep.setdescripcion(autoriconsepOrigen.getdescripcion());}
			if(conDefault || (!conDefault && autoriconsepOrigen.getnombre()!=null && !autoriconsepOrigen.getnombre().equals(""))) {autoriconsep.setnombre(autoriconsepOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAutoriConsep(AutoriConsep autoriconsep) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.setText(autoriconsep.getId().toString());
			this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxes_empresaAutoriConsep.setSelected(autoriconsep.getes_empresa());
			this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnumero_autorizacionAutoriConsep.setText(autoriconsep.getnumero_autorizacion());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_emisionAutoriConsep.setDate(autoriconsep.getfecha_emision());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_vencimientoAutoriConsep.setDate(autoriconsep.getfecha_vencimiento());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_ultimaAutoriConsep.setDate(autoriconsep.getfecha_ultima());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfechaAutoriConsep.setDate(autoriconsep.getfecha());
			this.jInternalFrameDetalleFormAutoriConsep.jTextAreadescripcionAutoriConsep.setText(autoriconsep.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAutoriConsep(AutoriConsepBean autoriconsepBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.setText(autoriconsepBean.getId().toString());
			this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxes_empresaAutoriConsep.setSelected(autoriconsepBean.getes_empresa());
			this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnumero_autorizacionAutoriConsep.setText(autoriconsepBean.getnumero_autorizacion());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_emisionAutoriConsep.setDate(autoriconsepBean.getfecha_emision());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_vencimientoAutoriConsep.setDate(autoriconsepBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_ultimaAutoriConsep.setDate(autoriconsepBean.getfecha_ultima());
			this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfechaAutoriConsep.setDate(autoriconsepBean.getfecha());
			this.jInternalFrameDetalleFormAutoriConsep.jTextAreadescripcionAutoriConsep.setText(autoriconsepBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAutoriConsep(AutoriConsepParameterReturnGeneral autoriconsepReturnGeneral,AutoriConsepBean autoriconsepBean,Boolean conDefault) throws Exception { 
		try {
			AutoriConsep autoriconsepLocal=new AutoriConsep();
			
			autoriconsepLocal=autoriconsepReturnGeneral.getAutoriConsep();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && autoriconsepLocal.getId()!=null && !autoriconsepLocal.getId().equals(0L))) {autoriconsepBean.setId(autoriconsepLocal.getId());}}
			if(conDefault || (!conDefault && autoriconsepLocal.getes_empresa()!=null && !autoriconsepLocal.getes_empresa().equals(false))) {autoriconsepBean.setes_empresa(autoriconsepLocal.getes_empresa());}
			if(conDefault || (!conDefault && autoriconsepLocal.getid_cliente()!=null && !autoriconsepLocal.getid_cliente().equals(-1L))) {autoriconsepBean.setid_cliente(autoriconsepLocal.getid_cliente());}
			if(conDefault || (!conDefault && autoriconsepLocal.getnumero_autorizacion()!=null && !autoriconsepLocal.getnumero_autorizacion().equals(""))) {autoriconsepBean.setnumero_autorizacion(autoriconsepLocal.getnumero_autorizacion());}
			if(conDefault || (!conDefault && autoriconsepLocal.getid_tipo_autori_consep()!=null && !autoriconsepLocal.getid_tipo_autori_consep().equals(-1L))) {autoriconsepBean.setid_tipo_autori_consep(autoriconsepLocal.getid_tipo_autori_consep());}
			if(conDefault || (!conDefault && autoriconsepLocal.getid_empleado()!=null && !autoriconsepLocal.getid_empleado().equals(-1L))) {autoriconsepBean.setid_empleado(autoriconsepLocal.getid_empleado());}
			if(conDefault || (!conDefault && autoriconsepLocal.getfecha_emision()!=null && !autoriconsepLocal.getfecha_emision().equals(new Date()))) {autoriconsepBean.setfecha_emision(autoriconsepLocal.getfecha_emision());}
			if(conDefault || (!conDefault && autoriconsepLocal.getfecha_vencimiento()!=null && !autoriconsepLocal.getfecha_vencimiento().equals(new Date()))) {autoriconsepBean.setfecha_vencimiento(autoriconsepLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && autoriconsepLocal.getfecha_ultima()!=null && !autoriconsepLocal.getfecha_ultima().equals(new Date()))) {autoriconsepBean.setfecha_ultima(autoriconsepLocal.getfecha_ultima());}
			if(conDefault || (!conDefault && autoriconsepLocal.getfecha()!=null && !autoriconsepLocal.getfecha().equals(new Date()))) {autoriconsepBean.setfecha(autoriconsepLocal.getfecha());}
			if(conDefault || (!conDefault && autoriconsepLocal.getdescripcion()!=null && !autoriconsepLocal.getdescripcion().equals(""))) {autoriconsepBean.setdescripcion(autoriconsepLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAutoriConsepGenerico(Long idAutoriConsepSeleccionado,JComboBox jComboBoxAutoriConsep,List<AutoriConsep> autoriconsepsLocal)throws Exception {
		try {
			AutoriConsep  autoriconsepTemp=null;

			for(AutoriConsep autoriconsepAux:autoriconsepsLocal) {
				if(autoriconsepAux.getId()!=null && autoriconsepAux.getId().equals(idAutoriConsepSeleccionado)) {
					autoriconsepTemp=autoriconsepAux;
					break;
				}
			}

			jComboBoxAutoriConsep.setSelectedItem(autoriconsepTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAutoriConsepGenerico(JComboBox jComboBoxAutoriConsep,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAutoriConsep.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAutoriConsep.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAutoriConsep.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAutoriConsep.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleAutoriConsep")) {
			jButtonDetalleAutoriConsepActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autoriconsep=(AutoriConsep) autoriconsepLogic.getAutoriConseps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			autoriconsep =(AutoriConsep) autoriconseps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!autoriconsep.getIsNew() && !autoriconsep.getIsChanged() && !autoriconsep.getIsDeleted()) {
				sDescripcion=autoriconsep.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=autoriconsep.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!autoriconsep.getIsNew() && !autoriconsep.getIsChanged() && !autoriconsep.getIsDeleted()) {
				sDescripcion=autoriconsep.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=autoriconsep.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!autoriconsep.getIsNew() && !autoriconsep.getIsChanged() && !autoriconsep.getIsDeleted()) {
				sDescripcion=autoriconsep.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=autoriconsep.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoAutoriConsep")) {
			//sDescripcion=this.getActualTipoAutoriConsepForeignKeyDescripcion((Long)value);
			if(!autoriconsep.getIsNew() && !autoriconsep.getIsChanged() && !autoriconsep.getIsDeleted()) {
				sDescripcion=autoriconsep.gettipoautoriconsep_descripcion();
			} else {
				//sDescripcion=this.getActualTipoAutoriConsepForeignKeyDescripcion((Long)value);
				sDescripcion=autoriconsep.gettipoautoriconsep_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!autoriconsep.getIsNew() && !autoriconsep.getIsChanged() && !autoriconsep.getIsDeleted()) {
				sDescripcion=autoriconsep.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=autoriconsep.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AutoriConsep autoriconsepRow=new AutoriConsep();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autoriconsepRow=(AutoriConsep) autoriconsepLogic.getAutoriConseps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			autoriconsepRow=(AutoriConsep) autoriconseps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleAutoriConsepActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,AutoriConsep autoriconsep) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormAutoriConsep==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep = (AutoriConsep)this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.autoriconsep = (AutoriConsep)this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(autoriconsep!=null) {
						this.autoriconsep = autoriconsep;
					} else {
						this.autoriconsep = new AutoriConsep();
					}
				}

				if(this.isTienePermisosDetalleAutoriConsep && this.permiteMantenimiento(this.autoriconsep)) {
					DetalleAutoriConsepBeanSwingJInternalFrame detalleautoriconsepBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFramePopup=new DetalleAutoriConsepBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleautoriconsepBeanSwingJInternalFrame=this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFramePopup;
					} else {
						detalleautoriconsepBeanSwingJInternalFrame=this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame;
					}

					List<AutoriConsep> autoriconseps=new ArrayList<AutoriConsep>();
					autoriconseps.add(this.autoriconsep);
					if(!esRelacionado) {
						//detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepSessionBean.setConGuardarRelaciones(false);
						//detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleautoriconsepBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormAutoriConsep.cargarDetalleAutoriConsepBeanSwingJInternalFrame(autoriconseps,this.autoriconsep,detalleautoriconsepBeanSwingJInternalFrame,/*conInicializar,*/detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepSessionBean.getConGuardarRelaciones(),detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepSessionBean.getEsGuardarRelacionado());
					detalleautoriconsepBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleautoriconsepBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleAutoriConsep("no_relacionado");

						detalleautoriconsepBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleAutoriConsepConstantesFunciones.ITAMANIOFILATABLA + (DetalleAutoriConsepConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleautoriconsepBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderAutoriConsep=(TitledBorder)this.jScrollPanelDatosAutoriConsep.getBorder();
						TitledBorder titledBorderDetalleAutoriConsep=(TitledBorder)detalleautoriconsepBeanSwingJInternalFrame.jScrollPanelDatosDetalleAutoriConsep.getBorder();

						titledBorderDetalleAutoriConsep.setTitle(titledBorderAutoriConsep.getTitle() + " -> Detalle Autorizacion Consep");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleautoriconsepBeanSwingJInternalFrame);
						}

						detalleautoriconsepBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleautoriconsepBeanSwingJInternalFrame);

						detalleautoriconsepBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.autoriconsepSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Autorizacion Consep",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAutoriConsep(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoAutoriConsep && this.isPermisoNuevoAutoriConsep));			
			this.jButtonDuplicarAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarAutoriConsep && this.isPermisoDuplicarAutoriConsep));			
			this.jButtonCopiarAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarAutoriConsep && this.isPermisoCopiarAutoriConsep));
			this.jButtonVerFormAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormAutoriConsep && this.isPermisoVerFormAutoriConsep));
			
			this.jButtonAbrirOrderByAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenAutoriConsep && this.isPermisoOrdenAutoriConsep));			
			
			this.jButtonNuevoRelacionesAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutoriConsep && this.isPermisoNuevoAutoriConsep));			
			this.jButtonNuevoGuardarCambiosAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoAutoriConsep && this.isPermisoNuevoAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep));
			
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonModificarAutoriConsep.setVisible((this.isVisibilidadCeldaModificarAutoriConsep && this.isPermisoActualizarAutoriConsep));	
			this.jInternalFrameDetalleFormAutoriConsep.jButtonActualizarAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarAutoriConsep && this.isPermisoActualizarAutoriConsep));	
			this.jInternalFrameDetalleFormAutoriConsep.jButtonEliminarAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarAutoriConsep && this.isPermisoEliminarAutoriConsep));
			this.jInternalFrameDetalleFormAutoriConsep.jButtonCancelarAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarAutoriConsep);							
			this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep));			
			
			}
						
			this.jButtonGuardarCambiosTablaAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoAutoriConsep && this.isPermisoNuevoAutoriConsep));						
			this.jButtonDuplicarToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarAutoriConsep && this.isPermisoDuplicarAutoriConsep));						
			this.jButtonCopiarToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarAutoriConsep && this.isPermisoCopiarAutoriConsep));			
			this.jButtonVerFormToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormAutoriConsep && this.isPermisoVerFormAutoriConsep));			
			this.jButtonAbrirOrderByToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenAutoriConsep && this.isPermisoOrdenAutoriConsep));
			this.jButtonNuevoRelacionesToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutoriConsep && this.isPermisoNuevoAutoriConsep));			
			this.jButtonNuevoGuardarCambiosToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoAutoriConsep && this.isPermisoNuevoAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep));			
			
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonModificarToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaModificarAutoriConsep && this.isPermisoActualizarAutoriConsep));	
			this.jInternalFrameDetalleFormAutoriConsep.jButtonActualizarToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarAutoriConsep  && this.isPermisoActualizarAutoriConsep));	
			this.jInternalFrameDetalleFormAutoriConsep.jButtonEliminarToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarAutoriConsep && this.isPermisoEliminarAutoriConsep));
			this.jInternalFrameDetalleFormAutoriConsep.jButtonCancelarToolBarAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarAutoriConsep);				
			this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoAutoriConsep && this.isPermisoNuevoAutoriConsep));			
			this.jMenuItemDuplicarAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarAutoriConsep && this.isPermisoDuplicarAutoriConsep));			
			this.jMenuItemCopiarAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarAutoriConsep && this.isPermisoCopiarAutoriConsep));			
			this.jMenuItemVerFormAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormAutoriConsep && this.isPermisoVerFormAutoriConsep));			
			this.jMenuItemAbrirOrderByAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenAutoriConsep && this.isPermisoOrdenAutoriConsep));			
			//this.jMenuItemMostrarOcultarAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenAutoriConsep && this.isPermisoOrdenAutoriConsep));
			this.jMenuItemDetalleAbrirOrderByAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenAutoriConsep && this.isPermisoOrdenAutoriConsep));			
			//this.jMenuItemDetalleMostrarOcultarAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenAutoriConsep && this.isPermisoOrdenAutoriConsep));			
			this.jMenuItemNuevoRelacionesAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutoriConsep && this.isPermisoNuevoAutoriConsep));			
			this.jMenuItemNuevoGuardarCambiosAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoAutoriConsep && this.isPermisoNuevoAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep));									
			
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			this.jInternalFrameDetalleFormAutoriConsep.jMenuItemModificarAutoriConsep.setVisible((this.isVisibilidadCeldaModificarAutoriConsep && this.isPermisoActualizarAutoriConsep));	
			this.jInternalFrameDetalleFormAutoriConsep.jMenuItemActualizarAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarAutoriConsep && this.isPermisoActualizarAutoriConsep));	
			this.jInternalFrameDetalleFormAutoriConsep.jMenuItemEliminarAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarAutoriConsep && this.isPermisoEliminarAutoriConsep));
			this.jInternalFrameDetalleFormAutoriConsep.jMenuItemCancelarAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarAutoriConsep);				
			}
			
			this.jMenuItemGuardarCambiosAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep));						
			this.jMenuItemGuardarCambiosTablaAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAutoriConsep=this.jButtonNuevoAutoriConsep.isVisible();
			this.isVisibilidadCeldaDuplicarAutoriConsep=this.jButtonDuplicarAutoriConsep.isVisible();
			this.isVisibilidadCeldaCopiarAutoriConsep=this.jButtonCopiarAutoriConsep.isVisible();
			this.isVisibilidadCeldaVerFormAutoriConsep=this.jButtonVerFormAutoriConsep.isVisible();
			
			this.isVisibilidadCeldaOrdenAutoriConsep=this.jButtonAbrirOrderByAutoriConsep.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=this.jButtonNuevoRelacionesAutoriConsep.isVisible();
			this.isVisibilidadCeldaModificarAutoriConsep=this.jButtonModificarAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			this.isVisibilidadCeldaActualizarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jButtonActualizarAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jButtonEliminarAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jButtonCancelarAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosAutoriConsep.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=this.jButtonGuardarCambiosTablaAutoriConsep.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAutoriConsep=this.jButtonNuevoToolBarAutoriConsep.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=this.jButtonNuevoRelacionesToolBarAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			this.isVisibilidadCeldaModificarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jButtonModificarToolBarAutoriConsep.isVisible();
			this.isVisibilidadCeldaActualizarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jButtonActualizarToolBarAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jButtonEliminarToolBarAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jButtonCancelarToolBarAutoriConsep.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAutoriConsep=this.jButtonGuardarCambiosToolBarAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=this.jButtonGuardarCambiosTablaToolBarAutoriConsep.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAutoriConsep=this.jMenuItemNuevoAutoriConsep.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=this.jMenuItemNuevoRelacionesAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			this.isVisibilidadCeldaModificarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jMenuItemModificarAutoriConsep.isVisible();
			this.isVisibilidadCeldaActualizarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jMenuItemActualizarAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jMenuItemEliminarAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.jMenuItemCancelarAutoriConsep.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAutoriConsep=this.jMenuItemGuardarCambiosAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=this.jMenuItemGuardarCambiosTablaAutoriConsep.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAutoriConsep(Boolean esInicializar) {
		if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {			
			if(this.autoriconsepSessionBean.getConGuardarRelaciones()) {
				//if(this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAutoriConsep();
			}
			
			this.inicializarActualizarBindingBotonesManualAutoriConsep(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAutoriConsep() {
		this.jButtonNuevoAutoriConsep.setVisible(this.isPermisoNuevoAutoriConsep);			
		this.jButtonDuplicarAutoriConsep.setVisible(this.isPermisoDuplicarAutoriConsep);			
		this.jButtonCopiarAutoriConsep.setVisible(this.isPermisoCopiarAutoriConsep);			
		this.jButtonVerFormAutoriConsep.setVisible(this.isPermisoVerFormAutoriConsep);			
		
		this.jButtonAbrirOrderByAutoriConsep.setVisible(this.isPermisoOrdenAutoriConsep);					
		
		this.jButtonNuevoRelacionesAutoriConsep.setVisible(this.isPermisoNuevoAutoriConsep);			
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonModificarAutoriConsep.setVisible(this.isPermisoActualizarAutoriConsep);	
			this.jInternalFrameDetalleFormAutoriConsep.jButtonActualizarAutoriConsep.setVisible(this.isPermisoActualizarAutoriConsep);	
			this.jInternalFrameDetalleFormAutoriConsep.jButtonEliminarAutoriConsep.setVisible(this.isPermisoEliminarAutoriConsep);
			this.jInternalFrameDetalleFormAutoriConsep.jButtonCancelarAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarAutoriConsep);						
			this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosAutoriConsep.setVisible(this.isPermisoGuardarCambiosAutoriConsep);							
		}
		
		this.jButtonGuardarCambiosTablaAutoriConsep.setVisible(this.isPermisoActualizarAutoriConsep);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAutoriConsep() {
		this.jInternalFrameDetalleFormAutoriConsep.jButtonModificarAutoriConsep.setVisible(this.isPermisoActualizarAutoriConsep);	
		this.jInternalFrameDetalleFormAutoriConsep.jButtonActualizarAutoriConsep.setVisible(this.isPermisoActualizarAutoriConsep);	
		this.jInternalFrameDetalleFormAutoriConsep.jButtonEliminarAutoriConsep.setVisible(this.isPermisoEliminarAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jButtonCancelarAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarAutoriConsep);							
		this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarAutoriConsep && this.isPermisoGuardarCambiosAutoriConsep));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAutoriConsep() {
		if(AutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAutoriConsep();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAutoriConsep() {
	}
	
	public void jTableDatosAutoriConsepListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAutoriConsep(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.autoriconsep.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAutoriConsepUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAutoriConsep(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriConsep.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriConsep.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.autoriconsepLogic.getConnexion());

				if(this.autoriconsep.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.autoriconsep.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriConsep=(TitledBorder)this.jScrollPanelDatosAutoriConsep.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAutoriConsep.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.autoriconsep.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioAutoriConsepUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebAutoriConsep(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriConsep.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriConsep.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.autoriconsepLogic.getConnexion());

				if(this.autoriconsep.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.autoriconsep.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriConsep=(TitledBorder)this.jScrollPanelDatosAutoriConsep.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderAutoriConsep.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.autoriconsep.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_empresaAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getes_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_empresa = "+this.autoriconsep.getes_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteAutoriConsepActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderAutoriConsep=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosAutoriConsep.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderAutoriConsep=(TitledBorder)this.jScrollPanelDatosAutoriConsep.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderAutoriConsep.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteAutoriConsepUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebAutoriConsep(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriConsep.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriConsep.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.autoriconsepLogic.getConnexion());

				if(this.autoriconsep.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.autoriconsep.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriConsep=(TitledBorder)this.jScrollPanelDatosAutoriConsep.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderAutoriConsep.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.autoriconsep.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_autorizacionAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getnumero_autorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_autorizacion like '%"+this.autoriconsep.getnumero_autorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_autori_consepAutoriConsepUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoautoriconsep=true;

			idTienePermisotipoautoriconsep=this.tienePermisosUsuarioEnPaginaWebAutoriConsep(TipoAutoriConsepConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoautoriconsep) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriConsep.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriConsep.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);

				this.tipoautoriconsepBeanSwingJInternalFrame=new TipoAutoriConsepBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoautoriconsepBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoautoriconsepBeanSwingJInternalFrame.getTipoAutoriConsepLogic().setConnexion(this.autoriconsepLogic.getConnexion());

				if(this.autoriconsep.getid_tipo_autori_consep()!=null) {
					this.tipoautoriconsepBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoautoriconsepBeanSwingJInternalFrame.setIdActual(this.autoriconsep.getid_tipo_autori_consep());
					this.tipoautoriconsepBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoautoriconsepBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoautoriconsepBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoAutoriConsep();
				}

				JInternalFrameBase jinternalFrame =this.tipoautoriconsepBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriConsep=(TitledBorder)this.jScrollPanelDatosAutoriConsep.getBorder();
				TitledBorder titledBordertipoautoriconsep=(TitledBorder)this.tipoautoriconsepBeanSwingJInternalFrame.jScrollPanelDatosTipoAutoriConsep.getBorder();

				titledBordertipoautoriconsep.setTitle(titledBorderAutoriConsep.getTitle() + " -> Tipo Autorizacion Consep");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_autori_consepAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getid_tipo_autori_consep()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_autori_consep = "+this.autoriconsep.getid_tipo_autori_consep().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoAutoriConsepActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderAutoriConsep=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosAutoriConsep.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderAutoriConsep=(TitledBorder)this.jScrollPanelDatosAutoriConsep.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderAutoriConsep.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoAutoriConsepUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebAutoriConsep(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriConsep.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriConsep.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.autoriconsepLogic.getConnexion());

				if(this.autoriconsep.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.autoriconsep.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriConsep=(TitledBorder)this.jScrollPanelDatosAutoriConsep.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderAutoriConsep.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.autoriconsep.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.autoriconsep.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.autoriconsep.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultimaAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getfecha_ultima()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultima = '"+Funciones2.getStringPostgresDate(this.autoriconsep.getfecha_ultima())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.autoriconsep.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.autoriconsep.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.getautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriconsep==null) {
						this.autoriconsep = new AutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);
				}

				if(this.autoriconsep.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.autoriconsep.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNumeroAutorizacionAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriConsep(false,false);

			this.getAutoriConsepsBusquedaPorNumeroAutorizacion();

			this.inicializarActualizarBindingAutoriConsep(false);

			//if(AutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriConsep(false,false);

			this.getAutoriConsepsFK_IdCliente();

			this.inicializarActualizarBindingAutoriConsep(false);

			//if(AutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriConsep(false,false);

			this.getAutoriConsepsFK_IdEmpleado();

			this.inicializarActualizarBindingAutoriConsep(false);

			//if(AutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriConsep(false,false);

			this.getAutoriConsepsFK_IdEmpresa();

			this.inicializarActualizarBindingAutoriConsep(false);

			//if(AutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoAutoriConsepAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriConsep(false,false);

			this.getAutoriConsepsFK_IdTipoAutoriConsep();

			this.inicializarActualizarBindingAutoriConsep(false);

			//if(AutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriConsep(false,false);

			this.getAutoriConsepsFK_IdUsuario();

			this.inicializarActualizarBindingAutoriConsep(false);

			//if(AutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAutoriConsep() {
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
		

		if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
			this.jInternalFrameDetalleFormAutoriConsep.setVisible(false);	    			
			this.jInternalFrameDetalleFormAutoriConsep.dispose();
			this.jInternalFrameDetalleFormAutoriConsep=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAutoriConsep!=null) {
			this.jInternalFrameReporteDinamicoAutoriConsep.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAutoriConsep.dispose();
			this.jInternalFrameReporteDinamicoAutoriConsep=null;
		}
		
		if(this.jInternalFrameImportacionAutoriConsep!=null) {
			this.jInternalFrameImportacionAutoriConsep.setVisible(false);	    			
			this.jInternalFrameImportacionAutoriConsep.dispose();
			this.jInternalFrameImportacionAutoriConsep=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAutoriConsep();
			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
			
			if(sTipo.equals("NuevoAutoriConsep")) {
				jButtonNuevoAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAutoriConsep")) {
				jButtonDuplicarAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAutoriConsep")) {
				jButtonCopiarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("VerFormAutoriConsep")) {
				jButtonVerFormAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAutoriConsep")) {
				jButtonNuevoAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAutoriConsep")) {
				jButtonDuplicarAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAutoriConsep")) {
				jButtonNuevoAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAutoriConsep")) {
				jButtonDuplicarAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAutoriConsep")) {
				jButtonNuevoAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAutoriConsep")) {
				jButtonNuevoAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAutoriConsep")) {
				jButtonNuevoAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAutoriConsep")) {
				jButtonModificarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAutoriConsep")) {
				jButtonModificarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAutoriConsep")) {
				jButtonModificarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAutoriConsep")) {
				jButtonActualizarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAutoriConsep")) {
				jButtonActualizarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAutoriConsep")) {
				jButtonActualizarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("EliminarAutoriConsep")) {
				jButtonEliminarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAutoriConsep")) {
				jButtonEliminarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAutoriConsep")) {
				jButtonEliminarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CancelarAutoriConsep")) {
				jButtonCancelarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAutoriConsep")) {
				jButtonCancelarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAutoriConsep")) {
				jButtonCancelarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CerrarAutoriConsep")) {
				jButtonCerrarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAutoriConsep")) {
				jButtonCerrarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAutoriConsep")) {
				jButtonCerrarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAutoriConsep")) {
				jButtonMostrarOcultarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAutoriConsep")) {
				jButtonCancelarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAutoriConsep")) {
				jButtonGuardarCambiosAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAutoriConsep")) {
				jButtonGuardarCambiosAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAutoriConsep")) {
				jButtonCopiarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAutoriConsep")) {
				jButtonVerFormAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAutoriConsep")) {
				jButtonGuardarCambiosAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAutoriConsep")) {
				jButtonCopiarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAutoriConsep")) {
				jButtonVerFormAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAutoriConsep")) {
				jButtonGuardarCambiosAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAutoriConsep")) {
				jButtonGuardarCambiosAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAutoriConsep")) {
				jButtonGuardarCambiosAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAutoriConsep")) {
				jButtonRecargarInformacionAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAutoriConsep")) {
				jButtonRecargarInformacionAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAutoriConsep")) {
				jButtonRecargarInformacionAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAutoriConsep")) {
				jButtonAnterioresAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAutoriConsep")) {
				jButtonAnterioresAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAutoriConsep")) {
				jButtonAnterioresAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAutoriConsep")) {
				jButtonSiguientesAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAutoriConsep")) {
				jButtonSiguientesAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAutoriConsep")) {
				jButtonSiguientesAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAutoriConsep") || sTipo.equals("MenuItemDetalleAbrirOrderByAutoriConsep")) {
				jButtonAbrirOrderByAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAutoriConsep") || sTipo.equals("MenuItemDetalleMostrarOcultarAutoriConsep")) {
				jButtonMostrarOcultarAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAutoriConsep")) {
				jButtonNuevoGuardarCambiosAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAutoriConsep")) {
				jButtonNuevoGuardarCambiosAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAutoriConsep")) {
				jButtonNuevoGuardarCambiosAutoriConsepActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAutoriConsep")) {
				jButtonCerrarReporteDinamicoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAutoriConsep")) {
				jButtonGenerarReporteDinamicoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAutoriConsep")) {
				
				jButtonGenerarExcelReporteDinamicoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAutoriConsep")) {
				jButtonCerrarImportacionAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAutoriConsep")) {
				
				jButtonGenerarImportacionAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAutoriConsep")) {
				
				jButtonAbrirImportacionAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAutoriConsep")) {
				jComboBoxTiposAccionesAutoriConsepActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAutoriConsep")) {
				jComboBoxTiposRelacionesAutoriConsepActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAutoriConsep")) {
				jComboBoxTiposAccionesAutoriConsepActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAutoriConsep")) {
				
				jComboBoxTiposSeleccionarAutoriConsepActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAutoriConsep")) {
				jTextFieldValorCampoGeneralAutoriConsepActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAutoriConsep")) {
				jButtonAbrirOrderByAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAutoriConsep")) {
				jButtonAbrirOrderByAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAutoriConsep")) {
				jButtonCerrarOrderByAutoriConsepActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAutoriConsepBusqueda")) {
				this.jButtonidAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAutoriConsepUpdate")) {
				this.jButtonid_empresaAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAutoriConsepBusqueda")) {
				this.jButtonid_empresaAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioAutoriConsepUpdate")) {
				this.jButtonid_usuarioAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioAutoriConsepBusqueda")) {
				this.jButtonid_usuarioAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_empresaAutoriConsepBusqueda")) {
				this.jButtones_empresaAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteAutoriConsep")) {
				this.jButtonid_clienteAutoriConsepActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteAutoriConsepUpdate")) {
				this.jButtonid_clienteAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteAutoriConsepBusqueda")) {
				this.jButtonid_clienteAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionAutoriConsepBusqueda")) {
				this.jButtonnumero_autorizacionAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_autori_consepAutoriConsepUpdate")) {
				this.jButtonid_tipo_autori_consepAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_autori_consepAutoriConsepBusqueda")) {
				this.jButtonid_tipo_autori_consepAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoAutoriConsep")) {
				this.jButtonid_empleadoAutoriConsepActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAutoriConsepUpdate")) {
				this.jButtonid_empleadoAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAutoriConsepBusqueda")) {
				this.jButtonid_empleadoAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionAutoriConsepBusqueda")) {
				this.jButtonfecha_emisionAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoAutoriConsepBusqueda")) {
				this.jButtonfecha_vencimientoAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimaAutoriConsepBusqueda")) {
				this.jButtonfecha_ultimaAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAutoriConsepBusqueda")) {
				this.jButtonfechaAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionAutoriConsepBusqueda")) {
				this.jButtondescripcionAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAutoriConsepBusqueda")) {
				this.jButtonnombreAutoriConsepBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteAutoriConsep")) {
				this.jButtonid_clienteAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("id_empleadoAutoriConsep")) {
				this.jButtonid_empleadoAutoriConsepActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorNumeroAutorizacionAutoriConsep")) {
				this.jButtonBusquedaPorNumeroAutorizacionAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteAutoriConsep")) {
				this.jButtonFK_IdClienteAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoAutoriConsep")) {
				this.jButtonFK_IdEmpleadoAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoAutoriConsepAutoriConsep")) {
				this.jButtonFK_IdTipoAutoriConsepAutoriConsepActionPerformed(evt);
			}
			
			;
			
			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAutoriConsep();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriConsepActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				


				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AutoriConsep autoriconsepLocal=null;
			
			if(!this.getEsControlTabla()) {
				autoriconsepLocal=this.autoriconsep;
			} else {
				autoriconsepLocal=this.autoriconsepAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
							
				
				


				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepAnterior =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriconsepAnterior =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
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
			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
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
			
			


			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriConsepActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
								
						
				


				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
								
				
				


				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepAnterior =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriconsepAnterior =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepAnterior =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriconsepAnterior =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriConsepActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
							
				
				


				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriConsepActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsepAnterior =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.autoriconsepAnterior =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
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
			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
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
			
			


			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriConsepActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
								
				
				


				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepAnterior =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriconsepAnterior =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriConsepActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriConsepActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAutoriConsep")) {
					jCheckBoxSeleccionarTodosAutoriConsepItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAutoriConsep")) {
					jCheckBoxSeleccionadosAutoriConsepItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAutoriConsep")) {
					
				}
				
				


				
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
												
				
				


				
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriConsepActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriconsepAnterior =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.autoriconsepAnterior =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriConsepActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
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
			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
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
			
			


			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriConsepActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriconsep);
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
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
				
				


				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriConsep.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriconsepAnterior =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriconsepAnterior =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAutoriConsep")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAutoriConsepListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAutoriConsep.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.autoriconsep =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.autoriconsep =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.autoriconsep);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAutoriConsep")) {
				
				}
				
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAutoriConsep")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAutoriConsep.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAutoriConsep")) {
			
			}
			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAutoriConsep();
			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
			if(sTipo.equals("NuevoAutoriConsep")) {
				jButtonNuevoAutoriConsepActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAutoriConsep")) {
				jButtonDuplicarAutoriConsepActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAutoriConsep")) {
				jButtonCopiarAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAutoriConsep")) {
				jButtonVerFormAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAutoriConsep")) {
				jButtonNuevoAutoriConsepActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAutoriConsep")) {
				jButtonModificarAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAutoriConsep")) {
				jButtonActualizarAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAutoriConsep")) {
				jButtonEliminarAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAutoriConsep")) {
				jButtonGuardarCambiosAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAutoriConsep")) {
				jButtonCancelarAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAutoriConsep")) {
				jButtonCerrarAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAutoriConsep")) {
				jButtonGuardarCambiosAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAutoriConsep")) {
				jButtonNuevoGuardarCambiosAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAutoriConsep")) {
				jButtonAbrirOrderByAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAutoriConsep")) {
				jButtonRecargarInformacionAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAutoriConsep")) {
				jButtonAnterioresAutoriConsepActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAutoriConsep")) {
				jButtonSiguientesAutoriConsepActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAutoriConsepBusqueda")) {
				this.jButtonidAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAutoriConsepUpdate")) {
				this.jButtonid_empresaAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAutoriConsepBusqueda")) {
				this.jButtonid_empresaAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioAutoriConsepUpdate")) {
				this.jButtonid_usuarioAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioAutoriConsepBusqueda")) {
				this.jButtonid_usuarioAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_empresaAutoriConsepBusqueda")) {
				this.jButtones_empresaAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteAutoriConsep")) {
				this.jButtonid_clienteAutoriConsepActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteAutoriConsepUpdate")) {
				this.jButtonid_clienteAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteAutoriConsepBusqueda")) {
				this.jButtonid_clienteAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionAutoriConsepBusqueda")) {
				this.jButtonnumero_autorizacionAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_autori_consepAutoriConsepUpdate")) {
				this.jButtonid_tipo_autori_consepAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_autori_consepAutoriConsepBusqueda")) {
				this.jButtonid_tipo_autori_consepAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoAutoriConsep")) {
				this.jButtonid_empleadoAutoriConsepActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAutoriConsepUpdate")) {
				this.jButtonid_empleadoAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAutoriConsepBusqueda")) {
				this.jButtonid_empleadoAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionAutoriConsepBusqueda")) {
				this.jButtonfecha_emisionAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoAutoriConsepBusqueda")) {
				this.jButtonfecha_vencimientoAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimaAutoriConsepBusqueda")) {
				this.jButtonfecha_ultimaAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAutoriConsepBusqueda")) {
				this.jButtonfechaAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionAutoriConsepBusqueda")) {
				this.jButtondescripcionAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAutoriConsepBusqueda")) {
				this.jButtonnombreAutoriConsepBusquedaActionPerformed(evt);
			}
			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAutoriConsep();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAutoriConsep")) {
				closingInternalFrameAutoriConsep();
				
			} else if(sTipo.equals("jButtonCancelarAutoriConsep")) {
				JInternalFrameBase jInternalFrameDetalleFormAutoriConsep = (JInternalFrameBase)evt.getSource();
	            	
	            AutoriConsepBeanSwingJInternalFrame jInternalFrameParent=(AutoriConsepBeanSwingJInternalFrame)jInternalFrameDetalleFormAutoriConsep.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAutoriConsepActionPerformed(null);
			}
			
			AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.autoriconsep,new Object(),this.autoriconsepParameterGeneral,this.autoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAutoriConsep(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAutoriConsep(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAutoriConsep(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.autoriconsep)) {
			if(!esControlTabla) {
				if(AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);			
				}
				
				if(this.autoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAutoriConsep(this.autoriconsep,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.autoriconsepReturnGeneral=autoriconsepLogic.procesarEventosAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autoriconsepLogic.getAutoriConseps(),this.autoriconsep,this.autoriconsepParameterGeneral,this.isEsNuevoAutoriConsep,classes);//this.autoriconsepLogic.getAutoriConsep()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAutoriConsep(this.autoriconsepReturnGeneral,this.autoriconsepBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.autoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAutoriConsep(classes,this.autoriconsepReturnGeneral,this.autoriconsepBean,false);
					}
						
					if(this.autoriconsepReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAutoriConsep(this.autoriconsepReturnGeneral.getAutoriConsep());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAutoriConsep(this.autoriconsepReturnGeneral.getAutoriConsep());	
					}
						
					if(this.autoriconsepReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAutoriConsep(this.autoriconsepReturnGeneral.getAutoriConsep(),classes);//this.autoriconsepBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAutoriConsep(this.autoriconsep,classes);//this.autoriconsepBean);									
				}
			
				if(AutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAutoriConsep(this.autoriconsep,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriConsep(this.autoriconsep);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.autoriconsepAnterior!=null) {
						this.autoriconsep=this.autoriconsepAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.autoriconsepReturnGeneral=autoriconsepLogic.procesarEventosAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autoriconsepLogic.getAutoriConseps(),this.autoriconsep,this.autoriconsepParameterGeneral,this.isEsNuevoAutoriConsep,classes);//this.autoriconsepLogic.getAutoriConsep()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.autoriconsepSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.autoriconsepSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.autoriconsepReturnGeneral.getAutoriConsep(),autoriconsepLogic.getAutoriConseps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.autoriconsepReturnGeneral.getAutoriConsep(),this.autoriconseps);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAutoriConsep.repaint();
				
				//((AbstractTableModel) this.jTableDatosAutoriConsep.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAutoriConsep();
			}
		}
	}
	
	public void actualizarVisualTableDatosAutoriConsep() throws Exception {
		
		AutoriConsepModel autoriconsepModel=(AutoriConsepModel)this.jTableDatosAutoriConsep.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autoriconsepModel.autoriconseps=this.autoriconsepLogic.getAutoriConseps();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			autoriconsepModel.autoriconseps=this.autoriconseps;
		}
		
		
		((AutoriConsepModel) this.jTableDatosAutoriConsep.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAutoriConsep() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getautoriconsepAnterior(),this.autoriconsepLogic.getAutoriConseps());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getautoriconsepAnterior(),this.autoriconseps);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAutoriConsep();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAutoriConsep(AutoriConsep autoriconsep,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleAutoriConsep.class)) {
					this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.setDetalleAutoriConseps(autoriconsep.getDetalleAutoriConseps());
					this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
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
										
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autoriconsep,new Object(),generalEntityParameterGeneral,this.autoriconsepReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.autoriconsepSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AutoriConsepConstantesFunciones.getClassesRelationshipsOfAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AutoriConsepConstantesFunciones.getClassesRelationshipsFromStringsOfAutoriConsep(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAutoriConsep(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autoriconsep,new Object(),generalEntityParameterGeneral,this.autoriconsepReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAutoriConsep(AutoriConsepBean autoriconsepBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleAutoriConsep.class)) {
					this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.setDetalleAutoriConseps(autoriconsep.getDetalleAutoriConseps());
					this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAutoriConsep(ArrayList<Classe> classes,AutoriConsepReturnGeneral autoriconsepReturnGeneral,AutoriConsepBean autoriconsepBean,Boolean conDefault) throws Exception {
		
			this.autoriconsepBean.setDetalleAutoriConseps(autoriconsepReturnGeneral.getAutoriConsep().getDetalleAutoriConseps());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAutoriConsep(AutoriConsep autoriconsep,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleAutoriConsep.class)) {
					autoriconsep.setDetalleAutoriConseps(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepBeanSwingJInternalFrame.detalleautoriconsepLogic.getDetalleAutoriConseps());
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
		if(!paraTabla && !this.permiteMantenimiento(this.autoriconsep)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAutoriConsep = new AutoriConsepDetalleFormJInternalFrame(jDesktopPane,this.autoriconsepSessionBean.getConGuardarRelaciones(),this.autoriconsepSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.setVisible(false);
		this.jInternalFrameDetalleFormAutoriConsep.setSelected(false);						
		
		this.jInternalFrameDetalleFormAutoriConsep.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAutoriConsep.autoriconsepLogic=this.autoriconsepLogic;
		
		this.cargarCombosFrameForeignKeyAutoriConsep("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAutoriConsep();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAutoriConsep();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAutoriConsep("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAutoriConsep();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAutoriConsep.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAutoriConsep"));
		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonModificarAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarAutoriConsep"));

		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonModificarToolBarAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarToolBarAutoriConsep"));
					
		this.jInternalFrameDetalleFormAutoriConsep.jMenuItemModificarAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemModificarAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonActualizarAutoriConsep.addActionListener (new ButtonActionListener(this,"ActualizarAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonActualizarToolBarAutoriConsep.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAutoriConsep"));
						
		this.jInternalFrameDetalleFormAutoriConsep.jMenuItemActualizarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonEliminarAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonEliminarToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarToolBarAutoriConsep"));
								
		this.jInternalFrameDetalleFormAutoriConsep.jMenuItemEliminarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonCancelarAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonCancelarToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarToolBarAutoriConsep"));
					
		this.jInternalFrameDetalleFormAutoriConsep.jMenuItemCancelarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAutoriConsep"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAutoriConsep.jMenuItemDetalleCerrarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutoriConsep"));
		
		
		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutoriConsep"));
		
		
		
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAutoriConsep"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonidAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empresaAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empresaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_usuarioAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_usuarioAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtones_empresaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"es_empresaAutoriConsepBusqueda"));
		//jButtonid_clienteAutoriConsep.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteAutoriConsepActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsep.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsep"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonnumero_autorizacionAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_tipo_autori_consepAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_autori_consepAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_tipo_autori_consepAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_autori_consepAutoriConsepBusqueda"));
		//jButtonid_empleadoAutoriConsep.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAutoriConsepActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsep.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsep"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfecha_emisionAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfecha_vencimientoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfecha_ultimaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimaAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfechaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fechaAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtondescripcionAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonnombreAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreAutoriConsepBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAutoriConsep.jTabbedPaneRelacionesAutoriConsep.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAutoriConsep"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAutoriConsep"));
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAutoriConsep"));
		}
		
		this.jTableDatosAutoriConsep.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAutoriConsep"));
		
		this.jTableDatosAutoriConsep.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAutoriConsep"));
		
		this.jButtonNuevoAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoAutoriConsep"));
		
		this.jButtonDuplicarAutoriConsep.addActionListener(new ButtonActionListener(this,"DuplicarAutoriConsep"));
		
		this.jButtonCopiarAutoriConsep.addActionListener(new ButtonActionListener(this,"CopiarAutoriConsep"));
		
		this.jButtonVerFormAutoriConsep.addActionListener(new ButtonActionListener(this,"VerFormAutoriConsep"));
		
		
		this.jButtonNuevoToolBarAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoToolBarAutoriConsep"));
			
		this.jButtonDuplicarToolBarAutoriConsep.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAutoriConsep"));
			
		this.jMenuItemNuevoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAutoriConsep"));
			
		this.jMenuItemDuplicarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAutoriConsep"));		
		
		
		this.jButtonNuevoRelacionesAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAutoriConsep"));
		
		
		this.jButtonNuevoRelacionesToolBarAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAutoriConsep"));
			
		this.jMenuItemNuevoRelacionesAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAutoriConsep"));		
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonModificarAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonModificarToolBarAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarToolBarAutoriConsep"));
			
			this.jInternalFrameDetalleFormAutoriConsep.jMenuItemModificarAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemModificarAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAutoriConsep.jButtonActualizarAutoriConsep.addActionListener (new ButtonActionListener(this,"ActualizarAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonActualizarToolBarAutoriConsep.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAutoriConsep"));
				
			this.jInternalFrameDetalleFormAutoriConsep.jMenuItemActualizarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonEliminarAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonEliminarToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarToolBarAutoriConsep"));
						
			this.jInternalFrameDetalleFormAutoriConsep.jMenuItemEliminarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonCancelarAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonCancelarToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarToolBarAutoriConsep"));
			
			this.jInternalFrameDetalleFormAutoriConsep.jMenuItemCancelarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAutoriConsep"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAutoriConsep"));		
		
		
		this.jButtonCerrarAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarAutoriConsep"));
		
		
		this.jButtonCerrarToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarToolBarAutoriConsep"));
			
		this.jMenuItemCerrarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAutoriConsep"));
			
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jMenuItemDetalleCerrarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutoriConsep"));
		}
		
		this.jButtonCopiarToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"CopiarToolBarAutoriConsep"));
			
		this.jButtonVerFormToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"VerFormToolBarAutoriConsep"));
		
		this.jMenuItemGuardarCambiosAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAutoriConsep"));
			
		this.jMenuItemCopiarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAutoriConsep"));		
		
		this.jMenuItemVerFormAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAutoriConsep"));		
		
		
		this.jButtonGuardarCambiosTablaAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAutoriConsep"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAutoriConsep"));
			
		this.jMenuItemGuardarCambiosTablaAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAutoriConsep"));		
		
		
		
		this.jButtonRecargarInformacionAutoriConsep.addActionListener (new ButtonActionListener(this,"RecargarInformacionAutoriConsep"));
					
		this.jButtonRecargarInformacionToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAutoriConsep"));
		
		this.jMenuItemRecargarInformacionAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAutoriConsep"));		
		
		
		
		this.jButtonAnterioresAutoriConsep.addActionListener (new ButtonActionListener(this,"AnterioresAutoriConsep"));
		
		
		this.jButtonAnterioresToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAutoriConsep"));
		
		this.jMenuItemAnterioresAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAutoriConsep"));		
		
		
		this.jButtonSiguientesAutoriConsep.addActionListener (new ButtonActionListener(this,"SiguientesAutoriConsep"));
		
		
		this.jButtonSiguientesToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAutoriConsep"));
			
		this.jMenuItemSiguientesAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAutoriConsep"));
			
		this.jMenuItemAbrirOrderByAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAutoriConsep"));
			
		this.jMenuItemMostrarOcultarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAutoriConsep"));
			
		this.jMenuItemDetalleAbrirOrderByAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAutoriConsep"));
			
		this.jMenuItemDetalleMostarOcultarAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAutoriConsep"));		
		
		
		this.jButtonNuevoGuardarCambiosAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAutoriConsep"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAutoriConsep"));
			
		this.jMenuItemNuevoGuardarCambiosAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAutoriConsep"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAutoriConsep.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAutoriConsep"));

		this.jCheckBoxSeleccionadosAutoriConsep.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAutoriConsep"));
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAutoriConsep"));
		}
		
		
		this.jComboBoxTiposRelacionesAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposRelacionesAutoriConsep"));
			
		this.jComboBoxTiposAccionesAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesAutoriConsep"));
					
		this.jComboBoxTiposSeleccionarAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAutoriConsep"));
			
		this.jTextFieldValorCampoGeneralAutoriConsep.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAutoriConsep"));		
		
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonidAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empresaAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empresaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_usuarioAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_usuarioAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtones_empresaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"es_empresaAutoriConsepBusqueda"));
		//jButtonid_clienteAutoriConsep.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteAutoriConsepActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsep.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsep"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonnumero_autorizacionAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_tipo_autori_consepAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_autori_consepAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_tipo_autori_consepAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_autori_consepAutoriConsepBusqueda"));
		//jButtonid_empleadoAutoriConsep.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAutoriConsepActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsep.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsep"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfecha_emisionAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfecha_vencimientoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfecha_ultimaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimaAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfechaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fechaAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtondescripcionAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonnombreAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreAutoriConsepBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNumeroAutorizacionAutoriConsep.addActionListener(new ButtonActionListener(this,"BusquedaPorNumeroAutorizacionAutoriConsep"));

			this.jButtonFK_IdClienteAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdClienteAutoriConsep"));

			this.jButtonBuscarFK_IdClienteid_clienteAutoriConsep.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsep"));

			this.jButtonFK_IdEmpleadoAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAutoriConsep"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsep"));

			this.jButtonFK_IdTipoAutoriConsepAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdTipoAutoriConsepAutoriConsep"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoAutoriConsep.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutoriConsep"));
				this.jInternalFrameReporteDinamicoAutoriConsep.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutoriConsep"));
				this.jInternalFrameReporteDinamicoAutoriConsep.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutoriConsep"));
			}
			
			//this.jButtonCerrarReporteDinamicoAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutoriConsep"));				
			//this.jButtonGenerarReporteDinamicoAutoriConsep.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutoriConsep"));
			//this.jButtonGenerarExcelReporteDinamicoAutoriConsep.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutoriConsep"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAutoriConsep!=null) {
				this.jInternalFrameImportacionAutoriConsep.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAutoriConsep"));
				this.jInternalFrameImportacionAutoriConsep.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAutoriConsep"));
				this.jInternalFrameImportacionAutoriConsep.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAutoriConsep"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAutoriConsep.addActionListener (new ButtonActionListener(this,"AbrirOrderByAutoriConsep"));
			
			this.jButtonAbrirOrderByToolBarAutoriConsep.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAutoriConsep"));			
			
			if(this.jInternalFrameOrderByAutoriConsep!=null) {
				this.jInternalFrameOrderByAutoriConsep.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAutoriConsep"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriConsep.jTabbedPaneRelacionesAutoriConsep.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAutoriConsep"));
		
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
            		closingInternalFrameAutoriConsep();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAutoriConsep.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAutoriConsep = (JInternalFrameBase)event.getSource();
	            	
	            AutoriConsepBeanSwingJInternalFrame jInternalFrameParent=(AutoriConsepBeanSwingJInternalFrame)jInternalFrameDetalleFormAutoriConsep.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAutoriConsepActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAutoriConsep.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAutoriConsepListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAutoriConsep.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAutoriConsep.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAutoriConsep";
		inputMap = this.jButtonNuevoAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAutoriConsepActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAutoriConsep";
		inputMap = this.jButtonNuevoRelacionesAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAutoriConsepActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAutoriConsep";
		inputMap = this.jButtonModificarAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAutoriConsep";
		inputMap = this.jButtonActualizarAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAutoriConsep";
		inputMap = this.jButtonEliminarAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAutoriConsep";
		inputMap = this.jButtonCancelarAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAutoriConsep";
		inputMap = this.jButtonCerrarAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAutoriConsep";
		inputMap = this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAutoriConsep.jButtonGuardarCambiosAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAutoriConsep.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAutoriConsepItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonidAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empresaAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empresaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_usuarioAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_usuarioAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtones_empresaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"es_empresaAutoriConsepBusqueda"));
		//jButtonid_clienteAutoriConsep.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteAutoriConsepActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsep.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsep"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonnumero_autorizacionAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_tipo_autori_consepAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_autori_consepAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_tipo_autori_consepAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_autori_consepAutoriConsepBusqueda"));
		//jButtonid_empleadoAutoriConsep.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAutoriConsepActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsep.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsep"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfecha_emisionAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfecha_vencimientoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfecha_ultimaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimaAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonfechaAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"fechaAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtondescripcionAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriConsep.jButtonnombreAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreAutoriConsepBusqueda"));
		
		
		this.jButtonBusquedaPorNumeroAutorizacionAutoriConsep.addActionListener(new ButtonActionListener(this,"BusquedaPorNumeroAutorizacionAutoriConsep"));

		this.jButtonFK_IdClienteAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdClienteAutoriConsep"));

		this.jButtonBuscarFK_IdClienteid_clienteAutoriConsep.addActionListener(new ButtonActionListener(this,"id_clienteAutoriConsep"));

		this.jButtonFK_IdEmpleadoAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAutoriConsep"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep.addActionListener(new ButtonActionListener(this,"id_empleadoAutoriConsep"));

		this.jButtonFK_IdTipoAutoriConsepAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdTipoAutoriConsepAutoriConsep"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAutoriConsepActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAutoriConsep.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAutoriConsep(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AutoriConsep autoriconsepAux:this.autoriconsepLogic.getAutoriConseps()) {
					autoriconsepAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriConsep autoriconsepAux:autoriconseps) {
					autoriconsepAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAutoriConsepItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAutoriConsep(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AutoriConsep autoriconsepAux:this.autoriconsepLogic.getAutoriConseps()) {
						autoriconsepAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutoriConsep autoriconsepAux:autoriconseps) {
						autoriconsepAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AutoriConsep autoriconsepAux:this.autoriconsepLogic.getAutoriConseps()) {
					
						if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_ESEMPRESA)) {
							existe=true;
							autoriconsepAux.setes_empresa(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutoriConsep autoriconsepAux:autoriconseps) {
						
						if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_ESEMPRESA)) {
							existe=true;
							autoriconsepAux.setes_empresa(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAutoriConsep(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAutoriConsep.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAutoriConsep.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAutoriConsepItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAutoriConsep(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAutoriConsep.getSelectedRows();
			
			AutoriConsep autoriconsepLocal=new AutoriConsep();
			
			//this.seleccionarTodosAutoriConsep(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriconsepLocal =(AutoriConsep) this.autoriconsepLogic.getAutoriConseps().toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					autoriconsepLocal =(AutoriConsep) this.autoriconseps.toArray()[this.jTableDatosAutoriConsep.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				autoriconsepLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AutoriConsep autoriconsepAux:this.autoriconsepLogic.getAutoriConseps()) {
						autoriconsepAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutoriConsep autoriconsepAux:autoriconseps) {
						autoriconsepAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAutoriConsep(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAutoriConsep.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAutoriConsep.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAutoriConsep,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAutoriConsepItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAutoriConsepParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAutoriConsepActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAutoriConsep(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAutoriConsep.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AutoriConsep autoriconsepAux:this.autoriconsepLogic.getAutoriConseps()) {
				
						if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							autoriconsepAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							autoriconsepAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							autoriconsepAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA)) {
							existe=true;
							autoriconsepAux.setfecha_ultima(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							autoriconsepAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							autoriconsepAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							autoriconsepAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriConsep autoriconsepAux:autoriconseps) {
					
						if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							autoriconsepAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							autoriconsepAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							autoriconsepAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA)) {
							existe=true;
							autoriconsepAux.setfecha_ultima(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							autoriconsepAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							autoriconsepAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							autoriconsepAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAutoriConsep(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAutoriConsepActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAutoriConsep(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAutoriConsep=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAutoriConsep.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAutoriConsep) {				
					conSplash=true;//false;										
					
					//this.startProcessAutoriConsep(conSplash);
				
					this.generarReporteAutoriConsepsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAutoriConsepsSeleccionados();
				//this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAutoriConsepsSeleccionados(false);
				//this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAutoriConsepsSeleccionados(true);
				//this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAutoriConsep();
				
				this.exportarAutoriConsepsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAutoriConseps();
				//this.importarAutoriConseps();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAutoriConsep();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAutoriConsepsSeleccionados();
				//this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Autorizaciones Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAutoriConsep();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAutoriConsep)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAutoriConsep(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Autorizaciones Consep",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.setSelectedIndex(0);					
				}	
			} 			
			else if(AutoriConsepBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAutoriConsep) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAutoriConsep(conSplash);
					
						//this.actualizarParametrosGeneralAutoriConsep();
						
						this.generarReporteProcesoAccionAutoriConsepsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AutoriConsepBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Autorizaciones ConsepES SELECCIONADOS?", "MANTENIMIENTO DE Autorizaciones Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAutoriConsep();
				
						this.actualizarParametrosGeneralAutoriConsep();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.autoriconsepReturnGeneral=autoriconsepLogic.procesarAccionAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.autoriconsepLogic.getAutoriConseps(),this.autoriconsepParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAutoriConsepReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAutoriConsep();
					
					AutoriConsepBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAutoriConsepReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAutoriConsep.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAutoriConsep.jComboBoxTiposAccionesFormularioAutoriConsep.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAutoriConsep(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAutoriConsepActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAutoriConsep();
			
			if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();		
			AutoriConsep autoriconsep=new AutoriConsep();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAutoriConsep(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAutoriConsep.getSelectedItem();
			
			
			
			
			autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
			//this.sTipoAccion;
			
			if(autoriconsepsSeleccionados.size()==1) {
				for(AutoriConsep autoriconsepAux:autoriconsepsSeleccionados) {
					autoriconsep=autoriconsepAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Autorizacion Consep")) {
					jButtonDetalleAutoriConsepActionPerformed(null,rowIndex,true,false,autoriconsep);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAutoriConsep();
			
      		//this.finishProcessAutoriConsep(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAutoriConsepReturnGeneral() throws Exception {
		if(this.autoriconsepReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.autoriconsepReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.autoriconsepReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.autoriconsepReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.autoriconsepReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.autoriconsepReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAutoriConsep(false);
		}
		
		if(this.autoriconsepReturnGeneral.getConRetornoLista() || this.autoriconsepReturnGeneral.getConRetornoObjeto()) {
			if(this.autoriconsepReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.autoriconsepLogic.setAutoriConseps(this.autoriconsepReturnGeneral.getAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.autoriconsepReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.autoriconsepLogic.setAutoriConsep(this.autoriconsepReturnGeneral.getAutoriConsep());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAutoriConsep(false);
		}
	}
	
	public void actualizarParametrosGeneralAutoriConsep() throws Exception {
		
		
	}
	
	public ArrayList<AutoriConsep> getAutoriConsepsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAutoriConsep) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AutoriConsep autoriconsepAux:autoriconsepLogic.getAutoriConseps()) {
					if(autoriconsepAux.getIsSelected()) {
						autoriconsepsSeleccionados.add(autoriconsepAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriConsep autoriconsepAux:this.autoriconseps) {
					if(autoriconsepAux.getIsSelected()) {
						autoriconsepsSeleccionados.add(autoriconsepAux);				
					}
				}
			}
			
			if(autoriconsepsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						autoriconsepsSeleccionados.addAll(this.autoriconsepLogic.getAutoriConseps());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						autoriconsepsSeleccionados.addAll(this.autoriconseps);				
					}
				}
			}
		} else {
			autoriconsepsSeleccionados.add(this.autoriconsep);
		}
		
		return autoriconsepsSeleccionados;
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
	
	public void generarReporteAutoriConsepsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAutoriConsepsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAutoriConsepsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAutoriConsepsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAutoriConsepsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesAutoriConsepsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Autorizaciones Consep",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAutoriConsepsSeleccionados() throws Exception {
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();		
		
		autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAutoriConseps("Todos",autoriconsepsSeleccionados);
		
	}	
	
	public void generarReporteNormalAutoriConsepsSeleccionados() throws Exception {
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();		
		
		autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAutoriConseps("Todos",autoriconsepsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAutoriConsepsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();
		
		autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAutoriConseps("Todos",autoriconsepsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAutoriConsepsSeleccionados() throws Exception {
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAutoriConsep();
		
		
		autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAutoriConsep();
		
		
		//this.generarReporteAutoriConseps("Todos",autoriconsepsSeleccionados ,autoriconsepImplementable,autoriconsepImplementableHome);
	}
	
	public void mostrarImportacionAutoriConseps() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAutoriConsep();
		
		this.abrirFrameImportacionAutoriConsep();		
		
			
		//this.generarReporteAutoriConseps("Todos",autoriconsepsSeleccionados ,autoriconsepImplementable,autoriconsepImplementableHome);
	}
	
	public void importarAutoriConseps() throws Exception {		
	
	}
	
	public void exportarAutoriConsepsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAutoriConsepsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAutoriConsepsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAutoriConsepsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Autorizaciones Consep",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAutoriConsepsSeleccionados() throws Exception {
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();		
		
		autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriconsep."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAutoriConsep(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AutoriConsep autoriconsepAux:autoriconsepsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAutoriConsep(autoriconsepAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//autoriconsepAux.setsDetalleGeneralEntityReporte(autoriconsepAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAutoriConsep(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_ESEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriConsepConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAutoriConsep(AutoriConsep autoriconsep,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=autoriconsep.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getes_empresa().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getnumero_autorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.gettipoautoriconsep_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getfecha_ultima().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriconsep.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAutoriConsepsSeleccionados() throws Exception {
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();		
		
		autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriconsep.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AutoriConseps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAutoriConsep(row);				
				iRow++;
			}				
			
			for(AutoriConsep autoriconsepAux:autoriconsepsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAutoriConsep(autoriconsepAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAutoriConsepsSeleccionados() throws Exception {
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();		
		
		autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriconsep.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("autoriconseps");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("autoriconsep");
			//elementRoot.appendChild(element);
		
			for(AutoriConsep autoriconsepAux:autoriconsepsSeleccionados) {
				element = document.createElement("autoriconsep");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAutoriConsep(autoriconsepAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizaciones Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAutoriConsep(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_ESEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriConsepConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAutoriConsep(AutoriConsep autoriconsep,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getes_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getnumero_autorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.gettipoautoriconsep_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getfecha_ultima());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriconsep.getnombre());				
	}
	
	public void setFilaDatosExportarXmlAutoriConsep(AutoriConsep autoriconsep,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AutoriConsepConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(autoriconsep.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AutoriConsepConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(autoriconsep.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AutoriConsepConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(autoriconsep.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementusuario_descripcion = document.createElement(AutoriConsepConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(autoriconsep.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementes_empresa = document.createElement(AutoriConsepConstantesFunciones.ESEMPRESA);
		elementes_empresa.appendChild(document.createTextNode(autoriconsep.getes_empresa().toString().trim()));
		element.appendChild(elementes_empresa);

		Element elementcliente_descripcion = document.createElement(AutoriConsepConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(autoriconsep.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementnumero_autorizacion = document.createElement(AutoriConsepConstantesFunciones.NUMEROAUTORIZACION);
		elementnumero_autorizacion.appendChild(document.createTextNode(autoriconsep.getnumero_autorizacion().trim()));
		element.appendChild(elementnumero_autorizacion);

		Element elementtipoautoriconsep_descripcion = document.createElement(AutoriConsepConstantesFunciones.IDTIPOAUTORICONSEP);
		elementtipoautoriconsep_descripcion.appendChild(document.createTextNode(autoriconsep.gettipoautoriconsep_descripcion()));
		element.appendChild(elementtipoautoriconsep_descripcion);

		Element elementempleado_descripcion = document.createElement(AutoriConsepConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(autoriconsep.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementfecha_emision = document.createElement(AutoriConsepConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(autoriconsep.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(AutoriConsepConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(autoriconsep.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementfecha_ultima = document.createElement(AutoriConsepConstantesFunciones.FECHAULTIMA);
		elementfecha_ultima.appendChild(document.createTextNode(autoriconsep.getfecha_ultima().toString().trim()));
		element.appendChild(elementfecha_ultima);

		Element elementfecha = document.createElement(AutoriConsepConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(autoriconsep.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementdescripcion = document.createElement(AutoriConsepConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(autoriconsep.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementnombre = document.createElement(AutoriConsepConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(autoriconsep.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoAutoriConsepsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AutoriConsep> autoriconsepsSeleccionados=new ArrayList<AutoriConsep>();
		
		autoriconsepsSeleccionados=this.getAutoriConsepsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAutoriConsep(autoriconsepsSeleccionados);
		
		this.generarReporteAutoriConseps("Todos",autoriconsepsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAutoriConsep(ArrayList<AutoriConsep> autoriconsepsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AutoriConsep autoriconsepAux:autoriconsepsSeleccionados) {
				autoriconsepAux.setsDetalleGeneralEntityReporte(autoriconsepAux.toString());
			
				if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(autoriconsepAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(autoriconsepAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_ESEMPRESA)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(autoriconsepAux.getes_empresa()));
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(autoriconsepAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(autoriconsepAux.getnumero_autorizacion());
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_IDTIPOAUTORICONSEP)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(autoriconsepAux.gettipoautoriconsep_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(autoriconsepAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autoriconsepAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autoriconsepAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHAULTIMA)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autoriconsepAux.getfecha_ultima()));
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autoriconsepAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(autoriconsepAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					autoriconsepAux.setsDescripcionGeneralEntityReporte1(autoriconsepAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAutoriConsep(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAutoriConsep=true;
				this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=true;
				this.isVisibilidadCeldaGuardarCambiosAutoriConsep=true;
			}
			
			this.isVisibilidadCeldaModificarAutoriConsep=false;
			this.isVisibilidadCeldaActualizarAutoriConsep=false;
			this.isVisibilidadCeldaEliminarAutoriConsep=false;
			this.isVisibilidadCeldaCancelarAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriConsep=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=false;
			this.isVisibilidadCeldaModificarAutoriConsep=false;
			this.isVisibilidadCeldaActualizarAutoriConsep=true;
			this.isVisibilidadCeldaEliminarAutoriConsep=false;
			this.isVisibilidadCeldaCancelarAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriConsep=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=false;
			this.isVisibilidadCeldaModificarAutoriConsep=false;
			this.isVisibilidadCeldaActualizarAutoriConsep=true;
			this.isVisibilidadCeldaEliminarAutoriConsep=true;
			this.isVisibilidadCeldaCancelarAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriConsep=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=false;
			this.isVisibilidadCeldaModificarAutoriConsep=false;
			this.isVisibilidadCeldaActualizarAutoriConsep=true;
			this.isVisibilidadCeldaEliminarAutoriConsep=false;
			this.isVisibilidadCeldaCancelarAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarAutoriConsep=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=true;
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=true;
			this.isVisibilidadCeldaModificarAutoriConsep=false;
			this.isVisibilidadCeldaActualizarAutoriConsep=false;
			this.isVisibilidadCeldaEliminarAutoriConsep=false;
			this.isVisibilidadCeldaCancelarAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriConsep=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=false;
			this.isVisibilidadCeldaActualizarAutoriConsep=false;
			this.isVisibilidadCeldaEliminarAutoriConsep=false;
			this.isVisibilidadCeldaCancelarAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarAutoriConsep=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=false;
			this.isVisibilidadCeldaModificarAutoriConsep=true;
			this.isVisibilidadCeldaActualizarAutoriConsep=false;
			this.isVisibilidadCeldaEliminarAutoriConsep=false;
			this.isVisibilidadCeldaCancelarAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarAutoriConsep=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AutoriConsepJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=true;
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=true;
		} else {
			this.actualizarEstadoPanelsAutoriConsep(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAutoriConsep=false;
			//this.isVisibilidadCeldaVerFormAutoriConsep=false;
			this.isVisibilidadCeldaDuplicarAutoriConsep=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!autoriconsepSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=false;
		} else {
			this.isVisibilidadCeldaNuevoAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriConsep=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(autoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(!autoriconsepSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=false;												
			}
			
			this.jButtonCerrarAutoriConsep.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAutoriConsep=false;
		}
		
		if(!this.permiteMantenimiento(this.autoriconsep)) {
			this.isVisibilidadCeldaActualizarAutoriConsep=false;
			this.isVisibilidadCeldaEliminarAutoriConsep=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAutoriConsep() {
		this.isVisibilidadCeldaNuevoAutoriConsep=false;
		this.isVisibilidadCeldaGuardarCambiosAutoriConsep=false;
	}
	
	public void actualizarEstadoPanelsAutoriConsep(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionAutoriConsep.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriConsep!=null) {
				this.jTabbedPaneBusquedasAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriConsep!=null) {
				this.jScrollPanelDatosAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriConsep!=null) {
				this.jPanelPaginacionAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriConsep!=null) {
				this.jPanelParametrosReportesAutoriConsep.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionAutoriConsep.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriConsep!=null) {
				this.jTabbedPaneBusquedasAutoriConsep.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAutoriConsep!=null) {
				this.jScrollPanelDatosAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutoriConsep!=null) {
				this.jPanelPaginacionAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutoriConsep!=null) {
				this.jPanelParametrosReportesAutoriConsep.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionAutoriConsep.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriConsep!=null) {
				this.jTabbedPaneBusquedasAutoriConsep.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAutoriConsep!=null) {
				this.jScrollPanelDatosAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutoriConsep!=null) {
				this.jPanelPaginacionAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutoriConsep!=null) {
				this.jPanelParametrosReportesAutoriConsep.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionAutoriConsep.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriConsep!=null) {
				this.jTabbedPaneBusquedasAutoriConsep.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAutoriConsep!=null) {
				this.jScrollPanelDatosAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutoriConsep!=null) {
				this.jPanelPaginacionAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutoriConsep!=null) {
				this.jPanelParametrosReportesAutoriConsep.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionAutoriConsep.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriConsep!=null) {
				this.jTabbedPaneBusquedasAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriConsep!=null) {
				this.jScrollPanelDatosAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriConsep!=null) {
				this.jPanelPaginacionAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriConsep!=null) {
				this.jPanelParametrosReportesAutoriConsep.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionAutoriConsep.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriConsep!=null) {
				this.jTabbedPaneBusquedasAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriConsep!=null) {
				this.jScrollPanelDatosAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriConsep!=null) {
				this.jPanelPaginacionAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriConsep!=null) {
				this.jPanelParametrosReportesAutoriConsep.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionAutoriConsep.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriConsep!=null) {
				this.jTabbedPaneBusquedasAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriConsep!=null) {
				this.jScrollPanelDatosAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriConsep!=null) {
				this.jPanelPaginacionAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriConsep!=null) {
				this.jPanelParametrosReportesAutoriConsep.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAutoriConsep!=null) {
					this.jTabbedPaneBusquedasAutoriConsep.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAutoriConsep!=null) {
				this.jPanelParametrosReportesAutoriConsep.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriConsep!=null) {
				this.jTabbedPaneBusquedasAutoriConsep.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAutoriConsep!=null) {
				this.jPanelParametrosReportesAutoriConsep.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNumeroAutorizacion=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNumeroAutorizacion) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelBusquedaPorNumeroAutorizacionAutoriConsep);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdClienteAutoriConsep);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdEmpleadoAutoriConsep);}

			this.isVisibilidadFK_IdTipoAutoriConsep=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoAutoriConsep) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdTipoAutoriConsepAutoriConsep);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadBusquedaPorNumeroAutorizacion=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorNumeroAutorizacion) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelBusquedaPorNumeroAutorizacionAutoriConsep);}

			this.isVisibilidadFK_IdCliente=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdClienteAutoriConsep);}

			this.isVisibilidadFK_IdEmpleado=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdEmpleadoAutoriConsep);}

			this.isVisibilidadFK_IdTipoAutoriConsep=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdTipoAutoriConsep) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdTipoAutoriConsepAutoriConsep);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaPorNumeroAutorizacion=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorNumeroAutorizacion) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelBusquedaPorNumeroAutorizacionAutoriConsep);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdClienteAutoriConsep);}

			this.isVisibilidadFK_IdEmpleado=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdEmpleadoAutoriConsep);}

			this.isVisibilidadFK_IdTipoAutoriConsep=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoAutoriConsep) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdTipoAutoriConsepAutoriConsep);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoAutoriConsep(Boolean isParaTipoAutoriConsep){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoAutoriConsepNegation=!isParaTipoAutoriConsep;

			this.isVisibilidadBusquedaPorNumeroAutorizacion=isParaTipoAutoriConsepNegation;
			if(!this.isVisibilidadBusquedaPorNumeroAutorizacion) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelBusquedaPorNumeroAutorizacionAutoriConsep);}

			this.isVisibilidadFK_IdCliente=isParaTipoAutoriConsepNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdClienteAutoriConsep);}

			this.isVisibilidadFK_IdEmpleado=isParaTipoAutoriConsepNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdEmpleadoAutoriConsep);}

			this.isVisibilidadFK_IdTipoAutoriConsep=isParaTipoAutoriConsep;
			if(!this.isVisibilidadFK_IdTipoAutoriConsep) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdTipoAutoriConsepAutoriConsep);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadBusquedaPorNumeroAutorizacion=isParaEmpleadoNegation;
			if(!this.isVisibilidadBusquedaPorNumeroAutorizacion) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelBusquedaPorNumeroAutorizacionAutoriConsep);}

			this.isVisibilidadFK_IdCliente=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdClienteAutoriConsep);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdEmpleadoAutoriConsep);}

			this.isVisibilidadFK_IdTipoAutoriConsep=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoAutoriConsep) {this.jTabbedPaneBusquedasAutoriConsep.remove(jPanelFK_IdTipoAutoriConsepAutoriConsep);}
		}
		
	}
	
	

	public String registrarSesionAutoriConsepParaDetalleAutoriConsepes() throws Exception {
		Boolean isPaginaPopupDetalleAutoriConsep=false;

		try {

			if(this.autoriconsepSessionBean==null) {
				this.autoriconsepSessionBean=new AutoriConsepSessionBean();
			}

			if(this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepSessionBean==null) {
				this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
			}

			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepSessionBean.setsPathNavegacionActual(autoriconsepSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleAutoriConsep=this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep(true);
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleAutoriConsep(AutoriConsepConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepSessionBean.setisBusquedaDesdeForeignKeySesionAutoriConsep(true);
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepSessionBean.setlidAutoriConsepActual(this.idAutoriConsepActual);
			this.jInternalFrameDetalleFormAutoriConsep.detalleautoriconsepSessionBean.setNoMantenimiento(true);

			autoriconsepSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep(true);
			autoriconsepSessionBean.setlIdAutoriConsepActualForeignKey(this.idAutoriConsepActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionAutoriConsepParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(autoriconsepSessionBean==null) {
				autoriconsepSessionBean=new AutoriConsepSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(autoriconsepSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.autoriconsepFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(AutoriConsepConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionAutoriConsep(true);
			//clienteSessionBean.setlidAutoriConsepActual(this.idAutoriConsepActual);

			autoriconsepSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep(true);
			autoriconsepSessionBean.setlIdAutoriConsepActualForeignKey(this.idAutoriConsepActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionAutoriConsepParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(autoriconsepSessionBean==null) {
				autoriconsepSessionBean=new AutoriConsepSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(autoriconsepSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.autoriconsepFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(AutoriConsepConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionAutoriConsep(true);
			//empleadoSessionBean.setlidAutoriConsepActual(this.idAutoriConsepActual);

			autoriconsepSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAutoriConsep(true);
			autoriconsepSessionBean.setlIdAutoriConsepActualForeignKey(this.idAutoriConsepActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AutoriConsepSessionBean autoriconsepSessionBean=new AutoriConsepSessionBean();
		
		if(this.autoriconsepSessionBean==null) {
			this.autoriconsepSessionBean=new AutoriConsepSessionBean();
		}
		
		this.autoriconsepSessionBean.setsUltimaBusquedaAutoriConsep(this.getsAccionBusqueda());
		this.autoriconsepSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.autoriconsepSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNumeroAutorizacion")) {
			autoriconsepSessionBean.setnumero_autorizacion(this.getnumero_autorizacionBusquedaPorNumeroAutorizacion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			autoriconsepSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			autoriconsepSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			autoriconsepSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoAutoriConsep")) {
			autoriconsepSessionBean.setid_tipo_autori_consep(this.getid_tipo_autori_consepFK_IdTipoAutoriConsep());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			autoriconsepSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AutoriConsepSessionBean autoriconsepSessionBean=new AutoriConsepSessionBean();
		
		if(this.autoriconsepSessionBean==null) {
			this.autoriconsepSessionBean=new AutoriConsepSessionBean();
		}
		
		if(this.autoriconsepSessionBean.getsUltimaBusquedaAutoriConsep()!=null&&!this.autoriconsepSessionBean.getsUltimaBusquedaAutoriConsep().equals("")) {
			this.setsAccionBusqueda(autoriconsepSessionBean.getsUltimaBusquedaAutoriConsep());
			this.setiNumeroPaginacion(autoriconsepSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(autoriconsepSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNumeroAutorizacion")) {
				this.setnumero_autorizacionBusquedaPorNumeroAutorizacion(autoriconsepSessionBean.getnumero_autorizacion());
				autoriconsepSessionBean.setnumero_autorizacion("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(autoriconsepSessionBean.getid_cliente());
				autoriconsepSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(autoriconsepSessionBean.getid_empleado());
				autoriconsepSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(autoriconsepSessionBean.getid_empresa());
				autoriconsepSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoAutoriConsep")) {
				this.setid_tipo_autori_consepFK_IdTipoAutoriConsep(autoriconsepSessionBean.getid_tipo_autori_consep());
				autoriconsepSessionBean.setid_tipo_autori_consep(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(autoriconsepSessionBean.getid_usuario());
				autoriconsepSessionBean.setid_usuario(-1L);
			}
		}
		
		this.autoriconsepSessionBean.setsUltimaBusquedaAutoriConsep("");
		this.autoriconsepSessionBean.setiNumeroPaginacion(AutoriConsepConstantesFunciones.INUMEROPAGINACION);
		this.autoriconsepSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAutoriConsep(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAutoriConsep() {
		this.updateBorderResaltarBusquedasFormularioAutoriConsep();
		this.updateVisibilidadBusquedasFormularioAutoriConsep();
		this.updateHabilitarBusquedasFormularioAutoriConsep();
	}
	
	public void updateBorderResaltarBusquedasFormularioAutoriConsep() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAutoriConsep.getComponents().length>0) {
	

		if(this.autoriconsepConstantesFunciones.resaltarBusquedaPorNumeroAutorizacionAutoriConsep!=null) {
			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelBusquedaPorNumeroAutorizacionAutoriConsep);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
				jPanel.setBorder(this.autoriconsepConstantesFunciones.resaltarBusquedaPorNumeroAutorizacionAutoriConsep);
			}
		}

		if(this.autoriconsepConstantesFunciones.resaltarFK_IdClienteAutoriConsep!=null) {
			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdClienteAutoriConsep);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
				jPanel.setBorder(this.autoriconsepConstantesFunciones.resaltarFK_IdClienteAutoriConsep);
			}
		}

		if(this.autoriconsepConstantesFunciones.resaltarFK_IdEmpleadoAutoriConsep!=null) {
			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdEmpleadoAutoriConsep);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
				jPanel.setBorder(this.autoriconsepConstantesFunciones.resaltarFK_IdEmpleadoAutoriConsep);
			}
		}

		if(this.autoriconsepConstantesFunciones.resaltarFK_IdTipoAutoriConsepAutoriConsep!=null) {
			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdTipoAutoriConsepAutoriConsep);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
				jPanel.setBorder(this.autoriconsepConstantesFunciones.resaltarFK_IdTipoAutoriConsepAutoriConsep);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAutoriConsep() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAutoriConsep.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelBusquedaPorNumeroAutorizacionAutoriConsep);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.autoriconsepConstantesFunciones.mostrarBusquedaPorNumeroAutorizacionAutoriConsep);
			if(!this.autoriconsepConstantesFunciones.mostrarBusquedaPorNumeroAutorizacionAutoriConsep && index>-1) {
				this.jTabbedPaneBusquedasAutoriConsep.remove(index);
			}

			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdClienteAutoriConsep);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.autoriconsepConstantesFunciones.mostrarFK_IdClienteAutoriConsep);
			if(!this.autoriconsepConstantesFunciones.mostrarFK_IdClienteAutoriConsep && index>-1) {
				this.jTabbedPaneBusquedasAutoriConsep.remove(index);
			}

			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdEmpleadoAutoriConsep);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.autoriconsepConstantesFunciones.mostrarFK_IdEmpleadoAutoriConsep);
			if(!this.autoriconsepConstantesFunciones.mostrarFK_IdEmpleadoAutoriConsep && index>-1) {
				this.jTabbedPaneBusquedasAutoriConsep.remove(index);
			}

			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdTipoAutoriConsepAutoriConsep);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.autoriconsepConstantesFunciones.mostrarFK_IdTipoAutoriConsepAutoriConsep);
			if(!this.autoriconsepConstantesFunciones.mostrarFK_IdTipoAutoriConsepAutoriConsep && index>-1) {
				this.jTabbedPaneBusquedasAutoriConsep.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAutoriConsep() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAutoriConsep.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelBusquedaPorNumeroAutorizacionAutoriConsep);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.autoriconsepConstantesFunciones.activarBusquedaPorNumeroAutorizacionAutoriConsep);
				this.jTabbedPaneBusquedasAutoriConsep.setEnabledAt(index,this.autoriconsepConstantesFunciones.activarBusquedaPorNumeroAutorizacionAutoriConsep);
			}

			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdClienteAutoriConsep);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.autoriconsepConstantesFunciones.activarFK_IdClienteAutoriConsep);
				this.jTabbedPaneBusquedasAutoriConsep.setEnabledAt(index,this.autoriconsepConstantesFunciones.activarFK_IdClienteAutoriConsep);
			}

			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdEmpleadoAutoriConsep);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.autoriconsepConstantesFunciones.activarFK_IdEmpleadoAutoriConsep);
				this.jTabbedPaneBusquedasAutoriConsep.setEnabledAt(index,this.autoriconsepConstantesFunciones.activarFK_IdEmpleadoAutoriConsep);
			}

			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdTipoAutoriConsepAutoriConsep);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.autoriconsepConstantesFunciones.activarFK_IdTipoAutoriConsepAutoriConsep);
				this.jTabbedPaneBusquedasAutoriConsep.setEnabledAt(index,this.autoriconsepConstantesFunciones.activarFK_IdTipoAutoriConsepAutoriConsep);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAutoriConsep(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNumeroAutorizacion")) {
			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelBusquedaPorNumeroAutorizacionAutoriConsep);

			this.jTabbedPaneBusquedasAutoriConsep.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);

			this.autoriconsepConstantesFunciones.setResaltarBusquedaPorNumeroAutorizacionAutoriConsep(resaltar);

			jPanel.setBorder(this.autoriconsepConstantesFunciones.resaltarBusquedaPorNumeroAutorizacionAutoriConsep);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdClienteAutoriConsep);

			this.jTabbedPaneBusquedasAutoriConsep.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);

			this.autoriconsepConstantesFunciones.setResaltarFK_IdClienteAutoriConsep(resaltar);

			jPanel.setBorder(this.autoriconsepConstantesFunciones.resaltarFK_IdClienteAutoriConsep);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdEmpleadoAutoriConsep);

			this.jTabbedPaneBusquedasAutoriConsep.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);

			this.autoriconsepConstantesFunciones.setResaltarFK_IdEmpleadoAutoriConsep(resaltar);

			jPanel.setBorder(this.autoriconsepConstantesFunciones.resaltarFK_IdEmpleadoAutoriConsep);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoAutoriConsep")) {
			index= this.jTabbedPaneBusquedasAutoriConsep.indexOfComponent(this.jPanelFK_IdTipoAutoriConsepAutoriConsep);

			this.jTabbedPaneBusquedasAutoriConsep.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutoriConsep.getComponent(index);

			this.autoriconsepConstantesFunciones.setResaltarFK_IdTipoAutoriConsepAutoriConsep(resaltar);

			jPanel.setBorder(this.autoriconsepConstantesFunciones.resaltarFK_IdTipoAutoriConsepAutoriConsep);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAutoriConsep.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAutoriConsep() throws Exception {

		if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAutoriConsep();
		this.updateVisibilidadResaltarControlesFormularioAutoriConsep();
		this.updateHabilitarResaltarControlesFormularioAutoriConsep();
		
	}
	
	public void updateBorderResaltarControlesFormularioAutoriConsep() throws Exception {
		if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.autoriconsepConstantesFunciones.resaltaridAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltaridAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarid_empresaAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarid_empresaAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarid_usuarioAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarid_usuarioAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltares_empresaAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxes_empresaAutoriConsep.setBorderPainted(true);this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxes_empresaAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltares_empresaAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarid_clienteAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarid_clienteAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarnumero_autorizacionAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnumero_autorizacionAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarnumero_autorizacionAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarid_tipo_autori_consepAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarid_tipo_autori_consepAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarid_empleadoAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarid_empleadoAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarfecha_emisionAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_emisionAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarfecha_emisionAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarfecha_vencimientoAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_vencimientoAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarfecha_vencimientoAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarfecha_ultimaAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_ultimaAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarfecha_ultimaAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarfechaAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfechaAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarfechaAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltardescripcionAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jTextAreadescripcionAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltardescripcionAutoriConsep);}
		if(this.autoriconsepConstantesFunciones.resaltarnombreAutoriConsep!=null && this.jInternalFrameDetalleFormAutoriConsep!=null) {this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnombreAutoriConsep.setBorder(this.autoriconsepConstantesFunciones.resaltarnombreAutoriConsep);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAutoriConsep() throws Exception {		
		if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
	
		//this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostraridAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelidAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostraridAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_empresaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelid_empresaAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_empresaAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_usuarioAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelid_usuarioAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_usuarioAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxes_empresaAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrares_empresaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPaneles_empresaAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrares_empresaAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_clienteAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelid_clienteAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_clienteAutoriConsep);
			this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_clienteAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnumero_autorizacionAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarnumero_autorizacionAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelnumero_autorizacionAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarnumero_autorizacionAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_tipo_autori_consepAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelid_tipo_autori_consepAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_tipo_autori_consepAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_empleadoAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelid_empleadoAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_empleadoAutoriConsep);
			this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarid_empleadoAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_emisionAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarfecha_emisionAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelfecha_emisionAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarfecha_emisionAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_vencimientoAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarfecha_vencimientoAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelfecha_vencimientoAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarfecha_vencimientoAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_ultimaAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarfecha_ultimaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelfecha_ultimaAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarfecha_ultimaAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfechaAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarfechaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelfechaAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarfechaAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jTextAreadescripcionAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrardescripcionAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPaneldescripcionAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrardescripcionAutoriConsep);
		//this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnombreAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarnombreAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jPanelnombreAutoriConsep.setVisible(this.autoriconsepConstantesFunciones.mostrarnombreAutoriConsep);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAutoriConsep() throws Exception {
		if(this.jInternalFrameDetalleFormAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAutoriConsep!=null) {
	
		this.jInternalFrameDetalleFormAutoriConsep.jLabelidAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activaridAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empresaAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarid_empresaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_usuarioAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarid_usuarioAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jCheckBoxes_empresaAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activares_empresaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_clienteAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarid_clienteAutoriConsep);
			this.jInternalFrameDetalleFormAutoriConsep.jButtonid_clienteAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarid_clienteAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnumero_autorizacionAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarnumero_autorizacionAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_tipo_autori_consepAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarid_tipo_autori_consepAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jComboBoxid_empleadoAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarid_empleadoAutoriConsep);
			this.jInternalFrameDetalleFormAutoriConsep.jButtonid_empleadoAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarid_empleadoAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_emisionAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarfecha_emisionAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_vencimientoAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarfecha_vencimientoAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfecha_ultimaAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarfecha_ultimaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jDateChooserfechaAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarfechaAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jTextAreadescripcionAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activardescripcionAutoriConsep);
		this.jInternalFrameDetalleFormAutoriConsep.jTextFieldnombreAutoriConsep.setEnabled(this.autoriconsepConstantesFunciones.activarnombreAutoriConsep);
		}
	}
	
		
}