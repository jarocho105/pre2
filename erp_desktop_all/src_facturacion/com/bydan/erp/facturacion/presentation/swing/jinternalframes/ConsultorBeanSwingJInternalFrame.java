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

import com.bydan.erp.facturacion.util.ConsultorConstantesFunciones;
import com.bydan.erp.facturacion.util.ConsultorParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ConsultorParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.ConsultorBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ConsultorBeanSwingJInternalFrame extends ConsultorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConsultorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Consultor> consultorValidator = new ClassValidator<Consultor>(Consultor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Consultor consultor;	
	public Consultor consultorAux;
	public Consultor consultorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Consultor consultorTotales;
	public Long idConsultorActual;
	public Long iIdNuevoConsultor=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosGuiaRemision=false;

	public Boolean getIsTienePermisosGuiaRemision() {
		return isTienePermisosGuiaRemision;
	}

	public void setIsTienePermisosGuiaRemision(Boolean isTienePermisosGuiaRemision) {
		this.isTienePermisosGuiaRemision= isTienePermisosGuiaRemision;
	}


	public Boolean isTienePermisosPedidoExpor=false;

	public Boolean getIsTienePermisosPedidoExpor() {
		return isTienePermisosPedidoExpor;
	}

	public void setIsTienePermisosPedidoExpor(Boolean isTienePermisosPedidoExpor) {
		this.isTienePermisosPedidoExpor= isTienePermisosPedidoExpor;
	}


	public Boolean isTienePermisosPedido=false;

	public Boolean getIsTienePermisosPedido() {
		return isTienePermisosPedido;
	}

	public void setIsTienePermisosPedido(Boolean isTienePermisosPedido) {
		this.isTienePermisosPedido= isTienePermisosPedido;
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
	
	public Boolean isPermisoTodoConsultor;
	public Boolean isPermisoNuevoConsultor;
	public Boolean isPermisoActualizarConsultor;
	public Boolean isPermisoActualizarOriginalConsultor;
	public Boolean isPermisoEliminarConsultor;
	public Boolean isPermisoGuardarCambiosConsultor;
	public Boolean isPermisoConsultaConsultor;
	public Boolean isPermisoBusquedaConsultor;
	public Boolean isPermisoReporteConsultor;
	public Boolean isPermisoPaginacionMedioConsultor;
	public Boolean isPermisoPaginacionAltoConsultor;
	public Boolean isPermisoPaginacionTodoConsultor;
	public Boolean isPermisoCopiarConsultor;
	public Boolean isPermisoVerFormConsultor;
	public Boolean isPermisoDuplicarConsultor;
	public Boolean isPermisoOrdenConsultor;
	
	
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
	
	public ConsultorParameterReturnGeneral consultorReturnGeneral;
	public ConsultorParameterReturnGeneral consultorParameterGeneral;
	
	

	public GuiaRemisionLogic guiaremisionLogic=null;

	public GuiaRemisionLogic getGuiaRemisionLogic() {
		return guiaremisionLogic;
	}

	public void setGuiaRemisionLogic(GuiaRemisionLogic guiaremisionLogic) {
		this.guiaremisionLogic = guiaremisionLogic;
	}


	public PedidoExporLogic pedidoexporLogic=null;

	public PedidoExporLogic getPedidoExporLogic() {
		return pedidoexporLogic;
	}

	public void setPedidoExporLogic(PedidoExporLogic pedidoexporLogic) {
		this.pedidoexporLogic = pedidoexporLogic;
	}


	public PedidoLogic pedidoLogic=null;

	public PedidoLogic getPedidoLogic() {
		return pedidoLogic;
	}

	public void setPedidoLogic(PedidoLogic pedidoLogic) {
		this.pedidoLogic = pedidoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConsultor=false;
	public Boolean esParaAccionDesdeFormularioConsultor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConsultorSessionBeanAdditional consultorSessionBeanAdditional=null;
	
	public ConsultorSessionBeanAdditional getConsultorSessionBeanAdditional() {
		return this.consultorSessionBeanAdditional;
	}
	
	public void setConsultorSessionBeanAdditional(ConsultorSessionBeanAdditional consultorSessionBeanAdditional) {
		try {
			this.consultorSessionBeanAdditional=consultorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConsultorBeanSwingJInternalFrameAdditional consultorBeanSwingJInternalFrameAdditional=null;
	//public class ConsultorBeanSwingJInternalFrame
	
	public ConsultorBeanSwingJInternalFrameAdditional getConsultorBeanSwingJInternalFrameAdditional() {
		return this.consultorBeanSwingJInternalFrameAdditional;
	}
	
	public void setConsultorBeanSwingJInternalFrameAdditional(ConsultorBeanSwingJInternalFrameAdditional consultorBeanSwingJInternalFrameAdditional) {
		try {
			this.consultorBeanSwingJInternalFrameAdditional=consultorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConsultorLogic consultorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Consultor consultorBean;
	public ConsultorConstantesFunciones consultorConstantesFunciones;
	//public ConsultorParameterReturnGeneral consultorReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Consultor> consultors;	
	//public List<Consultor> consultorsEliminados;
	//public List<Consultor> consultorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConsultor=false;
	public Boolean isVisibilidadCeldaDuplicarConsultor=true;
	public Boolean isVisibilidadCeldaCopiarConsultor=true;
	public Boolean isVisibilidadCeldaVerFormConsultor=true;
	public Boolean isVisibilidadCeldaOrdenConsultor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConsultor=false;
	public Boolean isVisibilidadCeldaModificarConsultor=false;
	public Boolean isVisibilidadCeldaActualizarConsultor=false;
	public Boolean isVisibilidadCeldaEliminarConsultor=false;
	public Boolean isVisibilidadCeldaCancelarConsultor=false;
	public Boolean isVisibilidadCeldaGuardarConsultor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConsultor=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoConsultor() {
		return this.iIdNuevoConsultor;
	}

	public void setiIdNuevoConsultor(Long iIdNuevoConsultor) {
		this.iIdNuevoConsultor = iIdNuevoConsultor;
	}
	
	public Long getidConsultorActual() {
		return this.idConsultorActual;
	}

	public void setidConsultorActual(Long idConsultorActual) {
		this.idConsultorActual = idConsultorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Consultor getconsultor() {
		return this.consultor;
	}

	public void setconsultor(Consultor consultor) {
		this.consultor = consultor;
	}
	
	public Consultor getconsultorAux() {
		return this.consultorAux;
	}

	public void setconsultorAux(Consultor consultorAux) {
		this.consultorAux = consultorAux;
	}				
	
	public Consultor getconsultorAnterior() {
		return this.consultorAnterior;
	}

	public void setconsultorAnterior(Consultor consultorAnterior) {
		this.consultorAnterior = consultorAnterior;
	}	
	
	public Consultor getconsultorTotales() {
		return this.consultorTotales;
	}

	public void setconsultorTotales(Consultor consultorTotales) {
		this.consultorTotales = consultorTotales;
	}	
	
	public Consultor getconsultorBean() {
		return this.consultorBean;
	}

	public void setconsultorBean(Consultor consultorBean) {
		this.consultorBean = consultorBean;
	}	
	
	public ConsultorParameterReturnGeneral getconsultorReturnGeneral() {
		return this.consultorReturnGeneral;
	}

	public void setconsultorReturnGeneral(ConsultorParameterReturnGeneral consultorReturnGeneral) {
		this.consultorReturnGeneral = consultorReturnGeneral;
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
	
	
	public ConsultorLogic getConsultorLogic()	{		
		return consultorLogic;
	}

	public void setConsultorLogic(ConsultorLogic consultorLogic) {
		this.consultorLogic = consultorLogic;
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
	
	public Boolean getIsEsNuevoConsultor() {
		return isEsNuevoConsultor;
	}

	public void setIsEsNuevoConsultor(Boolean isEsNuevoConsultor) {
		this.isEsNuevoConsultor = isEsNuevoConsultor;
	}

	public Boolean getEsParaAccionDesdeFormularioConsultor() {
		return esParaAccionDesdeFormularioConsultor;
	}
	
	public void setEsParaAccionDesdeFormularioConsultor(Boolean esParaAccionDesdeFormularioConsultor) {
		this.esParaAccionDesdeFormularioConsultor = esParaAccionDesdeFormularioConsultor;
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

			if(this.consultorSessionBean==null) {
				this.consultorSessionBean=new ConsultorSessionBean();
			}

			if(!this.consultorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(consultorSessionBean.getlidEmpresaActual());
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

					if(this.consultor!=null) {
						this.consultor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConsultor!=null) {
						this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConsultor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConsultor!=null) {
						if(this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConsultorGenerico)throws Exception
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
				jComboBoxid_empresaConsultorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConsultorGenerico!=null && jComboBoxid_empresaConsultorGenerico.getItemCount()>0) {
					jComboBoxid_empresaConsultorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Consultor consultor,JComboBox jComboBoxid_empresaConsultorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConsultorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConsultorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				consultor.setid_empresa(empresaAux.getId());
				consultor.setempresa_descripcion(ConsultorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				consultor.setEmpresa(empresaAux);			}
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

					if(!ConsultorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsultor!=null) { 
							this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsultor!=null) { 
					}

					if(!ConsultorJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormConsultor!=null) {
							this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsultor!=null) {
							this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesConsultor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ConsultorConstantesFunciones.refrescarForeignKeysDescripcionesConsultor(this.consultorLogic.getConsultors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ConsultorConstantesFunciones.refrescarForeignKeysDescripcionesConsultor(this.consultors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//consultorLogic.setConsultors(this.consultors);
			consultorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ConsultorParameterReturnGeneral getConsultorParameterGeneral() {
		return this.consultorParameterGeneral;
	}
	
	public void setConsultorParameterGeneral(ConsultorParameterReturnGeneral consultorParameterGeneral) {
		this.consultorParameterGeneral = consultorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConsultor() {
		return isPermisoTodoConsultor;
	}

	public void setIsPermisoTodoConsultor(Boolean isPermisoTodoConsultor) {
		this.isPermisoTodoConsultor = isPermisoTodoConsultor;
	}

	public Boolean getIsPermisoNuevoConsultor() {
		return isPermisoNuevoConsultor;
	}

	public void setIsPermisoNuevoConsultor(Boolean isPermisoNuevoConsultor) {
		this.isPermisoNuevoConsultor = isPermisoNuevoConsultor;
	}

	public Boolean getIsPermisoActualizarConsultor() {
		return isPermisoActualizarConsultor;
	}

	public void setIsPermisoActualizarConsultor(Boolean isPermisoActualizarConsultor) {
		this.isPermisoActualizarConsultor = isPermisoActualizarConsultor;
	}

	public Boolean getIsPermisoEliminarConsultor() {
		return isPermisoEliminarConsultor;
	}

	public void setIsPermisoEliminarConsultor(Boolean isPermisoEliminarConsultor) {
		this.isPermisoEliminarConsultor = isPermisoEliminarConsultor;
	}

	public Boolean getIsPermisoGuardarCambiosConsultor() {
		return isPermisoGuardarCambiosConsultor;
	}

	public void setIsPermisoGuardarCambiosConsultor(Boolean isPermisoGuardarCambiosConsultor) {
		this.isPermisoGuardarCambiosConsultor = isPermisoGuardarCambiosConsultor;
	}
	
	public Boolean getIsPermisoConsultaConsultor() {
		return isPermisoConsultaConsultor;
	}

	public void setIsPermisoConsultaConsultor(Boolean isPermisoConsultaConsultor) {
		this.isPermisoConsultaConsultor = isPermisoConsultaConsultor;
	}

	public Boolean getIsPermisoBusquedaConsultor() {
		return isPermisoBusquedaConsultor;
	}

	public void setIsPermisoBusquedaConsultor(Boolean isPermisoBusquedaConsultor) {
		this.isPermisoBusquedaConsultor = isPermisoBusquedaConsultor;
	}

	public Boolean getIsPermisoReporteConsultor() {
		return isPermisoReporteConsultor;
	}

	public void setIsPermisoReporteConsultor(Boolean isPermisoReporteConsultor) {
		this.isPermisoReporteConsultor = isPermisoReporteConsultor;
	}
	
	public Boolean getIsPermisoPaginacionMedioConsultor() {
		return isPermisoPaginacionMedioConsultor;
	}

	public void setIsPermisoPaginacionMedioConsultor(Boolean isPermisoPaginacionMedioConsultor) {
		this.isPermisoPaginacionMedioConsultor = isPermisoPaginacionMedioConsultor;
	}
	
	public Boolean getIsPermisoPaginacionTodoConsultor() {
		return isPermisoPaginacionTodoConsultor;
	}

	public void setIsPermisoPaginacionTodoConsultor(Boolean isPermisoPaginacionTodoConsultor) {
		this.isPermisoPaginacionTodoConsultor = isPermisoPaginacionTodoConsultor;
	}
	
	public Boolean getIsPermisoPaginacionAltoConsultor() {
		return isPermisoPaginacionAltoConsultor;
	}

	public void setIsPermisoPaginacionAltoConsultor(Boolean isPermisoPaginacionAltoConsultor) {
		this.isPermisoPaginacionAltoConsultor = isPermisoPaginacionAltoConsultor;
	}
	
	public Boolean getIsPermisoCopiarConsultor() {
		return isPermisoCopiarConsultor;
	}

	public void setIsPermisoCopiarConsultor(Boolean isPermisoCopiarConsultor) {
		this.isPermisoCopiarConsultor = isPermisoCopiarConsultor;
	}
	
	public Boolean getIsPermisoVerFormConsultor() {
		return isPermisoVerFormConsultor;
	}

	public void setIsPermisoVerFormConsultor(Boolean isPermisoVerFormConsultor) {
		this.isPermisoVerFormConsultor = isPermisoVerFormConsultor;
	}
	
	public Boolean getIsPermisoDuplicarConsultor() {
		return isPermisoDuplicarConsultor;
	}

	public void setIsPermisoDuplicarConsultor(Boolean isPermisoDuplicarConsultor) {
		this.isPermisoDuplicarConsultor = isPermisoDuplicarConsultor;
	}
	
	public Boolean getIsPermisoOrdenConsultor() {
		return isPermisoOrdenConsultor;
	}

	public void setIsPermisoOrdenConsultor(Boolean isPermisoOrdenConsultor) {
		this.isPermisoOrdenConsultor = isPermisoOrdenConsultor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConsultor() {
		return isVisibilidadCeldaNuevoConsultor;
	}

	public void setIsVisibilidadCeldaNuevoConsultor(Boolean isVisibilidadCeldaNuevoConsultor) {
		this.isVisibilidadCeldaNuevoConsultor = isVisibilidadCeldaNuevoConsultor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConsultor() {
		return isVisibilidadCeldaDuplicarConsultor;
	}

	public void setIsVisibilidadCeldaDuplicarConsultor(Boolean isVisibilidadCeldaDuplicarConsultor) {
		this.isVisibilidadCeldaDuplicarConsultor = isVisibilidadCeldaDuplicarConsultor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConsultor() {
		return isVisibilidadCeldaCopiarConsultor;
	}

	public void setIsVisibilidadCeldaCopiarConsultor(Boolean isVisibilidadCeldaCopiarConsultor) {
		this.isVisibilidadCeldaCopiarConsultor = isVisibilidadCeldaCopiarConsultor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConsultor() {
		return isVisibilidadCeldaVerFormConsultor;
	}

	public void setIsVisibilidadCeldaVerFormConsultor(Boolean isVisibilidadCeldaVerFormConsultor) {
		this.isVisibilidadCeldaVerFormConsultor = isVisibilidadCeldaVerFormConsultor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConsultor() {
		return isVisibilidadCeldaOrdenConsultor;
	}

	public void setIsVisibilidadCeldaOrdenConsultor(Boolean isVisibilidadCeldaOrdenConsultor) {
		this.isVisibilidadCeldaOrdenConsultor = isVisibilidadCeldaOrdenConsultor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConsultor() {
		return isVisibilidadCeldaNuevoRelacionesConsultor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConsultor(Boolean isVisibilidadCeldaNuevoRelacionesConsultor) {
		this.isVisibilidadCeldaNuevoRelacionesConsultor = isVisibilidadCeldaNuevoRelacionesConsultor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConsultor() {
		return isVisibilidadCeldaModificarConsultor;
	}

	public void setIsVisibilidadCeldaModificarConsultor(Boolean isVisibilidadCeldaModificarConsultor) {
		this.isVisibilidadCeldaModificarConsultor = isVisibilidadCeldaModificarConsultor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConsultor() {
		return isVisibilidadCeldaActualizarConsultor;
	}

	public void setIsVisibilidadCeldaActualizarConsultor(Boolean isVisibilidadCeldaActualizarConsultor) {
		this.isVisibilidadCeldaActualizarConsultor = isVisibilidadCeldaActualizarConsultor;
	}

	public Boolean getIsVisibilidadCeldaEliminarConsultor() {
		return isVisibilidadCeldaEliminarConsultor;
	}

	public void setIsVisibilidadCeldaEliminarConsultor(Boolean isVisibilidadCeldaEliminarConsultor) {
		this.isVisibilidadCeldaEliminarConsultor = isVisibilidadCeldaEliminarConsultor;
	}

	public Boolean getIsVisibilidadCeldaCancelarConsultor() {
		return isVisibilidadCeldaCancelarConsultor;
	}

	public void setIsVisibilidadCeldaCancelarConsultor(Boolean isVisibilidadCeldaCancelarConsultor) {
		this.isVisibilidadCeldaCancelarConsultor = isVisibilidadCeldaCancelarConsultor;
	}

	public Boolean getIsVisibilidadCeldaGuardarConsultor() {
		return isVisibilidadCeldaGuardarConsultor;
	}

	public void setIsVisibilidadCeldaGuardarConsultor(Boolean isVisibilidadCeldaGuardarConsultor) {
		this.isVisibilidadCeldaGuardarConsultor = isVisibilidadCeldaGuardarConsultor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConsultor() {
		return isVisibilidadCeldaGuardarCambiosConsultor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConsultor(Boolean isVisibilidadCeldaGuardarCambiosConsultor) {
		this.isVisibilidadCeldaGuardarCambiosConsultor = isVisibilidadCeldaGuardarCambiosConsultor;
	}
		
	public ConsultorSessionBean getconsultorSessionBean() {
		return this.consultorSessionBean;
	}
	
	public void setconsultorSessionBean(ConsultorSessionBean consultorSessionBean) {
		this.consultorSessionBean=consultorSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConsultor(Consultor consultor)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(consultor,null);
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
	
	public void bugActualizarReferenciaActual(Consultor consultor,Consultor consultorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConsultor(consultor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		consultorAux.setId(consultor.getId());
		consultorAux.setVersionRow(consultor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessConsultor();
		
			int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = consultorValidator.getInvalidValues(this.consultor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			consultorLogic.setDatosCliente(datosCliente);
			consultorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				consultorAux=new  Consultor();
				
				consultorAux.setIsNew(true);
				consultorAux.setIsChanged(true);
				
				consultorAux.setConsultorOriginal(this.consultor);
				
				consultorAux.setId(this.consultor.getId());	
				consultorAux.setVersionRow(this.consultor.getVersionRow());	
				consultorAux.setid_empresa(this.consultor.getid_empresa());	
				consultorAux.setidentificacion(this.consultor.getidentificacion());	
				consultorAux.setapellido(this.consultor.getapellido());	
				consultorAux.setnombre(this.consultor.getnombre());	
				consultorAux.setnombre_completo(this.consultor.getnombre_completo());	
				consultorAux.settelefono(this.consultor.gettelefono());	
				consultorAux.sete_mail(this.consultor.gete_mail());	
				consultorAux.setdireccion(this.consultor.getdireccion());	
				consultorAux.setdescripcion(this.consultor.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.consultorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.consultorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(consultorAux,consultorLogic.getConsultors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consultorAux,consultors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.consultorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.consultorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consultorLogic.saveConsultors();//WithConnection
						//consultorLogic.getSetVersionRowConsultors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.consultor,consultorAux);
					
					this.refrescarForeignKeysDescripcionesConsultor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.consultorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions().addAll(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors().addAll(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos().addAll(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisions.addAll(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexpors.addAll(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidos.addAll(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								consultorLogic.saveConsultorRelaciones(consultorAux,this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions(),this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors(),this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());//WithConnection
								//consultorLogic.getSetVersionRowConsultors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.consultor,consultorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.setGuiaRemisions(new ArrayList<GuiaRemision>());
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(new ArrayList<PedidoExpor>());
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(new ArrayList<Pedido>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisions= new ArrayList<GuiaRemision>();
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexpors= new ArrayList<PedidoExpor>();
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidos= new ArrayList<Pedido>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.quitarFilaTotales();}
							consultorAux.setGuiaRemisions(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions());

							if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							consultorAux.setPedidoExpors(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());

							if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.quitarFilaTotales();}
							consultorAux.setPedidos(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.consultorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.consultorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(consultorAux,consultorLogic.getConsultors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(consultorAux,consultors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.consultor,consultorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				consultorAux=new  Consultor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.consultorSessionBean.getEsGuardarRelacionado() 
					|| (this.consultorSessionBean.getEsGuardarRelacionado() && this.consultor.getId()>=0)) {
						
					consultorAux.setIsNew(false);
				}
				
				consultorAux.setIsDeleted(false);
			
				consultorAux.setId(this.consultor.getId());	
				consultorAux.setVersionRow(this.consultor.getVersionRow());	
				consultorAux.setid_empresa(this.consultor.getid_empresa());	
				consultorAux.setidentificacion(this.consultor.getidentificacion());	
				consultorAux.setapellido(this.consultor.getapellido());	
				consultorAux.setnombre(this.consultor.getnombre());	
				consultorAux.setnombre_completo(this.consultor.getnombre_completo());	
				consultorAux.settelefono(this.consultor.gettelefono());	
				consultorAux.sete_mail(this.consultor.gete_mail());	
				consultorAux.setdireccion(this.consultor.getdireccion());	
				consultorAux.setdescripcion(this.consultor.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(consultorAux,consultorLogic.getConsultors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consultorAux,consultors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.consultorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.consultorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consultorLogic.saveConsultors();//WithConnection
						//consultorLogic.getSetVersionRowConsultors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.consultor,consultorAux);
					
					this.refrescarForeignKeysDescripcionesConsultor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.consultorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions().addAll(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors().addAll(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos().addAll(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisions.addAll(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexpors.addAll(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidos.addAll(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								consultorLogic.saveConsultorRelaciones(consultorAux,this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions(),this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors(),this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());//WithConnection
								//consultorLogic.getSetVersionRowConsultors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.consultor,consultorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.setGuiaRemisions(new ArrayList<GuiaRemision>());
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(new ArrayList<PedidoExpor>());
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(new ArrayList<Pedido>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisions= new ArrayList<GuiaRemision>();
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexpors= new ArrayList<PedidoExpor>();
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidos= new ArrayList<Pedido>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.quitarFilaTotales();}
							consultorAux.setGuiaRemisions(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions());

							if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							consultorAux.setPedidoExpors(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());

							if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.quitarFilaTotales();}
							consultorAux.setPedidos(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.consultorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.consultorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(consultorAux,consultorLogic.getConsultors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(consultorAux,consultors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.consultor,consultorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				consultorAux=new  Consultor();
				
				consultorAux.setIsNew(false);
				consultorAux.setIsChanged(false);
				
				consultorAux.setIsDeleted(true);
				
				consultorAux.setId(this.consultor.getId());	
				consultorAux.setVersionRow(this.consultor.getVersionRow());	
				consultorAux.setid_empresa(this.consultor.getid_empresa());	
				consultorAux.setidentificacion(this.consultor.getidentificacion());	
				consultorAux.setapellido(this.consultor.getapellido());	
				consultorAux.setnombre(this.consultor.getnombre());	
				consultorAux.setnombre_completo(this.consultor.getnombre_completo());	
				consultorAux.settelefono(this.consultor.gettelefono());	
				consultorAux.sete_mail(this.consultor.gete_mail());	
				consultorAux.setdireccion(this.consultor.getdireccion());	
				consultorAux.setdescripcion(this.consultor.getdescripcion());	
				
				if(this.consultorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.consultorAux.getId()>=0) {	
						this.consultorsEliminados.add(consultorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(consultorAux,consultorLogic.getConsultors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consultorAux,consultors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.consultorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.consultorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consultorLogic.saveConsultors();//WithConnection
						//consultorLogic.getSetVersionRowConsultors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.consultorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions().addAll(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors().addAll(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos().addAll(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisions.addAll(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexpors.addAll(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporsEliminados);
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidos.addAll(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jInternalFrameDetalleFormGuiaRemision.detalleguiaremisionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoExpor.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								consultorLogic.saveConsultorRelaciones(consultorAux,this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions(),this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors(),this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());//WithConnection
								//consultorLogic.getSetVersionRowConsultors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.setGuiaRemisions(new ArrayList<GuiaRemision>());
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(new ArrayList<PedidoExpor>());
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(new ArrayList<Pedido>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisions= new ArrayList<GuiaRemision>();
							this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexpors= new ArrayList<PedidoExpor>();
							this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidos= new ArrayList<Pedido>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.quitarFilaTotales();}
							consultorAux.setGuiaRemisions(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions());

							if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							consultorAux.setPedidoExpors(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());

							if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.quitarFilaTotales();}
							consultorAux.setPedidos(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.consultorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.consultorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(consultorAux,consultorLogic.getConsultors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(consultorAux,consultors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getConsultors().addAll(this.consultorsEliminados);
					
					consultorLogic.saveConsultors();//WithConnection
					//consultorLogic.getSetVersionRowConsultors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesConsultor();
				
				this.consultorsEliminados= new ArrayList<Consultor>();		
			}
			
			if(this.consultorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consultorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Consultor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Consultor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.consultor=consultorAux;
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
      		//this.finishProcessConsultor();
      	}
		
	}	
	
	public void actualizarRelaciones(Consultor consultorLocal) throws Exception {
		
		if(this.consultorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				consultorLocal.setGuiaRemisions(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions());
				consultorLocal.setPedidoExpors(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
				consultorLocal.setPedidos(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());
			
			} else {
			
				consultorLocal.setGuiaRemisions(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisions);
				consultorLocal.setPedidoExpors(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexpors);
				consultorLocal.setPedidos(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Consultor consultorLocal) throws Exception {	
		if(this.consultorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				consultorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConsultorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = consultorValidator.getInvalidValues(this.consultor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Consultor consultor,List<Consultor> consultors) throws Exception {
		try	{		
			ConsultorConstantesFunciones.actualizarLista(consultor,consultors,this.consultorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Consultor consultor,List<Consultor> consultors) throws Exception {
		try	{			
			ConsultorConstantesFunciones.actualizarSelectedLista(consultor,consultors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Consultor> consultorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				consultorsLocal=this.consultorLogic.getConsultors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				consultorsLocal=this.consultors;
			}
			//ARCHITECTURE
		
			for(Consultor consultorLocal:consultorsLocal) {
				if(this.permiteMantenimiento(consultorLocal) && consultorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConsultorConstantesFunciones.getConsultorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConsultorConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabelid_empresaConsultor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsultorConstantesFunciones.IDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabelidentificacionConsultor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsultorConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabelapellidoConsultor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsultorConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabelnombreConsultor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsultorConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabelnombre_completoConsultor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsultorConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabeltelefonoConsultor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsultorConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabele_mailConsultor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsultorConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabeldireccionConsultor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsultorConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabeldescripcionConsultor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConsultor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsultor.jLabelid_empresaConsultor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsultor.jLabelidentificacionConsultor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsultor.jLabelapellidoConsultor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsultor.jLabelnombreConsultor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsultor.jLabelnombre_completoConsultor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsultor.jLabeltelefonoConsultor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsultor.jLabele_mailConsultor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsultor.jLabeldireccionConsultor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsultor.jLabeldescripcionConsultor,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("GuiaRemision")) {
			if(this.consultor==null) {
				this.consultor= new Consultor();
			}

			if(this.consultorSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoConsultor
				this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);

				this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.getguiaremision().setConsultor(this.consultor);
			}

			return;
		}
		 else  if(sTipo.equals("PedidoExpor")) {
			if(this.consultor==null) {
				this.consultor= new Consultor();
			}

			if(this.consultorSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoConsultor
				this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);

				this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.getpedidoexpor().setConsultor(this.consultor);
			}

			return;
		}
		 else  if(sTipo.equals("Pedido")) {
			if(this.consultor==null) {
				this.consultor= new Consultor();
			}

			if(this.consultorSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoConsultor
				this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);

				this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.getpedido().setConsultor(this.consultor);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoConsultor--;	
		
		
		this.consultorAux=new Consultor();
		
		this.consultorAux.setId(this.iIdNuevoConsultor);
		this.consultorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consultorLogic.getConsultors().add(this.consultorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.consultors.add(this.consultorAux);
		}
		//ARCHITECTURE
		
		this.consultor=this.consultorAux;
		
		if(ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConsultor(this.consultor);
			this.setVariablesObjetoActualToFormularioForeignKeyConsultor(this.consultor);
		}
				
		//this.setDefaultControlesConsultor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConsultor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConsultor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsultor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsultor(this.consultorBean,this.consultor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ConsultorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.consultorSessionBean.getConGuardarRelaciones()) {
			classes=ConsultorConstantesFunciones.getClassesRelationshipsOfConsultor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.consultorReturnGeneral=consultorLogic.procesarEventosConsultorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consultorLogic.getConsultors(),this.consultor,this.consultorParameterGeneral,this.isEsNuevoConsultor,classes);//this.consultorLogic.getConsultor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConsultor(this.consultorReturnGeneral,this.consultorBean,false);
		
		if(this.consultorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConsultor(this.consultorReturnGeneral.getConsultor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConsultor(this.consultorReturnGeneral.getConsultor());
		}
		
		if(this.consultorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConsultor(this.consultorReturnGeneral.getConsultor(),classes);//this.consultorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConsultor(this.consultor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConsultor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConsultor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConsultorBeanSwingJInternalFrameAdditional.RecargarFormConsultor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConsultor(false);
						
			if(consultorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.getEsGuardarRelacionado() && GuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGuiaRemisionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado() && PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoExporActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoSessionBean.getEsGuardarRelacionado() && PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ConsultorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsultor();
			}
			
			this.actualizarVisualTableDatosConsultor();
			
			this.jTableDatosConsultor.setRowSelectionInterval(this.getIndiceNuevoConsultor(), this.getIndiceNuevoConsultor());
			
			this.seleccionarFilaTablaConsultorActual();
						
			this.actualizarEstadoCeldasBotonesConsultor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConsultor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConsultor.jTextFieldidentificacionConsultor.setEnabled(isHabilitar && this.consultorConstantesFunciones.activaridentificacionConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreaapellidoConsultor.setEnabled(isHabilitar && this.consultorConstantesFunciones.activarapellidoConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreanombreConsultor.setEnabled(isHabilitar && this.consultorConstantesFunciones.activarnombreConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreanombre_completoConsultor.setEnabled(isHabilitar && this.consultorConstantesFunciones.activarnombre_completoConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreatelefonoConsultor.setEnabled(isHabilitar && this.consultorConstantesFunciones.activartelefonoConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreae_mailConsultor.setEnabled(isHabilitar && this.consultorConstantesFunciones.activare_mailConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreadireccionConsultor.setEnabled(isHabilitar && this.consultorConstantesFunciones.activardireccionConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreadescripcionConsultor.setEnabled(isHabilitar && this.consultorConstantesFunciones.activardescripcionConsultor);	
		//
		this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.setEnabled(isHabilitar && this.consultorConstantesFunciones.activarid_empresaConsultor);
	};
	
	public void setDefaultControlesConsultor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConsultor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.consultorSessionBean.setConGuardarRelaciones(true);			
			this.consultorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.consultorSessionBean.setConGuardarRelaciones(false);			
			this.consultorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoConsultor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Consultor consultorAux:this.consultorLogic.getConsultors()) {
				if(consultorAux.getId().equals(this.iIdNuevoConsultor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Consultor consultorAux:this.consultors) {
				if(consultorAux.getId().equals(this.iIdNuevoConsultor)) {
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
	
	public int getIndiceActualConsultor(Consultor consultor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Consultor consultorAux:this.consultorLogic.getConsultors()) {
				if(consultorAux.getId().equals(consultor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Consultor consultorAux:this.consultors) {
				if(consultorAux.getId().equals(consultor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConsultor(Consultor consultorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Consultor consultorAux:this.consultorLogic.getConsultors()) {
				if(consultorAux.getConsultorOriginal().getId().equals(consultorOriginal.getId())) {
					existe=true;
					consultorOriginal.setId(consultorAux.getId());
					consultorOriginal.setVersionRow(consultorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Consultor consultorAux:this.consultors) {
				if(consultorAux.getConsultorOriginal().getId().equals(consultorOriginal.getId())) {
					existe=true;
					consultorOriginal.setId(consultorAux.getId());
					consultorOriginal.setVersionRow(consultorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConsultor(Boolean esParaCancelar) throws Exception {
		consultorsAux=new ArrayList<Consultor>();
		consultorAux=new Consultor();
		
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Consultor consultorAux:this.consultorLogic.getConsultors()) {
					if(consultorAux.getId()<0) {
						consultorsAux.add(consultorAux);
					}		
				}
				this.iIdNuevoConsultor=0L;
				this.consultorLogic.getConsultors().removeAll(consultorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Consultor consultorAux:this.consultors) {
					if(consultorAux.getId()<0) {
						consultorsAux.add(consultorAux);
					}		
				}
				this.iIdNuevoConsultor=0L;
				this.consultors.removeAll(consultorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConsultor 
					&& this.consultorLogic.getConsultors().size()>0
					) {
					consultorAux=this.consultorLogic.getConsultors().get(this.consultorLogic.getConsultors().size() - 1);
				
					if(consultorAux.getId()<0) {
						this.consultorLogic.getConsultors().remove(consultorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConsultor && this.consultors.size()>0) {
					consultorAux=this.consultors.get(this.consultors.size() - 1);
				
					if(consultorAux.getId()<0) {
						this.consultors.remove(consultorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConsultor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(consultor.getId()<0) {
				this.consultorLogic.getConsultors().remove(this.consultor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(consultor.getId()<0) {
				this.consultors.remove(this.consultor);
			}
		}			
	}
	
	public void setEstadosInicialesConsultor(List<Consultor> consultorsAux) throws Exception {
		ConsultorConstantesFunciones.setEstadosInicialesConsultor(consultorsAux);
	}
	
	public void setEstadosInicialesConsultor(Consultor consultorAux) throws Exception {
		ConsultorConstantesFunciones.setEstadosInicialesConsultor(consultorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConsultorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConsultor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConsultorActual()) {
				if(!this.isEsNuevoConsultor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConsultor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConsultor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConsultorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Consultor ?", "MANTENIMIENTO DE Consultor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConsultor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Consultor consultor) throws Exception {
		ConsultorConstantesFunciones.seleccionarAsignar(this.consultor,consultor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConsultor=this.isPermisoActualizarOriginalConsultor;
			
			
			this.seleccionarAsignar(consultor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConsultorConstantesFunciones.quitarEspaciosConsultor(this.consultor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesConsultor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.consultorSessionBean.setsFuncionBusquedaRapida(this.consultorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConsultor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConsultor(esParaCancelar);				
				this.cancelarNuevoConsultor(esParaCancelar);								
			}
			
			this.consultor=new Consultor();
			
			this.inicializarConsultor();
			
			this.actualizarEstadoCeldasBotonesConsultor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConsultor() throws Exception {
		try {
			ConsultorConstantesFunciones.inicializarConsultor(this.consultor);
			
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
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.consultorLogic.getConsultors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConsultors(String sAccionBusqueda,List<Consultor> consultorsParaReportes) throws Exception {
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
					sPathReporteFinal="Consultor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConsultorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConsultorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Consultor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Consultores");		
		parameters.put("busquedapor", ConsultorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(GuiaRemision.class));
			classes.add(new Classe(PedidoExpor.class));
			classes.add(new Classe(Pedido.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ConsultorLogic consultorLogicAuxiliar=new ConsultorLogic();
					consultorLogicAuxiliar.setDatosCliente(consultorLogic.getDatosCliente());				
					consultorLogicAuxiliar.setConsultors(consultorsParaReportes);
					
					consultorLogicAuxiliar.cargarRelacionesLoteForeignKeyConsultorWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					consultorsParaReportes=consultorLogicAuxiliar.getConsultors();
					
					//consultorLogic.getNewConnexionToDeep();
					
					//for (Consultor consultor:consultorsParaReportes) {
					//	consultorLogic.deepLoad(consultor, false, DeepLoadType.INCLUDE, classes);
					//}						
					//consultorLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//consultorLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileGuiaRemision = AuxiliarReportes.class.getResourceAsStream("GuiaRemisionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_guiaremision", reportFileGuiaRemision);

			InputStream reportFilePedidoExpor = AuxiliarReportes.class.getResourceAsStream("PedidoExporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidoexpor", reportFilePedidoExpor);

			InputStream reportFilePedido = AuxiliarReportes.class.getResourceAsStream("PedidoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedido", reportFilePedido);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConsultor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConsultorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConsultorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConsultor=new JRBeanArrayDataSource(ConsultorJInternalFrame.TraerConsultorBeans(consultorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConsultor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConsultorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConsultorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConsultorBean.TraerConsultorBeans(consultorsParaReportes).toArray()));
							
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
				this.generarExcelReporteConsultors(sAccionBusqueda,sTipoArchivoReporte,consultorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConsultors(sAccionBusqueda,sTipoArchivoReporte,consultorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConsultorActionPerformed(null);
					//this.generarExcelReporteConsultors(sAccionBusqueda,sTipoArchivoReporte,consultorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConsultors(sAccionBusqueda,sTipoArchivoReporte,consultorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConsultors(sAccionBusqueda,sTipoArchivoReporte,consultorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConsultors(sAccionBusqueda,sTipoArchivoReporte,consultorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConsultors(String sAccionBusqueda,String sTipoArchivoReporte,List<Consultor> consultorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consultor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Consultors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsultor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Consultor consultor : consultorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConsultorConstantesFunciones.generarExcelReporteDataConsultor("NORMAL",row,workbook,consultor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consultorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consultor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConsultor(String sTipo,Row row,Workbook workbook) {
		
		ConsultorConstantesFunciones.generarExcelReporteHeaderConsultor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConsultors(String sAccionBusqueda,String sTipoArchivoReporte,List<Consultor> consultorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consultor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Consultors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Consultor consultor : consultorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConsultorConstantesFunciones.getConsultorDescripcion(consultor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsultorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsultorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consultor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsultorConstantesFunciones.LABEL_IDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsultorConstantesFunciones.LABEL_IDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consultor.getidentificacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsultorConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsultorConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consultor.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsultorConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsultorConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consultor.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consultor.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsultorConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsultorConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consultor.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsultorConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsultorConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consultor.gete_mail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsultorConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsultorConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consultor.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsultorConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsultorConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consultor.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consultorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consultor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConsultors(String sAccionBusqueda,String sTipoArchivoReporte,List<Consultor> consultorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Consultor> consultorsRespaldo=null;
		
		classes=ConsultorConstantesFunciones.getClassesRelationshipsOfConsultor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.consultorLogic.setDatosCliente(this.datosCliente);
		this.consultorLogic.setDatosDeep(this.datosDeep);
		this.consultorLogic.setIsConDeep(true);
		
		consultorsRespaldo=this.consultorLogic.getConsultors();
		
		this.consultorLogic.setConsultors(consultorsParaReportes);	
		this.consultorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		consultorsParaReportes=this.consultorLogic.getConsultors();
		this.consultorLogic.setConsultors(consultorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consultor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Consultors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsultor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Consultor consultor : consultorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConsultor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConsultorConstantesFunciones.generarExcelReporteDataConsultor("NORMAL",row,workbook,consultor,cellStyleDataAux);
		
			
			


				//GuiaRemision
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(GuiaRemisionConstantesFunciones.SCLASSWEBTITULO))) {

				if(consultor.getGuiaRemisions()!=null && consultor.getGuiaRemisions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					GuiaRemisionConstantesFunciones.generarExcelReporteHeaderGuiaRemision("RELACIONADO",row,workbook);
				}

				if(consultor.getGuiaRemisions()!=null) {
					i2=0;
					for(GuiaRemision guiaremision : consultor.getGuiaRemisions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						GuiaRemisionConstantesFunciones.generarExcelReporteDataGuiaRemision("RELACIONADO",row,workbook,guiaremision,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PedidoExpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoExporConstantesFunciones.SCLASSWEBTITULO))) {

				if(consultor.getPedidoExpors()!=null && consultor.getPedidoExpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoExporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoExporConstantesFunciones.generarExcelReporteHeaderPedidoExpor("RELACIONADO",row,workbook);
				}

				if(consultor.getPedidoExpors()!=null) {
					i2=0;
					for(PedidoExpor pedidoexpor : consultor.getPedidoExpors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoExporConstantesFunciones.generarExcelReporteDataPedidoExpor("RELACIONADO",row,workbook,pedidoexpor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Pedido
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoConstantesFunciones.SCLASSWEBTITULO))) {

				if(consultor.getPedidos()!=null && consultor.getPedidos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoConstantesFunciones.generarExcelReporteHeaderPedido("RELACIONADO",row,workbook);
				}

				if(consultor.getPedidos()!=null) {
					i2=0;
					for(Pedido pedido : consultor.getPedidos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoConstantesFunciones.generarExcelReporteDataPedido("RELACIONADO",row,workbook,pedido,cellStyleDataAuxHijo);
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
		cell.setCellValue(ConsultorConstantesFunciones.getConsultorDescripcion(consultor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consultorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consultor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsultor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsultor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsultor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsultor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConsultor() throws Exception {		
		this.startProcessConsultor(true);
	}
	
	public void startProcessConsultor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConsultor ,this.jPanelParametrosReportesConsultor, this.jScrollPanelDatosConsultor,this.jPanelPaginacionConsultor, this.jScrollPanelDatosEdicionConsultor, this.jPanelAccionesConsultor,this.jPanelAccionesFormularioConsultor,this.jmenuBarConsultor,this.jmenuBarDetalleConsultor,this.jTtoolBarConsultor,this.jTtoolBarDetalleConsultor);		
		
		final JTabbedPane jTabbedPaneBusquedasConsultor=this.jTabbedPaneBusquedasConsultor; 
		
		final JPanel jPanelParametrosReportesConsultor=this.jPanelParametrosReportesConsultor;
		//final JScrollPane jScrollPanelDatosConsultor=this.jScrollPanelDatosConsultor;
		final JTable jTableDatosConsultor=this.jTableDatosConsultor;		
		final JPanel jPanelPaginacionConsultor=this.jPanelPaginacionConsultor;
		//final JScrollPane jScrollPanelDatosEdicionConsultor=this.jScrollPanelDatosEdicionConsultor;
		final JPanel jPanelAccionesConsultor=this.jPanelAccionesConsultor;
		
		JPanel jPanelCamposAuxiliarConsultor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConsultor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConsultor!=null) {
			jPanelCamposAuxiliarConsultor=this.jInternalFrameDetalleFormConsultor.jPanelCamposConsultor;
			jPanelAccionesFormularioAuxiliarConsultor=this.jInternalFrameDetalleFormConsultor.jPanelAccionesFormularioConsultor;
		}
		
		final JPanel jPanelCamposConsultor=jPanelCamposAuxiliarConsultor;
		final JPanel jPanelAccionesFormularioConsultor=jPanelAccionesFormularioAuxiliarConsultor;
		
		
		final JMenuBar jmenuBarConsultor=this.jmenuBarConsultor;
		final JToolBar jTtoolBarConsultor=this.jTtoolBarConsultor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConsultor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsultor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) {
			jmenuBarDetalleAuxiliarConsultor=this.jInternalFrameDetalleFormConsultor.jmenuBarDetalleConsultor;
			jTtoolBarDetalleAuxiliarConsultor=this.jInternalFrameDetalleFormConsultor.jTtoolBarDetalleConsultor;
		}
		
		final JMenuBar jmenuBarDetalleConsultor=jmenuBarDetalleAuxiliarConsultor;
		final JToolBar jTtoolBarDetalleConsultor=jTtoolBarDetalleAuxiliarConsultor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsultor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsultor;
			processRunnable.jTableDatos=jTableDatosConsultor;
			processRunnable.jPanelCampos=jPanelCamposConsultor;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsultor;
			processRunnable.jPanelAcciones=jPanelAccionesConsultor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsultor;
			
			
			processRunnable.jmenuBar=jmenuBarConsultor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsultor;
			processRunnable.jTtoolBar=jTtoolBarConsultor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsultor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsultor ,jPanelParametrosReportesConsultor,jTableDatosConsultor, /*jScrollPanelDatosConsultor,*/jPanelCamposConsultor,jPanelPaginacionConsultor, /*jScrollPanelDatosEdicionConsultor,*/ jPanelAccionesConsultor,jPanelAccionesFormularioConsultor,jmenuBarConsultor,jmenuBarDetalleConsultor,jTtoolBarConsultor,jTtoolBarDetalleConsultor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsultor ,jPanelParametrosReportesConsultor, jScrollPanelDatosConsultor,jPanelPaginacionConsultor, jScrollPanelDatosEdicionConsultor, jPanelAccionesConsultor,jPanelAccionesFormularioConsultor,jmenuBarConsultor,jmenuBarDetalleConsultor,jTtoolBarConsultor,jTtoolBarDetalleConsultor);
						
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
	
	public void finishProcessConsultor() {// throws Exception 
		this.finishProcessConsultor(true);
	}
	
	public void finishProcessConsultor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConsultor ,this.jPanelParametrosReportesConsultor, this.jScrollPanelDatosConsultor,this.jPanelPaginacionConsultor, this.jScrollPanelDatosEdicionConsultor, this.jPanelAccionesConsultor,this.jPanelAccionesFormularioConsultor,this.jmenuBarConsultor,this.jmenuBarDetalleConsultor,this.jTtoolBarConsultor,this.jTtoolBarDetalleConsultor);		
		
		final JTabbedPane jTabbedPaneBusquedasConsultor=this.jTabbedPaneBusquedasConsultor; 
		
		final JPanel jPanelParametrosReportesConsultor=this.jPanelParametrosReportesConsultor;
		//final JScrollPane jScrollPanelDatosConsultor=this.jScrollPanelDatosConsultor;
		final JTable jTableDatosConsultor=this.jTableDatosConsultor;		
		final JPanel jPanelPaginacionConsultor=this.jPanelPaginacionConsultor;
		//final JScrollPane jScrollPanelDatosEdicionConsultor=this.jScrollPanelDatosEdicionConsultor;
		final JPanel jPanelAccionesConsultor=this.jPanelAccionesConsultor;
		
		JPanel jPanelCamposAuxiliarConsultor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConsultor=new JPanel();
		
		if(this.jInternalFrameDetalleFormConsultor!=null) {
			jPanelCamposAuxiliarConsultor=this.jInternalFrameDetalleFormConsultor.jPanelCamposConsultor;
			jPanelAccionesFormularioAuxiliarConsultor=this.jInternalFrameDetalleFormConsultor.jPanelAccionesFormularioConsultor;
		}
		
		final JPanel jPanelCamposConsultor=jPanelCamposAuxiliarConsultor;
		final JPanel jPanelAccionesFormularioConsultor=jPanelAccionesFormularioAuxiliarConsultor;
		
		
		final JMenuBar jmenuBarConsultor=this.jmenuBarConsultor;		
		final JToolBar jTtoolBarConsultor=this.jTtoolBarConsultor;
				
		JMenuBar jmenuBarDetalleAuxiliarConsultor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsultor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConsultor!=null) {
			jmenuBarDetalleAuxiliarConsultor=this.jInternalFrameDetalleFormConsultor.jmenuBarDetalleConsultor;
			jTtoolBarDetalleAuxiliarConsultor=this.jInternalFrameDetalleFormConsultor.jTtoolBarDetalleConsultor;		
		}
		
		final JMenuBar jmenuBarDetalleConsultor=jmenuBarDetalleAuxiliarConsultor;
		final JToolBar jTtoolBarDetalleConsultor=jTtoolBarDetalleAuxiliarConsultor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsultor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsultor;
			processRunnable.jTableDatos=jTableDatosConsultor;
			processRunnable.jPanelCampos=jPanelCamposConsultor;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsultor;
			processRunnable.jPanelAcciones=jPanelAccionesConsultor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsultor;
			
			
			processRunnable.jmenuBar=jmenuBarConsultor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsultor;
			processRunnable.jTtoolBar=jTtoolBarConsultor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsultor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConsultor ,jPanelParametrosReportesConsultor, jTableDatosConsultor,/*jScrollPanelDatosConsultor,*/jPanelCamposConsultor,jPanelPaginacionConsultor, /*jScrollPanelDatosEdicionConsultor,*/ jPanelAccionesConsultor,jPanelAccionesFormularioConsultor,jmenuBarConsultor,jmenuBarDetalleConsultor,jTtoolBarConsultor,jTtoolBarDetalleConsultor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConsultor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConsultor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConsultor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConsultor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConsultor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConsultor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConsultor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConsultor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConsultor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.consultorConstantesFunciones.getsFinalQueryConsultor();
		String  finalQueryPaginacionTodos=this.consultorConstantesFunciones.getsFinalQueryConsultor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConsultorConstantesFunciones.getArrayColumnasGlobalesNoConsultor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConsultorConstantesFunciones.getArrayColumnasGlobalesConsultor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConsultorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.consultorsEliminados= new ArrayList<Consultor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConsultor();
		
				///*ConsultorSessionBean*/this.consultorSessionBean=new ConsultorSessionBean();
			
			if(this.consultorSessionBean==null) {
				this.consultorSessionBean=new ConsultorSessionBean();
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
					this.iNumeroPaginacion=ConsultorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConsultorConstantesFunciones.getClassesForeignKeysOfConsultor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/consultor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			consultorsAux= new ArrayList<Consultor>();
			
				
			consultorLogic.setDatosCliente(this.datosCliente);
			consultorLogic.setDatosDeep(this.datosDeep);
			consultorLogic.setIsConDeep(true);
			
			
			consultorLogic.getConsultorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					consultorLogic.getTodosConsultors(finalQueryGlobal,pagination);
					
					//consultorLogic.getTodosConsultorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(consultorLogic.getConsultors()==null|| consultorLogic.getConsultors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							consultorsAux= new ArrayList<Consultor>();
							consultorsAux.addAll(consultorLogic.getConsultors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consultorsAux= new ArrayList<Consultor>();
							consultorsAux.addAll(consultors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							consultorLogic.getTodosConsultors(finalQueryGlobal+"",this.pagination);												
							
							//consultorLogic.getTodosConsultorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteConsultors("Todos",consultorLogic.getConsultors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							consultorLogic.setConsultors(new ArrayList<Consultor>());					
							consultorLogic.getConsultors().addAll(consultorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consultors=new ArrayList<Consultor>();
							consultors.addAll(consultorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idConsultor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idConsultor=this.idActual;
				
				} else if(this.idConsultorActual!=null && this.idConsultorActual!=0L) {
					idConsultor=idConsultorActual;
				}
				
					
				this.sDetalleReporte=ConsultorConstantesFunciones.getDetalleIndicePorId(idConsultor);
				
				this.consultors=new ArrayList<Consultor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					consultorLogic.getEntity(idConsultor);
					
					//consultorLogic.getEntityWithConnection(idConsultor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consultorLogic.setConsultors(new ArrayList<Consultor>());
					consultorLogic.getConsultors().add(consultorLogic.getConsultor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consultors=new ArrayList<Consultor>();
					this.consultors.add(consultor);
				}
				
				if(consultorLogic.getConsultor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ConsultorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					consultorLogic.getConsultorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsultorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsultorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=consultorLogic.getConsultors()==null||consultorLogic.getConsultors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=consultors==null|| consultors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						consultorsAux=new ArrayList<Consultor>();
						consultorsAux.addAll(consultorLogic.getConsultors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consultorsAux=new ArrayList<Consultor>();
							consultorsAux.addAll(consultors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							consultorLogic.getConsultorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsultorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsultorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConsultors("FK_IdEmpresa",consultorLogic.getConsultors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConsultors("FK_IdEmpresa",consultors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						consultorLogic.setConsultors(new ArrayList<Consultor>());
						consultorLogic.getConsultors().addAll(consultorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consultors=new ArrayList<Consultor>();
							consultors.addAll(consultorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConsultor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConsultor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consultorLogic.getConsultors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consultors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consultorLogic.getConsultors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consultors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Consultor consultor) {
		Boolean permite=true;
		
		if(this.consultor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConsultorConstantesFunciones.getOrderByListaConsultor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConsultorConstantesFunciones.getOrderByListaConsultor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Consultor consultor:consultorLogic.getConsultors()) {
				if(consultor.getsType().equals(Constantes2.S_TOTALES)) {
					consultorTotales=consultor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Consultor consultor:this.consultors) {
				if(consultor.getsType().equals(Constantes2.S_TOTALES)) {
					consultorTotales=consultor;
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
			this.consultorAux=new Consultor();
			this.consultorAux.setsType(Constantes2.S_TOTALES);
			this.consultorAux.setIsNew(false);
			this.consultorAux.setIsChanged(false);
			this.consultorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ConsultorConstantesFunciones.TotalizarValoresFilaConsultor(this.consultorLogic.getConsultors(),this.consultorAux);
				
				this.consultorLogic.getConsultors().add(this.consultorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConsultorConstantesFunciones.TotalizarValoresFilaConsultor(this.consultors,this.consultorAux);
				
				this.consultors.add(this.consultorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		consultorTotales=new Consultor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consultorLogic.getConsultors().remove(consultorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consultors.remove(consultorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		consultorTotales=new Consultor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Consultor consultor:consultorLogic.getConsultors()) {
				if(consultor.getsType().equals(Constantes2.S_TOTALES)) {
					consultorTotales=consultor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsultorConstantesFunciones.TotalizarValoresFilaConsultor(this.consultorLogic.getConsultors(),consultorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Consultor consultor:this.consultors) {
				if(consultor.getsType().equals(Constantes2.S_TOTALES)) {
					consultorTotales=consultor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsultorConstantesFunciones.TotalizarValoresFilaConsultor(this.consultors,consultorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConsultorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConsultorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consultorLogic.getConsultorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosConsultor() {
		this.isPermisoTodoConsultor=false;
		this.isPermisoNuevoConsultor=false;
		this.isPermisoActualizarConsultor=false;
		this.isPermisoActualizarOriginalConsultor=false;
		this.isPermisoEliminarConsultor=false;
		this.isPermisoGuardarCambiosConsultor=false;
		this.isPermisoConsultaConsultor=false;
		this.isPermisoBusquedaConsultor=false;
		this.isPermisoReporteConsultor=false;		
		this.isPermisoOrdenConsultor=false;		
		this.isPermisoPaginacionMedioConsultor=false;		
		this.isPermisoPaginacionAltoConsultor=false;
		this.isPermisoPaginacionTodoConsultor=false;
		this.isPermisoCopiarConsultor=false;		
		this.isPermisoVerFormConsultor=false;		
		this.isPermisoDuplicarConsultor=false;		
		this.isPermisoOrdenConsultor=false;		
	}
	
	public void setPermisosUsuarioConsultor(Boolean isPermiso) {
		this.isPermisoTodoConsultor=isPermiso;
		this.isPermisoNuevoConsultor=isPermiso;
		this.isPermisoActualizarConsultor=isPermiso;
		this.isPermisoActualizarOriginalConsultor=isPermiso;
		this.isPermisoEliminarConsultor=isPermiso;
		this.isPermisoGuardarCambiosConsultor=isPermiso;
		this.isPermisoConsultaConsultor=isPermiso;
		this.isPermisoBusquedaConsultor=isPermiso;
		this.isPermisoReporteConsultor=isPermiso;
		this.isPermisoOrdenConsultor=isPermiso;		
		this.isPermisoPaginacionMedioConsultor=isPermiso;		
		this.isPermisoPaginacionAltoConsultor=isPermiso;		
		this.isPermisoPaginacionTodoConsultor=isPermiso;		
		this.isPermisoCopiarConsultor=isPermiso;		
		this.isPermisoVerFormConsultor=isPermiso;		
		this.isPermisoDuplicarConsultor=isPermiso;
		this.isPermisoOrdenConsultor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConsultor(Boolean isPermiso) {
		//this.isPermisoTodoConsultor=isPermiso;
		this.isPermisoNuevoConsultor=isPermiso;
		this.isPermisoActualizarConsultor=isPermiso;
		this.isPermisoActualizarOriginalConsultor=isPermiso;
		this.isPermisoEliminarConsultor=isPermiso;
		this.isPermisoGuardarCambiosConsultor=isPermiso;
		//this.isPermisoConsultaConsultor=isPermiso;
		//this.isPermisoBusquedaConsultor=isPermiso;
		//this.isPermisoReporteConsultor=isPermiso;
		//this.isPermisoOrdenConsultor=isPermiso;		
		//this.isPermisoPaginacionMedioConsultor=isPermiso;		
		//this.isPermisoPaginacionAltoConsultor=isPermiso;		
		//this.isPermisoPaginacionTodoConsultor=isPermiso;		
		//this.isPermisoCopiarConsultor=isPermiso;		
		//this.isPermisoDuplicarConsultor=isPermiso;
		//this.isPermisoOrdenConsultor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConsultorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(GuiaRemisionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PedidoExporConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PedidoConstantesFunciones.SNOMBREOPCION);
		
		if(ConsultorJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosGuiaRemision=false;
		this.isTienePermisosGuiaRemision=this.verificarGetPermisosUsuarioOpcionConsultorClaseRelacionada(this.opcionsRelacionadas,GuiaRemisionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPedidoExpor=false;
		this.isTienePermisosPedidoExpor=this.verificarGetPermisosUsuarioOpcionConsultorClaseRelacionada(this.opcionsRelacionadas,PedidoExporConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPedido=false;
		this.isTienePermisosPedido=this.verificarGetPermisosUsuarioOpcionConsultorClaseRelacionada(this.opcionsRelacionadas,PedidoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebConsultor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConsultorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosGuiaRemision=conPermiso;
		this.isTienePermisosPedidoExpor=conPermiso;
		this.isTienePermisosPedido=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioConsultorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConsultorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConsultorClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosGuiaRemision && this.jInternalFrameDetalleFormConsultor!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.remove(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPedidoExpor && this.jInternalFrameDetalleFormConsultor!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.remove(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPedido && this.jInternalFrameDetalleFormConsultor!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.remove(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioConsultor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConsultorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.consultorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConsultorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConsultor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConsultor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConsultor=this.isPermisoActualizarConsultor;
			this.isPermisoEliminarConsultor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConsultor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConsultor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConsultor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConsultor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConsultor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsultor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConsultor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConsultor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConsultor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConsultor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConsultor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConsultor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsultor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.consultorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConsultor.setToolTipText(this.jTableDatosConsultor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConsultor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConsultor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConsultorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConsultorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConsultor() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosGuiaRemision && this.consultorConstantesFunciones.mostrarGuiaRemisionConsultor && !ConsultorConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Guia Remision");
			reporte.setsDescripcion("Guia Remision");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPedidoExpor && this.consultorConstantesFunciones.mostrarPedidoExporConsultor && !ConsultorConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Exportacion");
			reporte.setsDescripcion("Pedido Exportacion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPedido && this.consultorConstantesFunciones.mostrarPedidoConsultor && !ConsultorConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido");
			reporte.setsDescripcion("Pedido");
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
	public void inicializarCombosForeignKeyConsultorListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConsultorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConsultorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyConsultorListas(false);
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
	
	public void cargarCombosLoteForeignKeyConsultorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ConsultorParameterReturnGeneral consultorReturnGeneral=new ConsultorParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.consultorConstantesFunciones.cargarid_empresaConsultor)
					 || (this.esRecargarFks && this.consultorConstantesFunciones.cargarid_empresaConsultor)) {

					if(!this.consultorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+consultorSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				consultorReturnGeneral=consultorLogic.cargarCombosLoteForeignKeyConsultor(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=consultorReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyConsultor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.consultorSessionBean==null) {
				this.consultorSessionBean=new ConsultorSessionBean();
			}

			if(!this.consultorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyConsultor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConsultor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConsultor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsultor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConsultor(Consultor consultor)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConsultor(Consultor consultor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConsultor()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConsultor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConsultor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConsultor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConsultor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConsultor()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConsultor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConsultor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor!=null && this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ConsultorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConsultorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConsultorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.consultorSessionBean=new ConsultorSessionBean(); 
		this.consultorConstantesFunciones=new ConsultorConstantesFunciones(); 
		this.consultorBean=new Consultor();//(this.consultorConstantesFunciones); 		
		this.consultorReturnGeneral=new ConsultorParameterReturnGeneral(); 
		
		this.consultorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consultorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConsultorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConsultorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConsultorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConsultor(true);
			
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
			
			this.consultorConstantesFunciones=new ConsultorConstantesFunciones(); 
			this.consultorBean=new Consultor();//this.consultorConstantesFunciones); 			
			this.consultorReturnGeneral=new ConsultorParameterReturnGeneral(); 
		
			ConsultorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consultor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.consultor=new Consultor();
			this.consultors = new ArrayList<Consultor>();
			this.consultorsAux = new ArrayList<Consultor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic=new ConsultorLogic();
				this.consultorLogic.getNewConnexionToDeep("");
			}
			
			//this.consultorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.consultorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConsultor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConsultor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsultor);	
					}
					
					if(this.jInternalFrameImportacionConsultor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsultor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConsultor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConsultor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConsultor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConsultor);
				this.jInternalFrameDetalleFormConsultor.setVisible(false);
				this.jInternalFrameDetalleFormConsultor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConsultor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsultor);
					this.jInternalFrameReporteDinamicoConsultor.setVisible(false);
					this.jInternalFrameReporteDinamicoConsultor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConsultor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConsultor);
					this.jInternalFrameImportacionConsultor.setVisible(false);
					this.jInternalFrameImportacionConsultor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConsultor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConsultor);
					this.jInternalFrameOrderByConsultor.setVisible(false);
					this.jInternalFrameOrderByConsultor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConsultorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConsultorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.consultorReturnGeneral=new ConsultorParameterReturnGeneral();
			
			this.consultorParameterGeneral=new ConsultorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.consultorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConsultorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.consultorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(GuiaRemisionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PedidoExporConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PedidoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsultorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consultorSessionBean.getEsGuardarRelacionado(),this.consultorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsultorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consultorSessionBean.getEsGuardarRelacionado(),this.consultorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConsultor=false;
			this.isVisibilidadCeldaDuplicarConsultor=true;
			this.isVisibilidadCeldaCopiarConsultor=true;
			this.isVisibilidadCeldaVerFormConsultor=true;
			this.isVisibilidadCeldaOrdenConsultor=true;
			this.isVisibilidadCeldaNuevoRelacionesConsultor=false;
			this.isVisibilidadCeldaModificarConsultor=false;
			this.isVisibilidadCeldaActualizarConsultor=false;
			this.isVisibilidadCeldaEliminarConsultor=false;
			this.isVisibilidadCeldaCancelarConsultor=false;
			this.isVisibilidadCeldaGuardarConsultor=false;
			this.isVisibilidadCeldaGuardarCambiosConsultor=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConsultor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConsultor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConsultor(false);
			
			this.setPermisosUsuarioConsultor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consultorSessionBean.getEsGuardarRelacionado() 
				|| (this.consultorSessionBean.getEsGuardarRelacionado() && this.consultorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConsultorClasesRelacionadas();
			}
			
			if(this.consultorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConsultorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConsultorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConsultor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConsultor();
			}
			
			if(!this.isPermisoBusquedaConsultor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConsultor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consultorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioConsultor,this.isPermisoPaginacionMedioConsultor,this.isPermisoPaginacionTodoConsultor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConsultorConstantesFunciones.getTiposSeleccionarConsultor());
				
				this.tiposColumnasSelect=ConsultorConstantesFunciones.getTiposSeleccionarConsultor(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectConsultor();				
				//this.tiposRelacionesSelect=ConsultorConstantesFunciones.getTiposRelacionesConsultor(true);
				
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
			//if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConsultor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioConsultor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioConsultor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConsultor() ;
			
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
			
			
			this.guiaremisionLogic=new GuiaRemisionLogic();
			this.pedidoexporLogic=new PedidoExporLogic();
			this.pedidoLogic=new PedidoLogic(); 
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
				consultorImplementable= (ConsultorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsultorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				consultorImplementableHome= (ConsultorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsultorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.consultors= new ArrayList<Consultor>();
			this.consultorsEliminados= new ArrayList<Consultor>();
						
			this.isEsNuevoConsultor=false;
			this.esParaAccionDesdeFormularioConsultor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConsultor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConsultor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConsultorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConsultorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConsultor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConsultor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConsultor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConsultor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConsultor();
			}
			
			ConsultorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConsultor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConsultor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConsultor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConsultor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Consultor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConsultor() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PedidoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConsultor")) {
				iIndex=this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConsultor.getSelectedRow();	
				
				

				if(sTitle.equals("Guia Remisiones")) {
					if(!GuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessConsultor();

						this.cargarParteTabPanelRelacionadaGuiaRemision(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pedidos")) {
					if(!PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessConsultor();

						this.cargarParteTabPanelRelacionadaPedido(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pedido Exportacions")) {
					if(!PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessConsultor();

						this.cargarParteTabPanelRelacionadaPedidoExpor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConsultor();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaGuiaRemision(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormConsultor.cargarSessionConBeanSwingJInternalFrameGuiaRemision(false,true,iIndex);
		this.jButtonGuiaRemisionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaGuiaRemision();

		//this.jTabbedPaneRelacionesConsultor.updateUI();
		//this.jTabbedPaneRelacionesConsultor.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesConsultor.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPedido(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormConsultor.cargarSessionConBeanSwingJInternalFramePedido(false,true,iIndex);
		this.jButtonPedidoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedido();

		//this.jTabbedPaneRelacionesConsultor.updateUI();
		//this.jTabbedPaneRelacionesConsultor.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesConsultor.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPedidoExpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormConsultor.cargarSessionConBeanSwingJInternalFramePedidoExpor(false,true,iIndex);
		this.jButtonPedidoExporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoExpor();

		//this.jTabbedPaneRelacionesConsultor.updateUI();
		//this.jTabbedPaneRelacionesConsultor.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesConsultor.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("GuiaRemision")) {
				int row=this.jTableDatosConsultor.getSelectedRow();
				jButtonGuiaRemisionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PedidoExpor")) {
				int row=this.jTableDatosConsultor.getSelectedRow();
				jButtonPedidoExporActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Pedido")) {
				int row=this.jTableDatosConsultor.getSelectedRow();
				jButtonPedidoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Guia Remision")) {

					if(this.isTienePermisosGuiaRemision && this.consultorConstantesFunciones.mostrarGuiaRemisionConsultor && !ConsultorConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Guia Remisiones"+"("+GuiaRemisionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Guia Remisiones");

						if(consultorConstantesFunciones.resaltarGuiaRemisionConsultor!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(consultorConstantesFunciones.resaltarGuiaRemisionConsultor);
						}

						jmenuItem.setEnabled(this.consultorConstantesFunciones.activarGuiaRemisionConsultor);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"GuiaRemision"));

						

						this.jInternalFrameDetalleFormConsultor.jmenuDetalleConsultor.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Pedido Exportacion")) {

					if(this.isTienePermisosPedidoExpor && this.consultorConstantesFunciones.mostrarPedidoExporConsultor && !ConsultorConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Exportacions"+"("+PedidoExporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Exportacions");

						if(consultorConstantesFunciones.resaltarPedidoExporConsultor!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(consultorConstantesFunciones.resaltarPedidoExporConsultor);
						}

						jmenuItem.setEnabled(this.consultorConstantesFunciones.activarPedidoExporConsultor);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoExpor"));

						

						this.jInternalFrameDetalleFormConsultor.jmenuDetalleConsultor.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Pedido")) {

					if(this.isTienePermisosPedido && this.consultorConstantesFunciones.mostrarPedidoConsultor && !ConsultorConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedidos"+"("+PedidoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedidos");

						if(consultorConstantesFunciones.resaltarPedidoConsultor!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(consultorConstantesFunciones.resaltarPedidoConsultor);
						}

						jmenuItem.setEnabled(this.consultorConstantesFunciones.activarPedidoConsultor);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Pedido"));

						

						this.jInternalFrameDetalleFormConsultor.jmenuDetalleConsultor.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyConsultor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConsultor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConsultor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConsultorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConsultor();
		
		this.cargarCombosFrameForeignKeyConsultor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConsultor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConsultor();
		}
	}
	
	
	
	public void jButtonNuevoConsultorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.consultorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
			
			if(jTableDatosConsultor.getRowCount()>=1) {
				jTableDatosConsultor.removeRowSelectionInterval(0, jTableDatosConsultor.getRowCount()-1);						
			}
			
			this.isEsNuevoConsultor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConsultor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConsultor(true);			
			//this.consultor=new Consultor();
			//this.consultor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsultor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsultor() ;
			
			if(ConsultorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsultor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.consultor);	
			this.actualizarInformacion("INFO_PADRE",false,this.consultor);				
			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
			if(this.consultorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Consultor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConsultorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConsultor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConsultor.getSelectedRows().length;			
			}
			
			consultorsSeleccionados=this.getConsultorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConsultor--;			
				//Consultor consultorAux= new Consultor();			
				//consultorAux.setId(this.iIdNuevoConsultor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Consultor consultorOrigen=new Consultor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Consultor consultorOrigen : consultorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							consultorOrigen =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consultorOrigen =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConsultor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.consultor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConsultor(consultorOrigen,this.consultor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consultorLogic.getConsultors().add(this.consultorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consultors.add(this.consultorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConsultor(false);
				
				this.jTableDatosConsultor.setRowSelectionInterval(this.getIndiceNuevoConsultor(), this.getIndiceNuevoConsultor());
				
				int iLastRow =  this.jTableDatosConsultor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsultor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsultor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsultor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();									
		
			Consultor consultorOrigen=new Consultor();
			Consultor consultorDestino=new Consultor();
				
			consultorsSeleccionados=this.getConsultorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConsultor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || consultorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConsultor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consultorOrigen =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consultorOrigen =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consultorDestino =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consultorDestino =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				consultorOrigen =consultorsSeleccionados.get(0);
				consultorDestino =consultorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConsultor(consultorOrigen,consultorDestino,true,false);
				
				consultorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(consultorDestino,consultorLogic.getConsultors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consultorDestino,consultors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConsultor(false);
				
				//this.jTableDatosConsultor.setRowSelectionInterval(this.getIndiceNuevoConsultor(), this.getIndiceNuevoConsultor());
				
				int iLastRow =  this.jTableDatosConsultor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsultor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsultor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsultor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConsultor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConsultor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConsultor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConsultor.setVisible(!isVisible);
			this.jPanelPaginacionConsultor.setVisible(!isVisible);
			this.jPanelAccionesConsultor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConsultor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConsultor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConsultor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConsultor();
			
			this.abrirFrameOrderByConsultor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConsultor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConsultor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsultor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConsultor.isMaximum()) {
					this.jInternalFrameDetalleFormConsultor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConsultor.setSize(this.jInternalFrameDetalleFormConsultor.iWidthFormulario,this.jInternalFrameDetalleFormConsultor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConsultor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConsultor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConsultor.isMaximum()) {
						this.jInternalFrameDetalleFormConsultor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConsultor.jContentPaneDetalleConsultor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConsultor.jContentPaneDetalleConsultor.getWidth(),ConsultorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConsultor.jContentPaneDetalleConsultor.getWidth(),ConsultorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConsultor.jContentPaneDetalleConsultor.getWidth(),ConsultorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(GuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaGuiaRemision();
					}

					if(PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedido();
					}

					if(PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoExpor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConsultor.setVisible(true);
	        this.jInternalFrameDetalleFormConsultor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConsultor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConsultor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConsultor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsultor,false,this);
				} else {
					this.jInternalFrameOrderByConsultor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsultor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConsultor);
				this.jInternalFrameOrderByConsultor.setVisible(false);
				this.jInternalFrameOrderByConsultor.setSelected(false);
				
				this.jInternalFrameOrderByConsultor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsultor"));
				
				this.inicializarActualizarBindingTablaOrderByConsultor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConsultor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConsultor==null) {
				
				this.jInternalFrameImportacionConsultor=new ImportacionJInternalFrame(ConsultorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsultor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConsultor);
				this.jInternalFrameImportacionConsultor.setVisible(false);
				this.jInternalFrameImportacionConsultor.setSelected(false);


				this.jInternalFrameImportacionConsultor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsultor"));
				this.jInternalFrameImportacionConsultor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsultor"));
				this.jInternalFrameImportacionConsultor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsultor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConsultor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConsultor==null) {
				this.jInternalFrameReporteDinamicoConsultor=new ReporteDinamicoJInternalFrame(ConsultorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsultor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsultor);
				this.jInternalFrameReporteDinamicoConsultor.setVisible(false);
				this.jInternalFrameReporteDinamicoConsultor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConsultor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsultor"));
				this.jInternalFrameReporteDinamicoConsultor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsultor"));
				this.jInternalFrameReporteDinamicoConsultor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsultor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsultor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaGuiaRemision() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jScrollPanelDatosGuiaRemision.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormConsultor.jContentPaneDetalleConsultor.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jScrollPanelDatosGuiaRemision.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jScrollPanelDatosGuiaRemision.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.jScrollPanelDatosGuiaRemision.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPedido() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormConsultor.jContentPaneDetalleConsultor.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPedidoExpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormConsultor.jContentPaneDetalleConsultor.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleConsultor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsultor);
			
	       	this.jInternalFrameDetalleFormConsultor.setVisible(false);
	        this.jInternalFrameDetalleFormConsultor.setSelected(false);
			
			//this.jInternalFrameDetalleFormConsultor.dispose();
			//this.jInternalFrameDetalleFormConsultor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConsultor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConsultor.setVisible(true);
	        this.jInternalFrameReporteDinamicoConsultor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConsultor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConsultor.setVisible(true);
	        this.jInternalFrameImportacionConsultor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConsultor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConsultor.setVisible(true);
	        this.jInternalFrameOrderByConsultor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConsultor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConsultor.setVisible(false);
	        this.jInternalFrameOrderByConsultor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConsultor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConsultor.setVisible(false);
	        this.jInternalFrameReporteDinamicoConsultor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConsultor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConsultor.setVisible(false);
	        this.jInternalFrameImportacionConsultor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConsultor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConsultor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConsultor(true);
			//this.isEsNuevoConsultor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConsultor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsultor(false) ;
			
			if(consultorSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.getEsGuardarRelacionado() && GuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGuiaRemisionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado() && PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoExporActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoSessionBean.getEsGuardarRelacionado() && PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ConsultorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsultor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsultor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConsultorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConsultor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConsultor(true);
			//this.isEsNuevoConsultor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.consultor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConsultor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConsultor(false) ;
			
			if(ConsultorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsultor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsultor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConsultor(false);
			
			//if(!this.isEsNuevoConsultor) {								
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				
			}
			
			if(this.permiteMantenimiento(this.consultor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.consultorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConsultor=true;
					this.inicializarActualizarBindingTablaConsultor(false);
					this.isEsNuevoConsultor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConsultor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConsultor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsultor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsultor(false);
				
				this.habilitarDeshabilitarControlesConsultor(false);
			
												
				
				if(ConsultorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConsultor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConsultorActionPerformed(evt,consultorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConsultor(this.consultor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConsultor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,consultorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.consultor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConsultorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				this.consultor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				this.consultor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.consultor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.consultorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConsultorModel) this.jTableDatosConsultor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConsultor=true;
				this.inicializarActualizarBindingTablaConsultor(false);
				this.isEsNuevoConsultor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsultor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsultor(false);
				
				this.habilitarDeshabilitarControlesConsultor(false);
				
				
				
				if(ConsultorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConsultor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConsultorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConsultor.getRowCount()>=1) {
				jTableDatosConsultor.removeRowSelectionInterval(0, jTableDatosConsultor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConsultor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConsultor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsultor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsultor(false) ;
			
			this.isEsNuevoConsultor=false;
			
			if(ConsultorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConsultor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConsultorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConsultor(false);
				
				//SI ES MANUAL
				if(ConsultorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConsultor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConsultorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConsultor--;			
			//Consultor consultorAux= new Consultor();			
			//consultorAux.setId(this.iIdNuevoConsultor);
			
			if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConsultor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
			
			this.consultor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.consultorLogic.getConsultors().add(this.consultorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.consultors.add(this.consultorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConsultor(false);
			
			this.jTableDatosConsultor.setRowSelectionInterval(this.getIndiceNuevoConsultor(), this.getIndiceNuevoConsultor());
			
			int iLastRow =  this.jTableDatosConsultor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConsultor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConsultor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConsultor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConsultorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConsultor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsultor(false);
			
			//SI ES MANUAL
			if(ConsultorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsultor();
			}
			
			//this.abrirFrameTreeConsultor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConsultorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ConsultorES ?", "MANTENIMIENTO DE Consultor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionConsultor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralConsultor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.consultorReturnGeneral=consultorLogic.procesarImportacionConsultorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.consultorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarConsultorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConsultorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConsultor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConsultor.setFileImportacion(this.jInternalFrameImportacionConsultor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConsultor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConsultor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConsultor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConsultor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConsultorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();		

		consultorsSeleccionados=this.getConsultorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsultor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsultor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConsultorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConsultorBaseDesign.jrxml";
			
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
			
			this.generarReporteConsultors("Todos",consultorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consultorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consultor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConsultor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsultor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsultorConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsultorConstantesFunciones.LABEL_IDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_entificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_entificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_entificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_entificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsultorConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsultorConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsultorConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsultorConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsultorConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsultorConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoConsultor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConsultor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConsultor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConsultorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ConsultorConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoria="identificacion";
					break;

				case ConsultorConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case ConsultorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case ConsultorConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case ConsultorConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="e_mail";
					break;

				case ConsultorConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case ConsultorConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConsultor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConsultorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ConsultorConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoriaValor="identificacion";
					break;

				case ConsultorConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case ConsultorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case ConsultorConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case ConsultorConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="e_mail";
					break;

				case ConsultorConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case ConsultorConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConsultor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsultor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsultorConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ConsultorConstantesFunciones.LABEL_IDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"identificacion");
					break;

				case ConsultorConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case ConsultorConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case ConsultorConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case ConsultorConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"E Mail",sNombreCampoCategoria,sNombreCampoCategoriaValor,"e_mail");
					break;

				case ConsultorConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case ConsultorConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoConsultorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();		
		
		consultorsSeleccionados=this.getConsultorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consultor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Consultors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConsultor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConsultor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConsultorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsultorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Consultor consultor:consultorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consultor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsultorConstantesFunciones.LABEL_IDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsultorConstantesFunciones.LABEL_IDENTIFICACION);
					iRow++;

					for(Consultor consultor:consultorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consultor.getidentificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsultorConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsultorConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(Consultor consultor:consultorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consultor.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsultorConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsultorConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Consultor consultor:consultorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consultor.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(Consultor consultor:consultorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consultor.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsultorConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsultorConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Consultor consultor:consultorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consultor.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsultorConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsultorConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(Consultor consultor:consultorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consultor.gete_mail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsultorConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsultorConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Consultor consultor:consultorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consultor.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsultorConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsultorConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Consultor consultor:consultorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consultor.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelConsultor(row);				
			//	iRow++;
			//}				
			
			//for(Consultor consultorAux:consultorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConsultor(consultorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consultorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consultor",JOptionPane.INFORMATION_MESSAGE);
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
				this.consultorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsultor(false);
			
			//SI ES MANUAL
			if(ConsultorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsultor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConsultorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsultor(false);
			
			//SI ES MANUAL
			if(ConsultorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsultor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConsultorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsultor(false);
			
			//SI ES MANUAL
			if(ConsultorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsultor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConsultor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConsultor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConsultor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConsultor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConsultor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConsultor.setMinimumSize(dimensionMinimum);
		this.jTableDatosConsultor.setMaximumSize(dimensionMaximum);
		this.jTableDatosConsultor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConsultor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConsultor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConsultor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConsultor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConsultor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConsultor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsultor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConsultor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConsultorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConsultor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConsultor();
		
		this.inicializarActualizarBindingBotonesManualConsultor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConsultor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsultor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConsultor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConsultor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConsultor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConsultor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConsultor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConsultor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConsultor.jCheckBoxPostAccionNuevoConsultor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConsultor.jCheckBoxPostAccionSinCerrarConsultor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConsultor.jCheckBoxPostAccionSinMensajeConsultor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConsultor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConsultor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConsultor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConsultor!=null) {
				this.jInternalFrameDetalleFormConsultor.jCheckBoxPostAccionNuevoConsultor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConsultor.jCheckBoxPostAccionSinCerrarConsultor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConsultor.jCheckBoxPostAccionSinMensajeConsultor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConsultor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConsultor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConsultor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConsultor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConsultor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsultor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConsultor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConsultor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConsultor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConsultor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConsultor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsultor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConsultor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConsultor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConsultor(Boolean esInicializar) throws Exception {
		try	{	
			if(ConsultorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConsultor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConsultor() throws Exception {
		try	{
			if(ConsultorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConsultor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsultor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConsultor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConsultor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConsultor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConsultor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConsultor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConsultor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConsultor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConsultor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConsultor.addItem(reporte);
			}
			
			
			if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConsultor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConsultor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConsultor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConsultor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConsultor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConsultor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConsultor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConsultor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConsultor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsultor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsultor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsultor!=null) {
				this.jInternalFrameReporteDinamicoConsultor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsultor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsultor!=null) {
				this.jInternalFrameReporteDinamicoConsultor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsultor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConsultor!=null) {
				
				if(this.jInternalFrameReporteDinamicoConsultor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsultor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsultor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConsultor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsultor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsultor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConsultor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConsultor(Boolean esInicializar) throws Exception {				
		if(ConsultorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConsultor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConsultor() throws Exception {
		this.inicializarActualizarBindingTablaConsultor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConsultor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConsultorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConsultor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=consultorLogic.getConsultors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=consultors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConsultor.setModel(new ConsultorModel(this.consultorLogic.getConsultors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConsultor.setModel(new ConsultorModel(this.consultors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConsultor!=null && this.jInternalFrameOrderByConsultor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConsultor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConsultorConstantesFunciones.SCLASSWEBTITULO,consultorConstantesFunciones.resaltarSeleccionarConsultor,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConsultorConstantesFunciones.SCLASSWEBTITULO,consultorConstantesFunciones.resaltarSeleccionarConsultor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,ConsultorConstantesFunciones.LABEL_ID));

		if(this.consultorConstantesFunciones.mostraridConsultor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsultorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consultorConstantesFunciones.resaltaridConsultor,this.consultorConstantesFunciones.activaridConsultor,this,true,"idConsultor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consultorConstantesFunciones.resaltaridConsultor,this.consultorConstantesFunciones.activaridConsultor,this,true,"idConsultor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,ConsultorConstantesFunciones.LABEL_IDEMPRESA));

		if(this.consultorConstantesFunciones.mostrarid_empresaConsultor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsultorConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.consultorConstantesFunciones.resaltarid_empresaConsultor,this,this.consultorConstantesFunciones.activarid_empresaConsultor));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.consultorConstantesFunciones.resaltarid_empresaConsultor,this,this.consultorConstantesFunciones.activarid_empresaConsultor,false,"id_empresaConsultor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,ConsultorConstantesFunciones.LABEL_IDENTIFICACION));

		if(this.consultorConstantesFunciones.mostraridentificacionConsultor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsultorConstantesFunciones.LABEL_IDENTIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consultorConstantesFunciones.resaltaridentificacionConsultor,this.consultorConstantesFunciones.activaridentificacionConsultor,this,true,"identificacionConsultor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consultorConstantesFunciones.resaltaridentificacionConsultor,this.consultorConstantesFunciones.activaridentificacionConsultor,this,true,"identificacionConsultor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,ConsultorConstantesFunciones.LABEL_APELLIDO));

		if(this.consultorConstantesFunciones.mostrarapellidoConsultor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsultorConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consultorConstantesFunciones.resaltarapellidoConsultor,this.consultorConstantesFunciones.activarapellidoConsultor,this,true,"apellidoConsultor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consultorConstantesFunciones.resaltarapellidoConsultor,this.consultorConstantesFunciones.activarapellidoConsultor,this,true,"apellidoConsultor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,ConsultorConstantesFunciones.LABEL_NOMBRE));

		if(this.consultorConstantesFunciones.mostrarnombreConsultor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsultorConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consultorConstantesFunciones.resaltarnombreConsultor,this.consultorConstantesFunciones.activarnombreConsultor,this,true,"nombreConsultor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consultorConstantesFunciones.resaltarnombreConsultor,this.consultorConstantesFunciones.activarnombreConsultor,this,true,"nombreConsultor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.consultorConstantesFunciones.mostrarnombre_completoConsultor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consultorConstantesFunciones.resaltarnombre_completoConsultor,this.consultorConstantesFunciones.activarnombre_completoConsultor,this,true,"nombre_completoConsultor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consultorConstantesFunciones.resaltarnombre_completoConsultor,this.consultorConstantesFunciones.activarnombre_completoConsultor,this,true,"nombre_completoConsultor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,ConsultorConstantesFunciones.LABEL_TELEFONO));

		if(this.consultorConstantesFunciones.mostrartelefonoConsultor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsultorConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consultorConstantesFunciones.resaltartelefonoConsultor,this.consultorConstantesFunciones.activartelefonoConsultor,this,true,"telefonoConsultor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consultorConstantesFunciones.resaltartelefonoConsultor,this.consultorConstantesFunciones.activartelefonoConsultor,this,true,"telefonoConsultor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,ConsultorConstantesFunciones.LABEL_EMAIL));

		if(this.consultorConstantesFunciones.mostrare_mailConsultor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsultorConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consultorConstantesFunciones.resaltare_mailConsultor,this.consultorConstantesFunciones.activare_mailConsultor,this,true,"e_mailConsultor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consultorConstantesFunciones.resaltare_mailConsultor,this.consultorConstantesFunciones.activare_mailConsultor,this,true,"e_mailConsultor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,ConsultorConstantesFunciones.LABEL_DIRECCION));

		if(this.consultorConstantesFunciones.mostrardireccionConsultor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsultorConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consultorConstantesFunciones.resaltardireccionConsultor,this.consultorConstantesFunciones.activardireccionConsultor,this,true,"direccionConsultor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consultorConstantesFunciones.resaltardireccionConsultor,this.consultorConstantesFunciones.activardireccionConsultor,this,true,"direccionConsultor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsultor,ConsultorConstantesFunciones.LABEL_DESCRIPCION));

		if(this.consultorConstantesFunciones.mostrardescripcionConsultor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsultorConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consultorConstantesFunciones.resaltardescripcionConsultor,this.consultorConstantesFunciones.activardescripcionConsultor,this,true,"descripcionConsultor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consultorConstantesFunciones.resaltardescripcionConsultor,this.consultorConstantesFunciones.activardescripcionConsultor,this,true,"descripcionConsultor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsultorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.consultorSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosGuiaRemision && this.consultorConstantesFunciones.mostrarGuiaRemisionConsultor && !ConsultorConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Guia Remisiones");
				tableColumn.setHeaderValue("Guia Remisiones");
				tableColumn.setCellRenderer(new GuiaRemisionTableCell(consultorConstantesFunciones.resaltarGuiaRemisionConsultor,this,this.consultorConstantesFunciones.activarGuiaRemisionConsultor));
				tableColumn.setCellEditor(new GuiaRemisionTableCell(consultorConstantesFunciones.resaltarGuiaRemisionConsultor,this,this.consultorConstantesFunciones.activarGuiaRemisionConsultor));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosConsultor.addColumn(tableColumn);
			}

			if(this.isTienePermisosPedidoExpor && this.consultorConstantesFunciones.mostrarPedidoExporConsultor && !ConsultorConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Exportacions");
				tableColumn.setHeaderValue("Pedido Exportacions");
				tableColumn.setCellRenderer(new PedidoExporTableCell(consultorConstantesFunciones.resaltarPedidoExporConsultor,this,this.consultorConstantesFunciones.activarPedidoExporConsultor));
				tableColumn.setCellEditor(new PedidoExporTableCell(consultorConstantesFunciones.resaltarPedidoExporConsultor,this,this.consultorConstantesFunciones.activarPedidoExporConsultor));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosConsultor.addColumn(tableColumn);
			}

			if(this.isTienePermisosPedido && this.consultorConstantesFunciones.mostrarPedidoConsultor && !ConsultorConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedidos");
				tableColumn.setHeaderValue("Pedidos");
				tableColumn.setCellRenderer(new PedidoTableCell(consultorConstantesFunciones.resaltarPedidoConsultor,this,this.consultorConstantesFunciones.activarPedidoConsultor));
				tableColumn.setCellEditor(new PedidoTableCell(consultorConstantesFunciones.resaltarPedidoConsultor,this,this.consultorConstantesFunciones.activarPedidoConsultor));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosConsultor.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consultorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consultorSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsultor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consultorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consultorSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsultor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConsultor && this.isPermisoGuardarCambiosConsultor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.consultorSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.consultorSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConsultor.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.consultorSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosConsultor.addColumn(tableColumn);
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
			
			this.jTableDatosConsultor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsultor && this.isPermisoGuardarCambiosConsultor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.consultorSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsultor && this.isPermisoGuardarCambiosConsultor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConsultor.moveColumn(this.jTableDatosConsultor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConsultor.moveColumn(this.jTableDatosConsultor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.consultorSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosConsultor.moveColumn(this.jTableDatosConsultor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConsultor.moveColumn(this.jTableDatosConsultor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConsultor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConsultor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConsultor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConsultor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConsultor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConsultor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConsultor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConsultor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=consultorLogic.getConsultors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=consultors.size()-1;
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
		//this.jTableDatosConsultor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConsultor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConsultor();
			
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
				
				//this.isEsNuevoConsultor=false;
					
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
				if(this.consultorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConsultor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsultor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsultor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.consultor.getsType().equals("DUPLICADO")
				   || this.consultor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConsultor=true;
				
				} else {
					this.isEsNuevoConsultor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
					if(this.consultor.getId()>=0 && !this.consultor.getIsNew()) {						
						this.isEsNuevoConsultor=false;
						
					} else {
						this.isEsNuevoConsultor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConsultor(esRelaciones);						
				
				this.seleccionarConsultor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.consultor.getId()<0) {
					this.isEsNuevoConsultor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConsultor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConsultor(evt,rowIndex);
				}	
				
				if(this.consultorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Consultor: " + this.dDif); 
					}
				}								
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConsultor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.consultor)) {
					if(this.consultor.getId()>0) {
						this.consultor.setIsDeleted(true);
						
						this.consultorsEliminados.add(this.consultor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consultorLogic.getConsultors().remove(this.consultor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consultors.remove(this.consultor);				
					}
					
					
					((ConsultorModel) this.jTableDatosConsultor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConsultor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConsultor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConsultor) {
			
			if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsultor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsultor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConsultor(this.consultor);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.consultorConstantesFunciones.cargarid_empresaConsultor || this.consultorConstantesFunciones.event_dependid_empresaConsultor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.consultor.getid_empresa());
									//this.inicializarActualizarBindingConsultor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(consultor.getEmpresa()!=null) {
							this.empresasForeignKey.add(consultor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.consultor.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConsultor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConsultor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsultor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsultor(Consultor consultor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConsultor(consultor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsultor(Consultor consultor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConsultor(consultor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConsultor(consultor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConsultor(consultor);
	}
	
	public void setVariablesObjetoActualToFormularioConsultor(Consultor consultor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.setText(consultor.getId().toString());
			this.jInternalFrameDetalleFormConsultor.jTextFieldidentificacionConsultor.setText(consultor.getidentificacion());
			this.jInternalFrameDetalleFormConsultor.jTextAreaapellidoConsultor.setText(consultor.getapellido());
			this.jInternalFrameDetalleFormConsultor.jTextAreanombreConsultor.setText(consultor.getnombre());
			this.jInternalFrameDetalleFormConsultor.jTextAreanombre_completoConsultor.setText(consultor.getnombre_completo());
			this.jInternalFrameDetalleFormConsultor.jTextAreatelefonoConsultor.setText(consultor.gettelefono());
			this.jInternalFrameDetalleFormConsultor.jTextAreae_mailConsultor.setText(consultor.gete_mail());
			this.jInternalFrameDetalleFormConsultor.jTextAreadireccionConsultor.setText(consultor.getdireccion());
			this.jInternalFrameDetalleFormConsultor.jTextAreadescripcionConsultor.setText(consultor.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Consultor consultorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,consultorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Consultor consultorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				consultorLocal=this.consultor;
			} else {
				consultorLocal=this.consultorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(consultorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConsultor(consultorLocal,true);
					
					if(consultorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(consultorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.consultorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(consultorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConsultor(Consultor consultor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsultor(consultor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConsultor(consultor);
	}
	
	public void setVariablesFormularioToObjetoActualConsultor(Consultor consultor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsultor(consultor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConsultor(Consultor consultor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.getText()==null || this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.getText()=="" || this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.getText()=="Id") {
				this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.setText("0");
			}

			if(conColumnasBase) {consultor.setId(Long.parseLong(this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsultorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabelIdConsultor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consultor.setidentificacion(this.jInternalFrameDetalleFormConsultor.jTextFieldidentificacionConsultor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsultorConstantesFunciones.LABEL_IDENTIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabelidentificacionConsultor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consultor.setapellido(this.jInternalFrameDetalleFormConsultor.jTextAreaapellidoConsultor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsultorConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabelapellidoConsultor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consultor.setnombre(this.jInternalFrameDetalleFormConsultor.jTextAreanombreConsultor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsultorConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabelnombreConsultor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consultor.setnombre_completo(this.jInternalFrameDetalleFormConsultor.jTextAreanombre_completoConsultor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabelnombre_completoConsultor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consultor.settelefono(this.jInternalFrameDetalleFormConsultor.jTextAreatelefonoConsultor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsultorConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabeltelefonoConsultor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consultor.sete_mail(this.jInternalFrameDetalleFormConsultor.jTextAreae_mailConsultor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsultorConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabele_mailConsultor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consultor.setdireccion(this.jInternalFrameDetalleFormConsultor.jTextAreadireccionConsultor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsultorConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabeldireccionConsultor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consultor.setdescripcion(this.jInternalFrameDetalleFormConsultor.jTextAreadescripcionConsultor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsultorConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsultor.jLabeldescripcionConsultor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsultor(Consultor consultorBean,Consultor consultor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConsultor(Consultor consultorOrigen,Consultor consultor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consultorOrigen.getId()!=null && !consultorOrigen.getId().equals(0L))) {consultor.setId(consultorOrigen.getId());}}
			if(conDefault || (!conDefault && consultorOrigen.getidentificacion()!=null && !consultorOrigen.getidentificacion().equals(""))) {consultor.setidentificacion(consultorOrigen.getidentificacion());}
			if(conDefault || (!conDefault && consultorOrigen.getapellido()!=null && !consultorOrigen.getapellido().equals(""))) {consultor.setapellido(consultorOrigen.getapellido());}
			if(conDefault || (!conDefault && consultorOrigen.getnombre()!=null && !consultorOrigen.getnombre().equals(""))) {consultor.setnombre(consultorOrigen.getnombre());}
			if(conDefault || (!conDefault && consultorOrigen.getnombre_completo()!=null && !consultorOrigen.getnombre_completo().equals(""))) {consultor.setnombre_completo(consultorOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && consultorOrigen.gettelefono()!=null && !consultorOrigen.gettelefono().equals(""))) {consultor.settelefono(consultorOrigen.gettelefono());}
			if(conDefault || (!conDefault && consultorOrigen.gete_mail()!=null && !consultorOrigen.gete_mail().equals(""))) {consultor.sete_mail(consultorOrigen.gete_mail());}
			if(conDefault || (!conDefault && consultorOrigen.getdireccion()!=null && !consultorOrigen.getdireccion().equals(""))) {consultor.setdireccion(consultorOrigen.getdireccion());}
			if(conDefault || (!conDefault && consultorOrigen.getdescripcion()!=null && !consultorOrigen.getdescripcion().equals(""))) {consultor.setdescripcion(consultorOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsultor(Consultor consultor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.setText(consultor.getId().toString());
			this.jInternalFrameDetalleFormConsultor.jTextFieldidentificacionConsultor.setText(consultor.getidentificacion());
			this.jInternalFrameDetalleFormConsultor.jTextAreaapellidoConsultor.setText(consultor.getapellido());
			this.jInternalFrameDetalleFormConsultor.jTextAreanombreConsultor.setText(consultor.getnombre());
			this.jInternalFrameDetalleFormConsultor.jTextAreanombre_completoConsultor.setText(consultor.getnombre_completo());
			this.jInternalFrameDetalleFormConsultor.jTextAreatelefonoConsultor.setText(consultor.gettelefono());
			this.jInternalFrameDetalleFormConsultor.jTextAreae_mailConsultor.setText(consultor.gete_mail());
			this.jInternalFrameDetalleFormConsultor.jTextAreadireccionConsultor.setText(consultor.getdireccion());
			this.jInternalFrameDetalleFormConsultor.jTextAreadescripcionConsultor.setText(consultor.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsultor(ConsultorBean consultorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.setText(consultorBean.getId().toString());
			this.jInternalFrameDetalleFormConsultor.jTextFieldidentificacionConsultor.setText(consultorBean.getidentificacion());
			this.jInternalFrameDetalleFormConsultor.jTextAreaapellidoConsultor.setText(consultorBean.getapellido());
			this.jInternalFrameDetalleFormConsultor.jTextAreanombreConsultor.setText(consultorBean.getnombre());
			this.jInternalFrameDetalleFormConsultor.jTextAreanombre_completoConsultor.setText(consultorBean.getnombre_completo());
			this.jInternalFrameDetalleFormConsultor.jTextAreatelefonoConsultor.setText(consultorBean.gettelefono());
			this.jInternalFrameDetalleFormConsultor.jTextAreae_mailConsultor.setText(consultorBean.gete_mail());
			this.jInternalFrameDetalleFormConsultor.jTextAreadireccionConsultor.setText(consultorBean.getdireccion());
			this.jInternalFrameDetalleFormConsultor.jTextAreadescripcionConsultor.setText(consultorBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConsultor(ConsultorParameterReturnGeneral consultorReturnGeneral,ConsultorBean consultorBean,Boolean conDefault) throws Exception { 
		try {
			Consultor consultorLocal=new Consultor();
			
			consultorLocal=consultorReturnGeneral.getConsultor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consultorLocal.getId()!=null && !consultorLocal.getId().equals(0L))) {consultorBean.setId(consultorLocal.getId());}}
			if(conDefault || (!conDefault && consultorLocal.getidentificacion()!=null && !consultorLocal.getidentificacion().equals(""))) {consultorBean.setidentificacion(consultorLocal.getidentificacion());}
			if(conDefault || (!conDefault && consultorLocal.getapellido()!=null && !consultorLocal.getapellido().equals(""))) {consultorBean.setapellido(consultorLocal.getapellido());}
			if(conDefault || (!conDefault && consultorLocal.getnombre()!=null && !consultorLocal.getnombre().equals(""))) {consultorBean.setnombre(consultorLocal.getnombre());}
			if(conDefault || (!conDefault && consultorLocal.getnombre_completo()!=null && !consultorLocal.getnombre_completo().equals(""))) {consultorBean.setnombre_completo(consultorLocal.getnombre_completo());}
			if(conDefault || (!conDefault && consultorLocal.gettelefono()!=null && !consultorLocal.gettelefono().equals(""))) {consultorBean.settelefono(consultorLocal.gettelefono());}
			if(conDefault || (!conDefault && consultorLocal.gete_mail()!=null && !consultorLocal.gete_mail().equals(""))) {consultorBean.sete_mail(consultorLocal.gete_mail());}
			if(conDefault || (!conDefault && consultorLocal.getdireccion()!=null && !consultorLocal.getdireccion().equals(""))) {consultorBean.setdireccion(consultorLocal.getdireccion());}
			if(conDefault || (!conDefault && consultorLocal.getdescripcion()!=null && !consultorLocal.getdescripcion().equals(""))) {consultorBean.setdescripcion(consultorLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConsultorGenerico(Long idConsultorSeleccionado,JComboBox jComboBoxConsultor,List<Consultor> consultorsLocal)throws Exception {
		try {
			Consultor  consultorTemp=null;

			for(Consultor consultorAux:consultorsLocal) {
				if(consultorAux.getId()!=null && consultorAux.getId().equals(idConsultorSeleccionado)) {
					consultorTemp=consultorAux;
					break;
				}
			}

			jComboBoxConsultor.setSelectedItem(consultorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConsultorGenerico(JComboBox jComboBoxConsultor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsultor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConsultor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsultor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConsultor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("GuiaRemision")) {
			jButtonGuiaRemisionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PedidoExpor")) {
			jButtonPedidoExporActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Pedido")) {
			jButtonPedidoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consultor=(Consultor) consultorLogic.getConsultors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consultor =(Consultor) consultors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!consultor.getIsNew() && !consultor.getIsChanged() && !consultor.getIsDeleted()) {
				sDescripcion=consultor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=consultor.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Consultor consultorRow=new Consultor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consultorRow=(Consultor) consultorLogic.getConsultors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consultorRow=(Consultor) consultors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonGuiaRemisionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Consultor consultor) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormConsultor==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor = (Consultor)this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.consultor = (Consultor)this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(consultor!=null) {
						this.consultor = consultor;
					} else {
						this.consultor = new Consultor();
					}
				}

				if(this.isTienePermisosGuiaRemision && this.permiteMantenimiento(this.consultor)) {
					GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFramePopup=new GuiaRemisionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						guiaremisionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFramePopup;
					} else {
						guiaremisionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame;
					}

					List<Consultor> consultors=new ArrayList<Consultor>();
					consultors.add(this.consultor);
					if(!esRelacionado) {
						//guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setConGuardarRelaciones(false);
						//guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					guiaremisionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormConsultor.cargarGuiaRemisionBeanSwingJInternalFrame(consultors,this.consultor,guiaremisionBeanSwingJInternalFrame,/*conInicializar,*/guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.getConGuardarRelaciones(),guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.getEsGuardarRelacionado());
					guiaremisionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						guiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsGuiaRemision("no_relacionado");

						guiaremisionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(GuiaRemisionConstantesFunciones.ITAMANIOFILATABLA + (GuiaRemisionConstantesFunciones.ITAMANIOFILATABLA/2));

						guiaremisionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderConsultor=(TitledBorder)this.jScrollPanelDatosConsultor.getBorder();
						TitledBorder titledBorderGuiaRemision=(TitledBorder)guiaremisionBeanSwingJInternalFrame.jScrollPanelDatosGuiaRemision.getBorder();

						titledBorderGuiaRemision.setTitle(titledBorderConsultor.getTitle() + " -> Guia Remision");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,guiaremisionBeanSwingJInternalFrame);
						}

						guiaremisionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(guiaremisionBeanSwingJInternalFrame);

						guiaremisionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.consultorSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Guia Remision",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPedidoExporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Consultor consultor) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormConsultor==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor = (Consultor)this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.consultor = (Consultor)this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(consultor!=null) {
						this.consultor = consultor;
					} else {
						this.consultor = new Consultor();
					}
				}

				if(this.isTienePermisosPedidoExpor && this.permiteMantenimiento(this.consultor)) {
					PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFramePopup=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidoexporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFramePopup;
					} else {
						pedidoexporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame;
					}

					List<Consultor> consultors=new ArrayList<Consultor>();
					consultors.add(this.consultor);
					if(!esRelacionado) {
						//pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setConGuardarRelaciones(false);
						//pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidoexporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormConsultor.cargarPedidoExporBeanSwingJInternalFrame(consultors,this.consultor,pedidoexporBeanSwingJInternalFrame,/*conInicializar,*/pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getConGuardarRelaciones(),pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.getEsGuardarRelacionado());
					pedidoexporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("no_relacionado");

						pedidoexporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoExporConstantesFunciones.ITAMANIOFILATABLA + (PedidoExporConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidoexporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderConsultor=(TitledBorder)this.jScrollPanelDatosConsultor.getBorder();
						TitledBorder titledBorderPedidoExpor=(TitledBorder)pedidoexporBeanSwingJInternalFrame.jScrollPanelDatosPedidoExpor.getBorder();

						titledBorderPedidoExpor.setTitle(titledBorderConsultor.getTitle() + " -> Pedido Exportacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidoexporBeanSwingJInternalFrame);
						}

						pedidoexporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidoexporBeanSwingJInternalFrame);

						pedidoexporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.consultorSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Exportacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPedidoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Consultor consultor) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormConsultor==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor = (Consultor)this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.consultor = (Consultor)this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(consultor!=null) {
						this.consultor = consultor;
					} else {
						this.consultor = new Consultor();
					}
				}

				if(this.isTienePermisosPedido && this.permiteMantenimiento(this.consultor)) {
					PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFramePopup=new PedidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFramePopup;
					} else {
						pedidoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame;
					}

					List<Consultor> consultors=new ArrayList<Consultor>();
					consultors.add(this.consultor);
					if(!esRelacionado) {
						//pedidoBeanSwingJInternalFrame.pedidoSessionBean.setConGuardarRelaciones(false);
						//pedidoBeanSwingJInternalFrame.pedidoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormConsultor.cargarPedidoBeanSwingJInternalFrame(consultors,this.consultor,pedidoBeanSwingJInternalFrame,/*conInicializar,*/pedidoBeanSwingJInternalFrame.pedidoSessionBean.getConGuardarRelaciones(),pedidoBeanSwingJInternalFrame.pedidoSessionBean.getEsGuardarRelacionado());
					pedidoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidoBeanSwingJInternalFrame.actualizarEstadoPanelsPedido("no_relacionado");

						pedidoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoConstantesFunciones.ITAMANIOFILATABLA + (PedidoConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderConsultor=(TitledBorder)this.jScrollPanelDatosConsultor.getBorder();
						TitledBorder titledBorderPedido=(TitledBorder)pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.getBorder();

						titledBorderPedido.setTitle(titledBorderConsultor.getTitle() + " -> Pedido");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidoBeanSwingJInternalFrame);
						}

						pedidoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidoBeanSwingJInternalFrame);

						pedidoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.consultorSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConsultor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConsultor.setVisible((this.isVisibilidadCeldaNuevoConsultor && this.isPermisoNuevoConsultor));			
			this.jButtonDuplicarConsultor.setVisible((this.isVisibilidadCeldaDuplicarConsultor && this.isPermisoDuplicarConsultor));			
			this.jButtonCopiarConsultor.setVisible((this.isVisibilidadCeldaCopiarConsultor && this.isPermisoCopiarConsultor));
			this.jButtonVerFormConsultor.setVisible((this.isVisibilidadCeldaVerFormConsultor && this.isPermisoVerFormConsultor));
			
			this.jButtonAbrirOrderByConsultor.setVisible((this.isVisibilidadCeldaOrdenConsultor && this.isPermisoOrdenConsultor));			
			
			this.jButtonNuevoRelacionesConsultor.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsultor && this.isPermisoNuevoConsultor));			
			this.jButtonNuevoGuardarCambiosConsultor.setVisible((this.isVisibilidadCeldaNuevoConsultor && this.isPermisoNuevoConsultor && this.isPermisoGuardarCambiosConsultor));
			
			if(this.jInternalFrameDetalleFormConsultor!=null) {
			this.jInternalFrameDetalleFormConsultor.jButtonModificarConsultor.setVisible((this.isVisibilidadCeldaModificarConsultor && this.isPermisoActualizarConsultor));	
			this.jInternalFrameDetalleFormConsultor.jButtonActualizarConsultor.setVisible((this.isVisibilidadCeldaActualizarConsultor && this.isPermisoActualizarConsultor));	
			this.jInternalFrameDetalleFormConsultor.jButtonEliminarConsultor.setVisible((this.isVisibilidadCeldaEliminarConsultor && this.isPermisoEliminarConsultor));
			this.jInternalFrameDetalleFormConsultor.jButtonCancelarConsultor.setVisible(this.isVisibilidadCeldaCancelarConsultor);							
			this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosConsultor.setVisible((this.isVisibilidadCeldaGuardarConsultor && this.isPermisoGuardarCambiosConsultor));			
			
			}
						
			this.jButtonGuardarCambiosTablaConsultor.setVisible((this.isVisibilidadCeldaGuardarCambiosConsultor && this.isPermisoGuardarCambiosConsultor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConsultor.setVisible((this.isVisibilidadCeldaNuevoConsultor && this.isPermisoNuevoConsultor));						
			this.jButtonDuplicarToolBarConsultor.setVisible((this.isVisibilidadCeldaDuplicarConsultor && this.isPermisoDuplicarConsultor));						
			this.jButtonCopiarToolBarConsultor.setVisible((this.isVisibilidadCeldaCopiarConsultor && this.isPermisoCopiarConsultor));			
			this.jButtonVerFormToolBarConsultor.setVisible((this.isVisibilidadCeldaVerFormConsultor && this.isPermisoVerFormConsultor));			
			this.jButtonAbrirOrderByToolBarConsultor.setVisible((this.isVisibilidadCeldaOrdenConsultor && this.isPermisoOrdenConsultor));
			this.jButtonNuevoRelacionesToolBarConsultor.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsultor && this.isPermisoNuevoConsultor));			
			this.jButtonNuevoGuardarCambiosToolBarConsultor.setVisible((this.isVisibilidadCeldaNuevoConsultor && this.isPermisoNuevoConsultor && this.isPermisoGuardarCambiosConsultor));			
			
			if(this.jInternalFrameDetalleFormConsultor!=null) {
			this.jInternalFrameDetalleFormConsultor.jButtonModificarToolBarConsultor.setVisible((this.isVisibilidadCeldaModificarConsultor && this.isPermisoActualizarConsultor));	
			this.jInternalFrameDetalleFormConsultor.jButtonActualizarToolBarConsultor.setVisible((this.isVisibilidadCeldaActualizarConsultor  && this.isPermisoActualizarConsultor));	
			this.jInternalFrameDetalleFormConsultor.jButtonEliminarToolBarConsultor.setVisible((this.isVisibilidadCeldaEliminarConsultor && this.isPermisoEliminarConsultor));
			this.jInternalFrameDetalleFormConsultor.jButtonCancelarToolBarConsultor.setVisible(this.isVisibilidadCeldaCancelarConsultor);				
			this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosToolBarConsultor.setVisible((this.isVisibilidadCeldaGuardarConsultor && this.isPermisoGuardarCambiosConsultor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConsultor.setVisible((this.isVisibilidadCeldaGuardarCambiosConsultor && this.isPermisoGuardarCambiosConsultor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConsultor.setVisible((this.isVisibilidadCeldaNuevoConsultor && this.isPermisoNuevoConsultor));			
			this.jMenuItemDuplicarConsultor.setVisible((this.isVisibilidadCeldaDuplicarConsultor && this.isPermisoDuplicarConsultor));			
			this.jMenuItemCopiarConsultor.setVisible((this.isVisibilidadCeldaCopiarConsultor && this.isPermisoCopiarConsultor));			
			this.jMenuItemVerFormConsultor.setVisible((this.isVisibilidadCeldaVerFormConsultor && this.isPermisoVerFormConsultor));			
			this.jMenuItemAbrirOrderByConsultor.setVisible((this.isVisibilidadCeldaOrdenConsultor && this.isPermisoOrdenConsultor));			
			//this.jMenuItemMostrarOcultarConsultor.setVisible((this.isVisibilidadCeldaOrdenConsultor && this.isPermisoOrdenConsultor));
			this.jMenuItemDetalleAbrirOrderByConsultor.setVisible((this.isVisibilidadCeldaOrdenConsultor && this.isPermisoOrdenConsultor));			
			//this.jMenuItemDetalleMostrarOcultarConsultor.setVisible((this.isVisibilidadCeldaOrdenConsultor && this.isPermisoOrdenConsultor));			
			this.jMenuItemNuevoRelacionesConsultor.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsultor && this.isPermisoNuevoConsultor));			
			this.jMenuItemNuevoGuardarCambiosConsultor.setVisible((this.isVisibilidadCeldaNuevoConsultor && this.isPermisoNuevoConsultor && this.isPermisoGuardarCambiosConsultor));									
			
			if(this.jInternalFrameDetalleFormConsultor!=null) {
			this.jInternalFrameDetalleFormConsultor.jMenuItemModificarConsultor.setVisible((this.isVisibilidadCeldaModificarConsultor && this.isPermisoActualizarConsultor));	
			this.jInternalFrameDetalleFormConsultor.jMenuItemActualizarConsultor.setVisible((this.isVisibilidadCeldaActualizarConsultor && this.isPermisoActualizarConsultor));	
			this.jInternalFrameDetalleFormConsultor.jMenuItemEliminarConsultor.setVisible((this.isVisibilidadCeldaEliminarConsultor && this.isPermisoEliminarConsultor));
			this.jInternalFrameDetalleFormConsultor.jMenuItemCancelarConsultor.setVisible(this.isVisibilidadCeldaCancelarConsultor);				
			}
			
			this.jMenuItemGuardarCambiosConsultor.setVisible((this.isVisibilidadCeldaGuardarConsultor && this.isPermisoGuardarCambiosConsultor));						
			this.jMenuItemGuardarCambiosTablaConsultor.setVisible((this.isVisibilidadCeldaGuardarCambiosConsultor && this.isPermisoGuardarCambiosConsultor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConsultor=this.jButtonNuevoConsultor.isVisible();
			this.isVisibilidadCeldaDuplicarConsultor=this.jButtonDuplicarConsultor.isVisible();
			this.isVisibilidadCeldaCopiarConsultor=this.jButtonCopiarConsultor.isVisible();
			this.isVisibilidadCeldaVerFormConsultor=this.jButtonVerFormConsultor.isVisible();
			
			this.isVisibilidadCeldaOrdenConsultor=this.jButtonAbrirOrderByConsultor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConsultor=this.jButtonNuevoRelacionesConsultor.isVisible();
			this.isVisibilidadCeldaModificarConsultor=this.jButtonModificarConsultor.isVisible();
			
			if(this.jInternalFrameDetalleFormConsultor!=null) {
			this.isVisibilidadCeldaActualizarConsultor=this.jInternalFrameDetalleFormConsultor.jButtonActualizarConsultor.isVisible();
			this.isVisibilidadCeldaEliminarConsultor=this.jInternalFrameDetalleFormConsultor.jButtonEliminarConsultor.isVisible();
			this.isVisibilidadCeldaCancelarConsultor=this.jInternalFrameDetalleFormConsultor.jButtonCancelarConsultor.isVisible();
			this.isVisibilidadCeldaGuardarConsultor=this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosConsultor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConsultor=this.jButtonGuardarCambiosTablaConsultor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConsultor=this.jButtonNuevoToolBarConsultor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsultor=this.jButtonNuevoRelacionesToolBarConsultor.isVisible();
			
			if(this.jInternalFrameDetalleFormConsultor!=null) {
			this.isVisibilidadCeldaModificarConsultor=this.jInternalFrameDetalleFormConsultor.jButtonModificarToolBarConsultor.isVisible();
			this.isVisibilidadCeldaActualizarConsultor=this.jInternalFrameDetalleFormConsultor.jButtonActualizarToolBarConsultor.isVisible();
			this.isVisibilidadCeldaEliminarConsultor=this.jInternalFrameDetalleFormConsultor.jButtonEliminarToolBarConsultor.isVisible();
			this.isVisibilidadCeldaCancelarConsultor=this.jInternalFrameDetalleFormConsultor.jButtonCancelarToolBarConsultor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsultor=this.jButtonGuardarCambiosToolBarConsultor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsultor=this.jButtonGuardarCambiosTablaToolBarConsultor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConsultor=this.jMenuItemNuevoConsultor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsultor=this.jMenuItemNuevoRelacionesConsultor.isVisible();
			
			if(this.jInternalFrameDetalleFormConsultor!=null) {
			this.isVisibilidadCeldaModificarConsultor=this.jInternalFrameDetalleFormConsultor.jMenuItemModificarConsultor.isVisible();
			this.isVisibilidadCeldaActualizarConsultor=this.jInternalFrameDetalleFormConsultor.jMenuItemActualizarConsultor.isVisible();
			this.isVisibilidadCeldaEliminarConsultor=this.jInternalFrameDetalleFormConsultor.jMenuItemEliminarConsultor.isVisible();
			this.isVisibilidadCeldaCancelarConsultor=this.jInternalFrameDetalleFormConsultor.jMenuItemCancelarConsultor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsultor=this.jMenuItemGuardarCambiosConsultor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsultor=this.jMenuItemGuardarCambiosTablaConsultor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConsultor(Boolean esInicializar) {
		if(ConsultorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.consultorSessionBean.getConGuardarRelaciones()) {
				//if(this.consultorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConsultor();
			}
			
			this.inicializarActualizarBindingBotonesManualConsultor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConsultor() {
		this.jButtonNuevoConsultor.setVisible(this.isPermisoNuevoConsultor);			
		this.jButtonDuplicarConsultor.setVisible(this.isPermisoDuplicarConsultor);			
		this.jButtonCopiarConsultor.setVisible(this.isPermisoCopiarConsultor);			
		this.jButtonVerFormConsultor.setVisible(this.isPermisoVerFormConsultor);			
		
		this.jButtonAbrirOrderByConsultor.setVisible(this.isPermisoOrdenConsultor);					
		
		this.jButtonNuevoRelacionesConsultor.setVisible(this.isPermisoNuevoConsultor);			
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jButtonModificarConsultor.setVisible(this.isPermisoActualizarConsultor);	
			this.jInternalFrameDetalleFormConsultor.jButtonActualizarConsultor.setVisible(this.isPermisoActualizarConsultor);	
			this.jInternalFrameDetalleFormConsultor.jButtonEliminarConsultor.setVisible(this.isPermisoEliminarConsultor);
			this.jInternalFrameDetalleFormConsultor.jButtonCancelarConsultor.setVisible(this.isVisibilidadCeldaCancelarConsultor);						
			this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosConsultor.setVisible(this.isPermisoGuardarCambiosConsultor);							
		}
		
		this.jButtonGuardarCambiosTablaConsultor.setVisible(this.isPermisoActualizarConsultor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConsultor() {
		this.jInternalFrameDetalleFormConsultor.jButtonModificarConsultor.setVisible(this.isPermisoActualizarConsultor);	
		this.jInternalFrameDetalleFormConsultor.jButtonActualizarConsultor.setVisible(this.isPermisoActualizarConsultor);	
		this.jInternalFrameDetalleFormConsultor.jButtonEliminarConsultor.setVisible(this.isPermisoEliminarConsultor);
		this.jInternalFrameDetalleFormConsultor.jButtonCancelarConsultor.setVisible(this.isVisibilidadCeldaCancelarConsultor);							
		this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosConsultor.setVisible((this.isVisibilidadCeldaGuardarConsultor && this.isPermisoGuardarCambiosConsultor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConsultor() {
		if(ConsultorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConsultor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConsultor() {
	}
	
	public void jTableDatosConsultorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConsultor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConsultorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consultor==null) {
						this.consultor = new Consultor();
					}

					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				}

				if(this.consultor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.consultor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsultor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConsultorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConsultor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsultor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsultor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.consultorLogic.getConnexion());

				if(this.consultor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.consultor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsultor=(TitledBorder)this.jScrollPanelDatosConsultor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConsultor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConsultorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consultor==null) {
						this.consultor = new Consultor();
					}

					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				}

				if(this.consultor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.consultor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsultor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidentificacionConsultorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consultor==null) {
						this.consultor = new Consultor();
					}

					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				}

				if(this.consultor.getidentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where identificacion like '%"+this.consultor.getidentificacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsultor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoConsultorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consultor==null) {
						this.consultor = new Consultor();
					}

					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				}

				if(this.consultor.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.consultor.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsultor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreConsultorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consultor==null) {
						this.consultor = new Consultor();
					}

					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				}

				if(this.consultor.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.consultor.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsultor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoConsultorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consultor==null) {
						this.consultor = new Consultor();
					}

					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				}

				if(this.consultor.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.consultor.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsultor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoConsultorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consultor==null) {
						this.consultor = new Consultor();
					}

					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				}

				if(this.consultor.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.consultor.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsultor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtone_mailConsultorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consultor==null) {
						this.consultor = new Consultor();
					}

					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				}

				if(this.consultor.gete_mail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where e_mail like '%"+this.consultor.gete_mail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsultor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionConsultorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consultor==null) {
						this.consultor = new Consultor();
					}

					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				}

				if(this.consultor.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.consultor.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsultor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionConsultorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsultor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsultor(this.getconsultor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consultor==null) {
						this.consultor = new Consultor();
					}

					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);
				}

				if(this.consultor.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.consultor.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsultor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaConsultorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsultor(false,false);

			this.getConsultorsFK_IdEmpresa();

			this.inicializarActualizarBindingConsultor(false);

			//if(ConsultorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsultor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consultorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConsultor() {
		if(this.jInternalFrameDetalleFormConsultor!=null) {
		

		if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormConsultor!=null) {
			this.jInternalFrameDetalleFormConsultor.setVisible(false);	    			
			this.jInternalFrameDetalleFormConsultor.dispose();
			this.jInternalFrameDetalleFormConsultor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConsultor!=null) {
			this.jInternalFrameReporteDinamicoConsultor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConsultor.dispose();
			this.jInternalFrameReporteDinamicoConsultor=null;
		}
		
		if(this.jInternalFrameImportacionConsultor!=null) {
			this.jInternalFrameImportacionConsultor.setVisible(false);	    			
			this.jInternalFrameImportacionConsultor.dispose();
			this.jInternalFrameImportacionConsultor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConsultor();
			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
			
			if(sTipo.equals("NuevoConsultor")) {
				jButtonNuevoConsultorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConsultor")) {
				jButtonDuplicarConsultorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConsultor")) {
				jButtonCopiarConsultorActionPerformed(evt);
			} else if(sTipo.equals("VerFormConsultor")) {
				jButtonVerFormConsultorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConsultor")) {
				jButtonNuevoConsultorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConsultor")) {
				jButtonDuplicarConsultorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConsultor")) {
				jButtonNuevoConsultorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConsultor")) {
				jButtonDuplicarConsultorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConsultor")) {
				jButtonNuevoConsultorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConsultor")) {
				jButtonNuevoConsultorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConsultor")) {
				jButtonNuevoConsultorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConsultor")) {
				jButtonModificarConsultorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConsultor")) {
				jButtonModificarConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConsultor")) {
				jButtonModificarConsultorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConsultor")) {
				jButtonActualizarConsultorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConsultor")) {
				jButtonActualizarConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConsultor")) {
				jButtonActualizarConsultorActionPerformed(evt);
			} else if(sTipo.equals("EliminarConsultor")) {
				jButtonEliminarConsultorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConsultor")) {
				jButtonEliminarConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConsultor")) {
				jButtonEliminarConsultorActionPerformed(evt);
			} else if(sTipo.equals("CancelarConsultor")) {
				jButtonCancelarConsultorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConsultor")) {
				jButtonCancelarConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConsultor")) {
				jButtonCancelarConsultorActionPerformed(evt);
			} else if(sTipo.equals("CerrarConsultor")) {
				jButtonCerrarConsultorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConsultor")) {
				jButtonCerrarConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConsultor")) {
				jButtonCerrarConsultorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConsultor")) {
				jButtonMostrarOcultarConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConsultor")) {
				jButtonCancelarConsultorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConsultor")) {
				jButtonGuardarCambiosConsultorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConsultor")) {
				jButtonGuardarCambiosConsultorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConsultor")) {
				jButtonCopiarConsultorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConsultor")) {
				jButtonVerFormConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConsultor")) {
				jButtonGuardarCambiosConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConsultor")) {
				jButtonCopiarConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConsultor")) {
				jButtonVerFormConsultorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConsultor")) {
				jButtonGuardarCambiosConsultorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConsultor")) {
				jButtonGuardarCambiosConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConsultor")) {
				jButtonGuardarCambiosConsultorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConsultor")) {
				jButtonRecargarInformacionConsultorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConsultor")) {
				jButtonRecargarInformacionConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConsultor")) {
				jButtonRecargarInformacionConsultorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConsultor")) {
				jButtonAnterioresConsultorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConsultor")) {
				jButtonAnterioresConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConsultor")) {
				jButtonAnterioresConsultorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConsultor")) {
				jButtonSiguientesConsultorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConsultor")) {
				jButtonSiguientesConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConsultor")) {
				jButtonSiguientesConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConsultor") || sTipo.equals("MenuItemDetalleAbrirOrderByConsultor")) {
				jButtonAbrirOrderByConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConsultor") || sTipo.equals("MenuItemDetalleMostrarOcultarConsultor")) {
				jButtonMostrarOcultarConsultorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConsultor")) {
				jButtonNuevoGuardarCambiosConsultorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConsultor")) {
				jButtonNuevoGuardarCambiosConsultorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConsultor")) {
				jButtonNuevoGuardarCambiosConsultorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConsultor")) {
				jButtonCerrarReporteDinamicoConsultorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConsultor")) {
				jButtonGenerarReporteDinamicoConsultorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConsultor")) {
				
				jButtonGenerarExcelReporteDinamicoConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConsultor")) {
				jButtonCerrarImportacionConsultorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConsultor")) {
				
				jButtonGenerarImportacionConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConsultor")) {
				
				jButtonAbrirImportacionConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConsultor")) {
				jComboBoxTiposAccionesConsultorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConsultor")) {
				jComboBoxTiposRelacionesConsultorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConsultor")) {
				jComboBoxTiposAccionesConsultorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConsultor")) {
				
				jComboBoxTiposSeleccionarConsultorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConsultor")) {
				jTextFieldValorCampoGeneralConsultorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConsultor")) {
				jButtonAbrirOrderByConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConsultor")) {
				jButtonAbrirOrderByConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConsultor")) {
				jButtonCerrarOrderByConsultorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsultorBusqueda")) {
				this.jButtonidConsultorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsultorUpdate")) {
				this.jButtonid_empresaConsultorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsultorBusqueda")) {
				this.jButtonid_empresaConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionConsultorBusqueda")) {
				this.jButtonidentificacionConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoConsultorBusqueda")) {
				this.jButtonapellidoConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConsultorBusqueda")) {
				this.jButtonnombreConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoConsultorBusqueda")) {
				this.jButtonnombre_completoConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoConsultorBusqueda")) {
				this.jButtontelefonoConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mailConsultorBusqueda")) {
				this.jButtone_mailConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionConsultorBusqueda")) {
				this.jButtondireccionConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionConsultorBusqueda")) {
				this.jButtondescripcionConsultorBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConsultor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsultorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				


				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Consultor consultorLocal=null;
			
			if(!this.getEsControlTabla()) {
				consultorLocal=this.consultor;
			} else {
				consultorLocal=this.consultorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
							
				
				


				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsultorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorAnterior =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consultorAnterior =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
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
			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
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
			
			


			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsultorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
								
						
				


				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
								
				
				


				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsultorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorAnterior =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consultorAnterior =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsultorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorAnterior =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consultorAnterior =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsultorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
							
				
				


				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsultorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultorAnterior =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consultorAnterior =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
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
			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
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
			
			


			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsultorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
								
				
				


				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsultorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorAnterior =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consultorAnterior =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsultorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsultorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConsultor")) {
					jCheckBoxSeleccionarTodosConsultorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConsultor")) {
					jCheckBoxSeleccionadosConsultorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConsultor")) {
					
				}
				
				


				
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
												
				
				


				
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsultorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consultorAnterior =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consultorAnterior =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsultorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
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
			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
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
			
			


			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsultorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consultor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consultor);
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
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
				
				


				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Consultor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Consultor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsultorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consultorAnterior =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consultorAnterior =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConsultor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConsultorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConsultor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.consultor =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.consultor =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.consultor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConsultor")) {
				
				}
				
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConsultor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConsultor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConsultor")) {
			
			}
			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConsultor();
			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
			if(sTipo.equals("NuevoConsultor")) {
				jButtonNuevoConsultorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConsultor")) {
				jButtonDuplicarConsultorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConsultor")) {
				jButtonCopiarConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConsultor")) {
				jButtonVerFormConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConsultor")) {
				jButtonNuevoConsultorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConsultor")) {
				jButtonModificarConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConsultor")) {
				jButtonActualizarConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConsultor")) {
				jButtonEliminarConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConsultor")) {
				jButtonGuardarCambiosConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConsultor")) {
				jButtonCancelarConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConsultor")) {
				jButtonCerrarConsultorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConsultor")) {
				jButtonGuardarCambiosConsultorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConsultor")) {
				jButtonNuevoGuardarCambiosConsultorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConsultor")) {
				jButtonAbrirOrderByConsultorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConsultor")) {
				jButtonRecargarInformacionConsultorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConsultor")) {
				jButtonAnterioresConsultorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConsultor")) {
				jButtonSiguientesConsultorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsultorBusqueda")) {
				this.jButtonidConsultorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsultorUpdate")) {
				this.jButtonid_empresaConsultorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsultorBusqueda")) {
				this.jButtonid_empresaConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionConsultorBusqueda")) {
				this.jButtonidentificacionConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoConsultorBusqueda")) {
				this.jButtonapellidoConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConsultorBusqueda")) {
				this.jButtonnombreConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoConsultorBusqueda")) {
				this.jButtonnombre_completoConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoConsultorBusqueda")) {
				this.jButtontelefonoConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mailConsultorBusqueda")) {
				this.jButtone_mailConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionConsultorBusqueda")) {
				this.jButtondireccionConsultorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionConsultorBusqueda")) {
				this.jButtondescripcionConsultorBusquedaActionPerformed(evt);
			}
			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConsultor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConsultor")) {
				closingInternalFrameConsultor();
				
			} else if(sTipo.equals("jButtonCancelarConsultor")) {
				JInternalFrameBase jInternalFrameDetalleFormConsultor = (JInternalFrameBase)evt.getSource();
	            	
	            ConsultorBeanSwingJInternalFrame jInternalFrameParent=(ConsultorBeanSwingJInternalFrame)jInternalFrameDetalleFormConsultor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConsultorActionPerformed(null);
			}
			
			ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consultor,new Object(),this.consultorParameterGeneral,this.consultorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConsultor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConsultor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConsultor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.consultor)) {
			if(!esControlTabla) {
				if(ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);			
				}
				
				if(this.consultorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConsultor(this.consultor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.consultorReturnGeneral=consultorLogic.procesarEventosConsultorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consultorLogic.getConsultors(),this.consultor,this.consultorParameterGeneral,this.isEsNuevoConsultor,classes);//this.consultorLogic.getConsultor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConsultor(this.consultorReturnGeneral,this.consultorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.consultorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConsultor(classes,this.consultorReturnGeneral,this.consultorBean,false);
					}
						
					if(this.consultorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConsultor(this.consultorReturnGeneral.getConsultor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConsultor(this.consultorReturnGeneral.getConsultor());	
					}
						
					if(this.consultorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConsultor(this.consultorReturnGeneral.getConsultor(),classes);//this.consultorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConsultor(this.consultor,classes);//this.consultorBean);									
				}
			
				if(ConsultorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConsultor(this.consultor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsultor(this.consultor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.consultorAnterior!=null) {
						this.consultor=this.consultorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.consultorReturnGeneral=consultorLogic.procesarEventosConsultorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consultorLogic.getConsultors(),this.consultor,this.consultorParameterGeneral,this.isEsNuevoConsultor,classes);//this.consultorLogic.getConsultor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.consultorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.consultorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.consultorReturnGeneral.getConsultor(),consultorLogic.getConsultors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.consultorReturnGeneral.getConsultor(),this.consultors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConsultor.repaint();
				
				//((AbstractTableModel) this.jTableDatosConsultor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConsultor();
			}
		}
	}
	
	public void actualizarVisualTableDatosConsultor() throws Exception {
		
		ConsultorModel consultorModel=(ConsultorModel)this.jTableDatosConsultor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consultorModel.consultors=this.consultorLogic.getConsultors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			consultorModel.consultors=this.consultors;
		}
		
		
		((ConsultorModel) this.jTableDatosConsultor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConsultor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconsultorAnterior(),this.consultorLogic.getConsultors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconsultorAnterior(),this.consultors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConsultor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConsultor(Consultor consultor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(GuiaRemision.class)) {
					this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.setGuiaRemisions(consultor.getGuiaRemisions());
					this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGuiaRemision(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(consultor.getPedidoExpors());
					this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Pedido.class)) {
					this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(consultor.getPedidos());
					this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedido(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
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
										
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consultor,new Object(),generalEntityParameterGeneral,this.consultorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.consultorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConsultorConstantesFunciones.getClassesRelationshipsOfConsultor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConsultorConstantesFunciones.getClassesRelationshipsFromStringsOfConsultor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConsultor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConsultorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consultor,new Object(),generalEntityParameterGeneral,this.consultorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConsultor(ConsultorBean consultorBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(GuiaRemision.class)) {
					this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.setGuiaRemisions(consultor.getGuiaRemisions());
					this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGuiaRemision(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.setPedidoExpors(consultor.getPedidoExpors());
					this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Pedido.class)) {
					this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(consultor.getPedidos());
					this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedido(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConsultor(ArrayList<Classe> classes,ConsultorReturnGeneral consultorReturnGeneral,ConsultorBean consultorBean,Boolean conDefault) throws Exception {
		
			this.consultorBean.setGuiaRemisions(consultorReturnGeneral.getConsultor().getGuiaRemisions());
			this.consultorBean.setPedidoExpors(consultorReturnGeneral.getConsultor().getPedidoExpors());
			this.consultorBean.setPedidos(consultorReturnGeneral.getConsultor().getPedidos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConsultor(Consultor consultor,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(GuiaRemision.class)) {
					consultor.setGuiaRemisions(this.jInternalFrameDetalleFormConsultor.guiaremisionBeanSwingJInternalFrame.guiaremisionLogic.getGuiaRemisions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoExpor.class)) {
					consultor.setPedidoExpors(this.jInternalFrameDetalleFormConsultor.pedidoexporBeanSwingJInternalFrame.pedidoexporLogic.getPedidoExpors());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Pedido.class)) {
					consultor.setPedidos(this.jInternalFrameDetalleFormConsultor.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.consultor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConsultor = new ConsultorDetalleFormJInternalFrame(jDesktopPane,this.consultorSessionBean.getConGuardarRelaciones(),this.consultorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConsultor);
		this.jInternalFrameDetalleFormConsultor.setVisible(false);
		this.jInternalFrameDetalleFormConsultor.setSelected(false);						
		
		this.jInternalFrameDetalleFormConsultor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConsultor.consultorLogic=this.consultorLogic;
		
		this.cargarCombosFrameForeignKeyConsultor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConsultor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsultor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConsultor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConsultor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConsultor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsultor"));
		
		this.jInternalFrameDetalleFormConsultor.jButtonModificarConsultor.addActionListener(new ButtonActionListener(this,"ModificarConsultor"));

		
		this.jInternalFrameDetalleFormConsultor.jButtonModificarToolBarConsultor.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsultor"));
					
		this.jInternalFrameDetalleFormConsultor.jMenuItemModificarConsultor.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsultor"));		
		
		
		
		this.jInternalFrameDetalleFormConsultor.jButtonActualizarConsultor.addActionListener (new ButtonActionListener(this,"ActualizarConsultor"));
		
		
		this.jInternalFrameDetalleFormConsultor.jButtonActualizarToolBarConsultor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsultor"));
						
		this.jInternalFrameDetalleFormConsultor.jMenuItemActualizarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsultor"));		
		
		
		
		this.jInternalFrameDetalleFormConsultor.jButtonEliminarConsultor.addActionListener (new ButtonActionListener(this,"EliminarConsultor"));
		
		
		this.jInternalFrameDetalleFormConsultor.jButtonEliminarToolBarConsultor.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsultor"));
								
		this.jInternalFrameDetalleFormConsultor.jMenuItemEliminarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsultor"));		
		
		
		
		this.jInternalFrameDetalleFormConsultor.jButtonCancelarConsultor.addActionListener (new ButtonActionListener(this,"CancelarConsultor"));
		
		
		this.jInternalFrameDetalleFormConsultor.jButtonCancelarToolBarConsultor.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsultor"));
					
		this.jInternalFrameDetalleFormConsultor.jMenuItemCancelarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsultor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConsultor.jMenuItemDetalleCerrarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsultor"));		
		
		
		
		this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosToolBarConsultor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsultor"));
		
		
		
		this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosToolBarConsultor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsultor"));
		
		
		
		this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsultor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonidConsultorBusqueda.addActionListener(new ButtonActionListener(this,"idConsultorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsultor.jButtonid_empresaConsultorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsultorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonid_empresaConsultorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonidentificacionConsultorBusqueda.addActionListener(new ButtonActionListener(this,"identificacionConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonapellidoConsultorBusqueda.addActionListener(new ButtonActionListener(this,"apellidoConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonnombreConsultorBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonnombre_completoConsultorBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtontelefonoConsultorBusqueda.addActionListener(new ButtonActionListener(this,"telefonoConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtone_mailConsultorBusqueda.addActionListener(new ButtonActionListener(this,"e_mailConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtondireccionConsultorBusqueda.addActionListener(new ButtonActionListener(this,"direccionConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtondescripcionConsultorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionConsultorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsultor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConsultor"));
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsultor"));
		}
		
		this.jTableDatosConsultor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConsultor"));
		
		this.jTableDatosConsultor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConsultor"));
		
		this.jButtonNuevoConsultor.addActionListener(new ButtonActionListener(this,"NuevoConsultor"));
		
		this.jButtonDuplicarConsultor.addActionListener(new ButtonActionListener(this,"DuplicarConsultor"));
		
		this.jButtonCopiarConsultor.addActionListener(new ButtonActionListener(this,"CopiarConsultor"));
		
		this.jButtonVerFormConsultor.addActionListener(new ButtonActionListener(this,"VerFormConsultor"));
		
		
		this.jButtonNuevoToolBarConsultor.addActionListener(new ButtonActionListener(this,"NuevoToolBarConsultor"));
			
		this.jButtonDuplicarToolBarConsultor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConsultor"));
			
		this.jMenuItemNuevoConsultor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConsultor"));
			
		this.jMenuItemDuplicarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConsultor"));		
		
		
		this.jButtonNuevoRelacionesConsultor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConsultor"));
		
		
		this.jButtonNuevoRelacionesToolBarConsultor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConsultor"));
			
		this.jMenuItemNuevoRelacionesConsultor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConsultor"));		
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jButtonModificarConsultor.addActionListener(new ButtonActionListener(this,"ModificarConsultor"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jButtonModificarToolBarConsultor.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsultor"));
			
			this.jInternalFrameDetalleFormConsultor.jMenuItemModificarConsultor.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsultor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConsultor.jButtonActualizarConsultor.addActionListener (new ButtonActionListener(this,"ActualizarConsultor"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jButtonActualizarToolBarConsultor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsultor"));
				
			this.jInternalFrameDetalleFormConsultor.jMenuItemActualizarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsultor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jButtonEliminarConsultor.addActionListener (new ButtonActionListener(this,"EliminarConsultor"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jButtonEliminarToolBarConsultor.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsultor"));
						
			this.jInternalFrameDetalleFormConsultor.jMenuItemEliminarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsultor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jButtonCancelarConsultor.addActionListener (new ButtonActionListener(this,"CancelarConsultor"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jButtonCancelarToolBarConsultor.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsultor"));
			
			this.jInternalFrameDetalleFormConsultor.jMenuItemCancelarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsultor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConsultor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConsultor"));		
		
		
		this.jButtonCerrarConsultor.addActionListener (new ButtonActionListener(this,"CerrarConsultor"));
		
		
		this.jButtonCerrarToolBarConsultor.addActionListener (new ButtonActionListener(this,"CerrarToolBarConsultor"));
			
		this.jMenuItemCerrarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConsultor"));
			
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jMenuItemDetalleCerrarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsultor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosConsultor.addActionListener (new ButtonActionListener(this,"GuardarCambiosConsultor"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosToolBarConsultor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsultor"));
		}
		
		this.jButtonCopiarToolBarConsultor.addActionListener (new ButtonActionListener(this,"CopiarToolBarConsultor"));
			
		this.jButtonVerFormToolBarConsultor.addActionListener (new ButtonActionListener(this,"VerFormToolBarConsultor"));
		
		this.jMenuItemGuardarCambiosConsultor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConsultor"));
			
		this.jMenuItemCopiarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConsultor"));		
		
		this.jMenuItemVerFormConsultor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConsultor"));		
		
		
		this.jButtonGuardarCambiosTablaConsultor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsultor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConsultor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConsultor"));
			
		this.jMenuItemGuardarCambiosTablaConsultor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsultor"));		
		
		
		
		this.jButtonRecargarInformacionConsultor.addActionListener (new ButtonActionListener(this,"RecargarInformacionConsultor"));
					
		this.jButtonRecargarInformacionToolBarConsultor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConsultor"));
		
		this.jMenuItemRecargarInformacionConsultor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConsultor"));		
		
		
		
		this.jButtonAnterioresConsultor.addActionListener (new ButtonActionListener(this,"AnterioresConsultor"));
		
		
		this.jButtonAnterioresToolBarConsultor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConsultor"));
		
		this.jMenuItemAnterioresConsultor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConsultor"));		
		
		
		this.jButtonSiguientesConsultor.addActionListener (new ButtonActionListener(this,"SiguientesConsultor"));
		
		
		this.jButtonSiguientesToolBarConsultor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConsultor"));
			
		this.jMenuItemSiguientesConsultor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConsultor"));
			
		this.jMenuItemAbrirOrderByConsultor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConsultor"));
			
		this.jMenuItemMostrarOcultarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConsultor"));
			
		this.jMenuItemDetalleAbrirOrderByConsultor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConsultor"));
			
		this.jMenuItemDetalleMostarOcultarConsultor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConsultor"));		
		
		
		this.jButtonNuevoGuardarCambiosConsultor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConsultor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsultor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConsultor"));
			
		this.jMenuItemNuevoGuardarCambiosConsultor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConsultor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConsultor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConsultor"));

		this.jCheckBoxSeleccionadosConsultor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConsultor"));
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsultor"));
		}
		
		
		this.jComboBoxTiposRelacionesConsultor.addActionListener (new ButtonActionListener(this,"TiposRelacionesConsultor"));
			
		this.jComboBoxTiposAccionesConsultor.addActionListener (new ButtonActionListener(this,"TiposAccionesConsultor"));
					
		this.jComboBoxTiposSeleccionarConsultor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConsultor"));
			
		this.jTextFieldValorCampoGeneralConsultor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConsultor"));		
		
		
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonidConsultorBusqueda.addActionListener(new ButtonActionListener(this,"idConsultorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsultor.jButtonid_empresaConsultorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsultorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonid_empresaConsultorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonidentificacionConsultorBusqueda.addActionListener(new ButtonActionListener(this,"identificacionConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonapellidoConsultorBusqueda.addActionListener(new ButtonActionListener(this,"apellidoConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonnombreConsultorBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonnombre_completoConsultorBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtontelefonoConsultorBusqueda.addActionListener(new ButtonActionListener(this,"telefonoConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtone_mailConsultorBusqueda.addActionListener(new ButtonActionListener(this,"e_mailConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtondireccionConsultorBusqueda.addActionListener(new ButtonActionListener(this,"direccionConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtondescripcionConsultorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionConsultorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConsultor!=null) {
				this.jInternalFrameReporteDinamicoConsultor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsultor"));
				this.jInternalFrameReporteDinamicoConsultor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsultor"));
				this.jInternalFrameReporteDinamicoConsultor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsultor"));
			}
			
			//this.jButtonCerrarReporteDinamicoConsultor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsultor"));				
			//this.jButtonGenerarReporteDinamicoConsultor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsultor"));
			//this.jButtonGenerarExcelReporteDinamicoConsultor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsultor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConsultor!=null) {
				this.jInternalFrameImportacionConsultor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsultor"));
				this.jInternalFrameImportacionConsultor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsultor"));
				this.jInternalFrameImportacionConsultor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsultor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConsultor.addActionListener (new ButtonActionListener(this,"AbrirOrderByConsultor"));
			
			this.jButtonAbrirOrderByToolBarConsultor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConsultor"));			
			
			if(this.jInternalFrameOrderByConsultor!=null) {
				this.jInternalFrameOrderByConsultor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsultor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConsultor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsultor.jTabbedPaneRelacionesConsultor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsultor"));
		
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
            		closingInternalFrameConsultor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConsultor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConsultor = (JInternalFrameBase)event.getSource();
	            	
	            ConsultorBeanSwingJInternalFrame jInternalFrameParent=(ConsultorBeanSwingJInternalFrame)jInternalFrameDetalleFormConsultor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConsultorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConsultor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConsultorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConsultor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConsultor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsultorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsultorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsultorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConsultor";
		inputMap = this.jButtonNuevoConsultor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConsultor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsultorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsultorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsultorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsultorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConsultor";
		inputMap = this.jButtonNuevoRelacionesConsultor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConsultor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsultorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConsultor";
		inputMap = this.jButtonModificarConsultor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConsultor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConsultorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConsultor";
		inputMap = this.jButtonActualizarConsultor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConsultor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConsultorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConsultor";
		inputMap = this.jButtonEliminarConsultor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConsultor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConsultorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConsultor";
		inputMap = this.jButtonCancelarConsultor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConsultor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConsultorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConsultor";
		inputMap = this.jButtonCerrarConsultor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConsultor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConsultorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConsultor";
		inputMap = this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosConsultor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConsultor.jButtonGuardarCambiosConsultor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConsultorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConsultor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConsultorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConsultor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConsultorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConsultor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConsultorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConsultor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConsultorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonidConsultorBusqueda.addActionListener(new ButtonActionListener(this,"idConsultorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsultor.jButtonid_empresaConsultorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsultorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonid_empresaConsultorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonidentificacionConsultorBusqueda.addActionListener(new ButtonActionListener(this,"identificacionConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonapellidoConsultorBusqueda.addActionListener(new ButtonActionListener(this,"apellidoConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonnombreConsultorBusqueda.addActionListener(new ButtonActionListener(this,"nombreConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtonnombre_completoConsultorBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtontelefonoConsultorBusqueda.addActionListener(new ButtonActionListener(this,"telefonoConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtone_mailConsultorBusqueda.addActionListener(new ButtonActionListener(this,"e_mailConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtondireccionConsultorBusqueda.addActionListener(new ButtonActionListener(this,"direccionConsultorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsultor.jButtondescripcionConsultorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionConsultorBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConsultor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConsultorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConsultorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConsultor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConsultor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Consultor consultorAux:this.consultorLogic.getConsultors()) {
					consultorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Consultor consultorAux:consultors) {
					consultorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConsultorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsultor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Consultor consultorAux:this.consultorLogic.getConsultors()) {
						consultorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Consultor consultorAux:consultors) {
						consultorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Consultor consultorAux:this.consultorLogic.getConsultors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Consultor consultorAux:consultors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConsultor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsultor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsultor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsultor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConsultorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsultor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConsultor.getSelectedRows();
			
			Consultor consultorLocal=new Consultor();
			
			//this.seleccionarTodosConsultor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consultorLocal =(Consultor) this.consultorLogic.getConsultors().toArray()[this.jTableDatosConsultor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					consultorLocal =(Consultor) this.consultors.toArray()[this.jTableDatosConsultor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				consultorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Consultor consultorAux:this.consultorLogic.getConsultors()) {
						consultorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Consultor consultorAux:consultors) {
						consultorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConsultor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsultor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsultor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsultor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConsultorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConsultorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConsultorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConsultor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConsultor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Consultor consultorAux:this.consultorLogic.getConsultors()) {
				
						if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							consultorAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							consultorAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							consultorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							consultorAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							consultorAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							consultorAux.sete_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							consultorAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							consultorAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Consultor consultorAux:consultors) {
					
						if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							consultorAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							consultorAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							consultorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							consultorAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							consultorAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							consultorAux.sete_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							consultorAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							consultorAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConsultor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConsultorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConsultor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConsultor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConsultor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConsultor) {				
					conSplash=true;//false;										
					
					//this.startProcessConsultor(conSplash);
				
					this.generarReporteConsultorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConsultorsSeleccionados();
				//this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsultorsSeleccionados(false);
				//this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsultorsSeleccionados(true);
				//this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsultor();
				
				this.exportarConsultorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConsultors();
				//this.importarConsultors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsultor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConsultorsSeleccionados();
				//this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Consultor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConsultor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConsultor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConsultor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Consultor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.setSelectedIndex(0);					
				}	
			} 			
			else if(ConsultorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConsultor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConsultor(conSplash);
					
						//this.actualizarParametrosGeneralConsultor();
						
						this.generarReporteProcesoAccionConsultorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConsultorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ConsultorES SELECCIONADOS?", "MANTENIMIENTO DE Consultor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConsultor();
				
						this.actualizarParametrosGeneralConsultor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.consultorReturnGeneral=consultorLogic.procesarAccionConsultorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.consultorLogic.getConsultors(),this.consultorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConsultorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConsultor();
					
					ConsultorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConsultorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsultor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsultor.jComboBoxTiposAccionesFormularioConsultor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConsultor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConsultorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConsultor();
			
			if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();		
			Consultor consultor=new Consultor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConsultor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConsultor.getSelectedItem();
			
			
			
			
			consultorsSeleccionados=this.getConsultorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(consultorsSeleccionados.size()==1) {
				for(Consultor consultorAux:consultorsSeleccionados) {
					consultor=consultorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Guia Remision")) {
					jButtonGuiaRemisionActionPerformed(null,rowIndex,true,false,consultor);
				}
				else if(this.sTipoRelacion.equals("Pedido Exportacion")) {
					jButtonPedidoExporActionPerformed(null,rowIndex,true,false,consultor);
				}
				else if(this.sTipoRelacion.equals("Pedido")) {
					jButtonPedidoActionPerformed(null,rowIndex,true,false,consultor);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConsultor();
			
      		//this.finishProcessConsultor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConsultorReturnGeneral() throws Exception {
		if(this.consultorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.consultorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.consultorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.consultorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.consultorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.consultorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConsultor(false);
		}
		
		if(this.consultorReturnGeneral.getConRetornoLista() || this.consultorReturnGeneral.getConRetornoObjeto()) {
			if(this.consultorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.consultorLogic.setConsultors(this.consultorReturnGeneral.getConsultors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.consultorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.consultorLogic.setConsultor(this.consultorReturnGeneral.getConsultor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingConsultor(false);
		}
	}
	
	public void actualizarParametrosGeneralConsultor() throws Exception {
		
		
	}
	
	public ArrayList<Consultor> getConsultorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConsultor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Consultor consultorAux:consultorLogic.getConsultors()) {
					if(consultorAux.getIsSelected()) {
						consultorsSeleccionados.add(consultorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Consultor consultorAux:this.consultors) {
					if(consultorAux.getIsSelected()) {
						consultorsSeleccionados.add(consultorAux);				
					}
				}
			}
			
			if(consultorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						consultorsSeleccionados.addAll(this.consultorLogic.getConsultors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						consultorsSeleccionados.addAll(this.consultors);				
					}
				}
			}
		} else {
			consultorsSeleccionados.add(this.consultor);
		}
		
		return consultorsSeleccionados;
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
	
	public void generarReporteConsultorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConsultorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConsultorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsultorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsultorsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesConsultorsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Consultor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConsultorsSeleccionados() throws Exception {
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();		
		
		consultorsSeleccionados=this.getConsultorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConsultors("Todos",consultorsSeleccionados);
		
	}	
	
	public void generarReporteNormalConsultorsSeleccionados() throws Exception {
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();		
		
		consultorsSeleccionados=this.getConsultorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConsultors("Todos",consultorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConsultorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();
		
		consultorsSeleccionados=this.getConsultorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConsultors("Todos",consultorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConsultorsSeleccionados() throws Exception {
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConsultor();
		
		
		consultorsSeleccionados=this.getConsultorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConsultor();
		
		
		//this.generarReporteConsultors("Todos",consultorsSeleccionados ,consultorImplementable,consultorImplementableHome);
	}
	
	public void mostrarImportacionConsultors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConsultor();
		
		this.abrirFrameImportacionConsultor();		
		
			
		//this.generarReporteConsultors("Todos",consultorsSeleccionados ,consultorImplementable,consultorImplementableHome);
	}
	
	public void importarConsultors() throws Exception {		
	
	}
	
	public void exportarConsultorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConsultorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConsultorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConsultorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Consultor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConsultorsSeleccionados() throws Exception {
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();		
		
		consultorsSeleccionados=this.getConsultorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consultor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConsultor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Consultor consultorAux:consultorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConsultor(consultorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//consultorAux.setsDetalleGeneralEntityReporte(consultorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consultorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consultor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConsultor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_IDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsultorConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConsultor(Consultor consultor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=consultor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=consultor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=consultor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consultor.getidentificacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consultor.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consultor.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consultor.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consultor.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consultor.gete_mail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consultor.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consultor.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConsultorsSeleccionados() throws Exception {
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();		
		
		consultorsSeleccionados=this.getConsultorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consultor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Consultors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConsultor(row);				
				iRow++;
			}				
			
			for(Consultor consultorAux:consultorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConsultor(consultorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consultorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consultor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConsultorsSeleccionados() throws Exception {
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();		
		
		consultorsSeleccionados=this.getConsultorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consultor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("consultors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("consultor");
			//elementRoot.appendChild(element);
		
			for(Consultor consultorAux:consultorsSeleccionados) {
				element = document.createElement("consultor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConsultor(consultorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consultorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consultor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConsultor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_IDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsultorConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConsultor(Consultor consultor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(consultor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(consultor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consultor.getidentificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(consultor.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(consultor.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(consultor.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(consultor.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(consultor.gete_mail());
		cell = row.createCell(iColumn++);cell.setCellValue(consultor.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(consultor.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlConsultor(Consultor consultor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConsultorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(consultor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConsultorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(consultor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ConsultorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(consultor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementidentificacion = document.createElement(ConsultorConstantesFunciones.IDENTIFICACION);
		elementidentificacion.appendChild(document.createTextNode(consultor.getidentificacion().trim()));
		element.appendChild(elementidentificacion);

		Element elementapellido = document.createElement(ConsultorConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(consultor.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementnombre = document.createElement(ConsultorConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(consultor.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_completo = document.createElement(ConsultorConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(consultor.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementtelefono = document.createElement(ConsultorConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(consultor.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elemente_mail = document.createElement(ConsultorConstantesFunciones.EMAIL);
		elemente_mail.appendChild(document.createTextNode(consultor.gete_mail().trim()));
		element.appendChild(elemente_mail);

		Element elementdireccion = document.createElement(ConsultorConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(consultor.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementdescripcion = document.createElement(ConsultorConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(consultor.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoConsultorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Consultor> consultorsSeleccionados=new ArrayList<Consultor>();
		
		consultorsSeleccionados=this.getConsultorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConsultor(consultorsSeleccionados);
		
		this.generarReporteConsultors("Todos",consultorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConsultor(ArrayList<Consultor> consultorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Consultor consultorAux:consultorsSeleccionados) {
				consultorAux.setsDetalleGeneralEntityReporte(consultorAux.toString());
			
				if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					consultorAux.setsDescripcionGeneralEntityReporte1(consultorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_IDENTIFICACION)) {
					existe=true;
					consultorAux.setsDescripcionGeneralEntityReporte1(consultorAux.getidentificacion());
				}
				 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					consultorAux.setsDescripcionGeneralEntityReporte1(consultorAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					consultorAux.setsDescripcionGeneralEntityReporte1(consultorAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					consultorAux.setsDescripcionGeneralEntityReporte1(consultorAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					consultorAux.setsDescripcionGeneralEntityReporte1(consultorAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					consultorAux.setsDescripcionGeneralEntityReporte1(consultorAux.gete_mail());
				}
				 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					consultorAux.setsDescripcionGeneralEntityReporte1(consultorAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(ConsultorConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					consultorAux.setsDescripcionGeneralEntityReporte1(consultorAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsultorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConsultor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConsultor=true;
				this.isVisibilidadCeldaNuevoRelacionesConsultor=true;
				this.isVisibilidadCeldaGuardarCambiosConsultor=true;
			}
			
			this.isVisibilidadCeldaModificarConsultor=false;
			this.isVisibilidadCeldaActualizarConsultor=false;
			this.isVisibilidadCeldaEliminarConsultor=false;
			this.isVisibilidadCeldaCancelarConsultor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsultor=true;
				} else {
					this.isVisibilidadCeldaGuardarConsultor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConsultor=false;
			this.isVisibilidadCeldaNuevoRelacionesConsultor=false;
			this.isVisibilidadCeldaGuardarCambiosConsultor=false;
			this.isVisibilidadCeldaModificarConsultor=false;
			this.isVisibilidadCeldaActualizarConsultor=true;
			this.isVisibilidadCeldaEliminarConsultor=false;
			this.isVisibilidadCeldaCancelarConsultor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsultor=true;
				} else {
					this.isVisibilidadCeldaGuardarConsultor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConsultor=false;
			this.isVisibilidadCeldaNuevoRelacionesConsultor=false;
			this.isVisibilidadCeldaGuardarCambiosConsultor=false;
			this.isVisibilidadCeldaModificarConsultor=false;
			this.isVisibilidadCeldaActualizarConsultor=true;
			this.isVisibilidadCeldaEliminarConsultor=true;
			this.isVisibilidadCeldaCancelarConsultor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsultor=true;
				} else {
					this.isVisibilidadCeldaGuardarConsultor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConsultor=false;
			this.isVisibilidadCeldaNuevoRelacionesConsultor=false;
			this.isVisibilidadCeldaGuardarCambiosConsultor=false;
			this.isVisibilidadCeldaModificarConsultor=false;
			this.isVisibilidadCeldaActualizarConsultor=true;
			this.isVisibilidadCeldaEliminarConsultor=false;
			this.isVisibilidadCeldaCancelarConsultor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsultor=false;
				} else {
					this.isVisibilidadCeldaGuardarConsultor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConsultor=true;
			this.isVisibilidadCeldaNuevoRelacionesConsultor=true;
			this.isVisibilidadCeldaGuardarCambiosConsultor=true;
			this.isVisibilidadCeldaModificarConsultor=false;
			this.isVisibilidadCeldaActualizarConsultor=false;
			this.isVisibilidadCeldaEliminarConsultor=false;
			this.isVisibilidadCeldaCancelarConsultor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsultor=true;
				} else {
					this.isVisibilidadCeldaGuardarConsultor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConsultor=false;
			this.isVisibilidadCeldaNuevoRelacionesConsultor=false;
			this.isVisibilidadCeldaGuardarCambiosConsultor=false;
			this.isVisibilidadCeldaActualizarConsultor=false;
			this.isVisibilidadCeldaEliminarConsultor=false;
			this.isVisibilidadCeldaCancelarConsultor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsultor=false;
				} else {
					this.isVisibilidadCeldaGuardarConsultor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConsultor=false;
			this.isVisibilidadCeldaNuevoRelacionesConsultor=false;
			this.isVisibilidadCeldaGuardarCambiosConsultor=false;
			this.isVisibilidadCeldaModificarConsultor=true;
			this.isVisibilidadCeldaActualizarConsultor=false;
			this.isVisibilidadCeldaEliminarConsultor=false;
			this.isVisibilidadCeldaCancelarConsultor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsultor=false;
				} else {
					this.isVisibilidadCeldaGuardarConsultor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConsultorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConsultor=true;
			this.isVisibilidadCeldaNuevoRelacionesConsultor=true;
			this.isVisibilidadCeldaGuardarCambiosConsultor=true;
		} else {
			this.actualizarEstadoPanelsConsultor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConsultor=false;
			//this.isVisibilidadCeldaVerFormConsultor=false;
			this.isVisibilidadCeldaDuplicarConsultor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!consultorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConsultor=false;
		} else {
			this.isVisibilidadCeldaNuevoConsultor=false;
			this.isVisibilidadCeldaGuardarCambiosConsultor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(consultorSessionBean.getEsGuardarRelacionado()) {
			if(!consultorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConsultor=false;												
			}
			
			this.jButtonCerrarConsultor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConsultor=false;
		}
		
		if(!this.permiteMantenimiento(this.consultor)) {
			this.isVisibilidadCeldaActualizarConsultor=false;
			this.isVisibilidadCeldaEliminarConsultor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConsultor() {
		this.isVisibilidadCeldaNuevoConsultor=false;
		this.isVisibilidadCeldaGuardarCambiosConsultor=false;
	}
	
	public void actualizarEstadoPanelsConsultor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConsultor!=null) {
				this.jScrollPanelDatosEdicionConsultor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsultor!=null) {
				this.jTabbedPaneBusquedasConsultor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsultor!=null) {
				this.jScrollPanelDatosConsultor.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsultor!=null) {
				this.jPanelPaginacionConsultor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsultor!=null) {
				this.jPanelParametrosReportesConsultor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConsultor!=null) {
				this.jScrollPanelDatosEdicionConsultor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsultor!=null) {
				this.jTabbedPaneBusquedasConsultor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConsultor!=null) {
				this.jScrollPanelDatosConsultor.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsultor!=null) {
				this.jPanelPaginacionConsultor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsultor!=null) {
				this.jPanelParametrosReportesConsultor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConsultor!=null) {
				this.jScrollPanelDatosEdicionConsultor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsultor!=null) {
				this.jTabbedPaneBusquedasConsultor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsultor!=null) {
				this.jScrollPanelDatosConsultor.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsultor!=null) {
				this.jPanelPaginacionConsultor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsultor!=null) {
				this.jPanelParametrosReportesConsultor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConsultor!=null) {
				this.jScrollPanelDatosEdicionConsultor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsultor!=null) {
				this.jTabbedPaneBusquedasConsultor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsultor!=null) {
				this.jScrollPanelDatosConsultor.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsultor!=null) {
				this.jPanelPaginacionConsultor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsultor!=null) {
				this.jPanelParametrosReportesConsultor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConsultor!=null) {
				this.jScrollPanelDatosEdicionConsultor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsultor!=null) {
				this.jTabbedPaneBusquedasConsultor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsultor!=null) {
				this.jScrollPanelDatosConsultor.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsultor!=null) {
				this.jPanelPaginacionConsultor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsultor!=null) {
				this.jPanelParametrosReportesConsultor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConsultor!=null) {
				this.jScrollPanelDatosEdicionConsultor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsultor!=null) {
				this.jTabbedPaneBusquedasConsultor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsultor!=null) {
				this.jScrollPanelDatosConsultor.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsultor!=null) {
				this.jPanelPaginacionConsultor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsultor!=null) {
				this.jPanelParametrosReportesConsultor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConsultor!=null) {
				this.jScrollPanelDatosEdicionConsultor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsultor!=null) {
				this.jTabbedPaneBusquedasConsultor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsultor!=null) {
				this.jScrollPanelDatosConsultor.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsultor!=null) {
				this.jPanelPaginacionConsultor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsultor!=null) {
				this.jPanelParametrosReportesConsultor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.consultorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConsultor!=null) {
					this.jTabbedPaneBusquedasConsultor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConsultor!=null) {
				this.jPanelParametrosReportesConsultor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.consultorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsultor!=null) {
				this.jTabbedPaneBusquedasConsultor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConsultor!=null) {
				this.jPanelParametrosReportesConsultor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionConsultorParaGuiaRemisiones() throws Exception {
		Boolean isPaginaPopupGuiaRemision=false;

		try {

			if(this.consultorSessionBean==null) {
				this.consultorSessionBean=new ConsultorSessionBean();
			}

			if(this.jInternalFrameDetalleFormConsultor.guiaremisionSessionBean==null) {
				this.jInternalFrameDetalleFormConsultor.guiaremisionSessionBean=new GuiaRemisionSessionBean();
			}

			this.jInternalFrameDetalleFormConsultor.guiaremisionSessionBean.setsPathNavegacionActual(consultorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormConsultor.guiaremisionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupGuiaRemision=this.jInternalFrameDetalleFormConsultor.guiaremisionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormConsultor.guiaremisionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeGuiaRemision(true);
			this.jInternalFrameDetalleFormConsultor.guiaremisionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeGuiaRemision(ConsultorConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormConsultor.guiaremisionSessionBean.setisBusquedaDesdeForeignKeySesionConsultor(true);
			this.jInternalFrameDetalleFormConsultor.guiaremisionSessionBean.setlidConsultorActual(this.idConsultorActual);

			consultorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConsultor(true);
			consultorSessionBean.setlIdConsultorActualForeignKey(this.idConsultorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionConsultorParaPedidoExpors() throws Exception {
		Boolean isPaginaPopupPedidoExpor=false;

		try {

			if(this.consultorSessionBean==null) {
				this.consultorSessionBean=new ConsultorSessionBean();
			}

			if(this.jInternalFrameDetalleFormConsultor.pedidoexporSessionBean==null) {
				this.jInternalFrameDetalleFormConsultor.pedidoexporSessionBean=new PedidoExporSessionBean();
			}

			this.jInternalFrameDetalleFormConsultor.pedidoexporSessionBean.setsPathNavegacionActual(consultorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormConsultor.pedidoexporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoExpor=this.jInternalFrameDetalleFormConsultor.pedidoexporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormConsultor.pedidoexporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoExpor(true);
			this.jInternalFrameDetalleFormConsultor.pedidoexporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoExpor(ConsultorConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormConsultor.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionConsultor(true);
			this.jInternalFrameDetalleFormConsultor.pedidoexporSessionBean.setlidConsultorActual(this.idConsultorActual);

			consultorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConsultor(true);
			consultorSessionBean.setlIdConsultorActualForeignKey(this.idConsultorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionConsultorParaPedidos() throws Exception {
		Boolean isPaginaPopupPedido=false;

		try {

			if(this.consultorSessionBean==null) {
				this.consultorSessionBean=new ConsultorSessionBean();
			}

			if(this.jInternalFrameDetalleFormConsultor.pedidoSessionBean==null) {
				this.jInternalFrameDetalleFormConsultor.pedidoSessionBean=new PedidoSessionBean();
			}

			this.jInternalFrameDetalleFormConsultor.pedidoSessionBean.setsPathNavegacionActual(consultorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormConsultor.pedidoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedido=this.jInternalFrameDetalleFormConsultor.pedidoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormConsultor.pedidoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedido(true);
			this.jInternalFrameDetalleFormConsultor.pedidoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedido(ConsultorConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormConsultor.pedidoSessionBean.setisBusquedaDesdeForeignKeySesionConsultor(true);
			this.jInternalFrameDetalleFormConsultor.pedidoSessionBean.setlidConsultorActual(this.idConsultorActual);

			consultorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConsultor(true);
			consultorSessionBean.setlIdConsultorActualForeignKey(this.idConsultorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ConsultorSessionBean consultorSessionBean=new ConsultorSessionBean();
		
		if(this.consultorSessionBean==null) {
			this.consultorSessionBean=new ConsultorSessionBean();
		}
		
		this.consultorSessionBean.setsUltimaBusquedaConsultor(this.getsAccionBusqueda());
		this.consultorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.consultorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			consultorSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ConsultorSessionBean consultorSessionBean=new ConsultorSessionBean();
		
		if(this.consultorSessionBean==null) {
			this.consultorSessionBean=new ConsultorSessionBean();
		}
		
		if(this.consultorSessionBean.getsUltimaBusquedaConsultor()!=null&&!this.consultorSessionBean.getsUltimaBusquedaConsultor().equals("")) {
			this.setsAccionBusqueda(consultorSessionBean.getsUltimaBusquedaConsultor());
			this.setiNumeroPaginacion(consultorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(consultorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(consultorSessionBean.getid_empresa());
				consultorSessionBean.setid_empresa(-1L);
			}
		}
		
		this.consultorSessionBean.setsUltimaBusquedaConsultor("");
		this.consultorSessionBean.setiNumeroPaginacion(ConsultorConstantesFunciones.INUMEROPAGINACION);
		this.consultorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaConsultor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConsultor() {
		this.updateBorderResaltarBusquedasFormularioConsultor();
		this.updateVisibilidadBusquedasFormularioConsultor();
		this.updateHabilitarBusquedasFormularioConsultor();
	}
	
	public void updateBorderResaltarBusquedasFormularioConsultor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConsultor.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConsultor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConsultor.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConsultor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConsultor.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConsultor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarConsultor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConsultor() throws Exception {

		if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConsultor();
		this.updateVisibilidadResaltarControlesFormularioConsultor();
		this.updateHabilitarResaltarControlesFormularioConsultor();
		
	}
	
	public void updateBorderResaltarControlesFormularioConsultor() throws Exception {
		if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.consultorConstantesFunciones.resaltaridConsultor!=null && this.jInternalFrameDetalleFormConsultor!=null) {this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.setBorder(this.consultorConstantesFunciones.resaltaridConsultor);}
		if(this.consultorConstantesFunciones.resaltarid_empresaConsultor!=null && this.jInternalFrameDetalleFormConsultor!=null) {this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.setBorder(this.consultorConstantesFunciones.resaltarid_empresaConsultor);}
		if(this.consultorConstantesFunciones.resaltaridentificacionConsultor!=null && this.jInternalFrameDetalleFormConsultor!=null) {this.jInternalFrameDetalleFormConsultor.jTextFieldidentificacionConsultor.setBorder(this.consultorConstantesFunciones.resaltaridentificacionConsultor);}
		if(this.consultorConstantesFunciones.resaltarapellidoConsultor!=null && this.jInternalFrameDetalleFormConsultor!=null) {this.jInternalFrameDetalleFormConsultor.jTextAreaapellidoConsultor.setBorder(this.consultorConstantesFunciones.resaltarapellidoConsultor);}
		if(this.consultorConstantesFunciones.resaltarnombreConsultor!=null && this.jInternalFrameDetalleFormConsultor!=null) {this.jInternalFrameDetalleFormConsultor.jTextAreanombreConsultor.setBorder(this.consultorConstantesFunciones.resaltarnombreConsultor);}
		if(this.consultorConstantesFunciones.resaltarnombre_completoConsultor!=null && this.jInternalFrameDetalleFormConsultor!=null) {this.jInternalFrameDetalleFormConsultor.jTextAreanombre_completoConsultor.setBorder(this.consultorConstantesFunciones.resaltarnombre_completoConsultor);}
		if(this.consultorConstantesFunciones.resaltartelefonoConsultor!=null && this.jInternalFrameDetalleFormConsultor!=null) {this.jInternalFrameDetalleFormConsultor.jTextAreatelefonoConsultor.setBorder(this.consultorConstantesFunciones.resaltartelefonoConsultor);}
		if(this.consultorConstantesFunciones.resaltare_mailConsultor!=null && this.jInternalFrameDetalleFormConsultor!=null) {this.jInternalFrameDetalleFormConsultor.jTextAreae_mailConsultor.setBorder(this.consultorConstantesFunciones.resaltare_mailConsultor);}
		if(this.consultorConstantesFunciones.resaltardireccionConsultor!=null && this.jInternalFrameDetalleFormConsultor!=null) {this.jInternalFrameDetalleFormConsultor.jTextAreadireccionConsultor.setBorder(this.consultorConstantesFunciones.resaltardireccionConsultor);}
		if(this.consultorConstantesFunciones.resaltardescripcionConsultor!=null && this.jInternalFrameDetalleFormConsultor!=null) {this.jInternalFrameDetalleFormConsultor.jTextAreadescripcionConsultor.setBorder(this.consultorConstantesFunciones.resaltardescripcionConsultor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConsultor() throws Exception {		
		if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsultor!=null) {
	
		//this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.setVisible(this.consultorConstantesFunciones.mostraridConsultor);
		this.jInternalFrameDetalleFormConsultor.jPanelidConsultor.setVisible(this.consultorConstantesFunciones.mostraridConsultor);
		//this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.setVisible(this.consultorConstantesFunciones.mostrarid_empresaConsultor);
		this.jInternalFrameDetalleFormConsultor.jPanelid_empresaConsultor.setVisible(this.consultorConstantesFunciones.mostrarid_empresaConsultor);
		//this.jInternalFrameDetalleFormConsultor.jTextFieldidentificacionConsultor.setVisible(this.consultorConstantesFunciones.mostraridentificacionConsultor);
		this.jInternalFrameDetalleFormConsultor.jPanelidentificacionConsultor.setVisible(this.consultorConstantesFunciones.mostraridentificacionConsultor);
		//this.jInternalFrameDetalleFormConsultor.jTextAreaapellidoConsultor.setVisible(this.consultorConstantesFunciones.mostrarapellidoConsultor);
		this.jInternalFrameDetalleFormConsultor.jPanelapellidoConsultor.setVisible(this.consultorConstantesFunciones.mostrarapellidoConsultor);
		//this.jInternalFrameDetalleFormConsultor.jTextAreanombreConsultor.setVisible(this.consultorConstantesFunciones.mostrarnombreConsultor);
		this.jInternalFrameDetalleFormConsultor.jPanelnombreConsultor.setVisible(this.consultorConstantesFunciones.mostrarnombreConsultor);
		//this.jInternalFrameDetalleFormConsultor.jTextAreanombre_completoConsultor.setVisible(this.consultorConstantesFunciones.mostrarnombre_completoConsultor);
		this.jInternalFrameDetalleFormConsultor.jPanelnombre_completoConsultor.setVisible(this.consultorConstantesFunciones.mostrarnombre_completoConsultor);
		//this.jInternalFrameDetalleFormConsultor.jTextAreatelefonoConsultor.setVisible(this.consultorConstantesFunciones.mostrartelefonoConsultor);
		this.jInternalFrameDetalleFormConsultor.jPaneltelefonoConsultor.setVisible(this.consultorConstantesFunciones.mostrartelefonoConsultor);
		//this.jInternalFrameDetalleFormConsultor.jTextAreae_mailConsultor.setVisible(this.consultorConstantesFunciones.mostrare_mailConsultor);
		this.jInternalFrameDetalleFormConsultor.jPanele_mailConsultor.setVisible(this.consultorConstantesFunciones.mostrare_mailConsultor);
		//this.jInternalFrameDetalleFormConsultor.jTextAreadireccionConsultor.setVisible(this.consultorConstantesFunciones.mostrardireccionConsultor);
		this.jInternalFrameDetalleFormConsultor.jPaneldireccionConsultor.setVisible(this.consultorConstantesFunciones.mostrardireccionConsultor);
		//this.jInternalFrameDetalleFormConsultor.jTextAreadescripcionConsultor.setVisible(this.consultorConstantesFunciones.mostrardescripcionConsultor);
		this.jInternalFrameDetalleFormConsultor.jPaneldescripcionConsultor.setVisible(this.consultorConstantesFunciones.mostrardescripcionConsultor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConsultor() throws Exception {
		if(this.jInternalFrameDetalleFormConsultor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsultor!=null) {
	
		this.jInternalFrameDetalleFormConsultor.jLabelidConsultor.setEnabled(this.consultorConstantesFunciones.activaridConsultor);
		this.jInternalFrameDetalleFormConsultor.jComboBoxid_empresaConsultor.setEnabled(this.consultorConstantesFunciones.activarid_empresaConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextFieldidentificacionConsultor.setEnabled(this.consultorConstantesFunciones.activaridentificacionConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreaapellidoConsultor.setEnabled(this.consultorConstantesFunciones.activarapellidoConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreanombreConsultor.setEnabled(this.consultorConstantesFunciones.activarnombreConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreanombre_completoConsultor.setEnabled(this.consultorConstantesFunciones.activarnombre_completoConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreatelefonoConsultor.setEnabled(this.consultorConstantesFunciones.activartelefonoConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreae_mailConsultor.setEnabled(this.consultorConstantesFunciones.activare_mailConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreadireccionConsultor.setEnabled(this.consultorConstantesFunciones.activardireccionConsultor);
		this.jInternalFrameDetalleFormConsultor.jTextAreadescripcionConsultor.setEnabled(this.consultorConstantesFunciones.activardescripcionConsultor);
		}
	}
	
		
}