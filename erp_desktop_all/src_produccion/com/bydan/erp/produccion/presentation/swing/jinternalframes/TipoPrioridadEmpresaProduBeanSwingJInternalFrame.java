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

import com.bydan.erp.produccion.util.TipoPrioridadEmpresaProduConstantesFunciones;
import com.bydan.erp.produccion.util.TipoPrioridadEmpresaProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.TipoPrioridadEmpresaProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.TipoPrioridadEmpresaProduBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoPrioridadEmpresaProduBeanSwingJInternalFrame extends TipoPrioridadEmpresaProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoPrioridadEmpresaProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoPrioridadEmpresaProdu> tipoprioridadempresaproduValidator = new ClassValidator<TipoPrioridadEmpresaProdu>(TipoPrioridadEmpresaProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoPrioridadEmpresaProdu tipoprioridadempresaprodu;	
	public TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux;
	public TipoPrioridadEmpresaProdu tipoprioridadempresaproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoPrioridadEmpresaProdu tipoprioridadempresaproduTotales;
	public Long idTipoPrioridadEmpresaProduActual;
	public Long iIdNuevoTipoPrioridadEmpresaProdu=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosOrdenProdu=false;

	public Boolean getIsTienePermisosOrdenProdu() {
		return isTienePermisosOrdenProdu;
	}

	public void setIsTienePermisosOrdenProdu(Boolean isTienePermisosOrdenProdu) {
		this.isTienePermisosOrdenProdu= isTienePermisosOrdenProdu;
	}


	public Boolean isTienePermisosPedidoProdu=false;

	public Boolean getIsTienePermisosPedidoProdu() {
		return isTienePermisosPedidoProdu;
	}

	public void setIsTienePermisosPedidoProdu(Boolean isTienePermisosPedidoProdu) {
		this.isTienePermisosPedidoProdu= isTienePermisosPedidoProdu;
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
	
	public Boolean isPermisoTodoTipoPrioridadEmpresaProdu;
	public Boolean isPermisoNuevoTipoPrioridadEmpresaProdu;
	public Boolean isPermisoActualizarTipoPrioridadEmpresaProdu;
	public Boolean isPermisoActualizarOriginalTipoPrioridadEmpresaProdu;
	public Boolean isPermisoEliminarTipoPrioridadEmpresaProdu;
	public Boolean isPermisoGuardarCambiosTipoPrioridadEmpresaProdu;
	public Boolean isPermisoConsultaTipoPrioridadEmpresaProdu;
	public Boolean isPermisoBusquedaTipoPrioridadEmpresaProdu;
	public Boolean isPermisoReporteTipoPrioridadEmpresaProdu;
	public Boolean isPermisoPaginacionMedioTipoPrioridadEmpresaProdu;
	public Boolean isPermisoPaginacionAltoTipoPrioridadEmpresaProdu;
	public Boolean isPermisoPaginacionTodoTipoPrioridadEmpresaProdu;
	public Boolean isPermisoCopiarTipoPrioridadEmpresaProdu;
	public Boolean isPermisoVerFormTipoPrioridadEmpresaProdu;
	public Boolean isPermisoDuplicarTipoPrioridadEmpresaProdu;
	public Boolean isPermisoOrdenTipoPrioridadEmpresaProdu;
	
	
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
	
	public TipoPrioridadEmpresaProduParameterReturnGeneral tipoprioridadempresaproduReturnGeneral;
	public TipoPrioridadEmpresaProduParameterReturnGeneral tipoprioridadempresaproduParameterGeneral;
	
	

	public OrdenProduLogic ordenproduLogic=null;

	public OrdenProduLogic getOrdenProduLogic() {
		return ordenproduLogic;
	}

	public void setOrdenProduLogic(OrdenProduLogic ordenproduLogic) {
		this.ordenproduLogic = ordenproduLogic;
	}


	public PedidoProduLogic pedidoproduLogic=null;

	public PedidoProduLogic getPedidoProduLogic() {
		return pedidoproduLogic;
	}

	public void setPedidoProduLogic(PedidoProduLogic pedidoproduLogic) {
		this.pedidoproduLogic = pedidoproduLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoPrioridadEmpresaProdu=false;
	public Boolean esParaAccionDesdeFormularioTipoPrioridadEmpresaProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoPrioridadEmpresaProduSessionBeanAdditional tipoprioridadempresaproduSessionBeanAdditional=null;
	
	public TipoPrioridadEmpresaProduSessionBeanAdditional getTipoPrioridadEmpresaProduSessionBeanAdditional() {
		return this.tipoprioridadempresaproduSessionBeanAdditional;
	}
	
	public void setTipoPrioridadEmpresaProduSessionBeanAdditional(TipoPrioridadEmpresaProduSessionBeanAdditional tipoprioridadempresaproduSessionBeanAdditional) {
		try {
			this.tipoprioridadempresaproduSessionBeanAdditional=tipoprioridadempresaproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional tipoprioridadempresaproduBeanSwingJInternalFrameAdditional=null;
	//public class TipoPrioridadEmpresaProduBeanSwingJInternalFrame
	
	public TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional getTipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional() {
		return this.tipoprioridadempresaproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional(TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional tipoprioridadempresaproduBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoprioridadempresaproduBeanSwingJInternalFrameAdditional=tipoprioridadempresaproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoPrioridadEmpresaProduLogic tipoprioridadempresaproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoPrioridadEmpresaProdu tipoprioridadempresaproduBean;
	public TipoPrioridadEmpresaProduConstantesFunciones tipoprioridadempresaproduConstantesFunciones;
	//public TipoPrioridadEmpresaProduParameterReturnGeneral tipoprioridadempresaproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodus;	
	//public List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusEliminados;
	//public List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=false;
	public Boolean isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu=true;
	public Boolean isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu=true;
	public Boolean isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu=true;
	public Boolean isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=false;
	public Boolean isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=false;
	public Boolean isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=false;
	public Boolean isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=false;
	public Boolean isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=false;
	public Boolean isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoPrioridadEmpresaProdu() {
		return this.iIdNuevoTipoPrioridadEmpresaProdu;
	}

	public void setiIdNuevoTipoPrioridadEmpresaProdu(Long iIdNuevoTipoPrioridadEmpresaProdu) {
		this.iIdNuevoTipoPrioridadEmpresaProdu = iIdNuevoTipoPrioridadEmpresaProdu;
	}
	
	public Long getidTipoPrioridadEmpresaProduActual() {
		return this.idTipoPrioridadEmpresaProduActual;
	}

	public void setidTipoPrioridadEmpresaProduActual(Long idTipoPrioridadEmpresaProduActual) {
		this.idTipoPrioridadEmpresaProduActual = idTipoPrioridadEmpresaProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoPrioridadEmpresaProdu gettipoprioridadempresaprodu() {
		return this.tipoprioridadempresaprodu;
	}

	public void settipoprioridadempresaprodu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu) {
		this.tipoprioridadempresaprodu = tipoprioridadempresaprodu;
	}
	
	public TipoPrioridadEmpresaProdu gettipoprioridadempresaproduAux() {
		return this.tipoprioridadempresaproduAux;
	}

	public void settipoprioridadempresaproduAux(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux) {
		this.tipoprioridadempresaproduAux = tipoprioridadempresaproduAux;
	}				
	
	public TipoPrioridadEmpresaProdu gettipoprioridadempresaproduAnterior() {
		return this.tipoprioridadempresaproduAnterior;
	}

	public void settipoprioridadempresaproduAnterior(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAnterior) {
		this.tipoprioridadempresaproduAnterior = tipoprioridadempresaproduAnterior;
	}	
	
	public TipoPrioridadEmpresaProdu gettipoprioridadempresaproduTotales() {
		return this.tipoprioridadempresaproduTotales;
	}

	public void settipoprioridadempresaproduTotales(TipoPrioridadEmpresaProdu tipoprioridadempresaproduTotales) {
		this.tipoprioridadempresaproduTotales = tipoprioridadempresaproduTotales;
	}	
	
	public TipoPrioridadEmpresaProdu gettipoprioridadempresaproduBean() {
		return this.tipoprioridadempresaproduBean;
	}

	public void settipoprioridadempresaproduBean(TipoPrioridadEmpresaProdu tipoprioridadempresaproduBean) {
		this.tipoprioridadempresaproduBean = tipoprioridadempresaproduBean;
	}	
	
	public TipoPrioridadEmpresaProduParameterReturnGeneral gettipoprioridadempresaproduReturnGeneral() {
		return this.tipoprioridadempresaproduReturnGeneral;
	}

	public void settipoprioridadempresaproduReturnGeneral(TipoPrioridadEmpresaProduParameterReturnGeneral tipoprioridadempresaproduReturnGeneral) {
		this.tipoprioridadempresaproduReturnGeneral = tipoprioridadempresaproduReturnGeneral;
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
	
	
	public TipoPrioridadEmpresaProduLogic getTipoPrioridadEmpresaProduLogic()	{		
		return tipoprioridadempresaproduLogic;
	}

	public void setTipoPrioridadEmpresaProduLogic(TipoPrioridadEmpresaProduLogic tipoprioridadempresaproduLogic) {
		this.tipoprioridadempresaproduLogic = tipoprioridadempresaproduLogic;
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
	
	public Boolean getIsEsNuevoTipoPrioridadEmpresaProdu() {
		return isEsNuevoTipoPrioridadEmpresaProdu;
	}

	public void setIsEsNuevoTipoPrioridadEmpresaProdu(Boolean isEsNuevoTipoPrioridadEmpresaProdu) {
		this.isEsNuevoTipoPrioridadEmpresaProdu = isEsNuevoTipoPrioridadEmpresaProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoPrioridadEmpresaProdu() {
		return esParaAccionDesdeFormularioTipoPrioridadEmpresaProdu;
	}
	
	public void setEsParaAccionDesdeFormularioTipoPrioridadEmpresaProdu(Boolean esParaAccionDesdeFormularioTipoPrioridadEmpresaProdu) {
		this.esParaAccionDesdeFormularioTipoPrioridadEmpresaProdu = esParaAccionDesdeFormularioTipoPrioridadEmpresaProdu;
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

			if(this.tipoprioridadempresaproduSessionBean==null) {
				this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
			}

			if(!this.tipoprioridadempresaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoprioridadempresaproduSessionBean.getlidEmpresaActual());
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

					if(this.tipoprioridadempresaprodu!=null) {
						this.tipoprioridadempresaprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
						this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoPrioridadEmpresaProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
						if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoPrioridadEmpresaProduGenerico)throws Exception
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
				jComboBoxid_empresaTipoPrioridadEmpresaProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoPrioridadEmpresaProduGenerico!=null && jComboBoxid_empresaTipoPrioridadEmpresaProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoPrioridadEmpresaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,JComboBox jComboBoxid_empresaTipoPrioridadEmpresaProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoPrioridadEmpresaProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoPrioridadEmpresaProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoprioridadempresaprodu.setid_empresa(empresaAux.getId());
				tipoprioridadempresaprodu.setempresa_descripcion(TipoPrioridadEmpresaProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoprioridadempresaprodu.setEmpresa(empresaAux);			}
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

					if(!TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { 
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { 
					}

					if(!TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoPrioridadEmpresaProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoPrioridadEmpresaProduConstantesFunciones.refrescarForeignKeysDescripcionesTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoPrioridadEmpresaProduConstantesFunciones.refrescarForeignKeysDescripcionesTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoprioridadempresaproduLogic.setTipoPrioridadEmpresaProdus(this.tipoprioridadempresaprodus);
			tipoprioridadempresaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoPrioridadEmpresaProduParameterReturnGeneral getTipoPrioridadEmpresaProduParameterGeneral() {
		return this.tipoprioridadempresaproduParameterGeneral;
	}
	
	public void setTipoPrioridadEmpresaProduParameterGeneral(TipoPrioridadEmpresaProduParameterReturnGeneral tipoprioridadempresaproduParameterGeneral) {
		this.tipoprioridadempresaproduParameterGeneral = tipoprioridadempresaproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoPrioridadEmpresaProdu() {
		return isPermisoTodoTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoTodoTipoPrioridadEmpresaProdu(Boolean isPermisoTodoTipoPrioridadEmpresaProdu) {
		this.isPermisoTodoTipoPrioridadEmpresaProdu = isPermisoTodoTipoPrioridadEmpresaProdu;
	}

	public Boolean getIsPermisoNuevoTipoPrioridadEmpresaProdu() {
		return isPermisoNuevoTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoNuevoTipoPrioridadEmpresaProdu(Boolean isPermisoNuevoTipoPrioridadEmpresaProdu) {
		this.isPermisoNuevoTipoPrioridadEmpresaProdu = isPermisoNuevoTipoPrioridadEmpresaProdu;
	}

	public Boolean getIsPermisoActualizarTipoPrioridadEmpresaProdu() {
		return isPermisoActualizarTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoActualizarTipoPrioridadEmpresaProdu(Boolean isPermisoActualizarTipoPrioridadEmpresaProdu) {
		this.isPermisoActualizarTipoPrioridadEmpresaProdu = isPermisoActualizarTipoPrioridadEmpresaProdu;
	}

	public Boolean getIsPermisoEliminarTipoPrioridadEmpresaProdu() {
		return isPermisoEliminarTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoEliminarTipoPrioridadEmpresaProdu(Boolean isPermisoEliminarTipoPrioridadEmpresaProdu) {
		this.isPermisoEliminarTipoPrioridadEmpresaProdu = isPermisoEliminarTipoPrioridadEmpresaProdu;
	}

	public Boolean getIsPermisoGuardarCambiosTipoPrioridadEmpresaProdu() {
		return isPermisoGuardarCambiosTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoGuardarCambiosTipoPrioridadEmpresaProdu(Boolean isPermisoGuardarCambiosTipoPrioridadEmpresaProdu) {
		this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu = isPermisoGuardarCambiosTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsPermisoConsultaTipoPrioridadEmpresaProdu() {
		return isPermisoConsultaTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoConsultaTipoPrioridadEmpresaProdu(Boolean isPermisoConsultaTipoPrioridadEmpresaProdu) {
		this.isPermisoConsultaTipoPrioridadEmpresaProdu = isPermisoConsultaTipoPrioridadEmpresaProdu;
	}

	public Boolean getIsPermisoBusquedaTipoPrioridadEmpresaProdu() {
		return isPermisoBusquedaTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoBusquedaTipoPrioridadEmpresaProdu(Boolean isPermisoBusquedaTipoPrioridadEmpresaProdu) {
		this.isPermisoBusquedaTipoPrioridadEmpresaProdu = isPermisoBusquedaTipoPrioridadEmpresaProdu;
	}

	public Boolean getIsPermisoReporteTipoPrioridadEmpresaProdu() {
		return isPermisoReporteTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoReporteTipoPrioridadEmpresaProdu(Boolean isPermisoReporteTipoPrioridadEmpresaProdu) {
		this.isPermisoReporteTipoPrioridadEmpresaProdu = isPermisoReporteTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoPrioridadEmpresaProdu() {
		return isPermisoPaginacionMedioTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoPaginacionMedioTipoPrioridadEmpresaProdu(Boolean isPermisoPaginacionMedioTipoPrioridadEmpresaProdu) {
		this.isPermisoPaginacionMedioTipoPrioridadEmpresaProdu = isPermisoPaginacionMedioTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoPrioridadEmpresaProdu() {
		return isPermisoPaginacionTodoTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoPaginacionTodoTipoPrioridadEmpresaProdu(Boolean isPermisoPaginacionTodoTipoPrioridadEmpresaProdu) {
		this.isPermisoPaginacionTodoTipoPrioridadEmpresaProdu = isPermisoPaginacionTodoTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoPrioridadEmpresaProdu() {
		return isPermisoPaginacionAltoTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoPaginacionAltoTipoPrioridadEmpresaProdu(Boolean isPermisoPaginacionAltoTipoPrioridadEmpresaProdu) {
		this.isPermisoPaginacionAltoTipoPrioridadEmpresaProdu = isPermisoPaginacionAltoTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsPermisoCopiarTipoPrioridadEmpresaProdu() {
		return isPermisoCopiarTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoCopiarTipoPrioridadEmpresaProdu(Boolean isPermisoCopiarTipoPrioridadEmpresaProdu) {
		this.isPermisoCopiarTipoPrioridadEmpresaProdu = isPermisoCopiarTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsPermisoVerFormTipoPrioridadEmpresaProdu() {
		return isPermisoVerFormTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoVerFormTipoPrioridadEmpresaProdu(Boolean isPermisoVerFormTipoPrioridadEmpresaProdu) {
		this.isPermisoVerFormTipoPrioridadEmpresaProdu = isPermisoVerFormTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsPermisoDuplicarTipoPrioridadEmpresaProdu() {
		return isPermisoDuplicarTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoDuplicarTipoPrioridadEmpresaProdu(Boolean isPermisoDuplicarTipoPrioridadEmpresaProdu) {
		this.isPermisoDuplicarTipoPrioridadEmpresaProdu = isPermisoDuplicarTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsPermisoOrdenTipoPrioridadEmpresaProdu() {
		return isPermisoOrdenTipoPrioridadEmpresaProdu;
	}

	public void setIsPermisoOrdenTipoPrioridadEmpresaProdu(Boolean isPermisoOrdenTipoPrioridadEmpresaProdu) {
		this.isPermisoOrdenTipoPrioridadEmpresaProdu = isPermisoOrdenTipoPrioridadEmpresaProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu = isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu = isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu = isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu = isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu = isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu = isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaModificarTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu = isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu = isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu = isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu = isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu = isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu() {
		return isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu(Boolean isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu) {
		this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu = isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu;
	}
		
	public TipoPrioridadEmpresaProduSessionBean gettipoprioridadempresaproduSessionBean() {
		return this.tipoprioridadempresaproduSessionBean;
	}
	
	public void settipoprioridadempresaproduSessionBean(TipoPrioridadEmpresaProduSessionBean tipoprioridadempresaproduSessionBean) {
		this.tipoprioridadempresaproduSessionBean=tipoprioridadempresaproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoprioridadempresaprodu,null);
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
	
	public void bugActualizarReferenciaActual(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoPrioridadEmpresaProdu(tipoprioridadempresaprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoprioridadempresaproduAux.setId(tipoprioridadempresaprodu.getId());
		tipoprioridadempresaproduAux.setVersionRow(tipoprioridadempresaprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoPrioridadEmpresaProdu();
		
			int intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoprioridadempresaproduValidator.getInvalidValues(this.tipoprioridadempresaprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoprioridadempresaproduLogic.setDatosCliente(datosCliente);
			tipoprioridadempresaproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoprioridadempresaproduAux=new  TipoPrioridadEmpresaProdu();
				
				tipoprioridadempresaproduAux.setIsNew(true);
				tipoprioridadempresaproduAux.setIsChanged(true);
				
				tipoprioridadempresaproduAux.setTipoPrioridadEmpresaProduOriginal(this.tipoprioridadempresaprodu);
				
				tipoprioridadempresaproduAux.setId(this.tipoprioridadempresaprodu.getId());	
				tipoprioridadempresaproduAux.setVersionRow(this.tipoprioridadempresaprodu.getVersionRow());	
				tipoprioridadempresaproduAux.setid_empresa(this.tipoprioridadempresaprodu.getid_empresa());	
				tipoprioridadempresaproduAux.setnombre(this.tipoprioridadempresaprodu.getnombre());	
				tipoprioridadempresaproduAux.setdescripcion(this.tipoprioridadempresaprodu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadempresaproduLogic.saveTipoPrioridadEmpresaProdus();//WithConnection
						//tipoprioridadempresaproduLogic.getSetVersionRowTipoPrioridadEmpresaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprioridadempresaprodu,tipoprioridadempresaproduAux);
					
					this.refrescarForeignKeysDescripcionesTipoPrioridadEmpresaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus().addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodusEliminados);
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus().addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodus.addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodusEliminados);
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodus.addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodusEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprioridadempresaproduLogic.saveTipoPrioridadEmpresaProduRelaciones(tipoprioridadempresaproduAux,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus(),this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());//WithConnection
								//tipoprioridadempresaproduLogic.getSetVersionRowTipoPrioridadEmpresaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprioridadempresaprodu,tipoprioridadempresaproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodus= new ArrayList<OrdenProdu>();
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodus= new ArrayList<PedidoProdu>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprioridadempresaproduAux.setOrdenProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus());

							if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprioridadempresaproduAux.setPedidoProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprioridadempresaprodu,tipoprioridadempresaproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoprioridadempresaproduAux=new  TipoPrioridadEmpresaProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado() && this.tipoprioridadempresaprodu.getId()>=0)) {
						
					tipoprioridadempresaproduAux.setIsNew(false);
				}
				
				tipoprioridadempresaproduAux.setIsDeleted(false);
			
				tipoprioridadempresaproduAux.setId(this.tipoprioridadempresaprodu.getId());	
				tipoprioridadempresaproduAux.setVersionRow(this.tipoprioridadempresaprodu.getVersionRow());	
				tipoprioridadempresaproduAux.setid_empresa(this.tipoprioridadempresaprodu.getid_empresa());	
				tipoprioridadempresaproduAux.setnombre(this.tipoprioridadempresaprodu.getnombre());	
				tipoprioridadempresaproduAux.setdescripcion(this.tipoprioridadempresaprodu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadempresaproduLogic.saveTipoPrioridadEmpresaProdus();//WithConnection
						//tipoprioridadempresaproduLogic.getSetVersionRowTipoPrioridadEmpresaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprioridadempresaprodu,tipoprioridadempresaproduAux);
					
					this.refrescarForeignKeysDescripcionesTipoPrioridadEmpresaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus().addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodusEliminados);
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus().addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodus.addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodusEliminados);
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodus.addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodusEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprioridadempresaproduLogic.saveTipoPrioridadEmpresaProduRelaciones(tipoprioridadempresaproduAux,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus(),this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());//WithConnection
								//tipoprioridadempresaproduLogic.getSetVersionRowTipoPrioridadEmpresaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprioridadempresaprodu,tipoprioridadempresaproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodus= new ArrayList<OrdenProdu>();
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodus= new ArrayList<PedidoProdu>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprioridadempresaproduAux.setOrdenProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus());

							if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprioridadempresaproduAux.setPedidoProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprioridadempresaprodu,tipoprioridadempresaproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoprioridadempresaproduAux=new  TipoPrioridadEmpresaProdu();
				
				tipoprioridadempresaproduAux.setIsNew(false);
				tipoprioridadempresaproduAux.setIsChanged(false);
				
				tipoprioridadempresaproduAux.setIsDeleted(true);
				
				tipoprioridadempresaproduAux.setId(this.tipoprioridadempresaprodu.getId());	
				tipoprioridadempresaproduAux.setVersionRow(this.tipoprioridadempresaprodu.getVersionRow());	
				tipoprioridadempresaproduAux.setid_empresa(this.tipoprioridadempresaprodu.getid_empresa());	
				tipoprioridadempresaproduAux.setnombre(this.tipoprioridadempresaprodu.getnombre());	
				tipoprioridadempresaproduAux.setdescripcion(this.tipoprioridadempresaprodu.getdescripcion());	
				
				if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoprioridadempresaproduAux.getId()>=0) {	
						this.tipoprioridadempresaprodusEliminados.add(tipoprioridadempresaproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadempresaproduLogic.saveTipoPrioridadEmpresaProdus();//WithConnection
						//tipoprioridadempresaproduLogic.getSetVersionRowTipoPrioridadEmpresaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus().addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodusEliminados);
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus().addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodus.addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodusEliminados);
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodus.addAll(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodusEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprioridadempresaproduLogic.saveTipoPrioridadEmpresaProduRelaciones(tipoprioridadempresaproduAux,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus(),this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());//WithConnection
								//tipoprioridadempresaproduLogic.getSetVersionRowTipoPrioridadEmpresaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodus= new ArrayList<OrdenProdu>();
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodus= new ArrayList<PedidoProdu>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprioridadempresaproduAux.setOrdenProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus());

							if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprioridadempresaproduAux.setPedidoProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoprioridadempresaproduAux,tipoprioridadempresaprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().addAll(this.tipoprioridadempresaprodusEliminados);
					
					tipoprioridadempresaproduLogic.saveTipoPrioridadEmpresaProdus();//WithConnection
					//tipoprioridadempresaproduLogic.getSetVersionRowTipoPrioridadEmpresaProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoPrioridadEmpresaProdu();
				
				this.tipoprioridadempresaprodusEliminados= new ArrayList<TipoPrioridadEmpresaProdu>();		
			}
			
			if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Prioridad Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Prioridad Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoprioridadempresaprodu=tipoprioridadempresaproduAux;
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
      		//this.finishProcessTipoPrioridadEmpresaProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoPrioridadEmpresaProdu tipoprioridadempresaproduLocal) throws Exception {
		
		if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoprioridadempresaproduLocal.setOrdenProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus());
				tipoprioridadempresaproduLocal.setPedidoProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());
			
			} else {
			
				tipoprioridadempresaproduLocal.setOrdenProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenprodus);
				tipoprioridadempresaproduLocal.setPedidoProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodus);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoPrioridadEmpresaProdu tipoprioridadempresaproduLocal) throws Exception {	
		if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoprioridadempresaproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoPrioridadEmpresaProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoprioridadempresaproduValidator.getInvalidValues(this.tipoprioridadempresaprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodus) throws Exception {
		try	{		
			TipoPrioridadEmpresaProduConstantesFunciones.actualizarLista(tipoprioridadempresaprodu,tipoprioridadempresaprodus,this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodus) throws Exception {
		try	{			
			TipoPrioridadEmpresaProduConstantesFunciones.actualizarSelectedLista(tipoprioridadempresaprodu,tipoprioridadempresaprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoprioridadempresaprodusLocal=this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoprioridadempresaprodusLocal=this.tipoprioridadempresaprodus;
			}
			//ARCHITECTURE
		
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduLocal:tipoprioridadempresaprodusLocal) {
				if(this.permiteMantenimiento(tipoprioridadempresaproduLocal) && tipoprioridadempresaproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoPrioridadEmpresaProduConstantesFunciones.getTipoPrioridadEmpresaProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoPrioridadEmpresaProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelid_empresaTipoPrioridadEmpresaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPrioridadEmpresaProduConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelnombreTipoPrioridadEmpresaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPrioridadEmpresaProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabeldescripcionTipoPrioridadEmpresaProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelid_empresaTipoPrioridadEmpresaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelnombreTipoPrioridadEmpresaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabeldescripcionTipoPrioridadEmpresaProdu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("OrdenProdu")) {
			if(this.tipoprioridadempresaprodu==null) {
				this.tipoprioridadempresaprodu= new TipoPrioridadEmpresaProdu();
			}

			if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoPrioridadEmpresaProdu
				this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);

				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.getordenprodu().setTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
			}

			return;
		}
		 else  if(sTipo.equals("PedidoProdu")) {
			if(this.tipoprioridadempresaprodu==null) {
				this.tipoprioridadempresaprodu= new TipoPrioridadEmpresaProdu();
			}

			if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoPrioridadEmpresaProdu
				this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);

				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.getpedidoprodu().setTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoPrioridadEmpresaProdu--;	
		
		
		this.tipoprioridadempresaproduAux=new TipoPrioridadEmpresaProdu();
		
		this.tipoprioridadempresaproduAux.setId(this.iIdNuevoTipoPrioridadEmpresaProdu);
		this.tipoprioridadempresaproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().add(this.tipoprioridadempresaproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoprioridadempresaprodus.add(this.tipoprioridadempresaproduAux);
		}
		//ARCHITECTURE
		
		this.tipoprioridadempresaprodu=this.tipoprioridadempresaproduAux;
		
		if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
		}
				
		//this.setDefaultControlesTipoPrioridadEmpresaProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoPrioridadEmpresaProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrioridadEmpresaProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduBean,this.tipoprioridadempresaprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
			classes=TipoPrioridadEmpresaProduConstantesFunciones.getClassesRelationshipsOfTipoPrioridadEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoprioridadempresaproduReturnGeneral=tipoprioridadempresaproduLogic.procesarEventosTipoPrioridadEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus(),this.tipoprioridadempresaprodu,this.tipoprioridadempresaproduParameterGeneral,this.isEsNuevoTipoPrioridadEmpresaProdu,classes);//this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduReturnGeneral,this.tipoprioridadempresaproduBean,false);
		
		if(this.tipoprioridadempresaproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu());
		}
		
		if(this.tipoprioridadempresaproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu(),classes);//this.tipoprioridadempresaproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoPrioridadEmpresaProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoPrioridadEmpresaProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.RecargarFormTipoPrioridadEmpresaProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
						
			if(tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduSessionBean.getEsGuardarRelacionado() && OrdenProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOrdenProduActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.getEsGuardarRelacionado() && PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoProduActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrioridadEmpresaProdu();
			}
			
			this.actualizarVisualTableDatosTipoPrioridadEmpresaProdu();
			
			this.jTableDatosTipoPrioridadEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoPrioridadEmpresaProdu(), this.getIndiceNuevoTipoPrioridadEmpresaProdu());
			
			this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
						
			this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoPrioridadEmpresaProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreanombreTipoPrioridadEmpresaProdu.setEnabled(isHabilitar && this.tipoprioridadempresaproduConstantesFunciones.activarnombreTipoPrioridadEmpresaProdu);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreadescripcionTipoPrioridadEmpresaProdu.setEnabled(isHabilitar && this.tipoprioridadempresaproduConstantesFunciones.activardescripcionTipoPrioridadEmpresaProdu);	
		//
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.setEnabled(isHabilitar && this.tipoprioridadempresaproduConstantesFunciones.activarid_empresaTipoPrioridadEmpresaProdu);
	};
	
	public void setDefaultControlesTipoPrioridadEmpresaProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoPrioridadEmpresaProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoprioridadempresaproduSessionBean.setConGuardarRelaciones(true);			
			this.tipoprioridadempresaproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoprioridadempresaproduSessionBean.setConGuardarRelaciones(false);			
			this.tipoprioridadempresaproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoPrioridadEmpresaProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
				if(tipoprioridadempresaproduAux.getId().equals(this.iIdNuevoTipoPrioridadEmpresaProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaprodus) {
				if(tipoprioridadempresaproduAux.getId().equals(this.iIdNuevoTipoPrioridadEmpresaProdu)) {
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
	
	public int getIndiceActualTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
				if(tipoprioridadempresaproduAux.getId().equals(tipoprioridadempresaprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaprodus) {
				if(tipoprioridadempresaproduAux.getId().equals(tipoprioridadempresaprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
				if(tipoprioridadempresaproduAux.getTipoPrioridadEmpresaProduOriginal().getId().equals(tipoprioridadempresaproduOriginal.getId())) {
					existe=true;
					tipoprioridadempresaproduOriginal.setId(tipoprioridadempresaproduAux.getId());
					tipoprioridadempresaproduOriginal.setVersionRow(tipoprioridadempresaproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaprodus) {
				if(tipoprioridadempresaproduAux.getTipoPrioridadEmpresaProduOriginal().getId().equals(tipoprioridadempresaproduOriginal.getId())) {
					existe=true;
					tipoprioridadempresaproduOriginal.setId(tipoprioridadempresaproduAux.getId());
					tipoprioridadempresaproduOriginal.setVersionRow(tipoprioridadempresaproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoPrioridadEmpresaProdu(Boolean esParaCancelar) throws Exception {
		tipoprioridadempresaprodusAux=new ArrayList<TipoPrioridadEmpresaProdu>();
		tipoprioridadempresaproduAux=new TipoPrioridadEmpresaProdu();
		
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
					if(tipoprioridadempresaproduAux.getId()<0) {
						tipoprioridadempresaprodusAux.add(tipoprioridadempresaproduAux);
					}		
				}
				this.iIdNuevoTipoPrioridadEmpresaProdu=0L;
				this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().removeAll(tipoprioridadempresaprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaprodus) {
					if(tipoprioridadempresaproduAux.getId()<0) {
						tipoprioridadempresaprodusAux.add(tipoprioridadempresaproduAux);
					}		
				}
				this.iIdNuevoTipoPrioridadEmpresaProdu=0L;
				this.tipoprioridadempresaprodus.removeAll(tipoprioridadempresaprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoPrioridadEmpresaProdu 
					&& this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().size()>0
					) {
					tipoprioridadempresaproduAux=this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().get(this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().size() - 1);
				
					if(tipoprioridadempresaproduAux.getId()<0) {
						this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().remove(tipoprioridadempresaproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoPrioridadEmpresaProdu && this.tipoprioridadempresaprodus.size()>0) {
					tipoprioridadempresaproduAux=this.tipoprioridadempresaprodus.get(this.tipoprioridadempresaprodus.size() - 1);
				
					if(tipoprioridadempresaproduAux.getId()<0) {
						this.tipoprioridadempresaprodus.remove(tipoprioridadempresaproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoPrioridadEmpresaProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoprioridadempresaprodu.getId()<0) {
				this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().remove(this.tipoprioridadempresaprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoprioridadempresaprodu.getId()<0) {
				this.tipoprioridadempresaprodus.remove(this.tipoprioridadempresaprodu);
			}
		}			
	}
	
	public void setEstadosInicialesTipoPrioridadEmpresaProdu(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusAux) throws Exception {
		TipoPrioridadEmpresaProduConstantesFunciones.setEstadosInicialesTipoPrioridadEmpresaProdu(tipoprioridadempresaprodusAux);
	}
	
	public void setEstadosInicialesTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux) throws Exception {
		TipoPrioridadEmpresaProduConstantesFunciones.setEstadosInicialesTipoPrioridadEmpresaProdu(tipoprioridadempresaproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoPrioridadEmpresaProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoPrioridadEmpresaProduActual()) {
				if(!this.isEsNuevoTipoPrioridadEmpresaProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoPrioridadEmpresaProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoPrioridadEmpresaProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Prioridad Empresa ?", "MANTENIMIENTO DE Tipo Prioridad Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu) throws Exception {
		TipoPrioridadEmpresaProduConstantesFunciones.seleccionarAsignar(this.tipoprioridadempresaprodu,tipoprioridadempresaprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoPrioridadEmpresaProdu=this.isPermisoActualizarOriginalTipoPrioridadEmpresaProdu;
			
			
			this.seleccionarAsignar(tipoprioridadempresaprodu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPrioridadEmpresaProduConstantesFunciones.quitarEspaciosTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoprioridadempresaproduSessionBean.setsFuncionBusquedaRapida(this.tipoprioridadempresaproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoPrioridadEmpresaProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoPrioridadEmpresaProdu(esParaCancelar);				
				this.cancelarNuevoTipoPrioridadEmpresaProdu(esParaCancelar);								
			}
			
			this.tipoprioridadempresaprodu=new TipoPrioridadEmpresaProdu();
			
			this.inicializarTipoPrioridadEmpresaProdu();
			
			this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoPrioridadEmpresaProdu() throws Exception {
		try {
			TipoPrioridadEmpresaProduConstantesFunciones.inicializarTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoPrioridadEmpresaProdus(String sAccionBusqueda,List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusParaReportes) throws Exception {
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
					sPathReporteFinal="TipoPrioridadEmpresaProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoPrioridadEmpresaProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoPrioridadEmpresaProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoPrioridadEmpresaProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Prioridad Empresas");		
		parameters.put("busquedapor", TipoPrioridadEmpresaProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(OrdenProdu.class));
			classes.add(new Classe(PedidoProdu.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoPrioridadEmpresaProduLogic tipoprioridadempresaproduLogicAuxiliar=new TipoPrioridadEmpresaProduLogic();
					tipoprioridadempresaproduLogicAuxiliar.setDatosCliente(tipoprioridadempresaproduLogic.getDatosCliente());				
					tipoprioridadempresaproduLogicAuxiliar.setTipoPrioridadEmpresaProdus(tipoprioridadempresaprodusParaReportes);
					
					tipoprioridadempresaproduLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoPrioridadEmpresaProduWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoprioridadempresaprodusParaReportes=tipoprioridadempresaproduLogicAuxiliar.getTipoPrioridadEmpresaProdus();
					
					//tipoprioridadempresaproduLogic.getNewConnexionToDeep();
					
					//for (TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:tipoprioridadempresaprodusParaReportes) {
					//	tipoprioridadempresaproduLogic.deepLoad(tipoprioridadempresaprodu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileOrdenProdu = AuxiliarReportes.class.getResourceAsStream("OrdenProduDetalleRelacionesDesign.jasper");
			parameters.put("subreport_ordenprodu", reportFileOrdenProdu);

			InputStream reportFilePedidoProdu = AuxiliarReportes.class.getResourceAsStream("PedidoProduDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidoprodu", reportFilePedidoProdu);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoPrioridadEmpresaProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoPrioridadEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoPrioridadEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoPrioridadEmpresaProdu=new JRBeanArrayDataSource(TipoPrioridadEmpresaProduJInternalFrame.TraerTipoPrioridadEmpresaProduBeans(tipoprioridadempresaprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoPrioridadEmpresaProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoPrioridadEmpresaProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoPrioridadEmpresaProduBean.TraerTipoPrioridadEmpresaProduBeans(tipoprioridadempresaprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoPrioridadEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadempresaprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoPrioridadEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadempresaprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProduActionPerformed(null);
					//this.generarExcelReporteTipoPrioridadEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadempresaprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoPrioridadEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadempresaprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoPrioridadEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadempresaprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoPrioridadEmpresaProdus(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadempresaprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoPrioridadEmpresaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadempresaprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPrioridadEmpresaProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPrioridadEmpresaProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu : tipoprioridadempresaprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoPrioridadEmpresaProduConstantesFunciones.generarExcelReporteDataTipoPrioridadEmpresaProdu("NORMAL",row,workbook,tipoprioridadempresaprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoPrioridadEmpresaProdu(String sTipo,Row row,Workbook workbook) {
		
		TipoPrioridadEmpresaProduConstantesFunciones.generarExcelReporteHeaderTipoPrioridadEmpresaProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoPrioridadEmpresaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadempresaprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPrioridadEmpresaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu : tipoprioridadempresaprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.getTipoPrioridadEmpresaProduDescripcion(tipoprioridadempresaprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprioridadempresaprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprioridadempresaprodu.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprioridadempresaprodu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoPrioridadEmpresaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusRespaldo=null;
		
		classes=TipoPrioridadEmpresaProduConstantesFunciones.getClassesRelationshipsOfTipoPrioridadEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoprioridadempresaproduLogic.setDatosCliente(this.datosCliente);
		this.tipoprioridadempresaproduLogic.setDatosDeep(this.datosDeep);
		this.tipoprioridadempresaproduLogic.setIsConDeep(true);
		
		tipoprioridadempresaprodusRespaldo=this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus();
		
		this.tipoprioridadempresaproduLogic.setTipoPrioridadEmpresaProdus(tipoprioridadempresaprodusParaReportes);	
		this.tipoprioridadempresaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoprioridadempresaprodusParaReportes=this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus();
		this.tipoprioridadempresaproduLogic.setTipoPrioridadEmpresaProdus(tipoprioridadempresaprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadempresaprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPrioridadEmpresaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPrioridadEmpresaProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu : tipoprioridadempresaprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoPrioridadEmpresaProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoPrioridadEmpresaProduConstantesFunciones.generarExcelReporteDataTipoPrioridadEmpresaProdu("NORMAL",row,workbook,tipoprioridadempresaprodu,cellStyleDataAux);
		
			
			


				//OrdenProdu
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(OrdenProduConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoprioridadempresaprodu.getOrdenProdus()!=null && tipoprioridadempresaprodu.getOrdenProdus().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(OrdenProduConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					OrdenProduConstantesFunciones.generarExcelReporteHeaderOrdenProdu("RELACIONADO",row,workbook);
				}

				if(tipoprioridadempresaprodu.getOrdenProdus()!=null) {
					i2=0;
					for(OrdenProdu ordenprodu : tipoprioridadempresaprodu.getOrdenProdus()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						OrdenProduConstantesFunciones.generarExcelReporteDataOrdenProdu("RELACIONADO",row,workbook,ordenprodu,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PedidoProdu
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoProduConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoprioridadempresaprodu.getPedidoProdus()!=null && tipoprioridadempresaprodu.getPedidoProdus().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoProduConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoProduConstantesFunciones.generarExcelReporteHeaderPedidoProdu("RELACIONADO",row,workbook);
				}

				if(tipoprioridadempresaprodu.getPedidoProdus()!=null) {
					i2=0;
					for(PedidoProdu pedidoprodu : tipoprioridadempresaprodu.getPedidoProdus()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoProduConstantesFunciones.generarExcelReporteDataPedidoProdu("RELACIONADO",row,workbook,pedidoprodu,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.getTipoPrioridadEmpresaProduDescripcion(tipoprioridadempresaprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoPrioridadEmpresaProdu() throws Exception {		
		this.startProcessTipoPrioridadEmpresaProdu(true);
	}
	
	public void startProcessTipoPrioridadEmpresaProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu ,this.jPanelParametrosReportesTipoPrioridadEmpresaProdu, this.jScrollPanelDatosTipoPrioridadEmpresaProdu,this.jPanelPaginacionTipoPrioridadEmpresaProdu, this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu, this.jPanelAccionesTipoPrioridadEmpresaProdu,this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu,this.jmenuBarTipoPrioridadEmpresaProdu,this.jmenuBarDetalleTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,this.jTtoolBarDetalleTipoPrioridadEmpresaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPrioridadEmpresaProdu=this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu; 
		
		final JPanel jPanelParametrosReportesTipoPrioridadEmpresaProdu=this.jPanelParametrosReportesTipoPrioridadEmpresaProdu;
		//final JScrollPane jScrollPanelDatosTipoPrioridadEmpresaProdu=this.jScrollPanelDatosTipoPrioridadEmpresaProdu;
		final JTable jTableDatosTipoPrioridadEmpresaProdu=this.jTableDatosTipoPrioridadEmpresaProdu;		
		final JPanel jPanelPaginacionTipoPrioridadEmpresaProdu=this.jPanelPaginacionTipoPrioridadEmpresaProdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu=this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu;
		final JPanel jPanelAccionesTipoPrioridadEmpresaProdu=this.jPanelAccionesTipoPrioridadEmpresaProdu;
		
		JPanel jPanelCamposAuxiliarTipoPrioridadEmpresaProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoPrioridadEmpresaProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			jPanelCamposAuxiliarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jPanelCamposTipoPrioridadEmpresaProdu;
			jPanelAccionesFormularioAuxiliarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jPanelAccionesFormularioTipoPrioridadEmpresaProdu;
		}
		
		final JPanel jPanelCamposTipoPrioridadEmpresaProdu=jPanelCamposAuxiliarTipoPrioridadEmpresaProdu;
		final JPanel jPanelAccionesFormularioTipoPrioridadEmpresaProdu=jPanelAccionesFormularioAuxiliarTipoPrioridadEmpresaProdu;
		
		
		final JMenuBar jmenuBarTipoPrioridadEmpresaProdu=this.jmenuBarTipoPrioridadEmpresaProdu;
		final JToolBar jTtoolBarTipoPrioridadEmpresaProdu=this.jTtoolBarTipoPrioridadEmpresaProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoPrioridadEmpresaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPrioridadEmpresaProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			jmenuBarDetalleAuxiliarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jmenuBarDetalleTipoPrioridadEmpresaProdu;
			jTtoolBarDetalleAuxiliarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTtoolBarDetalleTipoPrioridadEmpresaProdu;
		}
		
		final JMenuBar jmenuBarDetalleTipoPrioridadEmpresaProdu=jmenuBarDetalleAuxiliarTipoPrioridadEmpresaProdu;
		final JToolBar jTtoolBarDetalleTipoPrioridadEmpresaProdu=jTtoolBarDetalleAuxiliarTipoPrioridadEmpresaProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPrioridadEmpresaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPrioridadEmpresaProdu;
			processRunnable.jTableDatos=jTableDatosTipoPrioridadEmpresaProdu;
			processRunnable.jPanelCampos=jPanelCamposTipoPrioridadEmpresaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPrioridadEmpresaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPrioridadEmpresaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPrioridadEmpresaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPrioridadEmpresaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPrioridadEmpresaProdu;
			processRunnable.jTtoolBar=jTtoolBarTipoPrioridadEmpresaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPrioridadEmpresaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPrioridadEmpresaProdu ,jPanelParametrosReportesTipoPrioridadEmpresaProdu,jTableDatosTipoPrioridadEmpresaProdu, /*jScrollPanelDatosTipoPrioridadEmpresaProdu,*/jPanelCamposTipoPrioridadEmpresaProdu,jPanelPaginacionTipoPrioridadEmpresaProdu, /*jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu,*/ jPanelAccionesTipoPrioridadEmpresaProdu,jPanelAccionesFormularioTipoPrioridadEmpresaProdu,jmenuBarTipoPrioridadEmpresaProdu,jmenuBarDetalleTipoPrioridadEmpresaProdu,jTtoolBarTipoPrioridadEmpresaProdu,jTtoolBarDetalleTipoPrioridadEmpresaProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPrioridadEmpresaProdu ,jPanelParametrosReportesTipoPrioridadEmpresaProdu, jScrollPanelDatosTipoPrioridadEmpresaProdu,jPanelPaginacionTipoPrioridadEmpresaProdu, jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu, jPanelAccionesTipoPrioridadEmpresaProdu,jPanelAccionesFormularioTipoPrioridadEmpresaProdu,jmenuBarTipoPrioridadEmpresaProdu,jmenuBarDetalleTipoPrioridadEmpresaProdu,jTtoolBarTipoPrioridadEmpresaProdu,jTtoolBarDetalleTipoPrioridadEmpresaProdu);
						
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
	
	public void finishProcessTipoPrioridadEmpresaProdu() {// throws Exception 
		this.finishProcessTipoPrioridadEmpresaProdu(true);
	}
	
	public void finishProcessTipoPrioridadEmpresaProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu ,this.jPanelParametrosReportesTipoPrioridadEmpresaProdu, this.jScrollPanelDatosTipoPrioridadEmpresaProdu,this.jPanelPaginacionTipoPrioridadEmpresaProdu, this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu, this.jPanelAccionesTipoPrioridadEmpresaProdu,this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu,this.jmenuBarTipoPrioridadEmpresaProdu,this.jmenuBarDetalleTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,this.jTtoolBarDetalleTipoPrioridadEmpresaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPrioridadEmpresaProdu=this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu; 
		
		final JPanel jPanelParametrosReportesTipoPrioridadEmpresaProdu=this.jPanelParametrosReportesTipoPrioridadEmpresaProdu;
		//final JScrollPane jScrollPanelDatosTipoPrioridadEmpresaProdu=this.jScrollPanelDatosTipoPrioridadEmpresaProdu;
		final JTable jTableDatosTipoPrioridadEmpresaProdu=this.jTableDatosTipoPrioridadEmpresaProdu;		
		final JPanel jPanelPaginacionTipoPrioridadEmpresaProdu=this.jPanelPaginacionTipoPrioridadEmpresaProdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu=this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu;
		final JPanel jPanelAccionesTipoPrioridadEmpresaProdu=this.jPanelAccionesTipoPrioridadEmpresaProdu;
		
		JPanel jPanelCamposAuxiliarTipoPrioridadEmpresaProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoPrioridadEmpresaProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			jPanelCamposAuxiliarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jPanelCamposTipoPrioridadEmpresaProdu;
			jPanelAccionesFormularioAuxiliarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jPanelAccionesFormularioTipoPrioridadEmpresaProdu;
		}
		
		final JPanel jPanelCamposTipoPrioridadEmpresaProdu=jPanelCamposAuxiliarTipoPrioridadEmpresaProdu;
		final JPanel jPanelAccionesFormularioTipoPrioridadEmpresaProdu=jPanelAccionesFormularioAuxiliarTipoPrioridadEmpresaProdu;
		
		
		final JMenuBar jmenuBarTipoPrioridadEmpresaProdu=this.jmenuBarTipoPrioridadEmpresaProdu;		
		final JToolBar jTtoolBarTipoPrioridadEmpresaProdu=this.jTtoolBarTipoPrioridadEmpresaProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoPrioridadEmpresaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPrioridadEmpresaProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			jmenuBarDetalleAuxiliarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jmenuBarDetalleTipoPrioridadEmpresaProdu;
			jTtoolBarDetalleAuxiliarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTtoolBarDetalleTipoPrioridadEmpresaProdu;		
		}
		
		final JMenuBar jmenuBarDetalleTipoPrioridadEmpresaProdu=jmenuBarDetalleAuxiliarTipoPrioridadEmpresaProdu;
		final JToolBar jTtoolBarDetalleTipoPrioridadEmpresaProdu=jTtoolBarDetalleAuxiliarTipoPrioridadEmpresaProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPrioridadEmpresaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPrioridadEmpresaProdu;
			processRunnable.jTableDatos=jTableDatosTipoPrioridadEmpresaProdu;
			processRunnable.jPanelCampos=jPanelCamposTipoPrioridadEmpresaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPrioridadEmpresaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPrioridadEmpresaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPrioridadEmpresaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPrioridadEmpresaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPrioridadEmpresaProdu;
			processRunnable.jTtoolBar=jTtoolBarTipoPrioridadEmpresaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPrioridadEmpresaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoPrioridadEmpresaProdu ,jPanelParametrosReportesTipoPrioridadEmpresaProdu, jTableDatosTipoPrioridadEmpresaProdu,/*jScrollPanelDatosTipoPrioridadEmpresaProdu,*/jPanelCamposTipoPrioridadEmpresaProdu,jPanelPaginacionTipoPrioridadEmpresaProdu, /*jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu,*/ jPanelAccionesTipoPrioridadEmpresaProdu,jPanelAccionesFormularioTipoPrioridadEmpresaProdu,jmenuBarTipoPrioridadEmpresaProdu,jmenuBarDetalleTipoPrioridadEmpresaProdu,jTtoolBarTipoPrioridadEmpresaProdu,jTtoolBarDetalleTipoPrioridadEmpresaProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoPrioridadEmpresaProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoPrioridadEmpresaProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoPrioridadEmpresaProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoPrioridadEmpresaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoPrioridadEmpresaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoPrioridadEmpresaProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoPrioridadEmpresaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoPrioridadEmpresaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoPrioridadEmpresaProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoprioridadempresaproduConstantesFunciones.getsFinalQueryTipoPrioridadEmpresaProdu();
		String  finalQueryPaginacionTodos=this.tipoprioridadempresaproduConstantesFunciones.getsFinalQueryTipoPrioridadEmpresaProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoPrioridadEmpresaProduConstantesFunciones.getArrayColumnasGlobalesNoTipoPrioridadEmpresaProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoPrioridadEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoPrioridadEmpresaProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoPrioridadEmpresaProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoprioridadempresaprodusEliminados= new ArrayList<TipoPrioridadEmpresaProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoPrioridadEmpresaProdu();
		
				///*TipoPrioridadEmpresaProduSessionBean*/this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
			
			if(this.tipoprioridadempresaproduSessionBean==null) {
				this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
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
					this.iNumeroPaginacion=TipoPrioridadEmpresaProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoPrioridadEmpresaProduConstantesFunciones.getClassesForeignKeysOfTipoPrioridadEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoprioridadempresaprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoprioridadempresaprodusAux= new ArrayList<TipoPrioridadEmpresaProdu>();
			
				
			tipoprioridadempresaproduLogic.setDatosCliente(this.datosCliente);
			tipoprioridadempresaproduLogic.setDatosDeep(this.datosDeep);
			tipoprioridadempresaproduLogic.setIsConDeep(true);
			
			
			tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoprioridadempresaproduLogic.getTodosTipoPrioridadEmpresaProdus(finalQueryGlobal,pagination);
					
					//tipoprioridadempresaproduLogic.getTodosTipoPrioridadEmpresaProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()==null|| tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprioridadempresaprodusAux= new ArrayList<TipoPrioridadEmpresaProdu>();
							tipoprioridadempresaprodusAux.addAll(tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadempresaprodusAux= new ArrayList<TipoPrioridadEmpresaProdu>();
							tipoprioridadempresaprodusAux.addAll(tipoprioridadempresaprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprioridadempresaproduLogic.getTodosTipoPrioridadEmpresaProdus(finalQueryGlobal+"",this.pagination);												
							
							//tipoprioridadempresaproduLogic.getTodosTipoPrioridadEmpresaProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoPrioridadEmpresaProdus("Todos",tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprioridadempresaproduLogic.setTipoPrioridadEmpresaProdus(new ArrayList<TipoPrioridadEmpresaProdu>());					
							tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().addAll(tipoprioridadempresaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadempresaprodus=new ArrayList<TipoPrioridadEmpresaProdu>();
							tipoprioridadempresaprodus.addAll(tipoprioridadempresaprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoPrioridadEmpresaProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoPrioridadEmpresaProdu=this.idActual;
				
				} else if(this.idTipoPrioridadEmpresaProduActual!=null && this.idTipoPrioridadEmpresaProduActual!=0L) {
					idTipoPrioridadEmpresaProdu=idTipoPrioridadEmpresaProduActual;
				}
				
					
				this.sDetalleReporte=TipoPrioridadEmpresaProduConstantesFunciones.getDetalleIndicePorId(idTipoPrioridadEmpresaProdu);
				
				this.tipoprioridadempresaprodus=new ArrayList<TipoPrioridadEmpresaProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoprioridadempresaproduLogic.getEntity(idTipoPrioridadEmpresaProdu);
					
					//tipoprioridadempresaproduLogic.getEntityWithConnection(idTipoPrioridadEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprioridadempresaproduLogic.setTipoPrioridadEmpresaProdus(new ArrayList<TipoPrioridadEmpresaProdu>());
					tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().add(tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprioridadempresaprodus=new ArrayList<TipoPrioridadEmpresaProdu>();
					this.tipoprioridadempresaprodus.add(tipoprioridadempresaprodu);
				}
				
				if(tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoPrioridadEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrioridadEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrioridadEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()==null||tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoprioridadempresaprodus==null|| tipoprioridadempresaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadempresaprodusAux=new ArrayList<TipoPrioridadEmpresaProdu>();
						tipoprioridadempresaprodusAux.addAll(tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadempresaprodusAux=new ArrayList<TipoPrioridadEmpresaProdu>();
							tipoprioridadempresaprodusAux.addAll(tipoprioridadempresaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrioridadEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrioridadEmpresaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoPrioridadEmpresaProdus("FK_IdEmpresa",tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoPrioridadEmpresaProdus("FK_IdEmpresa",tipoprioridadempresaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadempresaproduLogic.setTipoPrioridadEmpresaProdus(new ArrayList<TipoPrioridadEmpresaProdu>());
						tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().addAll(tipoprioridadempresaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadempresaprodus=new ArrayList<TipoPrioridadEmpresaProdu>();
							tipoprioridadempresaprodus.addAll(tipoprioridadempresaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoPrioridadEmpresaProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoPrioridadEmpresaProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprioridadempresaprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprioridadempresaprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu) {
		Boolean permite=true;
		
		if(this.tipoprioridadempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoPrioridadEmpresaProduConstantesFunciones.getOrderByListaTipoPrioridadEmpresaProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoPrioridadEmpresaProduConstantesFunciones.getOrderByListaTipoPrioridadEmpresaProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
				if(tipoprioridadempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprioridadempresaproduTotales=tipoprioridadempresaprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:this.tipoprioridadempresaprodus) {
				if(tipoprioridadempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprioridadempresaproduTotales=tipoprioridadempresaprodu;
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
			this.tipoprioridadempresaproduAux=new TipoPrioridadEmpresaProdu();
			this.tipoprioridadempresaproduAux.setsType(Constantes2.S_TOTALES);
			this.tipoprioridadempresaproduAux.setIsNew(false);
			this.tipoprioridadempresaproduAux.setIsChanged(false);
			this.tipoprioridadempresaproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoPrioridadEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus(),this.tipoprioridadempresaproduAux);
				
				this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().add(this.tipoprioridadempresaproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoPrioridadEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodus,this.tipoprioridadempresaproduAux);
				
				this.tipoprioridadempresaprodus.add(this.tipoprioridadempresaproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoprioridadempresaproduTotales=new TipoPrioridadEmpresaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().remove(tipoprioridadempresaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprioridadempresaprodus.remove(tipoprioridadempresaproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoprioridadempresaproduTotales=new TipoPrioridadEmpresaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
				if(tipoprioridadempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprioridadempresaproduTotales=tipoprioridadempresaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPrioridadEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus(),tipoprioridadempresaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:this.tipoprioridadempresaprodus) {
				if(tipoprioridadempresaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprioridadempresaproduTotales=tipoprioridadempresaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPrioridadEmpresaProduConstantesFunciones.TotalizarValoresFilaTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodus,tipoprioridadempresaproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoPrioridadEmpresaProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoPrioridadEmpresaProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoPrioridadEmpresaProdu() {
		this.isPermisoTodoTipoPrioridadEmpresaProdu=false;
		this.isPermisoNuevoTipoPrioridadEmpresaProdu=false;
		this.isPermisoActualizarTipoPrioridadEmpresaProdu=false;
		this.isPermisoActualizarOriginalTipoPrioridadEmpresaProdu=false;
		this.isPermisoEliminarTipoPrioridadEmpresaProdu=false;
		this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu=false;
		this.isPermisoConsultaTipoPrioridadEmpresaProdu=false;
		this.isPermisoBusquedaTipoPrioridadEmpresaProdu=false;
		this.isPermisoReporteTipoPrioridadEmpresaProdu=false;		
		this.isPermisoOrdenTipoPrioridadEmpresaProdu=false;		
		this.isPermisoPaginacionMedioTipoPrioridadEmpresaProdu=false;		
		this.isPermisoPaginacionAltoTipoPrioridadEmpresaProdu=false;
		this.isPermisoPaginacionTodoTipoPrioridadEmpresaProdu=false;
		this.isPermisoCopiarTipoPrioridadEmpresaProdu=false;		
		this.isPermisoVerFormTipoPrioridadEmpresaProdu=false;		
		this.isPermisoDuplicarTipoPrioridadEmpresaProdu=false;		
		this.isPermisoOrdenTipoPrioridadEmpresaProdu=false;		
	}
	
	public void setPermisosUsuarioTipoPrioridadEmpresaProdu(Boolean isPermiso) {
		this.isPermisoTodoTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoNuevoTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoActualizarTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoActualizarOriginalTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoEliminarTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoConsultaTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoBusquedaTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoReporteTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoOrdenTipoPrioridadEmpresaProdu=isPermiso;		
		this.isPermisoPaginacionMedioTipoPrioridadEmpresaProdu=isPermiso;		
		this.isPermisoPaginacionAltoTipoPrioridadEmpresaProdu=isPermiso;		
		this.isPermisoPaginacionTodoTipoPrioridadEmpresaProdu=isPermiso;		
		this.isPermisoCopiarTipoPrioridadEmpresaProdu=isPermiso;		
		this.isPermisoVerFormTipoPrioridadEmpresaProdu=isPermiso;		
		this.isPermisoDuplicarTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoOrdenTipoPrioridadEmpresaProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoPrioridadEmpresaProdu(Boolean isPermiso) {
		//this.isPermisoTodoTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoNuevoTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoActualizarTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoActualizarOriginalTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoEliminarTipoPrioridadEmpresaProdu=isPermiso;
		this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu=isPermiso;
		//this.isPermisoConsultaTipoPrioridadEmpresaProdu=isPermiso;
		//this.isPermisoBusquedaTipoPrioridadEmpresaProdu=isPermiso;
		//this.isPermisoReporteTipoPrioridadEmpresaProdu=isPermiso;
		//this.isPermisoOrdenTipoPrioridadEmpresaProdu=isPermiso;		
		//this.isPermisoPaginacionMedioTipoPrioridadEmpresaProdu=isPermiso;		
		//this.isPermisoPaginacionAltoTipoPrioridadEmpresaProdu=isPermiso;		
		//this.isPermisoPaginacionTodoTipoPrioridadEmpresaProdu=isPermiso;		
		//this.isPermisoCopiarTipoPrioridadEmpresaProdu=isPermiso;		
		//this.isPermisoDuplicarTipoPrioridadEmpresaProdu=isPermiso;
		//this.isPermisoOrdenTipoPrioridadEmpresaProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoPrioridadEmpresaProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(OrdenProduConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PedidoProduConstantesFunciones.SNOMBREOPCION);
		
		if(TipoPrioridadEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosOrdenProdu=false;
		this.isTienePermisosOrdenProdu=this.verificarGetPermisosUsuarioOpcionTipoPrioridadEmpresaProduClaseRelacionada(this.opcionsRelacionadas,OrdenProduConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPedidoProdu=false;
		this.isTienePermisosPedidoProdu=this.verificarGetPermisosUsuarioOpcionTipoPrioridadEmpresaProduClaseRelacionada(this.opcionsRelacionadas,PedidoProduConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoPrioridadEmpresaProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoPrioridadEmpresaProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosOrdenProdu=conPermiso;
		this.isTienePermisosPedidoProdu=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoPrioridadEmpresaProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoPrioridadEmpresaProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoPrioridadEmpresaProduClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosOrdenProdu && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.remove(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPedidoProdu && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.remove(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoPrioridadEmpresaProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoPrioridadEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoPrioridadEmpresaProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoPrioridadEmpresaProdu=this.isPermisoActualizarTipoPrioridadEmpresaProdu;
			this.isPermisoEliminarTipoPrioridadEmpresaProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoPrioridadEmpresaProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoPrioridadEmpresaProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPrioridadEmpresaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoPrioridadEmpresaProdu.setToolTipText(this.jTableDatosTipoPrioridadEmpresaProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoPrioridadEmpresaProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoPrioridadEmpresaProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoPrioridadEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoPrioridadEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoPrioridadEmpresaProdu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosOrdenProdu && this.tipoprioridadempresaproduConstantesFunciones.mostrarOrdenProduTipoPrioridadEmpresaProdu && !TipoPrioridadEmpresaProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Orden Produccion");
			reporte.setsDescripcion("Orden Produccion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPedidoProdu && this.tipoprioridadempresaproduConstantesFunciones.mostrarPedidoProduTipoPrioridadEmpresaProdu && !TipoPrioridadEmpresaProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Produccion");
			reporte.setsDescripcion("Pedido Produccion");
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
	public void inicializarCombosForeignKeyTipoPrioridadEmpresaProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoPrioridadEmpresaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoPrioridadEmpresaProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoPrioridadEmpresaProduListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoPrioridadEmpresaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoPrioridadEmpresaProduParameterReturnGeneral tipoprioridadempresaproduReturnGeneral=new TipoPrioridadEmpresaProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoprioridadempresaproduConstantesFunciones.cargarid_empresaTipoPrioridadEmpresaProdu)
					 || (this.esRecargarFks && this.tipoprioridadempresaproduConstantesFunciones.cargarid_empresaTipoPrioridadEmpresaProdu)) {

					if(!this.tipoprioridadempresaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoprioridadempresaproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoprioridadempresaproduReturnGeneral=tipoprioridadempresaproduLogic.cargarCombosLoteForeignKeyTipoPrioridadEmpresaProdu(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoprioridadempresaproduReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoPrioridadEmpresaProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoprioridadempresaproduSessionBean==null) {
				this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
			}

			if(!this.tipoprioridadempresaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoPrioridadEmpresaProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoPrioridadEmpresaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoPrioridadEmpresaProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrioridadEmpresaProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoPrioridadEmpresaProdu()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrioridadEmpresaProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoPrioridadEmpresaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoPrioridadEmpresaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoPrioridadEmpresaProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoPrioridadEmpresaProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoPrioridadEmpresaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoPrioridadEmpresaProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoPrioridadEmpresaProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoPrioridadEmpresaProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean(); 
		this.tipoprioridadempresaproduConstantesFunciones=new TipoPrioridadEmpresaProduConstantesFunciones(); 
		this.tipoprioridadempresaproduBean=new TipoPrioridadEmpresaProdu();//(this.tipoprioridadempresaproduConstantesFunciones); 		
		this.tipoprioridadempresaproduReturnGeneral=new TipoPrioridadEmpresaProduParameterReturnGeneral(); 
		
		this.tipoprioridadempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprioridadempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoPrioridadEmpresaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoPrioridadEmpresaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoPrioridadEmpresaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoPrioridadEmpresaProdu(true);
			
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
			
			this.tipoprioridadempresaproduConstantesFunciones=new TipoPrioridadEmpresaProduConstantesFunciones(); 
			this.tipoprioridadempresaproduBean=new TipoPrioridadEmpresaProdu();//this.tipoprioridadempresaproduConstantesFunciones); 			
			this.tipoprioridadempresaproduReturnGeneral=new TipoPrioridadEmpresaProduParameterReturnGeneral(); 
		
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Prioridad Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoprioridadempresaprodu=new TipoPrioridadEmpresaProdu();
			this.tipoprioridadempresaprodus = new ArrayList<TipoPrioridadEmpresaProdu>();
			this.tipoprioridadempresaprodusAux = new ArrayList<TipoPrioridadEmpresaProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic=new TipoPrioridadEmpresaProduLogic();
				this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoprioridadempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoprioridadempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu);	
					}
					
					if(this.jInternalFrameImportacionTipoPrioridadEmpresaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPrioridadEmpresaProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoPrioridadEmpresaProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu);
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setVisible(false);
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu);
					this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoPrioridadEmpresaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoPrioridadEmpresaProdu);
					this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setVisible(false);
					this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu);
					this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setVisible(false);
					this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoPrioridadEmpresaProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoPrioridadEmpresaProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoprioridadempresaproduReturnGeneral=new TipoPrioridadEmpresaProduParameterReturnGeneral();
			
			this.tipoprioridadempresaproduParameterGeneral=new TipoPrioridadEmpresaProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoprioridadempresaproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoPrioridadEmpresaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(OrdenProduConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PedidoProduConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPrioridadEmpresaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado(),this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPrioridadEmpresaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado(),this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoPrioridadEmpresaProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoPrioridadEmpresaProdu(false);
			
			this.setPermisosUsuarioTipoPrioridadEmpresaProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado() && this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoPrioridadEmpresaProduClasesRelacionadas();
			}
			
			if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoPrioridadEmpresaProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoPrioridadEmpresaProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoPrioridadEmpresaProdu();
			}
			
			if(!this.isPermisoBusquedaTipoPrioridadEmpresaProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoPrioridadEmpresaProdu,this.isPermisoPaginacionMedioTipoPrioridadEmpresaProdu,this.isPermisoPaginacionTodoTipoPrioridadEmpresaProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoPrioridadEmpresaProduConstantesFunciones.getTiposSeleccionarTipoPrioridadEmpresaProdu());
				
				this.tiposColumnasSelect=TipoPrioridadEmpresaProduConstantesFunciones.getTiposSeleccionarTipoPrioridadEmpresaProdu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoPrioridadEmpresaProdu();				
				//this.tiposRelacionesSelect=TipoPrioridadEmpresaProduConstantesFunciones.getTiposRelacionesTipoPrioridadEmpresaProdu(true);
				
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
			//if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoPrioridadEmpresaProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoPrioridadEmpresaProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoPrioridadEmpresaProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrioridadEmpresaProdu() ;
			
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
			
			
			this.ordenproduLogic=new OrdenProduLogic();
			this.pedidoproduLogic=new PedidoProduLogic(); 
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
				tipoprioridadempresaproduImplementable= (TipoPrioridadEmpresaProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPrioridadEmpresaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoprioridadempresaproduImplementableHome= (TipoPrioridadEmpresaProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPrioridadEmpresaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoprioridadempresaprodus= new ArrayList<TipoPrioridadEmpresaProdu>();
			this.tipoprioridadempresaprodusEliminados= new ArrayList<TipoPrioridadEmpresaProdu>();
						
			this.isEsNuevoTipoPrioridadEmpresaProdu=false;
			this.esParaAccionDesdeFormularioTipoPrioridadEmpresaProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoPrioridadEmpresaProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoPrioridadEmpresaProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoPrioridadEmpresaProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoPrioridadEmpresaProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoPrioridadEmpresaProdu();
			}
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoPrioridadEmpresaProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoPrioridadEmpresaProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoPrioridadEmpresaProdu() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(OrdenProduConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(OrdenProduConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoPrioridadEmpresaProdu")) {
				iIndex=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();	
				
				

				if(sTitle.equals("Orden Producciones")) {
					if(!OrdenProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoPrioridadEmpresaProdu();

						this.cargarParteTabPanelRelacionadaOrdenProdu(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pedido Producciones")) {
					if(!PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoPrioridadEmpresaProdu();

						this.cargarParteTabPanelRelacionadaPedidoProdu(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoPrioridadEmpresaProdu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaOrdenProdu(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.cargarSessionConBeanSwingJInternalFrameOrdenProdu(false,true,iIndex);
		this.jButtonOrdenProduActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaOrdenProdu();

		//this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.updateUI();
		//this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPedidoProdu(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.cargarSessionConBeanSwingJInternalFramePedidoProdu(false,true,iIndex);
		this.jButtonPedidoProduActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoProdu();

		//this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.updateUI();
		//this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("OrdenProdu")) {
				int row=this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
				jButtonOrdenProduActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PedidoProdu")) {
				int row=this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
				jButtonPedidoProduActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Orden Produccion")) {

					if(this.isTienePermisosOrdenProdu && this.tipoprioridadempresaproduConstantesFunciones.mostrarOrdenProduTipoPrioridadEmpresaProdu && !TipoPrioridadEmpresaProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Orden Producciones"+"("+OrdenProduConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Orden Producciones");

						if(tipoprioridadempresaproduConstantesFunciones.resaltarOrdenProduTipoPrioridadEmpresaProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoprioridadempresaproduConstantesFunciones.resaltarOrdenProduTipoPrioridadEmpresaProdu);
						}

						jmenuItem.setEnabled(this.tipoprioridadempresaproduConstantesFunciones.activarOrdenProduTipoPrioridadEmpresaProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"OrdenProdu"));

						

						this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jmenuDetalleTipoPrioridadEmpresaProdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Pedido Produccion")) {

					if(this.isTienePermisosPedidoProdu && this.tipoprioridadempresaproduConstantesFunciones.mostrarPedidoProduTipoPrioridadEmpresaProdu && !TipoPrioridadEmpresaProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Producciones"+"("+PedidoProduConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Producciones");

						if(tipoprioridadempresaproduConstantesFunciones.resaltarPedidoProduTipoPrioridadEmpresaProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoprioridadempresaproduConstantesFunciones.resaltarPedidoProduTipoPrioridadEmpresaProdu);
						}

						jmenuItem.setEnabled(this.tipoprioridadempresaproduConstantesFunciones.activarPedidoProduTipoPrioridadEmpresaProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoProdu"));

						

						this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jmenuDetalleTipoPrioridadEmpresaProdu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoPrioridadEmpresaProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoPrioridadEmpresaProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoPrioridadEmpresaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoPrioridadEmpresaProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoPrioridadEmpresaProdu();
		
		this.cargarCombosFrameForeignKeyTipoPrioridadEmpresaProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoPrioridadEmpresaProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoPrioridadEmpresaProdu();
		}
	}
	
	
	
	public void jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
			
			if(jTableDatosTipoPrioridadEmpresaProdu.getRowCount()>=1) {
				jTableDatosTipoPrioridadEmpresaProdu.removeRowSelectionInterval(0, jTableDatosTipoPrioridadEmpresaProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoPrioridadEmpresaProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoPrioridadEmpresaProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoPrioridadEmpresaProdu(true);			
			//this.tipoprioridadempresaprodu=new TipoPrioridadEmpresaProdu();
			//this.tipoprioridadempresaprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrioridadEmpresaProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrioridadEmpresaProdu() ;
			
			if(TipoPrioridadEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrioridadEmpresaProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoprioridadempresaprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);				
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
			if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoPrioridadEmpresaProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRows().length;			
			}
			
			tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoPrioridadEmpresaProdu--;			
				//TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux= new TipoPrioridadEmpresaProdu();			
				//tipoprioridadempresaproduAux.setId(this.iIdNuevoTipoPrioridadEmpresaProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoPrioridadEmpresaProdu tipoprioridadempresaproduOrigen=new TipoPrioridadEmpresaProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduOrigen : tipoprioridadempresaprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoprioridadempresaproduOrigen =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadempresaproduOrigen =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoPrioridadEmpresaProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoprioridadempresaprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoPrioridadEmpresaProdu(tipoprioridadempresaproduOrigen,this.tipoprioridadempresaprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().add(this.tipoprioridadempresaproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprioridadempresaprodus.add(this.tipoprioridadempresaproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
				
				this.jTableDatosTipoPrioridadEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoPrioridadEmpresaProdu(), this.getIndiceNuevoTipoPrioridadEmpresaProdu());
				
				int iLastRow =  this.jTableDatosTipoPrioridadEmpresaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPrioridadEmpresaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPrioridadEmpresaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();									
		
			TipoPrioridadEmpresaProdu tipoprioridadempresaproduOrigen=new TipoPrioridadEmpresaProdu();
			TipoPrioridadEmpresaProdu tipoprioridadempresaproduDestino=new TipoPrioridadEmpresaProdu();
				
			tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoprioridadempresaprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadempresaproduOrigen =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprioridadempresaproduOrigen =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadempresaproduDestino =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprioridadempresaproduDestino =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoprioridadempresaproduOrigen =tipoprioridadempresaprodusSeleccionados.get(0);
				tipoprioridadempresaproduDestino =tipoprioridadempresaprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoPrioridadEmpresaProdu(tipoprioridadempresaproduOrigen,tipoprioridadempresaproduDestino,true,false);
				
				tipoprioridadempresaproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprioridadempresaproduDestino,tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprioridadempresaproduDestino,tipoprioridadempresaprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
				
				//this.jTableDatosTipoPrioridadEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoPrioridadEmpresaProdu(), this.getIndiceNuevoTipoPrioridadEmpresaProdu());
				
				int iLastRow =  this.jTableDatosTipoPrioridadEmpresaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPrioridadEmpresaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPrioridadEmpresaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setVisible(!isVisible);
			this.jPanelPaginacionTipoPrioridadEmpresaProdu.setVisible(!isVisible);
			this.jPanelAccionesTipoPrioridadEmpresaProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoPrioridadEmpresaProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoPrioridadEmpresaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoPrioridadEmpresaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoPrioridadEmpresaProdu();
			
			this.abrirFrameOrderByTipoPrioridadEmpresaProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoPrioridadEmpresaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoPrioridadEmpresaProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPrioridadEmpresaProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.isMaximum()) {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setSize(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.iWidthFormulario,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.isMaximum()) {
						this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jContentPaneDetalleTipoPrioridadEmpresaProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jContentPaneDetalleTipoPrioridadEmpresaProdu.getWidth(),TipoPrioridadEmpresaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jContentPaneDetalleTipoPrioridadEmpresaProdu.getWidth(),TipoPrioridadEmpresaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jContentPaneDetalleTipoPrioridadEmpresaProdu.getWidth(),TipoPrioridadEmpresaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(OrdenProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaOrdenProdu();
					}

					if(PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoProdu();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setVisible(true);
	        this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoPrioridadEmpresaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoPrioridadEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu,false,this);
				} else {
					this.jInternalFrameOrderByTipoPrioridadEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu);
				this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setVisible(false);
				this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setSelected(false);
				
				this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPrioridadEmpresaProdu"));
				
				this.inicializarActualizarBindingTablaOrderByTipoPrioridadEmpresaProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoPrioridadEmpresaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoPrioridadEmpresaProdu==null) {
				
				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu=new ImportacionJInternalFrame(TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPrioridadEmpresaProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoPrioridadEmpresaProdu);
				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setVisible(false);
				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setSelected(false);


				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPrioridadEmpresaProdu"));
				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPrioridadEmpresaProdu"));
				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPrioridadEmpresaProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoPrioridadEmpresaProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu==null) {
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu=new ReporteDinamicoJInternalFrame(TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu);
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrioridadEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrioridadEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrioridadEmpresaProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaOrdenProdu() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenProdu.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jContentPaneDetalleTipoPrioridadEmpresaProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenProdu.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenProdu.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenProdu.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPedidoProdu() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jContentPaneDetalleTipoPrioridadEmpresaProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoPrioridadEmpresaProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPrioridadEmpresaProdu);
			
	       	this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setVisible(false);
	        this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.dispose();
			//this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoPrioridadEmpresaProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoPrioridadEmpresaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setVisible(true);
	        this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoPrioridadEmpresaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setVisible(true);
	        this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoPrioridadEmpresaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setVisible(false);
	        this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoPrioridadEmpresaProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoPrioridadEmpresaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setVisible(false);
	        this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoPrioridadEmpresaProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoPrioridadEmpresaProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoPrioridadEmpresaProdu(true);
			//this.isEsNuevoTipoPrioridadEmpresaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrioridadEmpresaProdu(false) ;
			
			if(tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduSessionBean.getEsGuardarRelacionado() && OrdenProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOrdenProduActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.getEsGuardarRelacionado() && PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoProduActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoPrioridadEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrioridadEmpresaProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrioridadEmpresaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoPrioridadEmpresaProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoPrioridadEmpresaProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoPrioridadEmpresaProdu(true);
			//this.isEsNuevoTipoPrioridadEmpresaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoprioridadempresaprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoPrioridadEmpresaProdu(false) ;
			
			if(TipoPrioridadEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrioridadEmpresaProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrioridadEmpresaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoPrioridadEmpresaProdu(false);
			
			//if(!this.isEsNuevoTipoPrioridadEmpresaProdu) {								
				int intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
				
			}
			
			if(this.permiteMantenimiento(this.tipoprioridadempresaprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoPrioridadEmpresaProdu=true;
					this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
					this.isEsNuevoTipoPrioridadEmpresaProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoPrioridadEmpresaProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoPrioridadEmpresaProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPrioridadEmpresaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrioridadEmpresaProdu(false);
				
				this.habilitarDeshabilitarControlesTipoPrioridadEmpresaProdu(false);
			
												
				
				if(TipoPrioridadEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoPrioridadEmpresaProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,tipoprioridadempresaproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoPrioridadEmpresaProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoprioridadempresaproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoprioridadempresaprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				this.tipoprioridadempresaprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				this.tipoprioridadempresaprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoprioridadempresaprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoPrioridadEmpresaProduModel) this.jTableDatosTipoPrioridadEmpresaProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoPrioridadEmpresaProdu=true;
				this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
				this.isEsNuevoTipoPrioridadEmpresaProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPrioridadEmpresaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrioridadEmpresaProdu(false);
				
				this.habilitarDeshabilitarControlesTipoPrioridadEmpresaProdu(false);
				
				
				
				if(TipoPrioridadEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoPrioridadEmpresaProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoPrioridadEmpresaProdu.getRowCount()>=1) {
				jTableDatosTipoPrioridadEmpresaProdu.removeRowSelectionInterval(0, jTableDatosTipoPrioridadEmpresaProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoPrioridadEmpresaProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrioridadEmpresaProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrioridadEmpresaProdu(false) ;
			
			this.isEsNuevoTipoPrioridadEmpresaProdu=false;
			
			if(TipoPrioridadEmpresaProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoPrioridadEmpresaProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
				
				//SI ES MANUAL
				if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoPrioridadEmpresaProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoPrioridadEmpresaProdu--;			
			//TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux= new TipoPrioridadEmpresaProdu();			
			//tipoprioridadempresaproduAux.setId(this.iIdNuevoTipoPrioridadEmpresaProdu);
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoPrioridadEmpresaProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
			
			this.tipoprioridadempresaprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().add(this.tipoprioridadempresaproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoprioridadempresaprodus.add(this.tipoprioridadempresaproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
			
			this.jTableDatosTipoPrioridadEmpresaProdu.setRowSelectionInterval(this.getIndiceNuevoTipoPrioridadEmpresaProdu(), this.getIndiceNuevoTipoPrioridadEmpresaProdu());
			
			int iLastRow =  this.jTableDatosTipoPrioridadEmpresaProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoPrioridadEmpresaProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoPrioridadEmpresaProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrioridadEmpresaProdu();
			}
			
			//this.abrirFrameTreeTipoPrioridadEmpresaProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Prioridad EmpresaS ?", "MANTENIMIENTO DE Tipo Prioridad Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoPrioridadEmpresaProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoprioridadempresaproduReturnGeneral=tipoprioridadempresaproduLogic.procesarImportacionTipoPrioridadEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoprioridadempresaproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoPrioridadEmpresaProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setFileImportacion(this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoPrioridadEmpresaProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();		

		tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoPrioridadEmpresaProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoPrioridadEmpresaProduBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoPrioridadEmpresaProdus("Todos",tipoprioridadempresaprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();		
		
		tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadempresaprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoPrioridadEmpresaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:tipoprioridadempresaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprioridadempresaprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:tipoprioridadempresaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprioridadempresaprodu.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:tipoprioridadempresaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprioridadempresaprodu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoPrioridadEmpresaProdu(row);				
			//	iRow++;
			//}				
			
			//for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoPrioridadEmpresaProdu(tipoprioridadempresaproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrioridadEmpresaProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPrioridadEmpresaProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
			
			//SI ES MANUAL
			if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPrioridadEmpresaProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoPrioridadEmpresaProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoPrioridadEmpresaProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoPrioridadEmpresaProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoPrioridadEmpresaProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoPrioridadEmpresaProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoPrioridadEmpresaProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoPrioridadEmpresaProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoPrioridadEmpresaProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoPrioridadEmpresaProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoPrioridadEmpresaProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoPrioridadEmpresaProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoPrioridadEmpresaProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrioridadEmpresaProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoPrioridadEmpresaProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoPrioridadEmpresaProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu();
		
		this.inicializarActualizarBindingBotonesManualTipoPrioridadEmpresaProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPrioridadEmpresaProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrioridadEmpresaProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrioridadEmpresaProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrioridadEmpresaProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoPrioridadEmpresaProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jCheckBoxPostAccionNuevoTipoPrioridadEmpresaProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jCheckBoxPostAccionSinCerrarTipoPrioridadEmpresaProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jCheckBoxPostAccionSinMensajeTipoPrioridadEmpresaProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoPrioridadEmpresaProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jCheckBoxPostAccionNuevoTipoPrioridadEmpresaProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jCheckBoxPostAccionSinCerrarTipoPrioridadEmpresaProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jCheckBoxPostAccionSinMensajeTipoPrioridadEmpresaProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoPrioridadEmpresaProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrioridadEmpresaProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrioridadEmpresaProdu() throws Exception {
		try	{
			if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPrioridadEmpresaProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPrioridadEmpresaProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPrioridadEmpresaProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.addItem(reporte);
			}
			
			
			if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrioridadEmpresaProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrioridadEmpresaProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoPrioridadEmpresaProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoPrioridadEmpresaProdu(Boolean esInicializar) throws Exception {				
		if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPrioridadEmpresaProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu() throws Exception {
		this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoPrioridadEmpresaProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoPrioridadEmpresaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoPrioridadEmpresaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoPrioridadEmpresaProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadEmpresaProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoPrioridadEmpresaProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoPrioridadEmpresaProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoprioridadempresaprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoPrioridadEmpresaProdu.setModel(new TipoPrioridadEmpresaProduModel(this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoPrioridadEmpresaProdu.setModel(new TipoPrioridadEmpresaProduModel(this.tipoprioridadempresaprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu!=null && this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoPrioridadEmpresaProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadEmpresaProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoPrioridadEmpresaProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO,tipoprioridadempresaproduConstantesFunciones.resaltarSeleccionarTipoPrioridadEmpresaProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO,tipoprioridadempresaproduConstantesFunciones.resaltarSeleccionarTipoPrioridadEmpresaProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadEmpresaProdu,TipoPrioridadEmpresaProduConstantesFunciones.LABEL_ID));

		if(this.tipoprioridadempresaproduConstantesFunciones.mostraridTipoPrioridadEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrioridadEmpresaProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoprioridadempresaproduConstantesFunciones.resaltaridTipoPrioridadEmpresaProdu,this.tipoprioridadempresaproduConstantesFunciones.activaridTipoPrioridadEmpresaProdu,this,true,"idTipoPrioridadEmpresaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprioridadempresaproduConstantesFunciones.resaltaridTipoPrioridadEmpresaProdu,this.tipoprioridadempresaproduConstantesFunciones.activaridTipoPrioridadEmpresaProdu,this,true,"idTipoPrioridadEmpresaProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadEmpresaProdu,TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoprioridadempresaproduConstantesFunciones.mostrarid_empresaTipoPrioridadEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoprioridadempresaproduConstantesFunciones.resaltarid_empresaTipoPrioridadEmpresaProdu,this,this.tipoprioridadempresaproduConstantesFunciones.activarid_empresaTipoPrioridadEmpresaProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoprioridadempresaproduConstantesFunciones.resaltarid_empresaTipoPrioridadEmpresaProdu,this,this.tipoprioridadempresaproduConstantesFunciones.activarid_empresaTipoPrioridadEmpresaProdu,false,"id_empresaTipoPrioridadEmpresaProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPrioridadEmpresaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadEmpresaProdu,TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoprioridadempresaproduConstantesFunciones.mostrarnombreTipoPrioridadEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprioridadempresaproduConstantesFunciones.resaltarnombreTipoPrioridadEmpresaProdu,this.tipoprioridadempresaproduConstantesFunciones.activarnombreTipoPrioridadEmpresaProdu,this,true,"nombreTipoPrioridadEmpresaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprioridadempresaproduConstantesFunciones.resaltarnombreTipoPrioridadEmpresaProdu,this.tipoprioridadempresaproduConstantesFunciones.activarnombreTipoPrioridadEmpresaProdu,this,true,"nombreTipoPrioridadEmpresaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPrioridadEmpresaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadEmpresaProdu,TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipoprioridadempresaproduConstantesFunciones.mostrardescripcionTipoPrioridadEmpresaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprioridadempresaproduConstantesFunciones.resaltardescripcionTipoPrioridadEmpresaProdu,this.tipoprioridadempresaproduConstantesFunciones.activardescripcionTipoPrioridadEmpresaProdu,this,true,"descripcionTipoPrioridadEmpresaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprioridadempresaproduConstantesFunciones.resaltardescripcionTipoPrioridadEmpresaProdu,this.tipoprioridadempresaproduConstantesFunciones.activardescripcionTipoPrioridadEmpresaProdu,this,true,"descripcionTipoPrioridadEmpresaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPrioridadEmpresaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosOrdenProdu && this.tipoprioridadempresaproduConstantesFunciones.mostrarOrdenProduTipoPrioridadEmpresaProdu && !TipoPrioridadEmpresaProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Orden Producciones");
				tableColumn.setHeaderValue("Orden Producciones");
				tableColumn.setCellRenderer(new OrdenProduTableCell(tipoprioridadempresaproduConstantesFunciones.resaltarOrdenProduTipoPrioridadEmpresaProdu,this,this.tipoprioridadempresaproduConstantesFunciones.activarOrdenProduTipoPrioridadEmpresaProdu));
				tableColumn.setCellEditor(new OrdenProduTableCell(tipoprioridadempresaproduConstantesFunciones.resaltarOrdenProduTipoPrioridadEmpresaProdu,this,this.tipoprioridadempresaproduConstantesFunciones.activarOrdenProduTipoPrioridadEmpresaProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoPrioridadEmpresaProdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosPedidoProdu && this.tipoprioridadempresaproduConstantesFunciones.mostrarPedidoProduTipoPrioridadEmpresaProdu && !TipoPrioridadEmpresaProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Producciones");
				tableColumn.setHeaderValue("Pedido Producciones");
				tableColumn.setCellRenderer(new PedidoProduTableCell(tipoprioridadempresaproduConstantesFunciones.resaltarPedidoProduTipoPrioridadEmpresaProdu,this,this.tipoprioridadempresaproduConstantesFunciones.activarPedidoProduTipoPrioridadEmpresaProdu));
				tableColumn.setCellEditor(new PedidoProduTableCell(tipoprioridadempresaproduConstantesFunciones.resaltarPedidoProduTipoPrioridadEmpresaProdu,this,this.tipoprioridadempresaproduConstantesFunciones.activarPedidoProduTipoPrioridadEmpresaProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoPrioridadEmpresaProdu.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPrioridadEmpresaProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPrioridadEmpresaProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoPrioridadEmpresaProdu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoPrioridadEmpresaProdu.addColumn(tableColumn);
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
			
			this.jTableDatosTipoPrioridadEmpresaProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoPrioridadEmpresaProdu.moveColumn(this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoPrioridadEmpresaProdu.moveColumn(this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoPrioridadEmpresaProdu.moveColumn(this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoPrioridadEmpresaProdu.moveColumn(this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoPrioridadEmpresaProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoPrioridadEmpresaProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoPrioridadEmpresaProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoPrioridadEmpresaProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoPrioridadEmpresaProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoPrioridadEmpresaProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoprioridadempresaprodus.size()-1;
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
		//this.jTableDatosTipoPrioridadEmpresaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoPrioridadEmpresaProdu();
			
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
				
				//this.isEsNuevoTipoPrioridadEmpresaProdu=false;
					
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
				if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPrioridadEmpresaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoprioridadempresaprodu.getsType().equals("DUPLICADO")
				   || this.tipoprioridadempresaprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoPrioridadEmpresaProdu=true;
				
				} else {
					this.isEsNuevoTipoPrioridadEmpresaProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoprioridadempresaprodu.getId()>=0 && !this.tipoprioridadempresaprodu.getIsNew()) {						
						this.isEsNuevoTipoPrioridadEmpresaProdu=false;
						
					} else {
						this.isEsNuevoTipoPrioridadEmpresaProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoPrioridadEmpresaProdu(esRelaciones);						
				
				this.seleccionarTipoPrioridadEmpresaProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoprioridadempresaprodu.getId()<0) {
					this.isEsNuevoTipoPrioridadEmpresaProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoPrioridadEmpresaProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoPrioridadEmpresaProdu(evt,rowIndex);
				}	
				
				if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoPrioridadEmpresaProdu: " + this.dDif); 
					}
				}								
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoPrioridadEmpresaProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoprioridadempresaprodu)) {
					if(this.tipoprioridadempresaprodu.getId()>0) {
						this.tipoprioridadempresaprodu.setIsDeleted(true);
						
						this.tipoprioridadempresaprodusEliminados.add(this.tipoprioridadempresaprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().remove(this.tipoprioridadempresaprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprioridadempresaprodus.remove(this.tipoprioridadempresaprodu);				
					}
					
					
					((TipoPrioridadEmpresaProduModel) this.jTableDatosTipoPrioridadEmpresaProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoPrioridadEmpresaProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoPrioridadEmpresaProdu) {
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPrioridadEmpresaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoprioridadempresaproduConstantesFunciones.cargarid_empresaTipoPrioridadEmpresaProdu || this.tipoprioridadempresaproduConstantesFunciones.event_dependid_empresaTipoPrioridadEmpresaProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoprioridadempresaprodu.getid_empresa());
									//this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoprioridadempresaprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoprioridadempresaprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoprioridadempresaprodu.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoPrioridadEmpresaProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrioridadEmpresaProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoPrioridadEmpresaProdu(tipoprioridadempresaprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoPrioridadEmpresaProdu(tipoprioridadempresaprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoPrioridadEmpresaProdu(tipoprioridadempresaprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoPrioridadEmpresaProdu(tipoprioridadempresaprodu);
	}
	
	public void setVariablesObjetoActualToFormularioTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.setText(tipoprioridadempresaprodu.getId().toString());
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreanombreTipoPrioridadEmpresaProdu.setText(tipoprioridadempresaprodu.getnombre());
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreadescripcionTipoPrioridadEmpresaProdu.setText(tipoprioridadempresaprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoPrioridadEmpresaProdu tipoprioridadempresaproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoprioridadempresaproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoPrioridadEmpresaProdu tipoprioridadempresaproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoprioridadempresaproduLocal=this.tipoprioridadempresaprodu;
			} else {
				tipoprioridadempresaproduLocal=this.tipoprioridadempresaproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoprioridadempresaproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoPrioridadEmpresaProdu(tipoprioridadempresaproduLocal,true);
					
					if(tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoprioridadempresaproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoprioridadempresaproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(tipoprioridadempresaprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(tipoprioridadempresaprodu);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(tipoprioridadempresaprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.getText()==null || this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.getText()=="" || this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.setText("0");
			}

			if(conColumnasBase) {tipoprioridadempresaprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPrioridadEmpresaProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelIdTipoPrioridadEmpresaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprioridadempresaprodu.setnombre(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreanombreTipoPrioridadEmpresaProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelnombreTipoPrioridadEmpresaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprioridadempresaprodu.setdescripcion(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreadescripcionTipoPrioridadEmpresaProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabeldescripcionTipoPrioridadEmpresaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaproduBean,TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaproduOrigen,TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprioridadempresaproduOrigen.getId()!=null && !tipoprioridadempresaproduOrigen.getId().equals(0L))) {tipoprioridadempresaprodu.setId(tipoprioridadempresaproduOrigen.getId());}}
			if(conDefault || (!conDefault && tipoprioridadempresaproduOrigen.getnombre()!=null && !tipoprioridadempresaproduOrigen.getnombre().equals(""))) {tipoprioridadempresaprodu.setnombre(tipoprioridadempresaproduOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoprioridadempresaproduOrigen.getdescripcion()!=null && !tipoprioridadempresaproduOrigen.getdescripcion().equals(""))) {tipoprioridadempresaprodu.setdescripcion(tipoprioridadempresaproduOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.setText(tipoprioridadempresaprodu.getId().toString());
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreanombreTipoPrioridadEmpresaProdu.setText(tipoprioridadempresaprodu.getnombre());
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreadescripcionTipoPrioridadEmpresaProdu.setText(tipoprioridadempresaprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProduBean tipoprioridadempresaproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.setText(tipoprioridadempresaproduBean.getId().toString());
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreanombreTipoPrioridadEmpresaProdu.setText(tipoprioridadempresaproduBean.getnombre());
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreadescripcionTipoPrioridadEmpresaProdu.setText(tipoprioridadempresaproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProduParameterReturnGeneral tipoprioridadempresaproduReturnGeneral,TipoPrioridadEmpresaProduBean tipoprioridadempresaproduBean,Boolean conDefault) throws Exception { 
		try {
			TipoPrioridadEmpresaProdu tipoprioridadempresaproduLocal=new TipoPrioridadEmpresaProdu();
			
			tipoprioridadempresaproduLocal=tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprioridadempresaproduLocal.getId()!=null && !tipoprioridadempresaproduLocal.getId().equals(0L))) {tipoprioridadempresaproduBean.setId(tipoprioridadempresaproduLocal.getId());}}
			if(conDefault || (!conDefault && tipoprioridadempresaproduLocal.getnombre()!=null && !tipoprioridadempresaproduLocal.getnombre().equals(""))) {tipoprioridadempresaproduBean.setnombre(tipoprioridadempresaproduLocal.getnombre());}
			if(conDefault || (!conDefault && tipoprioridadempresaproduLocal.getdescripcion()!=null && !tipoprioridadempresaproduLocal.getdescripcion().equals(""))) {tipoprioridadempresaproduBean.setdescripcion(tipoprioridadempresaproduLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoPrioridadEmpresaProduGenerico(Long idTipoPrioridadEmpresaProduSeleccionado,JComboBox jComboBoxTipoPrioridadEmpresaProdu,List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusLocal)throws Exception {
		try {
			TipoPrioridadEmpresaProdu  tipoprioridadempresaproduTemp=null;

			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusLocal) {
				if(tipoprioridadempresaproduAux.getId()!=null && tipoprioridadempresaproduAux.getId().equals(idTipoPrioridadEmpresaProduSeleccionado)) {
					tipoprioridadempresaproduTemp=tipoprioridadempresaproduAux;
					break;
				}
			}

			jComboBoxTipoPrioridadEmpresaProdu.setSelectedItem(tipoprioridadempresaproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoPrioridadEmpresaProduGenerico(JComboBox jComboBoxTipoPrioridadEmpresaProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoPrioridadEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPrioridadEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoPrioridadEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPrioridadEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPrioridadEmpresaProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoPrioridadEmpresaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPrioridadEmpresaProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoPrioridadEmpresaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoPrioridadEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoPrioridadEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("OrdenProdu")) {
			jButtonOrdenProduActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PedidoProdu")) {
			jButtonPedidoProduActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprioridadempresaprodu=(TipoPrioridadEmpresaProdu) tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) tipoprioridadempresaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoprioridadempresaprodu.getIsNew() && !tipoprioridadempresaprodu.getIsChanged() && !tipoprioridadempresaprodu.getIsDeleted()) {
				sDescripcion=tipoprioridadempresaprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoprioridadempresaprodu.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoPrioridadEmpresaProdu tipoprioridadempresaproduRow=new TipoPrioridadEmpresaProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprioridadempresaproduRow=(TipoPrioridadEmpresaProdu) tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprioridadempresaproduRow=(TipoPrioridadEmpresaProdu) tipoprioridadempresaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonOrdenProduActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoPrioridadEmpresaProdu tipoprioridadempresaprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadempresaprodu = (TipoPrioridadEmpresaProdu)this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoprioridadempresaprodu = (TipoPrioridadEmpresaProdu)this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoprioridadempresaprodu!=null) {
						this.tipoprioridadempresaprodu = tipoprioridadempresaprodu;
					} else {
						this.tipoprioridadempresaprodu = new TipoPrioridadEmpresaProdu();
					}
				}

				if(this.isTienePermisosOrdenProdu && this.permiteMantenimiento(this.tipoprioridadempresaprodu)) {
					OrdenProduBeanSwingJInternalFrame ordenproduBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFramePopup=new OrdenProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						ordenproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFramePopup;
					} else {
						ordenproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame;
					}

					List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodus=new ArrayList<TipoPrioridadEmpresaProdu>();
					tipoprioridadempresaprodus.add(this.tipoprioridadempresaprodu);
					if(!esRelacionado) {
						//ordenproduBeanSwingJInternalFrame.ordenproduSessionBean.setConGuardarRelaciones(false);
						//ordenproduBeanSwingJInternalFrame.ordenproduSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					ordenproduBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.cargarOrdenProduBeanSwingJInternalFrame(tipoprioridadempresaprodus,this.tipoprioridadempresaprodu,ordenproduBeanSwingJInternalFrame,/*conInicializar,*/ordenproduBeanSwingJInternalFrame.ordenproduSessionBean.getConGuardarRelaciones(),ordenproduBeanSwingJInternalFrame.ordenproduSessionBean.getEsGuardarRelacionado());
					ordenproduBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						ordenproduBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenProdu("no_relacionado");

						ordenproduBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(OrdenProduConstantesFunciones.ITAMANIOFILATABLA + (OrdenProduConstantesFunciones.ITAMANIOFILATABLA/2));

						ordenproduBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoPrioridadEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoPrioridadEmpresaProdu.getBorder();
						TitledBorder titledBorderOrdenProdu=(TitledBorder)ordenproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenProdu.getBorder();

						titledBorderOrdenProdu.setTitle(titledBorderTipoPrioridadEmpresaProdu.getTitle() + " -> Orden Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,ordenproduBeanSwingJInternalFrame);
						}

						ordenproduBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(ordenproduBeanSwingJInternalFrame);

						ordenproduBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Orden Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPedidoProduActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoPrioridadEmpresaProdu tipoprioridadempresaprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadempresaprodu = (TipoPrioridadEmpresaProdu)this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoprioridadempresaprodu = (TipoPrioridadEmpresaProdu)this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoprioridadempresaprodu!=null) {
						this.tipoprioridadempresaprodu = tipoprioridadempresaprodu;
					} else {
						this.tipoprioridadempresaprodu = new TipoPrioridadEmpresaProdu();
					}
				}

				if(this.isTienePermisosPedidoProdu && this.permiteMantenimiento(this.tipoprioridadempresaprodu)) {
					PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFramePopup=new PedidoProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidoproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFramePopup;
					} else {
						pedidoproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame;
					}

					List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodus=new ArrayList<TipoPrioridadEmpresaProdu>();
					tipoprioridadempresaprodus.add(this.tipoprioridadempresaprodu);
					if(!esRelacionado) {
						//pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setConGuardarRelaciones(false);
						//pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidoproduBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.cargarPedidoProduBeanSwingJInternalFrame(tipoprioridadempresaprodus,this.tipoprioridadempresaprodu,pedidoproduBeanSwingJInternalFrame,/*conInicializar,*/pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.getConGuardarRelaciones(),pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.getEsGuardarRelacionado());
					pedidoproduBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidoproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoProdu("no_relacionado");

						pedidoproduBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoProduConstantesFunciones.ITAMANIOFILATABLA + (PedidoProduConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidoproduBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoPrioridadEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoPrioridadEmpresaProdu.getBorder();
						TitledBorder titledBorderPedidoProdu=(TitledBorder)pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.getBorder();

						titledBorderPedidoProdu.setTitle(titledBorderTipoPrioridadEmpresaProdu.getTitle() + " -> Pedido Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidoproduBeanSwingJInternalFrame);
						}

						pedidoproduBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidoproduBeanSwingJInternalFrame);

						pedidoproduBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoPrioridadEmpresaProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu && this.isPermisoNuevoTipoPrioridadEmpresaProdu));			
			this.jButtonDuplicarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu && this.isPermisoDuplicarTipoPrioridadEmpresaProdu));			
			this.jButtonCopiarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu && this.isPermisoCopiarTipoPrioridadEmpresaProdu));
			this.jButtonVerFormTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu && this.isPermisoVerFormTipoPrioridadEmpresaProdu));
			
			this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu && this.isPermisoOrdenTipoPrioridadEmpresaProdu));			
			
			this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu && this.isPermisoNuevoTipoPrioridadEmpresaProdu));			
			this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu && this.isPermisoNuevoTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu));
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonModificarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu && this.isPermisoActualizarTipoPrioridadEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonActualizarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu && this.isPermisoActualizarTipoPrioridadEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonEliminarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu && this.isPermisoEliminarTipoPrioridadEmpresaProdu));
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonCancelarTipoPrioridadEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu);							
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu && this.isPermisoNuevoTipoPrioridadEmpresaProdu));						
			this.jButtonDuplicarToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu && this.isPermisoDuplicarTipoPrioridadEmpresaProdu));						
			this.jButtonCopiarToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu && this.isPermisoCopiarTipoPrioridadEmpresaProdu));			
			this.jButtonVerFormToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu && this.isPermisoVerFormTipoPrioridadEmpresaProdu));			
			this.jButtonAbrirOrderByToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu && this.isPermisoOrdenTipoPrioridadEmpresaProdu));
			this.jButtonNuevoRelacionesToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu && this.isPermisoNuevoTipoPrioridadEmpresaProdu));			
			this.jButtonNuevoGuardarCambiosToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu && this.isPermisoNuevoTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu));			
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonModificarToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu && this.isPermisoActualizarTipoPrioridadEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonActualizarToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu  && this.isPermisoActualizarTipoPrioridadEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonEliminarToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu && this.isPermisoEliminarTipoPrioridadEmpresaProdu));
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonCancelarToolBarTipoPrioridadEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu);				
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu && this.isPermisoNuevoTipoPrioridadEmpresaProdu));			
			this.jMenuItemDuplicarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu && this.isPermisoDuplicarTipoPrioridadEmpresaProdu));			
			this.jMenuItemCopiarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu && this.isPermisoCopiarTipoPrioridadEmpresaProdu));			
			this.jMenuItemVerFormTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu && this.isPermisoVerFormTipoPrioridadEmpresaProdu));			
			this.jMenuItemAbrirOrderByTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu && this.isPermisoOrdenTipoPrioridadEmpresaProdu));			
			//this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu && this.isPermisoOrdenTipoPrioridadEmpresaProdu));
			this.jMenuItemDetalleAbrirOrderByTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu && this.isPermisoOrdenTipoPrioridadEmpresaProdu));			
			//this.jMenuItemDetalleMostrarOcultarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu && this.isPermisoOrdenTipoPrioridadEmpresaProdu));			
			this.jMenuItemNuevoRelacionesTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu && this.isPermisoNuevoTipoPrioridadEmpresaProdu));			
			this.jMenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu && this.isPermisoNuevoTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu));									
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemModificarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu && this.isPermisoActualizarTipoPrioridadEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemActualizarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu && this.isPermisoActualizarTipoPrioridadEmpresaProdu));	
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemEliminarTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu && this.isPermisoEliminarTipoPrioridadEmpresaProdu));
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemCancelarTipoPrioridadEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu);				
			}
			
			this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu));						
			this.jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=this.jButtonNuevoTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu=this.jButtonDuplicarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu=this.jButtonCopiarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu=this.jButtonVerFormTipoPrioridadEmpresaProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoPrioridadEmpresaProdu=this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=this.jButtonModificarTipoPrioridadEmpresaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonActualizarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonEliminarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonCancelarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosTipoPrioridadEmpresaProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=this.jButtonNuevoToolBarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=this.jButtonNuevoRelacionesToolBarTipoPrioridadEmpresaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonModificarToolBarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonActualizarToolBarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonEliminarToolBarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonCancelarToolBarTipoPrioridadEmpresaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=this.jButtonGuardarCambiosToolBarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=this.jButtonGuardarCambiosTablaToolBarTipoPrioridadEmpresaProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=this.jMenuItemNuevoTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=this.jMenuItemNuevoRelacionesTipoPrioridadEmpresaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemModificarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemActualizarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemEliminarTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemCancelarTipoPrioridadEmpresaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=this.jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoPrioridadEmpresaProdu(Boolean esInicializar) {
		if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPrioridadEmpresaProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoPrioridadEmpresaProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoPrioridadEmpresaProdu() {
		this.jButtonNuevoTipoPrioridadEmpresaProdu.setVisible(this.isPermisoNuevoTipoPrioridadEmpresaProdu);			
		this.jButtonDuplicarTipoPrioridadEmpresaProdu.setVisible(this.isPermisoDuplicarTipoPrioridadEmpresaProdu);			
		this.jButtonCopiarTipoPrioridadEmpresaProdu.setVisible(this.isPermisoCopiarTipoPrioridadEmpresaProdu);			
		this.jButtonVerFormTipoPrioridadEmpresaProdu.setVisible(this.isPermisoVerFormTipoPrioridadEmpresaProdu);			
		
		this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.setVisible(this.isPermisoOrdenTipoPrioridadEmpresaProdu);					
		
		this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.setVisible(this.isPermisoNuevoTipoPrioridadEmpresaProdu);			
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonModificarTipoPrioridadEmpresaProdu.setVisible(this.isPermisoActualizarTipoPrioridadEmpresaProdu);	
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonActualizarTipoPrioridadEmpresaProdu.setVisible(this.isPermisoActualizarTipoPrioridadEmpresaProdu);	
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonEliminarTipoPrioridadEmpresaProdu.setVisible(this.isPermisoEliminarTipoPrioridadEmpresaProdu);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonCancelarTipoPrioridadEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu);						
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosTipoPrioridadEmpresaProdu.setVisible(this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu);							
		}
		
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.setVisible(this.isPermisoActualizarTipoPrioridadEmpresaProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPrioridadEmpresaProdu() {
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonModificarTipoPrioridadEmpresaProdu.setVisible(this.isPermisoActualizarTipoPrioridadEmpresaProdu);	
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonActualizarTipoPrioridadEmpresaProdu.setVisible(this.isPermisoActualizarTipoPrioridadEmpresaProdu);	
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonEliminarTipoPrioridadEmpresaProdu.setVisible(this.isPermisoEliminarTipoPrioridadEmpresaProdu);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonCancelarTipoPrioridadEmpresaProdu.setVisible(this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu);							
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosTipoPrioridadEmpresaProdu.setVisible((this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu && this.isPermisoGuardarCambiosTipoPrioridadEmpresaProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoPrioridadEmpresaProdu() {
		if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoPrioridadEmpresaProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoPrioridadEmpresaProdu() {
	}
	
	public void jTableDatosTipoPrioridadEmpresaProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoPrioridadEmpresaProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoPrioridadEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.gettipoprioridadempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprioridadempresaprodu==null) {
						this.tipoprioridadempresaprodu = new TipoPrioridadEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
				}

				if(this.tipoprioridadempresaprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoprioridadempresaprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoPrioridadEmpresaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoPrioridadEmpresaProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoPrioridadEmpresaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoPrioridadEmpresaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.gettipoprioridadempresaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoprioridadempresaproduLogic.getConnexion());

				if(this.tipoprioridadempresaprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoprioridadempresaprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoPrioridadEmpresaProdu=(TitledBorder)this.jScrollPanelDatosTipoPrioridadEmpresaProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoPrioridadEmpresaProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoPrioridadEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.gettipoprioridadempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprioridadempresaprodu==null) {
						this.tipoprioridadempresaprodu = new TipoPrioridadEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
				}

				if(this.tipoprioridadempresaprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoprioridadempresaprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoPrioridadEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.gettipoprioridadempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprioridadempresaprodu==null) {
						this.tipoprioridadempresaprodu = new TipoPrioridadEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
				}

				if(this.tipoprioridadempresaprodu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoprioridadempresaprodu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoPrioridadEmpresaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.gettipoprioridadempresaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprioridadempresaprodu==null) {
						this.tipoprioridadempresaprodu = new TipoPrioridadEmpresaProdu();
					}

					this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);
				}

				if(this.tipoprioridadempresaprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipoprioridadempresaprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoPrioridadEmpresaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false,false);

			this.getTipoPrioridadEmpresaProdusFK_IdEmpresa();

			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);

			//if(TipoPrioridadEmpresaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadempresaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoPrioridadEmpresaProdu() {
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
		

		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.dispose();
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu!=null) {
			this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.dispose();
			this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu=null;
		}
		
		if(this.jInternalFrameImportacionTipoPrioridadEmpresaProdu!=null) {
			this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setVisible(false);	    			
			this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.dispose();
			this.jInternalFrameImportacionTipoPrioridadEmpresaProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoPrioridadEmpresaProdu();
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoPrioridadEmpresaProdu")) {
				jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoPrioridadEmpresaProdu")) {
				jButtonDuplicarTipoPrioridadEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoPrioridadEmpresaProdu")) {
				jButtonCopiarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoPrioridadEmpresaProdu")) {
				jButtonVerFormTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoPrioridadEmpresaProdu")) {
				jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoPrioridadEmpresaProdu")) {
				jButtonDuplicarTipoPrioridadEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoPrioridadEmpresaProdu")) {
				jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoPrioridadEmpresaProdu")) {
				jButtonDuplicarTipoPrioridadEmpresaProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoPrioridadEmpresaProdu")) {
				jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoPrioridadEmpresaProdu")) {
				jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoPrioridadEmpresaProdu")) {
				jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoPrioridadEmpresaProdu")) {
				jButtonModificarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoPrioridadEmpresaProdu")) {
				jButtonModificarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoPrioridadEmpresaProdu")) {
				jButtonModificarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoPrioridadEmpresaProdu")) {
				jButtonActualizarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoPrioridadEmpresaProdu")) {
				jButtonActualizarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoPrioridadEmpresaProdu")) {
				jButtonActualizarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoPrioridadEmpresaProdu")) {
				jButtonEliminarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoPrioridadEmpresaProdu")) {
				jButtonEliminarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoPrioridadEmpresaProdu")) {
				jButtonEliminarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoPrioridadEmpresaProdu")) {
				jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoPrioridadEmpresaProdu")) {
				jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoPrioridadEmpresaProdu")) {
				jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoPrioridadEmpresaProdu")) {
				jButtonCerrarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoPrioridadEmpresaProdu")) {
				jButtonCerrarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoPrioridadEmpresaProdu")) {
				jButtonCerrarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoPrioridadEmpresaProdu")) {
				jButtonMostrarOcultarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoPrioridadEmpresaProdu")) {
				jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoPrioridadEmpresaProdu")) {
				jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoPrioridadEmpresaProdu")) {
				jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoPrioridadEmpresaProdu")) {
				jButtonCopiarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoPrioridadEmpresaProdu")) {
				jButtonVerFormTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoPrioridadEmpresaProdu")) {
				jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoPrioridadEmpresaProdu")) {
				jButtonCopiarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoPrioridadEmpresaProdu")) {
				jButtonVerFormTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoPrioridadEmpresaProdu")) {
				jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoPrioridadEmpresaProdu")) {
				jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu")) {
				jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoPrioridadEmpresaProdu")) {
				jButtonRecargarInformacionTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoPrioridadEmpresaProdu")) {
				jButtonRecargarInformacionTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoPrioridadEmpresaProdu")) {
				jButtonRecargarInformacionTipoPrioridadEmpresaProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoPrioridadEmpresaProdu")) {
				jButtonAnterioresTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoPrioridadEmpresaProdu")) {
				jButtonAnterioresTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoPrioridadEmpresaProdu")) {
				jButtonAnterioresTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoPrioridadEmpresaProdu")) {
				jButtonSiguientesTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoPrioridadEmpresaProdu")) {
				jButtonSiguientesTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoPrioridadEmpresaProdu")) {
				jButtonSiguientesTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoPrioridadEmpresaProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoPrioridadEmpresaProdu")) {
				jButtonAbrirOrderByTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoPrioridadEmpresaProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoPrioridadEmpresaProdu")) {
				jButtonMostrarOcultarTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPrioridadEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoPrioridadEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoPrioridadEmpresaProdu")) {
				jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoPrioridadEmpresaProdu")) {
				jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu")) {
				
				jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoPrioridadEmpresaProdu")) {
				jButtonCerrarImportacionTipoPrioridadEmpresaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoPrioridadEmpresaProdu")) {
				
				jButtonGenerarImportacionTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoPrioridadEmpresaProdu")) {
				
				jButtonAbrirImportacionTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoPrioridadEmpresaProdu")) {
				jComboBoxTiposAccionesTipoPrioridadEmpresaProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoPrioridadEmpresaProdu")) {
				jComboBoxTiposRelacionesTipoPrioridadEmpresaProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoPrioridadEmpresaProdu")) {
				jComboBoxTiposAccionesTipoPrioridadEmpresaProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoPrioridadEmpresaProdu")) {
				
				jComboBoxTiposSeleccionarTipoPrioridadEmpresaProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoPrioridadEmpresaProdu")) {
				jTextFieldValorCampoGeneralTipoPrioridadEmpresaProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoPrioridadEmpresaProdu")) {
				jButtonAbrirOrderByTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoPrioridadEmpresaProdu")) {
				jButtonAbrirOrderByTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoPrioridadEmpresaProdu")) {
				jButtonCerrarOrderByTipoPrioridadEmpresaProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPrioridadEmpresaProduBusqueda")) {
				this.jButtonidTipoPrioridadEmpresaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoPrioridadEmpresaProduUpdate")) {
				this.jButtonid_empresaTipoPrioridadEmpresaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoPrioridadEmpresaProduBusqueda")) {
				this.jButtonid_empresaTipoPrioridadEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPrioridadEmpresaProduBusqueda")) {
				this.jButtonnombreTipoPrioridadEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoPrioridadEmpresaProduBusqueda")) {
				this.jButtondescripcionTipoPrioridadEmpresaProduBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoPrioridadEmpresaProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				


				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoPrioridadEmpresaProdu tipoprioridadempresaproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoprioridadempresaproduLocal=this.tipoprioridadempresaprodu;
			} else {
				tipoprioridadempresaproduLocal=this.tipoprioridadempresaproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
							
				
				


				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
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
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
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
			
			


			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
								
						
				


				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
								
				
				


				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
							
				
				


				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
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
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
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
			
			


			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
								
				
				


				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoPrioridadEmpresaProdu")) {
					jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoPrioridadEmpresaProdu")) {
					jCheckBoxSeleccionadosTipoPrioridadEmpresaProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoPrioridadEmpresaProdu")) {
					
				}
				
				


				
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
												
				
				


				
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
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
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
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
			
			


			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadempresaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadempresaprodu);
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
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
				
				


				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadEmpresaProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadEmpresaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadEmpresaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadempresaproduAnterior =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoPrioridadEmpresaProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoPrioridadEmpresaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoprioridadempresaprodu =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoprioridadempresaprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoPrioridadEmpresaProdu")) {
				
				}
				
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoPrioridadEmpresaProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoPrioridadEmpresaProdu")) {
			
			}
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoPrioridadEmpresaProdu();
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
			if(sTipo.equals("NuevoTipoPrioridadEmpresaProdu")) {
				jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoPrioridadEmpresaProdu")) {
				jButtonDuplicarTipoPrioridadEmpresaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoPrioridadEmpresaProdu")) {
				jButtonCopiarTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoPrioridadEmpresaProdu")) {
				jButtonVerFormTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoPrioridadEmpresaProdu")) {
				jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoPrioridadEmpresaProdu")) {
				jButtonModificarTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoPrioridadEmpresaProdu")) {
				jButtonActualizarTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoPrioridadEmpresaProdu")) {
				jButtonEliminarTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoPrioridadEmpresaProdu")) {
				jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoPrioridadEmpresaProdu")) {
				jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoPrioridadEmpresaProdu")) {
				jButtonCerrarTipoPrioridadEmpresaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoPrioridadEmpresaProdu")) {
				jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPrioridadEmpresaProdu")) {
				jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoPrioridadEmpresaProdu")) {
				jButtonAbrirOrderByTipoPrioridadEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoPrioridadEmpresaProdu")) {
				jButtonRecargarInformacionTipoPrioridadEmpresaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoPrioridadEmpresaProdu")) {
				jButtonAnterioresTipoPrioridadEmpresaProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoPrioridadEmpresaProdu")) {
				jButtonSiguientesTipoPrioridadEmpresaProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPrioridadEmpresaProduBusqueda")) {
				this.jButtonidTipoPrioridadEmpresaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoPrioridadEmpresaProduUpdate")) {
				this.jButtonid_empresaTipoPrioridadEmpresaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoPrioridadEmpresaProduBusqueda")) {
				this.jButtonid_empresaTipoPrioridadEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPrioridadEmpresaProduBusqueda")) {
				this.jButtonnombreTipoPrioridadEmpresaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoPrioridadEmpresaProduBusqueda")) {
				this.jButtondescripcionTipoPrioridadEmpresaProduBusquedaActionPerformed(evt);
			}
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoPrioridadEmpresaProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoPrioridadEmpresaProdu")) {
				closingInternalFrameTipoPrioridadEmpresaProdu();
				
			} else if(sTipo.equals("jButtonCancelarTipoPrioridadEmpresaProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoPrioridadEmpresaProdu = (JInternalFrameBase)evt.getSource();
	            	
	            TipoPrioridadEmpresaProduBeanSwingJInternalFrame jInternalFrameParent=(TipoPrioridadEmpresaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(null);
			}
			
			TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprioridadempresaprodu,new Object(),this.tipoprioridadempresaproduParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoPrioridadEmpresaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoPrioridadEmpresaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoPrioridadEmpresaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoprioridadempresaprodu)) {
			if(!esControlTabla) {
				if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);			
				}
				
				if(this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprioridadempresaproduReturnGeneral=tipoprioridadempresaproduLogic.procesarEventosTipoPrioridadEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus(),this.tipoprioridadempresaprodu,this.tipoprioridadempresaproduParameterGeneral,this.isEsNuevoTipoPrioridadEmpresaProdu,classes);//this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduReturnGeneral,this.tipoprioridadempresaproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoPrioridadEmpresaProdu(classes,this.tipoprioridadempresaproduReturnGeneral,this.tipoprioridadempresaproduBean,false);
					}
						
					if(this.tipoprioridadempresaproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu());	
					}
						
					if(this.tipoprioridadempresaproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu(),classes);//this.tipoprioridadempresaproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,classes);//this.tipoprioridadempresaproduBean);									
				}
			
				if(TipoPrioridadEmpresaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoprioridadempresaproduAnterior!=null) {
						this.tipoprioridadempresaprodu=this.tipoprioridadempresaproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprioridadempresaproduReturnGeneral=tipoprioridadempresaproduLogic.procesarEventosTipoPrioridadEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus(),this.tipoprioridadempresaprodu,this.tipoprioridadempresaproduParameterGeneral,this.isEsNuevoTipoPrioridadEmpresaProdu,classes);//this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu(),tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu(),this.tipoprioridadempresaprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoPrioridadEmpresaProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoPrioridadEmpresaProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoPrioridadEmpresaProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoPrioridadEmpresaProdu() throws Exception {
		
		TipoPrioridadEmpresaProduModel tipoprioridadempresaproduModel=(TipoPrioridadEmpresaProduModel)this.jTableDatosTipoPrioridadEmpresaProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprioridadempresaproduModel.tipoprioridadempresaprodus=this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoprioridadempresaproduModel.tipoprioridadempresaprodus=this.tipoprioridadempresaprodus;
		}
		
		
		((TipoPrioridadEmpresaProduModel) this.jTableDatosTipoPrioridadEmpresaProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoPrioridadEmpresaProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoprioridadempresaproduAnterior(),this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoprioridadempresaproduAnterior(),this.tipoprioridadempresaprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoPrioridadEmpresaProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(OrdenProdu.class)) {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.setOrdenProdus(tipoprioridadempresaprodu.getOrdenProdus());
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenProdu(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoProdu.class)) {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.setPedidoProdus(tipoprioridadempresaprodu.getPedidoProdus());
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
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
										
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprioridadempresaprodu,new Object(),generalEntityParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoPrioridadEmpresaProduConstantesFunciones.getClassesRelationshipsOfTipoPrioridadEmpresaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoPrioridadEmpresaProduConstantesFunciones.getClassesRelationshipsFromStringsOfTipoPrioridadEmpresaProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoPrioridadEmpresaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprioridadempresaprodu,new Object(),generalEntityParameterGeneral,this.tipoprioridadempresaproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProduBean tipoprioridadempresaproduBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(OrdenProdu.class)) {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.setOrdenProdus(tipoprioridadempresaprodu.getOrdenProdus());
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenProdu(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoProdu.class)) {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.setPedidoProdus(tipoprioridadempresaprodu.getPedidoProdus());
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoPrioridadEmpresaProdu(ArrayList<Classe> classes,TipoPrioridadEmpresaProduReturnGeneral tipoprioridadempresaproduReturnGeneral,TipoPrioridadEmpresaProduBean tipoprioridadempresaproduBean,Boolean conDefault) throws Exception {
		
			this.tipoprioridadempresaproduBean.setOrdenProdus(tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu().getOrdenProdus());
			this.tipoprioridadempresaproduBean.setPedidoProdus(tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu().getPedidoProdus());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(OrdenProdu.class)) {
					tipoprioridadempresaprodu.setOrdenProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduBeanSwingJInternalFrame.ordenproduLogic.getOrdenProdus());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoProdu.class)) {
					tipoprioridadempresaprodu.setPedidoProdus(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoprioridadempresaprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu = new TipoPrioridadEmpresaProduDetalleFormJInternalFrame(jDesktopPane,this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones(),this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setVisible(false);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.tipoprioridadempresaproduLogic=this.tipoprioridadempresaproduLogic;
		
		this.cargarCombosFrameForeignKeyTipoPrioridadEmpresaProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPrioridadEmpresaProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPrioridadEmpresaProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoPrioridadEmpresaProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoPrioridadEmpresaProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPrioridadEmpresaProdu"));
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonModificarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarTipoPrioridadEmpresaProdu"));

		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonModificarToolBarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPrioridadEmpresaProdu"));
					
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemModificarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPrioridadEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonActualizarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoPrioridadEmpresaProdu"));
		
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonActualizarToolBarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPrioridadEmpresaProdu"));
						
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemActualizarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPrioridadEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonEliminarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarTipoPrioridadEmpresaProdu"));
		
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonEliminarToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPrioridadEmpresaProdu"));
								
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemEliminarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPrioridadEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonCancelarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarTipoPrioridadEmpresaProdu"));
		
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonCancelarToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPrioridadEmpresaProdu"));
					
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemCancelarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPrioridadEmpresaProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemDetalleCerrarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPrioridadEmpresaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrioridadEmpresaProdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrioridadEmpresaProdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPrioridadEmpresaProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonidTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPrioridadEmpresaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonid_empresaTipoPrioridadEmpresaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrioridadEmpresaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrioridadEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonnombreTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPrioridadEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtondescripcionTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoPrioridadEmpresaProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPrioridadEmpresaProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoPrioridadEmpresaProdu"));
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPrioridadEmpresaProdu"));
		}
		
		this.jTableDatosTipoPrioridadEmpresaProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoPrioridadEmpresaProdu"));
		
		this.jTableDatosTipoPrioridadEmpresaProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoPrioridadEmpresaProdu"));
		
		this.jButtonNuevoTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"NuevoTipoPrioridadEmpresaProdu"));
		
		this.jButtonDuplicarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"DuplicarTipoPrioridadEmpresaProdu"));
		
		this.jButtonCopiarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"CopiarTipoPrioridadEmpresaProdu"));
		
		this.jButtonVerFormTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"VerFormTipoPrioridadEmpresaProdu"));
		
		
		this.jButtonNuevoToolBarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoPrioridadEmpresaProdu"));
			
		this.jButtonDuplicarToolBarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemNuevoTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemDuplicarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoPrioridadEmpresaProdu"));		
		
		
		this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoPrioridadEmpresaProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemNuevoRelacionesTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoPrioridadEmpresaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonModificarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarTipoPrioridadEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonModificarToolBarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPrioridadEmpresaProdu"));
			
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemModificarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPrioridadEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonActualizarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoPrioridadEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonActualizarToolBarTipoPrioridadEmpresaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPrioridadEmpresaProdu"));
				
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemActualizarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPrioridadEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonEliminarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarTipoPrioridadEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonEliminarToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPrioridadEmpresaProdu"));
						
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemEliminarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPrioridadEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonCancelarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarTipoPrioridadEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonCancelarToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPrioridadEmpresaProdu"));
			
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemCancelarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPrioridadEmpresaProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoPrioridadEmpresaProdu"));		
		
		
		this.jButtonCerrarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"CerrarTipoPrioridadEmpresaProdu"));
		
		
		this.jButtonCerrarToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemCerrarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoPrioridadEmpresaProdu"));
			
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jMenuItemDetalleCerrarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPrioridadEmpresaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoPrioridadEmpresaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrioridadEmpresaProdu"));
		}
		
		this.jButtonCopiarToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoPrioridadEmpresaProdu"));
			
		this.jButtonVerFormToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoPrioridadEmpresaProdu"));
		
		this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemCopiarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoPrioridadEmpresaProdu"));		
		
		this.jMenuItemVerFormTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoPrioridadEmpresaProdu"));		
		
		
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPrioridadEmpresaProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPrioridadEmpresaProdu"));		
		
		
		
		this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoPrioridadEmpresaProdu"));
					
		this.jButtonRecargarInformacionToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoPrioridadEmpresaProdu"));
		
		this.jMenuItemRecargarInformacionTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoPrioridadEmpresaProdu"));		
		
		
		
		this.jButtonAnterioresTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"AnterioresTipoPrioridadEmpresaProdu"));
		
		
		this.jButtonAnterioresToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoPrioridadEmpresaProdu"));
		
		this.jMenuItemAnterioresTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoPrioridadEmpresaProdu"));		
		
		
		this.jButtonSiguientesTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"SiguientesTipoPrioridadEmpresaProdu"));
		
		
		this.jButtonSiguientesToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemSiguientesTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemAbrirOrderByTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemDetalleAbrirOrderByTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoPrioridadEmpresaProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoPrioridadEmpresaProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoPrioridadEmpresaProdu"));
			
		this.jMenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoPrioridadEmpresaProdu"));

		this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoPrioridadEmpresaProdu"));
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPrioridadEmpresaProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoPrioridadEmpresaProdu"));
			
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoPrioridadEmpresaProdu"));
					
		this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoPrioridadEmpresaProdu"));
			
		this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoPrioridadEmpresaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonidTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPrioridadEmpresaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonid_empresaTipoPrioridadEmpresaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrioridadEmpresaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrioridadEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonnombreTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPrioridadEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtondescripcionTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoPrioridadEmpresaProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu!=null) {
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrioridadEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrioridadEmpresaProdu"));
				this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrioridadEmpresaProdu"));				
			//this.jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrioridadEmpresaProdu"));
			//this.jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoPrioridadEmpresaProdu!=null) {
				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPrioridadEmpresaProdu"));
				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPrioridadEmpresaProdu"));
				this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPrioridadEmpresaProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoPrioridadEmpresaProdu"));
			
			this.jButtonAbrirOrderByToolBarTipoPrioridadEmpresaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoPrioridadEmpresaProdu"));			
			
			if(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu!=null) {
				this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPrioridadEmpresaProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPrioridadEmpresaProdu"));
		
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
            		closingInternalFrameTipoPrioridadEmpresaProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoPrioridadEmpresaProdu = (JInternalFrameBase)event.getSource();
	            	
	            TipoPrioridadEmpresaProduBeanSwingJInternalFrame jInternalFrameParent=(TipoPrioridadEmpresaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoPrioridadEmpresaProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoPrioridadEmpresaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoPrioridadEmpresaProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoPrioridadEmpresaProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonNuevoTipoPrioridadEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPrioridadEmpresaProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonModificarTipoPrioridadEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoPrioridadEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonActualizarTipoPrioridadEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoPrioridadEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonEliminarTipoPrioridadEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoPrioridadEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonCancelarTipoPrioridadEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonCerrarTipoPrioridadEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoPrioridadEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoPrioridadEmpresaProdu";
		inputMap = this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosTipoPrioridadEmpresaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonGuardarCambiosTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoPrioridadEmpresaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoPrioridadEmpresaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoPrioridadEmpresaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonidTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPrioridadEmpresaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonid_empresaTipoPrioridadEmpresaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrioridadEmpresaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrioridadEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtonnombreTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPrioridadEmpresaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jButtondescripcionTipoPrioridadEmpresaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoPrioridadEmpresaProduBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoPrioridadEmpresaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoPrioridadEmpresaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoPrioridadEmpresaProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoPrioridadEmpresaProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
					tipoprioridadempresaproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodus) {
					tipoprioridadempresaproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
						tipoprioridadempresaproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodus) {
						tipoprioridadempresaproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPrioridadEmpresaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPrioridadEmpresaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadEmpresaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoPrioridadEmpresaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoPrioridadEmpresaProdu.getSelectedRows();
			
			TipoPrioridadEmpresaProdu tipoprioridadempresaproduLocal=new TipoPrioridadEmpresaProdu();
			
			//this.seleccionarTodosTipoPrioridadEmpresaProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprioridadempresaproduLocal =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoprioridadempresaproduLocal =(TipoPrioridadEmpresaProdu) this.tipoprioridadempresaprodus.toArray()[this.jTableDatosTipoPrioridadEmpresaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoprioridadempresaproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
						tipoprioridadempresaproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodus) {
						tipoprioridadempresaproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPrioridadEmpresaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPrioridadEmpresaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadEmpresaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoPrioridadEmpresaProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoPrioridadEmpresaProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoPrioridadEmpresaProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
				
						if(sTipoSeleccionar.equals(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprioridadempresaproduAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoprioridadempresaproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodus) {
					
						if(sTipoSeleccionar.equals(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprioridadempresaproduAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoprioridadempresaproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoPrioridadEmpresaProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoPrioridadEmpresaProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoPrioridadEmpresaProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoPrioridadEmpresaProdu(conSplash);
				
					this.generarReporteTipoPrioridadEmpresaProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoPrioridadEmpresaProdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPrioridadEmpresaProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPrioridadEmpresaProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPrioridadEmpresaProdu();
				
				this.exportarTipoPrioridadEmpresaProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoPrioridadEmpresaProdus();
				//this.importarTipoPrioridadEmpresaProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPrioridadEmpresaProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoPrioridadEmpresaProdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Prioridad Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoPrioridadEmpresaProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoPrioridadEmpresaProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoPrioridadEmpresaProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Prioridad Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoPrioridadEmpresaProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoPrioridadEmpresaProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoPrioridadEmpresaProdu(conSplash);
					
						//this.actualizarParametrosGeneralTipoPrioridadEmpresaProdu();
						
						this.generarReporteProcesoAccionTipoPrioridadEmpresaProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Prioridad EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Prioridad Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoPrioridadEmpresaProdu();
				
						this.actualizarParametrosGeneralTipoPrioridadEmpresaProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoprioridadempresaproduReturnGeneral=tipoprioridadempresaproduLogic.procesarAccionTipoPrioridadEmpresaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus(),this.tipoprioridadempresaproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoPrioridadEmpresaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoPrioridadEmpresaProdu();
					
					TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoPrioridadEmpresaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoPrioridadEmpresaProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoPrioridadEmpresaProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoPrioridadEmpresaProdu();
			
			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();		
			TipoPrioridadEmpresaProdu tipoprioridadempresaprodu=new TipoPrioridadEmpresaProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu.getSelectedItem();
			
			
			
			
			tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoprioridadempresaprodusSeleccionados.size()==1) {
				for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusSeleccionados) {
					tipoprioridadempresaprodu=tipoprioridadempresaproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Orden Produccion")) {
					jButtonOrdenProduActionPerformed(null,rowIndex,true,false,tipoprioridadempresaprodu);
				}
				else if(this.sTipoRelacion.equals("Pedido Produccion")) {
					jButtonPedidoProduActionPerformed(null,rowIndex,true,false,tipoprioridadempresaprodu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoPrioridadEmpresaProdu();
			
      		//this.finishProcessTipoPrioridadEmpresaProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoPrioridadEmpresaProduReturnGeneral() throws Exception {
		if(this.tipoprioridadempresaproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoprioridadempresaproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoprioridadempresaproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoprioridadempresaproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoprioridadempresaproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoprioridadempresaproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
		}
		
		if(this.tipoprioridadempresaproduReturnGeneral.getConRetornoLista() || this.tipoprioridadempresaproduReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoprioridadempresaproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprioridadempresaproduLogic.setTipoPrioridadEmpresaProdus(this.tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoprioridadempresaproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprioridadempresaproduLogic.setTipoPrioridadEmpresaProdu(this.tipoprioridadempresaproduReturnGeneral.getTipoPrioridadEmpresaProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoPrioridadEmpresaProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoPrioridadEmpresaProdu() throws Exception {
		
		
	}
	
	public ArrayList<TipoPrioridadEmpresaProdu> getTipoPrioridadEmpresaProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoPrioridadEmpresaProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus()) {
					if(tipoprioridadempresaproduAux.getIsSelected()) {
						tipoprioridadempresaprodusSeleccionados.add(tipoprioridadempresaproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:this.tipoprioridadempresaprodus) {
					if(tipoprioridadempresaproduAux.getIsSelected()) {
						tipoprioridadempresaprodusSeleccionados.add(tipoprioridadempresaproduAux);				
					}
				}
			}
			
			if(tipoprioridadempresaprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoprioridadempresaprodusSeleccionados.addAll(this.tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoprioridadempresaprodusSeleccionados.addAll(this.tipoprioridadempresaprodus);				
					}
				}
			}
		} else {
			tipoprioridadempresaprodusSeleccionados.add(this.tipoprioridadempresaprodu);
		}
		
		return tipoprioridadempresaprodusSeleccionados;
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
	
	public void generarReporteTipoPrioridadEmpresaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoPrioridadEmpresaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoPrioridadEmpresaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPrioridadEmpresaProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPrioridadEmpresaProdusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoPrioridadEmpresaProdusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Prioridad Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoPrioridadEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();		
		
		tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoPrioridadEmpresaProdus("Todos",tipoprioridadempresaprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoPrioridadEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();		
		
		tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoPrioridadEmpresaProdus("Todos",tipoprioridadempresaprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoPrioridadEmpresaProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();
		
		tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoPrioridadEmpresaProdus("Todos",tipoprioridadempresaprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoPrioridadEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoPrioridadEmpresaProdu();
		
		
		tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoPrioridadEmpresaProdu();
		
		
		//this.generarReporteTipoPrioridadEmpresaProdus("Todos",tipoprioridadempresaprodusSeleccionados ,tipoprioridadempresaproduImplementable,tipoprioridadempresaproduImplementableHome);
	}
	
	public void mostrarImportacionTipoPrioridadEmpresaProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoPrioridadEmpresaProdu();
		
		this.abrirFrameImportacionTipoPrioridadEmpresaProdu();		
		
			
		//this.generarReporteTipoPrioridadEmpresaProdus("Todos",tipoprioridadempresaprodusSeleccionados ,tipoprioridadempresaproduImplementable,tipoprioridadempresaproduImplementableHome);
	}
	
	public void importarTipoPrioridadEmpresaProdus() throws Exception {		
	
	}
	
	public void exportarTipoPrioridadEmpresaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoPrioridadEmpresaProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoPrioridadEmpresaProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoPrioridadEmpresaProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Prioridad Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoPrioridadEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();		
		
		tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadempresaprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoPrioridadEmpresaProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoPrioridadEmpresaProdu(tipoprioridadempresaproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoprioridadempresaproduAux.setsDetalleGeneralEntityReporte(tipoprioridadempresaproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoPrioridadEmpresaProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoPrioridadEmpresaProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrioridadEmpresaProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoprioridadempresaprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprioridadempresaprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprioridadempresaprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprioridadempresaprodu.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprioridadempresaprodu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoPrioridadEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();		
		
		tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadempresaprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoPrioridadEmpresaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoPrioridadEmpresaProdu(row);				
				iRow++;
			}				
			
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoPrioridadEmpresaProdu(tipoprioridadempresaproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoPrioridadEmpresaProdusSeleccionados() throws Exception {
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();		
		
		tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadempresaprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoprioridadempresaprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoprioridadempresaprodu");
			//elementRoot.appendChild(element);
		
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusSeleccionados) {
				element = document.createElement("tipoprioridadempresaprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoPrioridadEmpresaProdu(tipoprioridadempresaproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoPrioridadEmpresaProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprioridadempresaprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprioridadempresaprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprioridadempresaprodu.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprioridadempresaprodu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoPrioridadEmpresaProdu(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoPrioridadEmpresaProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoprioridadempresaprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoPrioridadEmpresaProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoprioridadempresaprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoPrioridadEmpresaProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoprioridadempresaprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoPrioridadEmpresaProduConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoprioridadempresaprodu.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoPrioridadEmpresaProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipoprioridadempresaprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoPrioridadEmpresaProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados=new ArrayList<TipoPrioridadEmpresaProdu>();
		
		tipoprioridadempresaprodusSeleccionados=this.getTipoPrioridadEmpresaProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoPrioridadEmpresaProdu(tipoprioridadempresaprodusSeleccionados);
		
		this.generarReporteTipoPrioridadEmpresaProdus("Todos",tipoprioridadempresaprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoPrioridadEmpresaProdu(ArrayList<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusSeleccionados) {
				tipoprioridadempresaproduAux.setsDetalleGeneralEntityReporte(tipoprioridadempresaproduAux.toString());
			
				if(sTipoSeleccionar.equals(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoprioridadempresaproduAux.setsDescripcionGeneralEntityReporte1(tipoprioridadempresaproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoprioridadempresaproduAux.setsDescripcionGeneralEntityReporte1(tipoprioridadempresaproduAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipoprioridadempresaproduAux.setsDescripcionGeneralEntityReporte1(tipoprioridadempresaproduAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoPrioridadEmpresaProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=true;
				this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=true;
			}
			
			this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaModificarTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadEmpresaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadEmpresaProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoPrioridadEmpresaProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=true;
		} else {
			this.actualizarEstadoPanelsTipoPrioridadEmpresaProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoPrioridadEmpresaProdu=false;
			//this.isVisibilidadCeldaVerFormTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaDuplicarTipoPrioridadEmpresaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			if(!tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=false;												
			}
			
			this.jButtonCerrarTipoPrioridadEmpresaProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadEmpresaProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoprioridadempresaprodu)) {
			this.isVisibilidadCeldaActualizarTipoPrioridadEmpresaProdu=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadEmpresaProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPrioridadEmpresaProdu() {
		this.isVisibilidadCeldaNuevoTipoPrioridadEmpresaProdu=false;
		this.isVisibilidadCeldaGuardarCambiosTipoPrioridadEmpresaProdu=false;
	}
	
	public void actualizarEstadoPanelsTipoPrioridadEmpresaProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrioridadEmpresaProdu!=null) {
				this.jPanelPaginacionTipoPrioridadEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrioridadEmpresaProdu!=null) {
				this.jPanelPaginacionTipoPrioridadEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrioridadEmpresaProdu!=null) {
				this.jPanelPaginacionTipoPrioridadEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrioridadEmpresaProdu!=null) {
				this.jPanelPaginacionTipoPrioridadEmpresaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrioridadEmpresaProdu!=null) {
				this.jPanelPaginacionTipoPrioridadEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrioridadEmpresaProdu!=null) {
				this.jPanelPaginacionTipoPrioridadEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadEmpresaProdu!=null) {
				this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrioridadEmpresaProdu!=null) {
				this.jPanelPaginacionTipoPrioridadEmpresaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu!=null) {
					this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu!=null) {
				this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoPrioridadEmpresaProduParaOrdenProdues() throws Exception {
		Boolean isPaginaPopupOrdenProdu=false;

		try {

			if(this.tipoprioridadempresaproduSessionBean==null) {
				this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduSessionBean==null) {
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduSessionBean.setsPathNavegacionActual(tipoprioridadempresaproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+OrdenProduConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupOrdenProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeOrdenProdu(true);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenProdu(TipoPrioridadEmpresaProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu(true);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.ordenproduSessionBean.setlidTipoPrioridadEmpresaProduActual(this.idTipoPrioridadEmpresaProduActual);

			tipoprioridadempresaproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoPrioridadEmpresaProdu(true);
			tipoprioridadempresaproduSessionBean.setlIdTipoPrioridadEmpresaProduActualForeignKey(this.idTipoPrioridadEmpresaProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoPrioridadEmpresaProduParaPedidoProdues() throws Exception {
		Boolean isPaginaPopupPedidoProdu=false;

		try {

			if(this.tipoprioridadempresaproduSessionBean==null) {
				this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduSessionBean==null) {
				this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduSessionBean.setsPathNavegacionActual(tipoprioridadempresaproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoProdu=this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoProdu(true);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoProdu(TipoPrioridadEmpresaProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu(true);
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.pedidoproduSessionBean.setlidTipoPrioridadEmpresaProduActual(this.idTipoPrioridadEmpresaProduActual);

			tipoprioridadempresaproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoPrioridadEmpresaProdu(true);
			tipoprioridadempresaproduSessionBean.setlIdTipoPrioridadEmpresaProduActualForeignKey(this.idTipoPrioridadEmpresaProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoPrioridadEmpresaProduSessionBean tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
		
		if(this.tipoprioridadempresaproduSessionBean==null) {
			this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
		}
		
		this.tipoprioridadempresaproduSessionBean.setsUltimaBusquedaTipoPrioridadEmpresaProdu(this.getsAccionBusqueda());
		this.tipoprioridadempresaproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoprioridadempresaproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoprioridadempresaproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoPrioridadEmpresaProduSessionBean tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
		
		if(this.tipoprioridadempresaproduSessionBean==null) {
			this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
		}
		
		if(this.tipoprioridadempresaproduSessionBean.getsUltimaBusquedaTipoPrioridadEmpresaProdu()!=null&&!this.tipoprioridadempresaproduSessionBean.getsUltimaBusquedaTipoPrioridadEmpresaProdu().equals("")) {
			this.setsAccionBusqueda(tipoprioridadempresaproduSessionBean.getsUltimaBusquedaTipoPrioridadEmpresaProdu());
			this.setiNumeroPaginacion(tipoprioridadempresaproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoprioridadempresaproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoprioridadempresaproduSessionBean.getid_empresa());
				tipoprioridadempresaproduSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoprioridadempresaproduSessionBean.setsUltimaBusquedaTipoPrioridadEmpresaProdu("");
		this.tipoprioridadempresaproduSessionBean.setiNumeroPaginacion(TipoPrioridadEmpresaProduConstantesFunciones.INUMEROPAGINACION);
		this.tipoprioridadempresaproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoPrioridadEmpresaProdu() {
		this.updateBorderResaltarBusquedasFormularioTipoPrioridadEmpresaProdu();
		this.updateVisibilidadBusquedasFormularioTipoPrioridadEmpresaProdu();
		this.updateHabilitarBusquedasFormularioTipoPrioridadEmpresaProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoPrioridadEmpresaProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoPrioridadEmpresaProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoPrioridadEmpresaProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoPrioridadEmpresaProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoPrioridadEmpresaProdu() throws Exception {

		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoPrioridadEmpresaProdu();
		this.updateVisibilidadResaltarControlesFormularioTipoPrioridadEmpresaProdu();
		this.updateHabilitarResaltarControlesFormularioTipoPrioridadEmpresaProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoPrioridadEmpresaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoprioridadempresaproduConstantesFunciones.resaltaridTipoPrioridadEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.setBorder(this.tipoprioridadempresaproduConstantesFunciones.resaltaridTipoPrioridadEmpresaProdu);}
		if(this.tipoprioridadempresaproduConstantesFunciones.resaltarid_empresaTipoPrioridadEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.setBorder(this.tipoprioridadempresaproduConstantesFunciones.resaltarid_empresaTipoPrioridadEmpresaProdu);}
		if(this.tipoprioridadempresaproduConstantesFunciones.resaltarnombreTipoPrioridadEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreanombreTipoPrioridadEmpresaProdu.setBorder(this.tipoprioridadempresaproduConstantesFunciones.resaltarnombreTipoPrioridadEmpresaProdu);}
		if(this.tipoprioridadempresaproduConstantesFunciones.resaltardescripcionTipoPrioridadEmpresaProdu!=null && this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreadescripcionTipoPrioridadEmpresaProdu.setBorder(this.tipoprioridadempresaproduConstantesFunciones.resaltardescripcionTipoPrioridadEmpresaProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoPrioridadEmpresaProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
	
		//this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.setVisible(this.tipoprioridadempresaproduConstantesFunciones.mostraridTipoPrioridadEmpresaProdu);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jPanelidTipoPrioridadEmpresaProdu.setVisible(this.tipoprioridadempresaproduConstantesFunciones.mostraridTipoPrioridadEmpresaProdu);
		//this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.setVisible(this.tipoprioridadempresaproduConstantesFunciones.mostrarid_empresaTipoPrioridadEmpresaProdu);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jPanelid_empresaTipoPrioridadEmpresaProdu.setVisible(this.tipoprioridadempresaproduConstantesFunciones.mostrarid_empresaTipoPrioridadEmpresaProdu);
		//this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreanombreTipoPrioridadEmpresaProdu.setVisible(this.tipoprioridadempresaproduConstantesFunciones.mostrarnombreTipoPrioridadEmpresaProdu);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jPanelnombreTipoPrioridadEmpresaProdu.setVisible(this.tipoprioridadempresaproduConstantesFunciones.mostrarnombreTipoPrioridadEmpresaProdu);
		//this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreadescripcionTipoPrioridadEmpresaProdu.setVisible(this.tipoprioridadempresaproduConstantesFunciones.mostrardescripcionTipoPrioridadEmpresaProdu);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jPaneldescripcionTipoPrioridadEmpresaProdu.setVisible(this.tipoprioridadempresaproduConstantesFunciones.mostrardescripcionTipoPrioridadEmpresaProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoPrioridadEmpresaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu!=null) {
	
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jLabelidTipoPrioridadEmpresaProdu.setEnabled(this.tipoprioridadempresaproduConstantesFunciones.activaridTipoPrioridadEmpresaProdu);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jComboBoxid_empresaTipoPrioridadEmpresaProdu.setEnabled(this.tipoprioridadempresaproduConstantesFunciones.activarid_empresaTipoPrioridadEmpresaProdu);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreanombreTipoPrioridadEmpresaProdu.setEnabled(this.tipoprioridadempresaproduConstantesFunciones.activarnombreTipoPrioridadEmpresaProdu);
		this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu.jTextAreadescripcionTipoPrioridadEmpresaProdu.setEnabled(this.tipoprioridadempresaproduConstantesFunciones.activardescripcionTipoPrioridadEmpresaProdu);
		}
	}
	
		
}