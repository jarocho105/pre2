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

import com.bydan.erp.inventario.util.EmbarcadorConstantesFunciones;
import com.bydan.erp.inventario.util.EmbarcadorParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EmbarcadorParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EmbarcadorBean;
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
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

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
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EmbarcadorBeanSwingJInternalFrame extends EmbarcadorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmbarcadorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Embarcador> embarcadorValidator = new ClassValidator<Embarcador>(Embarcador.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Embarcador embarcador;	
	public Embarcador embarcadorAux;
	public Embarcador embarcadorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Embarcador embarcadorTotales;
	public Long idEmbarcadorActual;
	public Long iIdNuevoEmbarcador=0L;
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

	public String sFinalQueryComboPuerto="";

	public List<Puerto> puertosForeignKey;

	public List<Puerto> getpuertosForeignKey() {
		return puertosForeignKey;
	}

	public void setpuertosForeignKey(List<Puerto> puertosForeignKey) {
		this.puertosForeignKey = puertosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Puerto puertoForeignKey;

	public Puerto getpuertoForeignKey() {
		return puertoForeignKey;
	}

	public void setpuertoForeignKey(Puerto puertoForeignKey) {
		this.puertoForeignKey = puertoForeignKey;
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

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
	}
	
	

	public Boolean isTienePermisosPedidoCompraImpor=false;

	public Boolean getIsTienePermisosPedidoCompraImpor() {
		return isTienePermisosPedidoCompraImpor;
	}

	public void setIsTienePermisosPedidoCompraImpor(Boolean isTienePermisosPedidoCompraImpor) {
		this.isTienePermisosPedidoCompraImpor= isTienePermisosPedidoCompraImpor;
	}


	public Boolean isTienePermisosParametroCompra=false;

	public Boolean getIsTienePermisosParametroCompra() {
		return isTienePermisosParametroCompra;
	}

	public void setIsTienePermisosParametroCompra(Boolean isTienePermisosParametroCompra) {
		this.isTienePermisosParametroCompra= isTienePermisosParametroCompra;
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
	
	public Boolean isPermisoTodoEmbarcador;
	public Boolean isPermisoNuevoEmbarcador;
	public Boolean isPermisoActualizarEmbarcador;
	public Boolean isPermisoActualizarOriginalEmbarcador;
	public Boolean isPermisoEliminarEmbarcador;
	public Boolean isPermisoGuardarCambiosEmbarcador;
	public Boolean isPermisoConsultaEmbarcador;
	public Boolean isPermisoBusquedaEmbarcador;
	public Boolean isPermisoReporteEmbarcador;
	public Boolean isPermisoPaginacionMedioEmbarcador;
	public Boolean isPermisoPaginacionAltoEmbarcador;
	public Boolean isPermisoPaginacionTodoEmbarcador;
	public Boolean isPermisoCopiarEmbarcador;
	public Boolean isPermisoVerFormEmbarcador;
	public Boolean isPermisoDuplicarEmbarcador;
	public Boolean isPermisoOrdenEmbarcador;
	
	
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
	
	public EmbarcadorParameterReturnGeneral embarcadorReturnGeneral;
	public EmbarcadorParameterReturnGeneral embarcadorParameterGeneral;
	
	

	public PedidoCompraImporLogic pedidocompraimporLogic=null;

	public PedidoCompraImporLogic getPedidoCompraImporLogic() {
		return pedidocompraimporLogic;
	}

	public void setPedidoCompraImporLogic(PedidoCompraImporLogic pedidocompraimporLogic) {
		this.pedidocompraimporLogic = pedidocompraimporLogic;
	}


	public ParametroCompraLogic parametrocompraLogic=null;

	public ParametroCompraLogic getParametroCompraLogic() {
		return parametrocompraLogic;
	}

	public void setParametroCompraLogic(ParametroCompraLogic parametrocompraLogic) {
		this.parametrocompraLogic = parametrocompraLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmbarcador=false;
	public Boolean esParaAccionDesdeFormularioEmbarcador=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmbarcadorSessionBeanAdditional embarcadorSessionBeanAdditional=null;
	
	public EmbarcadorSessionBeanAdditional getEmbarcadorSessionBeanAdditional() {
		return this.embarcadorSessionBeanAdditional;
	}
	
	public void setEmbarcadorSessionBeanAdditional(EmbarcadorSessionBeanAdditional embarcadorSessionBeanAdditional) {
		try {
			this.embarcadorSessionBeanAdditional=embarcadorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmbarcadorBeanSwingJInternalFrameAdditional embarcadorBeanSwingJInternalFrameAdditional=null;
	//public class EmbarcadorBeanSwingJInternalFrame
	
	public EmbarcadorBeanSwingJInternalFrameAdditional getEmbarcadorBeanSwingJInternalFrameAdditional() {
		return this.embarcadorBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmbarcadorBeanSwingJInternalFrameAdditional(EmbarcadorBeanSwingJInternalFrameAdditional embarcadorBeanSwingJInternalFrameAdditional) {
		try {
			this.embarcadorBeanSwingJInternalFrameAdditional=embarcadorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmbarcadorLogic embarcadorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Embarcador embarcadorBean;
	public EmbarcadorConstantesFunciones embarcadorConstantesFunciones;
	//public EmbarcadorParameterReturnGeneral embarcadorReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoViaTransporteLogic tipoviatransporteLogic;
	public PuertoLogic puertoLogic;
	public EmpleadoLogic empleadoLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<Embarcador> embarcadors;	
	//public List<Embarcador> embarcadorsEliminados;
	//public List<Embarcador> embarcadorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmbarcador=false;
	public Boolean isVisibilidadCeldaDuplicarEmbarcador=true;
	public Boolean isVisibilidadCeldaCopiarEmbarcador=true;
	public Boolean isVisibilidadCeldaVerFormEmbarcador=true;
	public Boolean isVisibilidadCeldaOrdenEmbarcador=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmbarcador=false;
	public Boolean isVisibilidadCeldaModificarEmbarcador=false;
	public Boolean isVisibilidadCeldaActualizarEmbarcador=false;
	public Boolean isVisibilidadCeldaEliminarEmbarcador=false;
	public Boolean isVisibilidadCeldaCancelarEmbarcador=false;
	public Boolean isVisibilidadCeldaGuardarEmbarcador=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmbarcador=false;	
	
	
	public Boolean isVisibilidadBusquedaPorContacto=false;
	public Boolean isVisibilidadBusquedaPorEMail=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorRuc=false;
	public Boolean isVisibilidadBusquedaPorTelefono=false;
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdPuerto=false;
	public Boolean isVisibilidadFK_IdTipoViaTransporte=false;
	
	public Long getiIdNuevoEmbarcador() {
		return this.iIdNuevoEmbarcador;
	}

	public void setiIdNuevoEmbarcador(Long iIdNuevoEmbarcador) {
		this.iIdNuevoEmbarcador = iIdNuevoEmbarcador;
	}
	
	public Long getidEmbarcadorActual() {
		return this.idEmbarcadorActual;
	}

	public void setidEmbarcadorActual(Long idEmbarcadorActual) {
		this.idEmbarcadorActual = idEmbarcadorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Embarcador getembarcador() {
		return this.embarcador;
	}

	public void setembarcador(Embarcador embarcador) {
		this.embarcador = embarcador;
	}
	
	public Embarcador getembarcadorAux() {
		return this.embarcadorAux;
	}

	public void setembarcadorAux(Embarcador embarcadorAux) {
		this.embarcadorAux = embarcadorAux;
	}				
	
	public Embarcador getembarcadorAnterior() {
		return this.embarcadorAnterior;
	}

	public void setembarcadorAnterior(Embarcador embarcadorAnterior) {
		this.embarcadorAnterior = embarcadorAnterior;
	}	
	
	public Embarcador getembarcadorTotales() {
		return this.embarcadorTotales;
	}

	public void setembarcadorTotales(Embarcador embarcadorTotales) {
		this.embarcadorTotales = embarcadorTotales;
	}	
	
	public Embarcador getembarcadorBean() {
		return this.embarcadorBean;
	}

	public void setembarcadorBean(Embarcador embarcadorBean) {
		this.embarcadorBean = embarcadorBean;
	}	
	
	public EmbarcadorParameterReturnGeneral getembarcadorReturnGeneral() {
		return this.embarcadorReturnGeneral;
	}

	public void setembarcadorReturnGeneral(EmbarcadorParameterReturnGeneral embarcadorReturnGeneral) {
		this.embarcadorReturnGeneral = embarcadorReturnGeneral;
	}	
	
	
	public String contactoBusquedaPorContacto="";

	public String getcontactoBusquedaPorContacto() {
		return this.contactoBusquedaPorContacto;
	}

	public void setcontactoBusquedaPorContacto(String contactoBusquedaPorContacto) {
		this.contactoBusquedaPorContacto = contactoBusquedaPorContacto;
	}

	public String e_mailBusquedaPorEMail="";

	public String gete_mailBusquedaPorEMail() {
		return this.e_mailBusquedaPorEMail;
	}

	public void sete_mailBusquedaPorEMail(String e_mailBusquedaPorEMail) {
		this.e_mailBusquedaPorEMail = e_mailBusquedaPorEMail;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public String rucBusquedaPorRuc="";

	public String getrucBusquedaPorRuc() {
		return this.rucBusquedaPorRuc;
	}

	public void setrucBusquedaPorRuc(String rucBusquedaPorRuc) {
		this.rucBusquedaPorRuc = rucBusquedaPorRuc;
	}

	public String telefonoBusquedaPorTelefono="";

	public String gettelefonoBusquedaPorTelefono() {
		return this.telefonoBusquedaPorTelefono;
	}

	public void settelefonoBusquedaPorTelefono(String telefonoBusquedaPorTelefono) {
		this.telefonoBusquedaPorTelefono = telefonoBusquedaPorTelefono;
	}

	public Long id_ciudadFK_IdCiudad=null;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
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

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long id_puertoFK_IdPuerto=-1L;

	public Long getid_puertoFK_IdPuerto() {
		return this.id_puertoFK_IdPuerto;
	}

	public void setid_puertoFK_IdPuerto(Long id_puertoFK_IdPuerto) {
		this.id_puertoFK_IdPuerto = id_puertoFK_IdPuerto;
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
	
	
	public EmbarcadorLogic getEmbarcadorLogic()	{		
		return embarcadorLogic;
	}

	public void setEmbarcadorLogic(EmbarcadorLogic embarcadorLogic) {
		this.embarcadorLogic = embarcadorLogic;
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
	
	public Boolean getIsEsNuevoEmbarcador() {
		return isEsNuevoEmbarcador;
	}

	public void setIsEsNuevoEmbarcador(Boolean isEsNuevoEmbarcador) {
		this.isEsNuevoEmbarcador = isEsNuevoEmbarcador;
	}

	public Boolean getEsParaAccionDesdeFormularioEmbarcador() {
		return esParaAccionDesdeFormularioEmbarcador;
	}
	
	public void setEsParaAccionDesdeFormularioEmbarcador(Boolean esParaAccionDesdeFormularioEmbarcador) {
		this.esParaAccionDesdeFormularioEmbarcador = esParaAccionDesdeFormularioEmbarcador;
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

			if(this.embarcadorSessionBean==null) {
				this.embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(embarcadorSessionBean.getlidEmpresaActual());
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

			if(this.embarcadorSessionBean==null) {
				this.embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {
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
					tipoviatransporteLogic.getEntityWithConnection(embarcadorSessionBean.getlidTipoViaTransporteActual());
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

	public void cargarCombosPuertosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.puertosForeignKey=new ArrayList<Puerto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PuertoLogic puertoLogic=new PuertoLogic();

			//puertoLogic.getPuertoDataAccess().setIsForForeingKeyData(true);

			if(this.embarcadorSessionBean==null) {
				this.embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionPuerto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//puertoLogic.getPuertoDataAccess().setIsForForeingKeyData(true);

					puertoLogic.getTodosPuertosWithConnection(sFinalQuery,new Pagination());

					this.puertosForeignKey=puertoLogic.getPuertos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPuerto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					puertoLogic.getEntityWithConnection(embarcadorSessionBean.getlidPuertoActual());
					this.puertosForeignKey.add(puertoLogic.getPuerto());
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

			if(this.embarcadorSessionBean==null) {
				this.embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(embarcadorSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.embarcadorSessionBean==null) {
				this.embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(embarcadorSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Ciudad ciudadNulo = new Ciudad();

			CiudadLogic ciudadLogic=new CiudadLogic();

			//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.embarcadorSessionBean==null) {
				this.embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.ciudadsForeignKey.add(0, ciudadNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(embarcadorSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

					if(this.embarcador!=null) {
						this.embarcador.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmbarcador.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmbarcadorGenerico)throws Exception
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
				jComboBoxid_empresaEmbarcadorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmbarcadorGenerico!=null && jComboBoxid_empresaEmbarcadorGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmbarcadorGenerico.setSelectedIndex(0);
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

					if(this.embarcador!=null) {
						this.embarcador.setTipoViaTransporte(tipoviatransporteTemp);
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.setSelectedItem(tipoviatransporteTemp);
					}
				} else {
					//jComboBoxid_tipo_via_transporteEmbarcador.setSelectedItem(tipoviatransporteTemp);
					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.setSelectedIndex(0);
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
	public void setActualTipoViaTransporteForeignKeyGenerico(Long idTipoViaTransporteSeleccionado,JComboBox jComboBoxid_tipo_via_transporteEmbarcadorGenerico)throws Exception
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
				jComboBoxid_tipo_via_transporteEmbarcadorGenerico.setSelectedItem(tipoviatransporteTemp);
			} else {
				if(jComboBoxid_tipo_via_transporteEmbarcadorGenerico!=null && jComboBoxid_tipo_via_transporteEmbarcadorGenerico.getItemCount()>0) {
					jComboBoxid_tipo_via_transporteEmbarcadorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPuertoForeignKey(Long idPuertoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Puerto  puertoTemp=null;

			for(Puerto puertoAux:puertosForeignKey) {
				if(puertoAux.getId()!=null && puertoAux.getId().equals(idPuertoSeleccionado)) {
					puertoTemp=puertoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(puertoTemp!=null) {

					if(this.embarcador!=null) {
						this.embarcador.setPuerto(puertoTemp);
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.setSelectedItem(puertoTemp);
					}
				} else {
					//jComboBoxid_puertoEmbarcador.setSelectedItem(puertoTemp);
					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPuerto") || sFormularioTipoBusqueda.equals("Todos")){
					if(puertoTemp!=null && jComboBoxid_puertoFK_IdPuertoEmbarcador!=null) {
						jComboBoxid_puertoFK_IdPuertoEmbarcador.setSelectedItem(puertoTemp);
					} else {
						if(jComboBoxid_puertoFK_IdPuertoEmbarcador!=null) {
							//jComboBoxid_puertoFK_IdPuertoEmbarcador.setSelectedItem(puertoTemp);
							if(jComboBoxid_puertoFK_IdPuertoEmbarcador.getItemCount()>0) {
								jComboBoxid_puertoFK_IdPuertoEmbarcador.setSelectedIndex(0);
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

	public String getActualPuertoForeignKeyDescripcion(Long idPuertoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Puerto  puertoTemp=null;

			for(Puerto puertoAux:puertosForeignKey) {
				if(puertoAux.getId()!=null && puertoAux.getId().equals(idPuertoSeleccionado)) {
					puertoTemp=puertoAux;
					break;
				}
			}


			sDescripcion=PuertoConstantesFunciones.getPuertoDescripcion(puertoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPuertoForeignKeyGenerico(Long idPuertoSeleccionado,JComboBox jComboBoxid_puertoEmbarcadorGenerico)throws Exception
	{
		try
		{
			Puerto  puertoTemp=null;

			for(Puerto puertoAux:puertosForeignKey) {
				if(puertoAux.getId()!=null && puertoAux.getId().equals(idPuertoSeleccionado)) {
					puertoTemp=puertoAux;
					break;
				}
			}

			if(puertoTemp!=null) {
				jComboBoxid_puertoEmbarcadorGenerico.setSelectedItem(puertoTemp);
			} else {
				if(jComboBoxid_puertoEmbarcadorGenerico!=null && jComboBoxid_puertoEmbarcadorGenerico.getItemCount()>0) {
					jComboBoxid_puertoEmbarcadorGenerico.setSelectedIndex(0);
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

					if(this.embarcador!=null) {
						this.embarcador.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmbarcador.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmbarcador!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmbarcador!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmbarcadorGenerico)throws Exception
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
				jComboBoxid_empleadoEmbarcadorGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmbarcadorGenerico!=null && jComboBoxid_empleadoEmbarcadorGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmbarcadorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.embarcador!=null) {
						this.embarcador.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisEmbarcador.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisEmbarcadorGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisEmbarcadorGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisEmbarcadorGenerico!=null && jComboBoxid_paisEmbarcadorGenerico.getItemCount()>0) {
					jComboBoxid_paisEmbarcadorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.embarcador!=null) {
						this.embarcador.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadEmbarcador.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadEmbarcadorGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxid_ciudadEmbarcadorGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadEmbarcadorGenerico!=null && jComboBoxid_ciudadEmbarcadorGenerico.getItemCount()>0) {
					jComboBoxid_ciudadEmbarcadorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Embarcador embarcador,JComboBox jComboBoxid_empresaEmbarcadorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmbarcadorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmbarcadorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				embarcador.setid_empresa(empresaAux.getId());
				embarcador.setempresa_descripcion(EmbarcadorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				embarcador.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoViaTransporteForeignKey(Embarcador embarcador,JComboBox jComboBoxid_tipo_via_transporteEmbarcadorGenerico)throws Exception
	{
		try
		{
			TipoViaTransporte  tipoviatransporteAux=new TipoViaTransporte();

			if(jComboBoxid_tipo_via_transporteEmbarcadorGenerico==null) {
				tipoviatransporteAux=(TipoViaTransporte)this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.getSelectedItem();
			} else {
				tipoviatransporteAux=(TipoViaTransporte)jComboBoxid_tipo_via_transporteEmbarcadorGenerico.getSelectedItem();
			}

			if(tipoviatransporteAux!=null && tipoviatransporteAux.getId()!=null) {
				embarcador.setid_tipo_via_transporte(tipoviatransporteAux.getId());
				embarcador.settipoviatransporte_descripcion(EmbarcadorConstantesFunciones.getTipoViaTransporteDescripcion(tipoviatransporteAux));
				embarcador.setTipoViaTransporte(tipoviatransporteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPuertoForeignKey(Embarcador embarcador,JComboBox jComboBoxid_puertoEmbarcadorGenerico)throws Exception
	{
		try
		{
			Puerto  puertoAux=new Puerto();

			if(jComboBoxid_puertoEmbarcadorGenerico==null) {
				puertoAux=(Puerto)this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.getSelectedItem();
			} else {
				puertoAux=(Puerto)jComboBoxid_puertoEmbarcadorGenerico.getSelectedItem();
			}

			if(puertoAux!=null && puertoAux.getId()!=null) {
				embarcador.setid_puerto(puertoAux.getId());
				embarcador.setpuerto_descripcion(EmbarcadorConstantesFunciones.getPuertoDescripcion(puertoAux));
				embarcador.setPuerto(puertoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(Embarcador embarcador,JComboBox jComboBoxid_empleadoEmbarcadorGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmbarcadorGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmbarcadorGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				embarcador.setid_empleado(empleadoAux.getId());
				embarcador.setempleado_descripcion(EmbarcadorConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				embarcador.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(Embarcador embarcador,JComboBox jComboBoxid_paisEmbarcadorGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisEmbarcadorGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisEmbarcadorGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				embarcador.setid_pais(paisAux.getId());
				embarcador.setpais_descripcion(EmbarcadorConstantesFunciones.getPaisDescripcion(paisAux));
				embarcador.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(Embarcador embarcador,JComboBox jComboBoxid_ciudadEmbarcadorGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadEmbarcadorGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadEmbarcadorGenerico.getSelectedItem();
			}

			if(ciudadAux!=null) {
				embarcador.setid_ciudad(ciudadAux.getId());
				embarcador.setciudad_descripcion(EmbarcadorConstantesFunciones.getCiudadDescripcion(ciudadAux));
				embarcador.setCiudad(ciudadAux);			}
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

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
					}

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.removeAllItems();

							for(TipoViaTransporte tipoviatransporte:this.tipoviatransportesForeignKey) {
								this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.addItem(tipoviatransporte);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
					}

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePuertosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPuerto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.removeAllItems();

							for(Puerto puerto:this.puertosForeignKey) {
								this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.addItem(puerto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
					}

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPuerto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_puertoFK_IdPuertoEmbarcador.removeAllItems();

							for(Puerto puerto:this.puertosForeignKey) {
								this.jComboBoxid_puertoFK_IdPuertoEmbarcador.addItem(puerto);
							}
						}

						if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
					}

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.addItem(empleado);
							}
						}

						if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
					}

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmbarcador!=null) { 
					}

					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.setSelectedItem(tipoviatransporte);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePuertoForeignKey(Puerto puerto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.setSelectedItem(puerto);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_puertoFK_IdPuertoEmbarcador.setSelectedItem(puerto);
						} else {
							this.jComboBoxid_puertoFK_IdPuertoEmbarcador.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmbarcador!=null) {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesEmbarcador() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmbarcadorConstantesFunciones.refrescarForeignKeysDescripcionesEmbarcador(this.embarcadorLogic.getEmbarcadors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmbarcadorConstantesFunciones.refrescarForeignKeysDescripcionesEmbarcador(this.embarcadors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoViaTransporte.class));
		classes.add(new Classe(Puerto.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//embarcadorLogic.setEmbarcadors(this.embarcadors);
			embarcadorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmbarcadorParameterReturnGeneral getEmbarcadorParameterGeneral() {
		return this.embarcadorParameterGeneral;
	}
	
	public void setEmbarcadorParameterGeneral(EmbarcadorParameterReturnGeneral embarcadorParameterGeneral) {
		this.embarcadorParameterGeneral = embarcadorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmbarcador() {
		return isPermisoTodoEmbarcador;
	}

	public void setIsPermisoTodoEmbarcador(Boolean isPermisoTodoEmbarcador) {
		this.isPermisoTodoEmbarcador = isPermisoTodoEmbarcador;
	}

	public Boolean getIsPermisoNuevoEmbarcador() {
		return isPermisoNuevoEmbarcador;
	}

	public void setIsPermisoNuevoEmbarcador(Boolean isPermisoNuevoEmbarcador) {
		this.isPermisoNuevoEmbarcador = isPermisoNuevoEmbarcador;
	}

	public Boolean getIsPermisoActualizarEmbarcador() {
		return isPermisoActualizarEmbarcador;
	}

	public void setIsPermisoActualizarEmbarcador(Boolean isPermisoActualizarEmbarcador) {
		this.isPermisoActualizarEmbarcador = isPermisoActualizarEmbarcador;
	}

	public Boolean getIsPermisoEliminarEmbarcador() {
		return isPermisoEliminarEmbarcador;
	}

	public void setIsPermisoEliminarEmbarcador(Boolean isPermisoEliminarEmbarcador) {
		this.isPermisoEliminarEmbarcador = isPermisoEliminarEmbarcador;
	}

	public Boolean getIsPermisoGuardarCambiosEmbarcador() {
		return isPermisoGuardarCambiosEmbarcador;
	}

	public void setIsPermisoGuardarCambiosEmbarcador(Boolean isPermisoGuardarCambiosEmbarcador) {
		this.isPermisoGuardarCambiosEmbarcador = isPermisoGuardarCambiosEmbarcador;
	}
	
	public Boolean getIsPermisoConsultaEmbarcador() {
		return isPermisoConsultaEmbarcador;
	}

	public void setIsPermisoConsultaEmbarcador(Boolean isPermisoConsultaEmbarcador) {
		this.isPermisoConsultaEmbarcador = isPermisoConsultaEmbarcador;
	}

	public Boolean getIsPermisoBusquedaEmbarcador() {
		return isPermisoBusquedaEmbarcador;
	}

	public void setIsPermisoBusquedaEmbarcador(Boolean isPermisoBusquedaEmbarcador) {
		this.isPermisoBusquedaEmbarcador = isPermisoBusquedaEmbarcador;
	}

	public Boolean getIsPermisoReporteEmbarcador() {
		return isPermisoReporteEmbarcador;
	}

	public void setIsPermisoReporteEmbarcador(Boolean isPermisoReporteEmbarcador) {
		this.isPermisoReporteEmbarcador = isPermisoReporteEmbarcador;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmbarcador() {
		return isPermisoPaginacionMedioEmbarcador;
	}

	public void setIsPermisoPaginacionMedioEmbarcador(Boolean isPermisoPaginacionMedioEmbarcador) {
		this.isPermisoPaginacionMedioEmbarcador = isPermisoPaginacionMedioEmbarcador;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmbarcador() {
		return isPermisoPaginacionTodoEmbarcador;
	}

	public void setIsPermisoPaginacionTodoEmbarcador(Boolean isPermisoPaginacionTodoEmbarcador) {
		this.isPermisoPaginacionTodoEmbarcador = isPermisoPaginacionTodoEmbarcador;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmbarcador() {
		return isPermisoPaginacionAltoEmbarcador;
	}

	public void setIsPermisoPaginacionAltoEmbarcador(Boolean isPermisoPaginacionAltoEmbarcador) {
		this.isPermisoPaginacionAltoEmbarcador = isPermisoPaginacionAltoEmbarcador;
	}
	
	public Boolean getIsPermisoCopiarEmbarcador() {
		return isPermisoCopiarEmbarcador;
	}

	public void setIsPermisoCopiarEmbarcador(Boolean isPermisoCopiarEmbarcador) {
		this.isPermisoCopiarEmbarcador = isPermisoCopiarEmbarcador;
	}
	
	public Boolean getIsPermisoVerFormEmbarcador() {
		return isPermisoVerFormEmbarcador;
	}

	public void setIsPermisoVerFormEmbarcador(Boolean isPermisoVerFormEmbarcador) {
		this.isPermisoVerFormEmbarcador = isPermisoVerFormEmbarcador;
	}
	
	public Boolean getIsPermisoDuplicarEmbarcador() {
		return isPermisoDuplicarEmbarcador;
	}

	public void setIsPermisoDuplicarEmbarcador(Boolean isPermisoDuplicarEmbarcador) {
		this.isPermisoDuplicarEmbarcador = isPermisoDuplicarEmbarcador;
	}
	
	public Boolean getIsPermisoOrdenEmbarcador() {
		return isPermisoOrdenEmbarcador;
	}

	public void setIsPermisoOrdenEmbarcador(Boolean isPermisoOrdenEmbarcador) {
		this.isPermisoOrdenEmbarcador = isPermisoOrdenEmbarcador;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmbarcador() {
		return isVisibilidadCeldaNuevoEmbarcador;
	}

	public void setIsVisibilidadCeldaNuevoEmbarcador(Boolean isVisibilidadCeldaNuevoEmbarcador) {
		this.isVisibilidadCeldaNuevoEmbarcador = isVisibilidadCeldaNuevoEmbarcador;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmbarcador() {
		return isVisibilidadCeldaDuplicarEmbarcador;
	}

	public void setIsVisibilidadCeldaDuplicarEmbarcador(Boolean isVisibilidadCeldaDuplicarEmbarcador) {
		this.isVisibilidadCeldaDuplicarEmbarcador = isVisibilidadCeldaDuplicarEmbarcador;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmbarcador() {
		return isVisibilidadCeldaCopiarEmbarcador;
	}

	public void setIsVisibilidadCeldaCopiarEmbarcador(Boolean isVisibilidadCeldaCopiarEmbarcador) {
		this.isVisibilidadCeldaCopiarEmbarcador = isVisibilidadCeldaCopiarEmbarcador;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmbarcador() {
		return isVisibilidadCeldaVerFormEmbarcador;
	}

	public void setIsVisibilidadCeldaVerFormEmbarcador(Boolean isVisibilidadCeldaVerFormEmbarcador) {
		this.isVisibilidadCeldaVerFormEmbarcador = isVisibilidadCeldaVerFormEmbarcador;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmbarcador() {
		return isVisibilidadCeldaOrdenEmbarcador;
	}

	public void setIsVisibilidadCeldaOrdenEmbarcador(Boolean isVisibilidadCeldaOrdenEmbarcador) {
		this.isVisibilidadCeldaOrdenEmbarcador = isVisibilidadCeldaOrdenEmbarcador;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmbarcador() {
		return isVisibilidadCeldaNuevoRelacionesEmbarcador;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmbarcador(Boolean isVisibilidadCeldaNuevoRelacionesEmbarcador) {
		this.isVisibilidadCeldaNuevoRelacionesEmbarcador = isVisibilidadCeldaNuevoRelacionesEmbarcador;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmbarcador() {
		return isVisibilidadCeldaModificarEmbarcador;
	}

	public void setIsVisibilidadCeldaModificarEmbarcador(Boolean isVisibilidadCeldaModificarEmbarcador) {
		this.isVisibilidadCeldaModificarEmbarcador = isVisibilidadCeldaModificarEmbarcador;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmbarcador() {
		return isVisibilidadCeldaActualizarEmbarcador;
	}

	public void setIsVisibilidadCeldaActualizarEmbarcador(Boolean isVisibilidadCeldaActualizarEmbarcador) {
		this.isVisibilidadCeldaActualizarEmbarcador = isVisibilidadCeldaActualizarEmbarcador;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmbarcador() {
		return isVisibilidadCeldaEliminarEmbarcador;
	}

	public void setIsVisibilidadCeldaEliminarEmbarcador(Boolean isVisibilidadCeldaEliminarEmbarcador) {
		this.isVisibilidadCeldaEliminarEmbarcador = isVisibilidadCeldaEliminarEmbarcador;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmbarcador() {
		return isVisibilidadCeldaCancelarEmbarcador;
	}

	public void setIsVisibilidadCeldaCancelarEmbarcador(Boolean isVisibilidadCeldaCancelarEmbarcador) {
		this.isVisibilidadCeldaCancelarEmbarcador = isVisibilidadCeldaCancelarEmbarcador;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmbarcador() {
		return isVisibilidadCeldaGuardarEmbarcador;
	}

	public void setIsVisibilidadCeldaGuardarEmbarcador(Boolean isVisibilidadCeldaGuardarEmbarcador) {
		this.isVisibilidadCeldaGuardarEmbarcador = isVisibilidadCeldaGuardarEmbarcador;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmbarcador() {
		return isVisibilidadCeldaGuardarCambiosEmbarcador;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmbarcador(Boolean isVisibilidadCeldaGuardarCambiosEmbarcador) {
		this.isVisibilidadCeldaGuardarCambiosEmbarcador = isVisibilidadCeldaGuardarCambiosEmbarcador;
	}
		
	public EmbarcadorSessionBean getembarcadorSessionBean() {
		return this.embarcadorSessionBean;
	}
	
	public void setembarcadorSessionBean(EmbarcadorSessionBean embarcadorSessionBean) {
		this.embarcadorSessionBean=embarcadorSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorContacto() {
		return this.isVisibilidadBusquedaPorContacto;
	}

	public void setisVisibilidadBusquedaPorContacto(Boolean isVisibilidadBusquedaPorContacto) {
		this.isVisibilidadBusquedaPorContacto=isVisibilidadBusquedaPorContacto;
	}

	public Boolean getisVisibilidadBusquedaPorEMail() {
		return this.isVisibilidadBusquedaPorEMail;
	}

	public void setisVisibilidadBusquedaPorEMail(Boolean isVisibilidadBusquedaPorEMail) {
		this.isVisibilidadBusquedaPorEMail=isVisibilidadBusquedaPorEMail;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorRuc() {
		return this.isVisibilidadBusquedaPorRuc;
	}

	public void setisVisibilidadBusquedaPorRuc(Boolean isVisibilidadBusquedaPorRuc) {
		this.isVisibilidadBusquedaPorRuc=isVisibilidadBusquedaPorRuc;
	}

	public Boolean getisVisibilidadBusquedaPorTelefono() {
		return this.isVisibilidadBusquedaPorTelefono;
	}

	public void setisVisibilidadBusquedaPorTelefono(Boolean isVisibilidadBusquedaPorTelefono) {
		this.isVisibilidadBusquedaPorTelefono=isVisibilidadBusquedaPorTelefono;
	}

	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
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

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdPuerto() {
		return this.isVisibilidadFK_IdPuerto;
	}

	public void setisVisibilidadFK_IdPuerto(Boolean isVisibilidadFK_IdPuerto) {
		this.isVisibilidadFK_IdPuerto=isVisibilidadFK_IdPuerto;
	}

	public Boolean getisVisibilidadFK_IdTipoViaTransporte() {
		return this.isVisibilidadFK_IdTipoViaTransporte;
	}

	public void setisVisibilidadFK_IdTipoViaTransporte(Boolean isVisibilidadFK_IdTipoViaTransporte) {
		this.isVisibilidadFK_IdTipoViaTransporte=isVisibilidadFK_IdTipoViaTransporte;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmbarcador(Embarcador embarcador)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(embarcador,null);
				this.setActualParaGuardarTipoViaTransporteForeignKey(embarcador,null);
				this.setActualParaGuardarPuertoForeignKey(embarcador,null);
				this.setActualParaGuardarEmpleadoForeignKey(embarcador,null);
				this.setActualParaGuardarPaisForeignKey(embarcador,null);
				this.setActualParaGuardarCiudadForeignKey(embarcador,null);
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
	
	public void bugActualizarReferenciaActual(Embarcador embarcador,Embarcador embarcadorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmbarcador(embarcador);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		embarcadorAux.setId(embarcador.getId());
		embarcadorAux.setVersionRow(embarcador.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmbarcador();
		
			int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = embarcadorValidator.getInvalidValues(this.embarcador);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			embarcadorLogic.setDatosCliente(datosCliente);
			embarcadorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				embarcadorAux=new  Embarcador();
				
				embarcadorAux.setIsNew(true);
				embarcadorAux.setIsChanged(true);
				
				embarcadorAux.setEmbarcadorOriginal(this.embarcador);
				
				embarcadorAux.setId(this.embarcador.getId());	
				embarcadorAux.setVersionRow(this.embarcador.getVersionRow());	
				embarcadorAux.setid_empresa(this.embarcador.getid_empresa());	
				embarcadorAux.setnombre(this.embarcador.getnombre());	
				embarcadorAux.setruc(this.embarcador.getruc());	
				embarcadorAux.setdireccion(this.embarcador.getdireccion());	
				embarcadorAux.settelefono(this.embarcador.gettelefono());	
				embarcadorAux.setcontacto(this.embarcador.getcontacto());	
				embarcadorAux.sete_mail(this.embarcador.gete_mail());	
				embarcadorAux.setfax(this.embarcador.getfax());	
				embarcadorAux.setid_tipo_via_transporte(this.embarcador.getid_tipo_via_transporte());	
				embarcadorAux.setid_puerto(this.embarcador.getid_puerto());	
				embarcadorAux.setid_empleado(this.embarcador.getid_empleado());	
				embarcadorAux.setid_pais(this.embarcador.getid_pais());	
				
				if(this.embarcador.getid_ciudad()!=null && this.embarcador.getid_ciudad()>0L) {
					embarcadorAux.setid_ciudad(this.embarcador.getid_ciudad());
				} else {
					embarcadorAux.setid_ciudad(null);
				}	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.embarcadorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.embarcadorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(embarcadorAux,embarcadorLogic.getEmbarcadors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(embarcadorAux,embarcadors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.embarcadorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.embarcadorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorLogic.saveEmbarcadors();//WithConnection
						//embarcadorLogic.getSetVersionRowEmbarcadors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.embarcador,embarcadorAux);
					
					this.refrescarForeignKeysDescripcionesEmbarcador();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.embarcadorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors().addAll(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras().addAll(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors.addAll(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompras.addAll(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								embarcadorLogic.saveEmbarcadorRelaciones(embarcadorAux,this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors(),this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());//WithConnection
								//embarcadorLogic.getSetVersionRowEmbarcadors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.embarcador,embarcadorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.setPedidoCompraImpors(new ArrayList<PedidoCompraImpor>());
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.setParametroCompras(new ArrayList<ParametroCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors= new ArrayList<PedidoCompraImpor>();
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompras= new ArrayList<ParametroCompra>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();}
							embarcadorAux.setPedidoCompraImpors(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors());

							if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();}
							embarcadorAux.setParametroCompras(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.embarcadorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.embarcadorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(embarcadorAux,embarcadorLogic.getEmbarcadors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(embarcadorAux,embarcadors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.embarcador,embarcadorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				embarcadorAux=new  Embarcador();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.embarcadorSessionBean.getEsGuardarRelacionado() 
					|| (this.embarcadorSessionBean.getEsGuardarRelacionado() && this.embarcador.getId()>=0)) {
						
					embarcadorAux.setIsNew(false);
				}
				
				embarcadorAux.setIsDeleted(false);
			
				embarcadorAux.setId(this.embarcador.getId());	
				embarcadorAux.setVersionRow(this.embarcador.getVersionRow());	
				embarcadorAux.setid_empresa(this.embarcador.getid_empresa());	
				embarcadorAux.setnombre(this.embarcador.getnombre());	
				embarcadorAux.setruc(this.embarcador.getruc());	
				embarcadorAux.setdireccion(this.embarcador.getdireccion());	
				embarcadorAux.settelefono(this.embarcador.gettelefono());	
				embarcadorAux.setcontacto(this.embarcador.getcontacto());	
				embarcadorAux.sete_mail(this.embarcador.gete_mail());	
				embarcadorAux.setfax(this.embarcador.getfax());	
				embarcadorAux.setid_tipo_via_transporte(this.embarcador.getid_tipo_via_transporte());	
				embarcadorAux.setid_puerto(this.embarcador.getid_puerto());	
				embarcadorAux.setid_empleado(this.embarcador.getid_empleado());	
				embarcadorAux.setid_pais(this.embarcador.getid_pais());	
				
				if(this.embarcador.getid_ciudad()!=null && this.embarcador.getid_ciudad()>0L) {
					embarcadorAux.setid_ciudad(this.embarcador.getid_ciudad());
				} else {
					embarcadorAux.setid_ciudad(null);
				}	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(embarcadorAux,embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(embarcadorAux,embarcadors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.embarcadorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.embarcadorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorLogic.saveEmbarcadors();//WithConnection
						//embarcadorLogic.getSetVersionRowEmbarcadors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.embarcador,embarcadorAux);
					
					this.refrescarForeignKeysDescripcionesEmbarcador();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.embarcadorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors().addAll(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras().addAll(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors.addAll(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompras.addAll(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								embarcadorLogic.saveEmbarcadorRelaciones(embarcadorAux,this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors(),this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());//WithConnection
								//embarcadorLogic.getSetVersionRowEmbarcadors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.embarcador,embarcadorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.setPedidoCompraImpors(new ArrayList<PedidoCompraImpor>());
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.setParametroCompras(new ArrayList<ParametroCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors= new ArrayList<PedidoCompraImpor>();
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompras= new ArrayList<ParametroCompra>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();}
							embarcadorAux.setPedidoCompraImpors(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors());

							if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();}
							embarcadorAux.setParametroCompras(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.embarcadorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.embarcadorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(embarcadorAux,embarcadorLogic.getEmbarcadors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(embarcadorAux,embarcadors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.embarcador,embarcadorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				embarcadorAux=new  Embarcador();
				
				embarcadorAux.setIsNew(false);
				embarcadorAux.setIsChanged(false);
				
				embarcadorAux.setIsDeleted(true);
				
				embarcadorAux.setId(this.embarcador.getId());	
				embarcadorAux.setVersionRow(this.embarcador.getVersionRow());	
				embarcadorAux.setid_empresa(this.embarcador.getid_empresa());	
				embarcadorAux.setnombre(this.embarcador.getnombre());	
				embarcadorAux.setruc(this.embarcador.getruc());	
				embarcadorAux.setdireccion(this.embarcador.getdireccion());	
				embarcadorAux.settelefono(this.embarcador.gettelefono());	
				embarcadorAux.setcontacto(this.embarcador.getcontacto());	
				embarcadorAux.sete_mail(this.embarcador.gete_mail());	
				embarcadorAux.setfax(this.embarcador.getfax());	
				embarcadorAux.setid_tipo_via_transporte(this.embarcador.getid_tipo_via_transporte());	
				embarcadorAux.setid_puerto(this.embarcador.getid_puerto());	
				embarcadorAux.setid_empleado(this.embarcador.getid_empleado());	
				embarcadorAux.setid_pais(this.embarcador.getid_pais());	
				
				if(this.embarcador.getid_ciudad()!=null && this.embarcador.getid_ciudad()>0L) {
					embarcadorAux.setid_ciudad(this.embarcador.getid_ciudad());
				} else {
					embarcadorAux.setid_ciudad(null);
				}	
				
				if(this.embarcadorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.embarcadorAux.getId()>=0) {	
						this.embarcadorsEliminados.add(embarcadorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(embarcadorAux,embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(embarcadorAux,embarcadors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.embarcadorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.embarcadorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorLogic.saveEmbarcadors();//WithConnection
						//embarcadorLogic.getSetVersionRowEmbarcadors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.embarcadorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors().addAll(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras().addAll(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors.addAll(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporsEliminados);
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompras.addAll(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jInternalFrameDetalleFormPedidoCompraImpor.liquidacionimpuestoimporBeanSwingJInternalFrame.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								embarcadorLogic.saveEmbarcadorRelaciones(embarcadorAux,this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors(),this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());//WithConnection
								//embarcadorLogic.getSetVersionRowEmbarcadors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.setPedidoCompraImpors(new ArrayList<PedidoCompraImpor>());
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.setParametroCompras(new ArrayList<ParametroCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors= new ArrayList<PedidoCompraImpor>();
							this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompras= new ArrayList<ParametroCompra>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();}
							embarcadorAux.setPedidoCompraImpors(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors());

							if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();}
							embarcadorAux.setParametroCompras(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.embarcadorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.embarcadorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(embarcadorAux,embarcadorLogic.getEmbarcadors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(embarcadorAux,embarcadors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getEmbarcadors().addAll(this.embarcadorsEliminados);
					
					embarcadorLogic.saveEmbarcadors();//WithConnection
					//embarcadorLogic.getSetVersionRowEmbarcadors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmbarcador();
				
				this.embarcadorsEliminados= new ArrayList<Embarcador>();		
			}
			
			if(this.embarcadorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Embarcador GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Embarcador",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.embarcador=embarcadorAux;
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
      		//this.finishProcessEmbarcador();
      	}
		
	}	
	
	public void actualizarRelaciones(Embarcador embarcadorLocal) throws Exception {
		
		if(this.embarcadorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				embarcadorLocal.setPedidoCompraImpors(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors());
				embarcadorLocal.setParametroCompras(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());
			
			} else {
			
				embarcadorLocal.setPedidoCompraImpors(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimpors);
				embarcadorLocal.setParametroCompras(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompras);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Embarcador embarcadorLocal) throws Exception {	
		if(this.embarcadorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				embarcadorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoViaTransporteDetalleFormJInternalFrame.class)) {
				TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrameLocal=(TipoViaTransporteBeanSwingJInternalFrame) ((TipoViaTransporteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoviatransporteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoViaTransporte(tipoviatransporteBeanSwingJInternalFrameLocal.gettipoviatransporte(),true);
				tipoviatransporteBeanSwingJInternalFrameLocal.actualizarLista(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte,this.tipoviatransportesForeignKey);

				tipoviatransporteBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte);

				embarcadorLocal.setTipoViaTransporte(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte);

				this.addItemDefectoCombosForeignKeyTipoViaTransporte();
				this.cargarCombosFrameTipoViaTransportesForeignKey("Formulario");
				this.setActualTipoViaTransporteForeignKey(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PuertoDetalleFormJInternalFrame.class)) {
				PuertoBeanSwingJInternalFrame puertoBeanSwingJInternalFrameLocal=(PuertoBeanSwingJInternalFrame) ((PuertoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				puertoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPuerto(puertoBeanSwingJInternalFrameLocal.getpuerto(),true);
				puertoBeanSwingJInternalFrameLocal.actualizarLista(puertoBeanSwingJInternalFrameLocal.puerto,this.puertosForeignKey);

				puertoBeanSwingJInternalFrameLocal.actualizarRelaciones(puertoBeanSwingJInternalFrameLocal.puerto);

				embarcadorLocal.setPuerto(puertoBeanSwingJInternalFrameLocal.puerto);

				this.addItemDefectoCombosForeignKeyPuerto();
				this.cargarCombosFramePuertosForeignKey("Formulario");
				this.setActualPuertoForeignKey(puertoBeanSwingJInternalFrameLocal.puerto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				embarcadorLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				embarcadorLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				embarcadorLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmbarcadorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = embarcadorValidator.getInvalidValues(this.embarcador);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Embarcador embarcador,List<Embarcador> embarcadors) throws Exception {
		try	{		
			EmbarcadorConstantesFunciones.actualizarLista(embarcador,embarcadors,this.embarcadorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Embarcador embarcador,List<Embarcador> embarcadors) throws Exception {
		try	{			
			EmbarcadorConstantesFunciones.actualizarSelectedLista(embarcador,embarcadors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Embarcador> embarcadorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				embarcadorsLocal=this.embarcadorLogic.getEmbarcadors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				embarcadorsLocal=this.embarcadors;
			}
			//ARCHITECTURE
		
			for(Embarcador embarcadorLocal:embarcadorsLocal) {
				if(this.permiteMantenimiento(embarcadorLocal) && embarcadorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmbarcadorConstantesFunciones.getEmbarcadorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelid_empresaEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelnombreEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelrucEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabeldireccionEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabeltelefonoEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.CONTACTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelcontactoEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabele_mailEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.FAX)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelfaxEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.IDTIPOVIATRANSPORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelid_tipo_via_transporteEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.IDPUERTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelid_puertoEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelid_empleadoEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelid_paisEmbarcador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmbarcadorConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelid_ciudadEmbarcador,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabelid_empresaEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabelnombreEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabelrucEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabeldireccionEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabeltelefonoEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabelcontactoEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabele_mailEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabelfaxEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabelid_tipo_via_transporteEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabelid_puertoEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabelid_empleadoEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabelid_paisEmbarcador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmbarcador.jLabelid_ciudadEmbarcador,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PedidoCompraImpor")) {
			if(this.embarcador==null) {
				this.embarcador= new Embarcador();
			}

			if(this.embarcadorSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEmbarcador
				this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);

				this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.getpedidocompraimpor().setEmbarcador(this.embarcador);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroCompra")) {
			if(this.embarcador==null) {
				this.embarcador= new Embarcador();
			}

			if(this.embarcadorSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEmbarcador
				this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);

				this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.getparametrocompra().setEmbarcador(this.embarcador);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEmbarcador--;	
		
		
		this.embarcadorAux=new Embarcador();
		
		this.embarcadorAux.setId(this.iIdNuevoEmbarcador);
		this.embarcadorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.embarcadorLogic.getEmbarcadors().add(this.embarcadorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.embarcadors.add(this.embarcadorAux);
		}
		//ARCHITECTURE
		
		this.embarcador=this.embarcadorAux;
		
		if(EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmbarcador(this.embarcador);
			this.setVariablesObjetoActualToFormularioForeignKeyEmbarcador(this.embarcador);
		}
				
		//this.setDefaultControlesEmbarcador();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmbarcador();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmbarcador();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmbarcador();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmbarcador(this.embarcadorBean,this.embarcador,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmbarcadorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
			classes=EmbarcadorConstantesFunciones.getClassesRelationshipsOfEmbarcador(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.embarcadorReturnGeneral=embarcadorLogic.procesarEventosEmbarcadorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.embarcadorLogic.getEmbarcadors(),this.embarcador,this.embarcadorParameterGeneral,this.isEsNuevoEmbarcador,classes);//this.embarcadorLogic.getEmbarcador()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmbarcador(this.embarcadorReturnGeneral,this.embarcadorBean,false);
		
		if(this.embarcadorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmbarcador(this.embarcadorReturnGeneral.getEmbarcador());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmbarcador(this.embarcadorReturnGeneral.getEmbarcador());
		}
		
		if(this.embarcadorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmbarcador(this.embarcadorReturnGeneral.getEmbarcador(),classes);//this.embarcadorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmbarcador();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmbarcador();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmbarcadorBeanSwingJInternalFrameAdditional.RecargarFormEmbarcador(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmbarcador(false);
						
			if(embarcadorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.getEsGuardarRelacionado() && PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoCompraImporActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.getEsGuardarRelacionado() && ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCompraActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmbarcador();
			}
			
			this.actualizarVisualTableDatosEmbarcador();
			
			this.jTableDatosEmbarcador.setRowSelectionInterval(this.getIndiceNuevoEmbarcador(), this.getIndiceNuevoEmbarcador());
			
			this.seleccionarFilaTablaEmbarcadorActual();
						
			this.actualizarEstadoCeldasBotonesEmbarcador("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmbarcador(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmbarcador.jTextFieldnombreEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activarnombreEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextFieldrucEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activarrucEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextAreadireccionEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activardireccionEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextFieldtelefonoEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activartelefonoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextAreacontactoEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activarcontactoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextFielde_mailEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activare_mailEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextFieldfaxEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activarfaxEmbarcador);	
		//
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activarid_empresaEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activarid_tipo_via_transporteEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activarid_puertoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activarid_empleadoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activarid_paisEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.setEnabled(isHabilitar && this.embarcadorConstantesFunciones.activarid_ciudadEmbarcador);
	};
	
	public void setDefaultControlesEmbarcador() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmbarcador(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.embarcadorSessionBean.setConGuardarRelaciones(true);			
			this.embarcadorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.embarcadorSessionBean.setConGuardarRelaciones(false);			
			this.embarcadorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEmbarcador() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Embarcador embarcadorAux:this.embarcadorLogic.getEmbarcadors()) {
				if(embarcadorAux.getId().equals(this.iIdNuevoEmbarcador)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Embarcador embarcadorAux:this.embarcadors) {
				if(embarcadorAux.getId().equals(this.iIdNuevoEmbarcador)) {
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
	
	public int getIndiceActualEmbarcador(Embarcador embarcador,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Embarcador embarcadorAux:this.embarcadorLogic.getEmbarcadors()) {
				if(embarcadorAux.getId().equals(embarcador.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Embarcador embarcadorAux:this.embarcadors) {
				if(embarcadorAux.getId().equals(embarcador.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmbarcador(Embarcador embarcadorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Embarcador embarcadorAux:this.embarcadorLogic.getEmbarcadors()) {
				if(embarcadorAux.getEmbarcadorOriginal().getId().equals(embarcadorOriginal.getId())) {
					existe=true;
					embarcadorOriginal.setId(embarcadorAux.getId());
					embarcadorOriginal.setVersionRow(embarcadorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Embarcador embarcadorAux:this.embarcadors) {
				if(embarcadorAux.getEmbarcadorOriginal().getId().equals(embarcadorOriginal.getId())) {
					existe=true;
					embarcadorOriginal.setId(embarcadorAux.getId());
					embarcadorOriginal.setVersionRow(embarcadorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmbarcador(Boolean esParaCancelar) throws Exception {
		embarcadorsAux=new ArrayList<Embarcador>();
		embarcadorAux=new Embarcador();
		
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Embarcador embarcadorAux:this.embarcadorLogic.getEmbarcadors()) {
					if(embarcadorAux.getId()<0) {
						embarcadorsAux.add(embarcadorAux);
					}		
				}
				this.iIdNuevoEmbarcador=0L;
				this.embarcadorLogic.getEmbarcadors().removeAll(embarcadorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Embarcador embarcadorAux:this.embarcadors) {
					if(embarcadorAux.getId()<0) {
						embarcadorsAux.add(embarcadorAux);
					}		
				}
				this.iIdNuevoEmbarcador=0L;
				this.embarcadors.removeAll(embarcadorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmbarcador 
					&& this.embarcadorLogic.getEmbarcadors().size()>0
					) {
					embarcadorAux=this.embarcadorLogic.getEmbarcadors().get(this.embarcadorLogic.getEmbarcadors().size() - 1);
				
					if(embarcadorAux.getId()<0) {
						this.embarcadorLogic.getEmbarcadors().remove(embarcadorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmbarcador && this.embarcadors.size()>0) {
					embarcadorAux=this.embarcadors.get(this.embarcadors.size() - 1);
				
					if(embarcadorAux.getId()<0) {
						this.embarcadors.remove(embarcadorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmbarcador(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(embarcador.getId()<0) {
				this.embarcadorLogic.getEmbarcadors().remove(this.embarcador);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(embarcador.getId()<0) {
				this.embarcadors.remove(this.embarcador);
			}
		}			
	}
	
	public void setEstadosInicialesEmbarcador(List<Embarcador> embarcadorsAux) throws Exception {
		EmbarcadorConstantesFunciones.setEstadosInicialesEmbarcador(embarcadorsAux);
	}
	
	public void setEstadosInicialesEmbarcador(Embarcador embarcadorAux) throws Exception {
		EmbarcadorConstantesFunciones.setEstadosInicialesEmbarcador(embarcadorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmbarcadorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmbarcador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmbarcadorActual()) {
				if(!this.isEsNuevoEmbarcador) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmbarcador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmbarcador=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmbarcadorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Embarcador ?", "MANTENIMIENTO DE Embarcador", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmbarcador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Embarcador embarcador) throws Exception {
		EmbarcadorConstantesFunciones.seleccionarAsignar(this.embarcador,embarcador);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmbarcador=this.isPermisoActualizarOriginalEmbarcador;
			
			
			this.seleccionarAsignar(embarcador);
			
			

			idEmpleadoActual=embarcador.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmbarcadorConstantesFunciones.quitarEspaciosEmbarcador(this.embarcador,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmbarcador("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.embarcadorSessionBean.setsFuncionBusquedaRapida(this.embarcadorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
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
			if(this.isEsNuevoEmbarcador) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmbarcador(esParaCancelar);				
				this.cancelarNuevoEmbarcador(esParaCancelar);								
			}
			
			this.embarcador=new Embarcador();
			
			this.inicializarEmbarcador();
			
			this.actualizarEstadoCeldasBotonesEmbarcador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmbarcador() throws Exception {
		try {
			EmbarcadorConstantesFunciones.inicializarEmbarcador(this.embarcador);
			
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
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.embarcadorLogic.getEmbarcadors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmbarcadors(String sAccionBusqueda,List<Embarcador> embarcadorsParaReportes) throws Exception {
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
					sPathReporteFinal="Embarcador"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmbarcadorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmbarcadorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Embarcador"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Embarcadores");		
		parameters.put("busquedapor", EmbarcadorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PedidoCompraImpor.class));
			classes.add(new Classe(ParametroCompra.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EmbarcadorLogic embarcadorLogicAuxiliar=new EmbarcadorLogic();
					embarcadorLogicAuxiliar.setDatosCliente(embarcadorLogic.getDatosCliente());				
					embarcadorLogicAuxiliar.setEmbarcadors(embarcadorsParaReportes);
					
					embarcadorLogicAuxiliar.cargarRelacionesLoteForeignKeyEmbarcadorWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					embarcadorsParaReportes=embarcadorLogicAuxiliar.getEmbarcadors();
					
					//embarcadorLogic.getNewConnexionToDeep();
					
					//for (Embarcador embarcador:embarcadorsParaReportes) {
					//	embarcadorLogic.deepLoad(embarcador, false, DeepLoadType.INCLUDE, classes);
					//}						
					//embarcadorLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//embarcadorLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePedidoCompraImpor = AuxiliarReportes.class.getResourceAsStream("PedidoCompraImporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidocompraimpor", reportFilePedidoCompraImpor);

			InputStream reportFileParametroCompra = AuxiliarReportes.class.getResourceAsStream("ParametroCompraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocompra", reportFileParametroCompra);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmbarcador=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmbarcadorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmbarcadorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmbarcador=new JRBeanArrayDataSource(EmbarcadorJInternalFrame.TraerEmbarcadorBeans(embarcadorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmbarcador);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmbarcadorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmbarcadorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmbarcadorBean.TraerEmbarcadorBeans(embarcadorsParaReportes).toArray()));
							
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
				this.generarExcelReporteEmbarcadors(sAccionBusqueda,sTipoArchivoReporte,embarcadorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmbarcadors(sAccionBusqueda,sTipoArchivoReporte,embarcadorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmbarcadorActionPerformed(null);
					//this.generarExcelReporteEmbarcadors(sAccionBusqueda,sTipoArchivoReporte,embarcadorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmbarcadors(sAccionBusqueda,sTipoArchivoReporte,embarcadorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmbarcadors(sAccionBusqueda,sTipoArchivoReporte,embarcadorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmbarcadors(sAccionBusqueda,sTipoArchivoReporte,embarcadorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmbarcadors(String sAccionBusqueda,String sTipoArchivoReporte,List<Embarcador> embarcadorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"embarcador";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Embarcadors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmbarcador("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Embarcador embarcador : embarcadorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmbarcadorConstantesFunciones.generarExcelReporteDataEmbarcador("NORMAL",row,workbook,embarcador,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Embarcador",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmbarcador(String sTipo,Row row,Workbook workbook) {
		
		EmbarcadorConstantesFunciones.generarExcelReporteHeaderEmbarcador(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmbarcadors(String sAccionBusqueda,String sTipoArchivoReporte,List<Embarcador> embarcadorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"embarcador_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Embarcadors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Embarcador embarcador : embarcadorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmbarcadorConstantesFunciones.getEmbarcadorDescripcion(embarcador));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_CONTACTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_CONTACTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.getcontacto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.gete_mail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_FAX))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_FAX);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.getfax());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.gettipoviatransporte_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_IDPUERTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDPUERTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.getpuerto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmbarcadorConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(embarcador.getciudad_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Embarcador",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmbarcadors(String sAccionBusqueda,String sTipoArchivoReporte,List<Embarcador> embarcadorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Embarcador> embarcadorsRespaldo=null;
		
		classes=EmbarcadorConstantesFunciones.getClassesRelationshipsOfEmbarcador(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.embarcadorLogic.setDatosCliente(this.datosCliente);
		this.embarcadorLogic.setDatosDeep(this.datosDeep);
		this.embarcadorLogic.setIsConDeep(true);
		
		embarcadorsRespaldo=this.embarcadorLogic.getEmbarcadors();
		
		this.embarcadorLogic.setEmbarcadors(embarcadorsParaReportes);	
		this.embarcadorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		embarcadorsParaReportes=this.embarcadorLogic.getEmbarcadors();
		this.embarcadorLogic.setEmbarcadors(embarcadorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"embarcador_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Embarcadors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmbarcador("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Embarcador embarcador : embarcadorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmbarcador("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmbarcadorConstantesFunciones.generarExcelReporteDataEmbarcador("NORMAL",row,workbook,embarcador,cellStyleDataAux);
		
			
			


				//PedidoCompraImpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO))) {

				if(embarcador.getPedidoCompraImpors()!=null && embarcador.getPedidoCompraImpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoCompraImporConstantesFunciones.generarExcelReporteHeaderPedidoCompraImpor("RELACIONADO",row,workbook);
				}

				if(embarcador.getPedidoCompraImpors()!=null) {
					i2=0;
					for(PedidoCompraImpor pedidocompraimpor : embarcador.getPedidoCompraImpors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoCompraImporConstantesFunciones.generarExcelReporteDataPedidoCompraImpor("RELACIONADO",row,workbook,pedidocompraimpor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroCompra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCompraConstantesFunciones.SCLASSWEBTITULO))) {

				if(embarcador.getParametroCompras()!=null && embarcador.getParametroCompras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCompraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCompraConstantesFunciones.generarExcelReporteHeaderParametroCompra("RELACIONADO",row,workbook);
				}

				if(embarcador.getParametroCompras()!=null) {
					i2=0;
					for(ParametroCompra parametrocompra : embarcador.getParametroCompras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroCompraConstantesFunciones.generarExcelReporteDataParametroCompra("RELACIONADO",row,workbook,parametrocompra,cellStyleDataAuxHijo);
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
		cell.setCellValue(EmbarcadorConstantesFunciones.getEmbarcadorDescripcion(embarcador));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Embarcador",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmbarcador.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmbarcador() throws Exception {		
		this.startProcessEmbarcador(true);
	}
	
	public void startProcessEmbarcador(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmbarcador ,this.jPanelParametrosReportesEmbarcador, this.jScrollPanelDatosEmbarcador,this.jPanelPaginacionEmbarcador, this.jScrollPanelDatosEdicionEmbarcador, this.jPanelAccionesEmbarcador,this.jPanelAccionesFormularioEmbarcador,this.jmenuBarEmbarcador,this.jmenuBarDetalleEmbarcador,this.jTtoolBarEmbarcador,this.jTtoolBarDetalleEmbarcador);		
		
		final JTabbedPane jTabbedPaneBusquedasEmbarcador=this.jTabbedPaneBusquedasEmbarcador; 
		
		final JPanel jPanelParametrosReportesEmbarcador=this.jPanelParametrosReportesEmbarcador;
		//final JScrollPane jScrollPanelDatosEmbarcador=this.jScrollPanelDatosEmbarcador;
		final JTable jTableDatosEmbarcador=this.jTableDatosEmbarcador;		
		final JPanel jPanelPaginacionEmbarcador=this.jPanelPaginacionEmbarcador;
		//final JScrollPane jScrollPanelDatosEdicionEmbarcador=this.jScrollPanelDatosEdicionEmbarcador;
		final JPanel jPanelAccionesEmbarcador=this.jPanelAccionesEmbarcador;
		
		JPanel jPanelCamposAuxiliarEmbarcador=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmbarcador=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			jPanelCamposAuxiliarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jPanelCamposEmbarcador;
			jPanelAccionesFormularioAuxiliarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jPanelAccionesFormularioEmbarcador;
		}
		
		final JPanel jPanelCamposEmbarcador=jPanelCamposAuxiliarEmbarcador;
		final JPanel jPanelAccionesFormularioEmbarcador=jPanelAccionesFormularioAuxiliarEmbarcador;
		
		
		final JMenuBar jmenuBarEmbarcador=this.jmenuBarEmbarcador;
		final JToolBar jTtoolBarEmbarcador=this.jTtoolBarEmbarcador;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmbarcador=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmbarcador=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			jmenuBarDetalleAuxiliarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jmenuBarDetalleEmbarcador;
			jTtoolBarDetalleAuxiliarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jTtoolBarDetalleEmbarcador;
		}
		
		final JMenuBar jmenuBarDetalleEmbarcador=jmenuBarDetalleAuxiliarEmbarcador;
		final JToolBar jTtoolBarDetalleEmbarcador=jTtoolBarDetalleAuxiliarEmbarcador;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmbarcador;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmbarcador;
			processRunnable.jTableDatos=jTableDatosEmbarcador;
			processRunnable.jPanelCampos=jPanelCamposEmbarcador;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmbarcador;
			processRunnable.jPanelAcciones=jPanelAccionesEmbarcador;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmbarcador;
			
			
			processRunnable.jmenuBar=jmenuBarEmbarcador;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmbarcador;
			processRunnable.jTtoolBar=jTtoolBarEmbarcador;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmbarcador;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmbarcador ,jPanelParametrosReportesEmbarcador,jTableDatosEmbarcador, /*jScrollPanelDatosEmbarcador,*/jPanelCamposEmbarcador,jPanelPaginacionEmbarcador, /*jScrollPanelDatosEdicionEmbarcador,*/ jPanelAccionesEmbarcador,jPanelAccionesFormularioEmbarcador,jmenuBarEmbarcador,jmenuBarDetalleEmbarcador,jTtoolBarEmbarcador,jTtoolBarDetalleEmbarcador);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmbarcador ,jPanelParametrosReportesEmbarcador, jScrollPanelDatosEmbarcador,jPanelPaginacionEmbarcador, jScrollPanelDatosEdicionEmbarcador, jPanelAccionesEmbarcador,jPanelAccionesFormularioEmbarcador,jmenuBarEmbarcador,jmenuBarDetalleEmbarcador,jTtoolBarEmbarcador,jTtoolBarDetalleEmbarcador);
						
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
	
	public void finishProcessEmbarcador() {// throws Exception 
		this.finishProcessEmbarcador(true);
	}
	
	public void finishProcessEmbarcador(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmbarcador ,this.jPanelParametrosReportesEmbarcador, this.jScrollPanelDatosEmbarcador,this.jPanelPaginacionEmbarcador, this.jScrollPanelDatosEdicionEmbarcador, this.jPanelAccionesEmbarcador,this.jPanelAccionesFormularioEmbarcador,this.jmenuBarEmbarcador,this.jmenuBarDetalleEmbarcador,this.jTtoolBarEmbarcador,this.jTtoolBarDetalleEmbarcador);		
		
		final JTabbedPane jTabbedPaneBusquedasEmbarcador=this.jTabbedPaneBusquedasEmbarcador; 
		
		final JPanel jPanelParametrosReportesEmbarcador=this.jPanelParametrosReportesEmbarcador;
		//final JScrollPane jScrollPanelDatosEmbarcador=this.jScrollPanelDatosEmbarcador;
		final JTable jTableDatosEmbarcador=this.jTableDatosEmbarcador;		
		final JPanel jPanelPaginacionEmbarcador=this.jPanelPaginacionEmbarcador;
		//final JScrollPane jScrollPanelDatosEdicionEmbarcador=this.jScrollPanelDatosEdicionEmbarcador;
		final JPanel jPanelAccionesEmbarcador=this.jPanelAccionesEmbarcador;
		
		JPanel jPanelCamposAuxiliarEmbarcador=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmbarcador=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			jPanelCamposAuxiliarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jPanelCamposEmbarcador;
			jPanelAccionesFormularioAuxiliarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jPanelAccionesFormularioEmbarcador;
		}
		
		final JPanel jPanelCamposEmbarcador=jPanelCamposAuxiliarEmbarcador;
		final JPanel jPanelAccionesFormularioEmbarcador=jPanelAccionesFormularioAuxiliarEmbarcador;
		
		
		final JMenuBar jmenuBarEmbarcador=this.jmenuBarEmbarcador;		
		final JToolBar jTtoolBarEmbarcador=this.jTtoolBarEmbarcador;
				
		JMenuBar jmenuBarDetalleAuxiliarEmbarcador=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmbarcador=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			jmenuBarDetalleAuxiliarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jmenuBarDetalleEmbarcador;
			jTtoolBarDetalleAuxiliarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jTtoolBarDetalleEmbarcador;		
		}
		
		final JMenuBar jmenuBarDetalleEmbarcador=jmenuBarDetalleAuxiliarEmbarcador;
		final JToolBar jTtoolBarDetalleEmbarcador=jTtoolBarDetalleAuxiliarEmbarcador;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmbarcador;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmbarcador;
			processRunnable.jTableDatos=jTableDatosEmbarcador;
			processRunnable.jPanelCampos=jPanelCamposEmbarcador;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmbarcador;
			processRunnable.jPanelAcciones=jPanelAccionesEmbarcador;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmbarcador;
			
			
			processRunnable.jmenuBar=jmenuBarEmbarcador;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmbarcador;
			processRunnable.jTtoolBar=jTtoolBarEmbarcador;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmbarcador;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmbarcador ,jPanelParametrosReportesEmbarcador, jTableDatosEmbarcador,/*jScrollPanelDatosEmbarcador,*/jPanelCamposEmbarcador,jPanelPaginacionEmbarcador, /*jScrollPanelDatosEdicionEmbarcador,*/ jPanelAccionesEmbarcador,jPanelAccionesFormularioEmbarcador,jmenuBarEmbarcador,jmenuBarDetalleEmbarcador,jTtoolBarEmbarcador,jTtoolBarDetalleEmbarcador));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmbarcador(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmbarcador(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmbarcador(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmbarcador(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmbarcador,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmbarcador,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmbarcador(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmbarcador,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmbarcador,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.embarcadorConstantesFunciones.getsFinalQueryEmbarcador();
		String  finalQueryPaginacionTodos=this.embarcadorConstantesFunciones.getsFinalQueryEmbarcador();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmbarcadorConstantesFunciones.getArrayColumnasGlobalesNoEmbarcador(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmbarcadorConstantesFunciones.getArrayColumnasGlobalesEmbarcador(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmbarcadorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.embarcadorsEliminados= new ArrayList<Embarcador>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmbarcador();
		
				///*EmbarcadorSessionBean*/this.embarcadorSessionBean=new EmbarcadorSessionBean();
			
			if(this.embarcadorSessionBean==null) {
				this.embarcadorSessionBean=new EmbarcadorSessionBean();
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
					this.iNumeroPaginacion=EmbarcadorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmbarcadorConstantesFunciones.getClassesForeignKeysOfEmbarcador(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/embarcador."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			embarcadorsAux= new ArrayList<Embarcador>();
			
				
			embarcadorLogic.setDatosCliente(this.datosCliente);
			embarcadorLogic.setDatosDeep(this.datosDeep);
			embarcadorLogic.setIsConDeep(true);
			
			
			embarcadorLogic.getEmbarcadorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					embarcadorLogic.getTodosEmbarcadors(finalQueryGlobal,pagination);
					
					//embarcadorLogic.getTodosEmbarcadorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(embarcadorLogic.getEmbarcadors()==null|| embarcadorLogic.getEmbarcadors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							embarcadorsAux= new ArrayList<Embarcador>();
							embarcadorsAux.addAll(embarcadorLogic.getEmbarcadors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadorsAux= new ArrayList<Embarcador>();
							embarcadorsAux.addAll(embarcadors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							embarcadorLogic.getTodosEmbarcadors(finalQueryGlobal+"",this.pagination);												
							
							//embarcadorLogic.getTodosEmbarcadorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmbarcadors("Todos",embarcadorLogic.getEmbarcadors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());					
							embarcadorLogic.getEmbarcadors().addAll(embarcadorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadors=new ArrayList<Embarcador>();
							embarcadors.addAll(embarcadorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmbarcador=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmbarcador=this.idActual;
				
				} else if(this.idEmbarcadorActual!=null && this.idEmbarcadorActual!=0L) {
					idEmbarcador=idEmbarcadorActual;
				}
				
					
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndicePorId(idEmbarcador);
				
				this.embarcadors=new ArrayList<Embarcador>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					embarcadorLogic.getEntity(idEmbarcador);
					
					//embarcadorLogic.getEntityWithConnection(idEmbarcador);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());
					embarcadorLogic.getEmbarcadors().add(embarcadorLogic.getEmbarcador());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.embarcadors=new ArrayList<Embarcador>();
					this.embarcadors.add(embarcador);
				}
				
				if(embarcadorLogic.getEmbarcador()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorContacto")) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorContacto(contactoBusquedaPorContacto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					embarcadorLogic.getEmbarcadorsBusquedaPorContacto(finalQueryGlobal,pagination,contactoBusquedaPorContacto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorContacto(contactoBusquedaPorContacto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorContacto(contactoBusquedaPorContacto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=embarcadorLogic.getEmbarcadors()==null||embarcadorLogic.getEmbarcadors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=embarcadors==null|| embarcadors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorsAux=new ArrayList<Embarcador>();
						embarcadorsAux.addAll(embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadorsAux=new ArrayList<Embarcador>();
							embarcadorsAux.addAll(embarcadors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							embarcadorLogic.getEmbarcadorsBusquedaPorContacto(finalQueryGlobal,pagination,contactoBusquedaPorContacto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorContacto(contactoBusquedaPorContacto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorContacto(contactoBusquedaPorContacto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmbarcadors("BusquedaPorContacto",embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmbarcadors("BusquedaPorContacto",embarcadors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());
						embarcadorLogic.getEmbarcadors().addAll(embarcadorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadors=new ArrayList<Embarcador>();
							embarcadors.addAll(embarcadorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					embarcadorLogic.getEmbarcadorsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=embarcadorLogic.getEmbarcadors()==null||embarcadorLogic.getEmbarcadors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=embarcadors==null|| embarcadors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorsAux=new ArrayList<Embarcador>();
						embarcadorsAux.addAll(embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadorsAux=new ArrayList<Embarcador>();
							embarcadorsAux.addAll(embarcadors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							embarcadorLogic.getEmbarcadorsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmbarcadors("BusquedaPorNombre",embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmbarcadors("BusquedaPorNombre",embarcadors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());
						embarcadorLogic.getEmbarcadors().addAll(embarcadorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadors=new ArrayList<Embarcador>();
							embarcadors.addAll(embarcadorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorTelefono")) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					embarcadorLogic.getEmbarcadorsBusquedaPorTelefono(finalQueryGlobal,pagination,telefonoBusquedaPorTelefono);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=embarcadorLogic.getEmbarcadors()==null||embarcadorLogic.getEmbarcadors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=embarcadors==null|| embarcadors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorsAux=new ArrayList<Embarcador>();
						embarcadorsAux.addAll(embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadorsAux=new ArrayList<Embarcador>();
							embarcadorsAux.addAll(embarcadors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							embarcadorLogic.getEmbarcadorsBusquedaPorTelefono(finalQueryGlobal,pagination,telefonoBusquedaPorTelefono);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmbarcadors("BusquedaPorTelefono",embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmbarcadors("BusquedaPorTelefono",embarcadors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());
						embarcadorLogic.getEmbarcadors().addAll(embarcadorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadors=new ArrayList<Embarcador>();
							embarcadors.addAll(embarcadorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					embarcadorLogic.getEmbarcadorsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=embarcadorLogic.getEmbarcadors()==null||embarcadorLogic.getEmbarcadors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=embarcadors==null|| embarcadors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorsAux=new ArrayList<Embarcador>();
						embarcadorsAux.addAll(embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadorsAux=new ArrayList<Embarcador>();
							embarcadorsAux.addAll(embarcadors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							embarcadorLogic.getEmbarcadorsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmbarcadors("FK_IdEmpleado",embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmbarcadors("FK_IdEmpleado",embarcadors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());
						embarcadorLogic.getEmbarcadors().addAll(embarcadorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadors=new ArrayList<Embarcador>();
							embarcadors.addAll(embarcadorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					embarcadorLogic.getEmbarcadorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=embarcadorLogic.getEmbarcadors()==null||embarcadorLogic.getEmbarcadors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=embarcadors==null|| embarcadors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorsAux=new ArrayList<Embarcador>();
						embarcadorsAux.addAll(embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadorsAux=new ArrayList<Embarcador>();
							embarcadorsAux.addAll(embarcadors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							embarcadorLogic.getEmbarcadorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmbarcadors("FK_IdEmpresa",embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmbarcadors("FK_IdEmpresa",embarcadors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());
						embarcadorLogic.getEmbarcadors().addAll(embarcadorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadors=new ArrayList<Embarcador>();
							embarcadors.addAll(embarcadorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPuerto")) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdPuerto(id_puertoFK_IdPuerto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					embarcadorLogic.getEmbarcadorsFK_IdPuerto(finalQueryGlobal,pagination,id_puertoFK_IdPuerto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdPuerto(id_puertoFK_IdPuerto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdPuerto(id_puertoFK_IdPuerto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=embarcadorLogic.getEmbarcadors()==null||embarcadorLogic.getEmbarcadors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=embarcadors==null|| embarcadors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorsAux=new ArrayList<Embarcador>();
						embarcadorsAux.addAll(embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadorsAux=new ArrayList<Embarcador>();
							embarcadorsAux.addAll(embarcadors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							embarcadorLogic.getEmbarcadorsFK_IdPuerto(finalQueryGlobal,pagination,id_puertoFK_IdPuerto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdPuerto(id_puertoFK_IdPuerto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmbarcadorConstantesFunciones.getDetalleIndiceFK_IdPuerto(id_puertoFK_IdPuerto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmbarcadors("FK_IdPuerto",embarcadorLogic.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmbarcadors("FK_IdPuerto",embarcadors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorLogic.setEmbarcadors(new ArrayList<Embarcador>());
						embarcadorLogic.getEmbarcadors().addAll(embarcadorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadors=new ArrayList<Embarcador>();
							embarcadors.addAll(embarcadorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmbarcador();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmbarcador();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=embarcadorLogic.getEmbarcadors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=embarcadors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=embarcadorLogic.getEmbarcadors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=embarcadors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Embarcador embarcador) {
		Boolean permite=true;
		
		if(this.embarcador.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmbarcadorConstantesFunciones.getOrderByListaEmbarcador();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmbarcadorConstantesFunciones.getOrderByListaEmbarcador();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Embarcador embarcador:embarcadorLogic.getEmbarcadors()) {
				if(embarcador.getsType().equals(Constantes2.S_TOTALES)) {
					embarcadorTotales=embarcador;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Embarcador embarcador:this.embarcadors) {
				if(embarcador.getsType().equals(Constantes2.S_TOTALES)) {
					embarcadorTotales=embarcador;
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
			this.embarcadorAux=new Embarcador();
			this.embarcadorAux.setsType(Constantes2.S_TOTALES);
			this.embarcadorAux.setIsNew(false);
			this.embarcadorAux.setIsChanged(false);
			this.embarcadorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmbarcadorConstantesFunciones.TotalizarValoresFilaEmbarcador(this.embarcadorLogic.getEmbarcadors(),this.embarcadorAux);
				
				this.embarcadorLogic.getEmbarcadors().add(this.embarcadorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmbarcadorConstantesFunciones.TotalizarValoresFilaEmbarcador(this.embarcadors,this.embarcadorAux);
				
				this.embarcadors.add(this.embarcadorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		embarcadorTotales=new Embarcador();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.embarcadorLogic.getEmbarcadors().remove(embarcadorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.embarcadors.remove(embarcadorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		embarcadorTotales=new Embarcador();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Embarcador embarcador:embarcadorLogic.getEmbarcadors()) {
				if(embarcador.getsType().equals(Constantes2.S_TOTALES)) {
					embarcadorTotales=embarcador;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmbarcadorConstantesFunciones.TotalizarValoresFilaEmbarcador(this.embarcadorLogic.getEmbarcadors(),embarcadorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Embarcador embarcador:this.embarcadors) {
				if(embarcador.getsType().equals(Constantes2.S_TOTALES)) {
					embarcadorTotales=embarcador;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmbarcadorConstantesFunciones.TotalizarValoresFilaEmbarcador(this.embarcadors,embarcadorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmbarcadorsBusquedaPorContacto()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorContacto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmbarcadorsBusquedaPorEMail()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorEMail";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmbarcadorsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmbarcadorsBusquedaPorRuc()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorRuc";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmbarcadorsBusquedaPorTelefono()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorTelefono";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmbarcadorsFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmbarcadorsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmbarcadorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmbarcadorsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmbarcadorsFK_IdPuerto()throws Exception {
		try {
			sAccionBusqueda="FK_IdPuerto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmbarcadorsFK_IdTipoViaTransporte()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoViaTransporte";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmbarcadorsBusquedaPorContacto(String sFinalQuery,String contacto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsBusquedaPorContacto(sFinalQuery,this.pagination,contacto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmbarcadorsBusquedaPorEMail(String sFinalQuery,String e_mail)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsBusquedaPorEMail(sFinalQuery,this.pagination,e_mail);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmbarcadorsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmbarcadorsBusquedaPorRuc(String sFinalQuery,String ruc)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsBusquedaPorRuc(sFinalQuery,this.pagination,ruc);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmbarcadorsBusquedaPorTelefono(String sFinalQuery,String telefono)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsBusquedaPorTelefono(sFinalQuery,this.pagination,telefono);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmbarcadorsFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmbarcadorsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmbarcadorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmbarcadorsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmbarcadorsFK_IdPuerto(String sFinalQuery,Long id_puerto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsFK_IdPuerto(sFinalQuery,this.pagination,id_puerto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmbarcadorsFK_IdTipoViaTransporte(String sFinalQuery,Long id_tipo_via_transporte)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLogic.getEmbarcadorsFK_IdTipoViaTransporte(sFinalQuery,this.pagination,id_tipo_via_transporte);
				
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
	
	public void inicializarPermisosEmbarcador() {
		this.isPermisoTodoEmbarcador=false;
		this.isPermisoNuevoEmbarcador=false;
		this.isPermisoActualizarEmbarcador=false;
		this.isPermisoActualizarOriginalEmbarcador=false;
		this.isPermisoEliminarEmbarcador=false;
		this.isPermisoGuardarCambiosEmbarcador=false;
		this.isPermisoConsultaEmbarcador=false;
		this.isPermisoBusquedaEmbarcador=false;
		this.isPermisoReporteEmbarcador=false;		
		this.isPermisoOrdenEmbarcador=false;		
		this.isPermisoPaginacionMedioEmbarcador=false;		
		this.isPermisoPaginacionAltoEmbarcador=false;
		this.isPermisoPaginacionTodoEmbarcador=false;
		this.isPermisoCopiarEmbarcador=false;		
		this.isPermisoVerFormEmbarcador=false;		
		this.isPermisoDuplicarEmbarcador=false;		
		this.isPermisoOrdenEmbarcador=false;		
	}
	
	public void setPermisosUsuarioEmbarcador(Boolean isPermiso) {
		this.isPermisoTodoEmbarcador=isPermiso;
		this.isPermisoNuevoEmbarcador=isPermiso;
		this.isPermisoActualizarEmbarcador=isPermiso;
		this.isPermisoActualizarOriginalEmbarcador=isPermiso;
		this.isPermisoEliminarEmbarcador=isPermiso;
		this.isPermisoGuardarCambiosEmbarcador=isPermiso;
		this.isPermisoConsultaEmbarcador=isPermiso;
		this.isPermisoBusquedaEmbarcador=isPermiso;
		this.isPermisoReporteEmbarcador=isPermiso;
		this.isPermisoOrdenEmbarcador=isPermiso;		
		this.isPermisoPaginacionMedioEmbarcador=isPermiso;		
		this.isPermisoPaginacionAltoEmbarcador=isPermiso;		
		this.isPermisoPaginacionTodoEmbarcador=isPermiso;		
		this.isPermisoCopiarEmbarcador=isPermiso;		
		this.isPermisoVerFormEmbarcador=isPermiso;		
		this.isPermisoDuplicarEmbarcador=isPermiso;
		this.isPermisoOrdenEmbarcador=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmbarcador(Boolean isPermiso) {
		//this.isPermisoTodoEmbarcador=isPermiso;
		this.isPermisoNuevoEmbarcador=isPermiso;
		this.isPermisoActualizarEmbarcador=isPermiso;
		this.isPermisoActualizarOriginalEmbarcador=isPermiso;
		this.isPermisoEliminarEmbarcador=isPermiso;
		this.isPermisoGuardarCambiosEmbarcador=isPermiso;
		//this.isPermisoConsultaEmbarcador=isPermiso;
		//this.isPermisoBusquedaEmbarcador=isPermiso;
		//this.isPermisoReporteEmbarcador=isPermiso;
		//this.isPermisoOrdenEmbarcador=isPermiso;		
		//this.isPermisoPaginacionMedioEmbarcador=isPermiso;		
		//this.isPermisoPaginacionAltoEmbarcador=isPermiso;		
		//this.isPermisoPaginacionTodoEmbarcador=isPermiso;		
		//this.isPermisoCopiarEmbarcador=isPermiso;		
		//this.isPermisoDuplicarEmbarcador=isPermiso;
		//this.isPermisoOrdenEmbarcador=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmbarcadorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PedidoCompraImporConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroCompraConstantesFunciones.SNOMBREOPCION);
		
		if(EmbarcadorJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPedidoCompraImpor=false;
		this.isTienePermisosPedidoCompraImpor=this.verificarGetPermisosUsuarioOpcionEmbarcadorClaseRelacionada(this.opcionsRelacionadas,PedidoCompraImporConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroCompra=false;
		this.isTienePermisosParametroCompra=this.verificarGetPermisosUsuarioOpcionEmbarcadorClaseRelacionada(this.opcionsRelacionadas,ParametroCompraConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmbarcador(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmbarcadorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPedidoCompraImpor=conPermiso;
		this.isTienePermisosParametroCompra=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEmbarcadorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmbarcadorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmbarcadorClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPedidoCompraImpor && this.jInternalFrameDetalleFormEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.remove(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroCompra && this.jInternalFrameDetalleFormEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.remove(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEmbarcador() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmbarcadorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.embarcadorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmbarcadorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmbarcador=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmbarcador=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmbarcador=this.isPermisoActualizarEmbarcador;
			this.isPermisoEliminarEmbarcador=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmbarcador=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmbarcador=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmbarcador=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmbarcador=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmbarcador=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmbarcador=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmbarcador=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmbarcador=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmbarcador=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmbarcador=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmbarcador=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmbarcador=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmbarcador=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.embarcadorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmbarcador.setToolTipText(this.jTableDatosEmbarcador.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmbarcador(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmbarcador(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmbarcadorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmbarcadorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmbarcador() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPedidoCompraImpor && this.embarcadorConstantesFunciones.mostrarPedidoCompraImporEmbarcador && !EmbarcadorConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Compra");
			reporte.setsDescripcion("Pedido Compra");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroCompra && this.embarcadorConstantesFunciones.mostrarParametroCompraEmbarcador && !EmbarcadorConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Compra");
			reporte.setsDescripcion("Parametro Compra");
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
	public void inicializarCombosForeignKeyEmbarcadorListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoviatransportesForeignKey=new ArrayList();
				this.puertosForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmbarcadorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmbarcadorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmbarcadorListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoViaTransporteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPuertoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPuertoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.puertosForeignKey==null||this.puertosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PuertoConstantesFunciones.getArrayColumnasGlobalesPuerto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PuertoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PuertoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPuertosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEmbarcadorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmbarcadorParameterReturnGeneral embarcadorReturnGeneral=new EmbarcadorParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.embarcadorConstantesFunciones.cargarid_empresaEmbarcador)
					 || (this.esRecargarFks && this.embarcadorConstantesFunciones.cargarid_empresaEmbarcador)) {

					if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+embarcadorSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoViaTransporte="";

				if(((this.tipoviatransportesForeignKey==null||this.tipoviatransportesForeignKey.size()<=0) && this.embarcadorConstantesFunciones.cargarid_tipo_via_transporteEmbarcador)
					 || (this.esRecargarFks && this.embarcadorConstantesFunciones.cargarid_tipo_via_transporteEmbarcador)) {

					if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoViaTransporteConstantesFunciones.getArrayColumnasGlobalesTipoViaTransporte(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoViaTransporte=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoViaTransporteConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoViaTransporte=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoViaTransporte, "");
						finalQueryGlobalTipoViaTransporte+=TipoViaTransporteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoViaTransportesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoViaTransporte=" WHERE " + ConstantesSql.ID + "="+embarcadorSessionBean.getlidTipoViaTransporteActual();
					}
				} else {
					finalQueryGlobalTipoViaTransporte="NONE";
				}


				String finalQueryGlobalPuerto="";

				if(((this.puertosForeignKey==null||this.puertosForeignKey.size()<=0) && this.embarcadorConstantesFunciones.cargarid_puertoEmbarcador)
					 || (this.esRecargarFks && this.embarcadorConstantesFunciones.cargarid_puertoEmbarcador)) {

					if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionPuerto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PuertoConstantesFunciones.getArrayColumnasGlobalesPuerto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPuerto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PuertoConstantesFunciones.TABLENAME);

						finalQueryGlobalPuerto=Funciones.GetFinalQueryAppend(finalQueryGlobalPuerto, "");
						finalQueryGlobalPuerto+=PuertoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPuertosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPuerto=" WHERE " + ConstantesSql.ID + "="+embarcadorSessionBean.getlidPuertoActual();
					}
				} else {
					finalQueryGlobalPuerto="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.embarcadorConstantesFunciones.cargarid_empleadoEmbarcador)
					 || (this.esRecargarFks && this.embarcadorConstantesFunciones.cargarid_empleadoEmbarcador)) {

					if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+embarcadorSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.embarcadorConstantesFunciones.cargarid_paisEmbarcador)
					 || (this.esRecargarFks && this.embarcadorConstantesFunciones.cargarid_paisEmbarcador)) {

					if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+embarcadorSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(cargarCombosDependencia && ((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.embarcadorConstantesFunciones.cargarid_ciudadEmbarcador)
					 || (this.esRecargarFks && this.embarcadorConstantesFunciones.cargarid_ciudadEmbarcador)) {

					if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+embarcadorSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				embarcadorReturnGeneral=embarcadorLogic.cargarCombosLoteForeignKeyEmbarcador(finalQueryGlobalEmpresa,finalQueryGlobalTipoViaTransporte,finalQueryGlobalPuerto,finalQueryGlobalEmpleado,finalQueryGlobalPais,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=embarcadorReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoViaTransporte.equals("NONE")) {
				this.tipoviatransportesForeignKey=embarcadorReturnGeneral.gettipoviatransportesForeignKey();
			}

			if(!finalQueryGlobalPuerto.equals("NONE")) {
				this.puertosForeignKey=embarcadorReturnGeneral.getpuertosForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=embarcadorReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=embarcadorReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=embarcadorReturnGeneral.getciudadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmbarcador()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoViaTransporte();
			this.addItemDefectoCombosForeignKeyPuerto();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.embarcadorSessionBean==null) {
				this.embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoViaTransporte()throws Exception {
		try {

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {
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

	public void addItemDefectoCombosForeignKeyPuerto()throws Exception {
		try {

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionPuerto()) {
				Puerto puerto=new Puerto();
				PuertoConstantesFunciones.setPuertoDescripcion(puerto,Constantes.SMENSAJE_ESCOJA_OPCION);
				puerto.setId(null);

				if(!PuertoConstantesFunciones.ExisteEnLista(this.puertosForeignKey,puerto,true)) {

					this.puertosForeignKey.add(0,puerto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.embarcadorSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEmbarcador()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmbarcador(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyPais(JComboBox jComboBoxPaisGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Pais paisLocal=(Pais)jComboBoxPaisGenerico.getSelectedItem();

			if(paisLocal!=null  && paisLocal.getId()!=null  && paisLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_pais="+paisLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboCiudad=sFinalQueryCombo;

			this.ciudadsForeignKey=new ArrayList<Ciudad>();
			this.cargarCombosForeignKeyCiudad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyPais(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.addItemListener(new ComboBoxItemListener(this,"id_paisEmbarcador"));
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.addFocusListener(new ComboBoxFocusListener(this,"id_paisEmbarcador"));
					}
				} else {
					if(this.jInternalFrameDetalleFormEmbarcador!=null) {
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.addActionListener(new ComboBoxActionListener(this,"id_paisEmbarcador"));
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.addFocusListener(new ComboBoxFocusListener(this,"id_paisEmbarcador"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyEmbarcador()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmbarcador();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmbarcador(Embarcador embarcador)throws Exception {	
		try {
			
			this.setActualTipoViaTransporteForeignKey(embarcador.getid_tipo_via_transporte(),false,"Formulario");
			this.setActualPuertoForeignKey(embarcador.getid_puerto(),false,"Formulario");
			this.setActualEmpleadoForeignKey(embarcador.getid_empleado(),false,"Formulario");
			this.setActualPaisForeignKey(embarcador.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(embarcador.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmbarcador(Embarcador embarcador,String sTipoEvento)throws Exception {	
		try {
			
			

				if(embarcador.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoEmbarcador")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(embarcador.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmbarcador()throws Exception {	
		try {
			
			this.setActualTipoViaTransporteForeignKey(this.embarcadorConstantesFunciones.getid_tipo_via_transporte(),false,"Formulario");
			this.setActualPuertoForeignKey(this.embarcadorConstantesFunciones.getid_puerto(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.embarcadorConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualPaisForeignKey(this.embarcadorConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.embarcadorConstantesFunciones.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmbarcador()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmbarcador()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmbarcador()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmbarcador()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmbarcador()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoViaTransportesForeignKey("Todos");
			this.cargarCombosFramePuertosForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmbarcador(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoViaTransportesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePuertosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmbarcador()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	









	public void recargarFormEmbarcadorPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormEmbarcadorid_ciudad(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}


	
	



	public void recargarFormEmbarcadorid_ciudad(JComboBox<?> jComboBoxGenericoCiudad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.embarcador,jComboBoxGenericoCiudad);
			}

			if(this.embarcador.getid_pais()!=null && this.embarcador.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.embarcador.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualCiudadForeignKey(this.embarcador.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosCiudadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public EmbarcadorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmbarcadorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmbarcadorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.embarcadorSessionBean=new EmbarcadorSessionBean(); 
		this.embarcadorConstantesFunciones=new EmbarcadorConstantesFunciones(); 
		this.embarcadorBean=new Embarcador();//(this.embarcadorConstantesFunciones); 		
		this.embarcadorReturnGeneral=new EmbarcadorParameterReturnGeneral(); 
		
		this.embarcadorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.embarcadorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmbarcadorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmbarcadorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmbarcadorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmbarcador(true);
			
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
			
			this.embarcadorConstantesFunciones=new EmbarcadorConstantesFunciones(); 
			this.embarcadorBean=new Embarcador();//this.embarcadorConstantesFunciones); 			
			this.embarcadorReturnGeneral=new EmbarcadorParameterReturnGeneral(); 
		
			EmbarcadorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Embarcador Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.embarcador=new Embarcador();
			this.embarcadors = new ArrayList<Embarcador>();
			this.embarcadorsAux = new ArrayList<Embarcador>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic=new EmbarcadorLogic();
				this.embarcadorLogic.getNewConnexionToDeep("");
			}
			
			//this.embarcadorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.embarcadorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmbarcador);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmbarcador!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmbarcador);	
					}
					
					if(this.jInternalFrameImportacionEmbarcador!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmbarcador);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmbarcador!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmbarcador);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmbarcador!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmbarcador);
				this.jInternalFrameDetalleFormEmbarcador.setVisible(false);
				this.jInternalFrameDetalleFormEmbarcador.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmbarcador!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmbarcador);
					this.jInternalFrameReporteDinamicoEmbarcador.setVisible(false);
					this.jInternalFrameReporteDinamicoEmbarcador.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmbarcador!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmbarcador);
					this.jInternalFrameImportacionEmbarcador.setVisible(false);
					this.jInternalFrameImportacionEmbarcador.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmbarcador!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmbarcador);
					this.jInternalFrameOrderByEmbarcador.setVisible(false);
					this.jInternalFrameOrderByEmbarcador.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmbarcadorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmbarcadorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.embarcadorReturnGeneral=new EmbarcadorParameterReturnGeneral();
			
			this.embarcadorParameterGeneral=new EmbarcadorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.embarcadorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmbarcadorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.embarcadorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PedidoCompraImporConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroCompraConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmbarcadorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.embarcadorSessionBean.getEsGuardarRelacionado(),this.embarcadorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmbarcadorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.embarcadorSessionBean.getEsGuardarRelacionado(),this.embarcadorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmbarcador=false;
			this.isVisibilidadCeldaDuplicarEmbarcador=true;
			this.isVisibilidadCeldaCopiarEmbarcador=true;
			this.isVisibilidadCeldaVerFormEmbarcador=true;
			this.isVisibilidadCeldaOrdenEmbarcador=true;
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=false;
			this.isVisibilidadCeldaModificarEmbarcador=false;
			this.isVisibilidadCeldaActualizarEmbarcador=false;
			this.isVisibilidadCeldaEliminarEmbarcador=false;
			this.isVisibilidadCeldaCancelarEmbarcador=false;
			this.isVisibilidadCeldaGuardarEmbarcador=false;
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=false;
			
			
			this.isVisibilidadBusquedaPorContacto=true;
			this.isVisibilidadBusquedaPorEMail=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorRuc=true;
			this.isVisibilidadBusquedaPorTelefono=true;
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdPuerto=true;
			this.isVisibilidadFK_IdTipoViaTransporte=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmbarcador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmbarcador();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmbarcador(false);
			
			this.setPermisosUsuarioEmbarcador();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.embarcadorSessionBean.getEsGuardarRelacionado() 
				|| (this.embarcadorSessionBean.getEsGuardarRelacionado() && this.embarcadorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmbarcadorClasesRelacionadas();
			}
			
			if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmbarcadorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmbarcador();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmbarcador();
			}
			
			if(!this.isPermisoBusquedaEmbarcador) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmbarcador.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmbarcador,this.isPermisoPaginacionMedioEmbarcador,this.isPermisoPaginacionTodoEmbarcador);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmbarcadorConstantesFunciones.getTiposSeleccionarEmbarcador());
				
				this.tiposColumnasSelect=EmbarcadorConstantesFunciones.getTiposSeleccionarEmbarcador(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEmbarcador();				
				//this.tiposRelacionesSelect=EmbarcadorConstantesFunciones.getTiposRelacionesEmbarcador(true);
				
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
			//if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmbarcador();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEmbarcador(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEmbarcador(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmbarcador() ;
			
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
			
			
			this.pedidocompraimporLogic=new PedidoCompraImporLogic();
			this.parametrocompraLogic=new ParametroCompraLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.tipoviatransporteLogic=new TipoViaTransporteLogic();
			this.puertoLogic=new PuertoLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.paisLogic=new PaisLogic();
			this.ciudadLogic=new CiudadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				embarcadorImplementable= (EmbarcadorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmbarcadorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				embarcadorImplementableHome= (EmbarcadorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmbarcadorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.embarcadors= new ArrayList<Embarcador>();
			this.embarcadorsEliminados= new ArrayList<Embarcador>();
						
			this.isEsNuevoEmbarcador=false;
			this.esParaAccionDesdeFormularioEmbarcador=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>() ;
			this.puertosForeignKey=new ArrayList<Puerto>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmbarcador(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmbarcador();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmbarcadorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmbarcadorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmbarcador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmbarcador(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmbarcador!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmbarcador();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmbarcador();
			}
			
			EmbarcadorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmbarcador.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmbarcador.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmbarcador.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmbarcador(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Embarcador: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmbarcador() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmbarcador")) {
				iIndex=this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Compraes")) {
					if(!ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEmbarcador();

						this.cargarParteTabPanelRelacionadaParametroCompra(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pedido Compras")) {
					if(!PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEmbarcador();

						this.cargarParteTabPanelRelacionadaPedidoCompraImpor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmbarcador();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroCompra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEmbarcador.cargarSessionConBeanSwingJInternalFrameParametroCompra(false,true,iIndex);
		this.jButtonParametroCompraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCompra();

		//this.jTabbedPaneRelacionesEmbarcador.updateUI();
		//this.jTabbedPaneRelacionesEmbarcador.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEmbarcador.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPedidoCompraImpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEmbarcador.cargarSessionConBeanSwingJInternalFramePedidoCompraImpor(false,true,iIndex);
		this.jButtonPedidoCompraImporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoCompraImpor();

		//this.jTabbedPaneRelacionesEmbarcador.updateUI();
		//this.jTabbedPaneRelacionesEmbarcador.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEmbarcador.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PedidoCompraImpor")) {
				int row=this.jTableDatosEmbarcador.getSelectedRow();
				jButtonPedidoCompraImporActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroCompra")) {
				int row=this.jTableDatosEmbarcador.getSelectedRow();
				jButtonParametroCompraActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Pedido Compra")) {

					if(this.isTienePermisosPedidoCompraImpor && this.embarcadorConstantesFunciones.mostrarPedidoCompraImporEmbarcador && !EmbarcadorConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Compras"+"("+PedidoCompraImporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Compras");

						if(embarcadorConstantesFunciones.resaltarPedidoCompraImporEmbarcador!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(embarcadorConstantesFunciones.resaltarPedidoCompraImporEmbarcador);
						}

						jmenuItem.setEnabled(this.embarcadorConstantesFunciones.activarPedidoCompraImporEmbarcador);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoCompraImpor"));

						

						this.jInternalFrameDetalleFormEmbarcador.jmenuDetalleEmbarcador.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Compra")) {

					if(this.isTienePermisosParametroCompra && this.embarcadorConstantesFunciones.mostrarParametroCompraEmbarcador && !EmbarcadorConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Compraes"+"("+ParametroCompraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Compraes");

						if(embarcadorConstantesFunciones.resaltarParametroCompraEmbarcador!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(embarcadorConstantesFunciones.resaltarParametroCompraEmbarcador);
						}

						jmenuItem.setEnabled(this.embarcadorConstantesFunciones.activarParametroCompraEmbarcador);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCompra"));

						

						this.jInternalFrameDetalleFormEmbarcador.jmenuDetalleEmbarcador.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEmbarcador(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmbarcador(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmbarcador(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmbarcadorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmbarcador();
		
		this.cargarCombosFrameForeignKeyEmbarcador();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmbarcador();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmbarcador();
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

	public void cargarCombosForeignKeyPuerto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPuertoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPuerto();
				this.cargarCombosFramePuertosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPuerto(this.puertosForeignKey);

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

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEmbarcadorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
			
			if(jTableDatosEmbarcador.getRowCount()>=1) {
				jTableDatosEmbarcador.removeRowSelectionInterval(0, jTableDatosEmbarcador.getRowCount()-1);						
			}
			
			this.isEsNuevoEmbarcador=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmbarcador(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmbarcador(true);			
			//this.embarcador=new Embarcador();
			//this.embarcador.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmbarcador(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmbarcador() ;
			
			if(EmbarcadorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmbarcador(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.embarcador);	
			this.actualizarInformacion("INFO_PADRE",false,this.embarcador);				
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
			if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Embarcador: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmbarcadorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmbarcador.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmbarcador.getSelectedRows().length;			
			}
			
			embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmbarcador--;			
				//Embarcador embarcadorAux= new Embarcador();			
				//embarcadorAux.setId(this.iIdNuevoEmbarcador);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Embarcador embarcadorOrigen=new Embarcador();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Embarcador embarcadorOrigen : embarcadorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							embarcadorOrigen =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							embarcadorOrigen =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmbarcador();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.embarcador.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmbarcador(embarcadorOrigen,this.embarcador,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.embarcadorLogic.getEmbarcadors().add(this.embarcadorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.embarcadors.add(this.embarcadorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmbarcador(false);
				
				this.jTableDatosEmbarcador.setRowSelectionInterval(this.getIndiceNuevoEmbarcador(), this.getIndiceNuevoEmbarcador());
				
				int iLastRow =  this.jTableDatosEmbarcador.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmbarcador.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmbarcador.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmbarcador(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();									
		
			Embarcador embarcadorOrigen=new Embarcador();
			Embarcador embarcadorDestino=new Embarcador();
				
			embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmbarcador.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || embarcadorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmbarcador.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorOrigen =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						embarcadorOrigen =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						embarcadorDestino =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						embarcadorDestino =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				embarcadorOrigen =embarcadorsSeleccionados.get(0);
				embarcadorDestino =embarcadorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmbarcador(embarcadorOrigen,embarcadorDestino,true,false);
				
				embarcadorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(embarcadorDestino,embarcadorLogic.getEmbarcadors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(embarcadorDestino,embarcadors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmbarcador(false);
				
				//this.jTableDatosEmbarcador.setRowSelectionInterval(this.getIndiceNuevoEmbarcador(), this.getIndiceNuevoEmbarcador());
				
				int iLastRow =  this.jTableDatosEmbarcador.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmbarcador.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmbarcador.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmbarcador(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmbarcador.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmbarcador.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmbarcador.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmbarcador.setVisible(!isVisible);
			this.jPanelPaginacionEmbarcador.setVisible(!isVisible);
			this.jPanelAccionesEmbarcador.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmbarcador();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmbarcador();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmbarcador();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmbarcador();
			
			this.abrirFrameOrderByEmbarcador();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmbarcador();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmbarcador(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmbarcador);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmbarcador.isMaximum()) {
					this.jInternalFrameDetalleFormEmbarcador.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmbarcador.setSize(this.jInternalFrameDetalleFormEmbarcador.iWidthFormulario,this.jInternalFrameDetalleFormEmbarcador.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmbarcador.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmbarcador.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmbarcador.isMaximum()) {
						this.jInternalFrameDetalleFormEmbarcador.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmbarcador.jContentPaneDetalleEmbarcador.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmbarcador.jContentPaneDetalleEmbarcador.getWidth(),EmbarcadorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmbarcador.jContentPaneDetalleEmbarcador.getWidth(),EmbarcadorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmbarcador.jContentPaneDetalleEmbarcador.getWidth(),EmbarcadorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCompra();
					}

					if(PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoCompraImpor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmbarcador.setVisible(true);
	        this.jInternalFrameDetalleFormEmbarcador.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmbarcador() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmbarcador==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmbarcador=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmbarcador,false,this);
				} else {
					this.jInternalFrameOrderByEmbarcador=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmbarcador,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmbarcador);
				this.jInternalFrameOrderByEmbarcador.setVisible(false);
				this.jInternalFrameOrderByEmbarcador.setSelected(false);
				
				this.jInternalFrameOrderByEmbarcador.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmbarcador"));
				
				this.inicializarActualizarBindingTablaOrderByEmbarcador();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmbarcador() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmbarcador==null) {
				
				this.jInternalFrameImportacionEmbarcador=new ImportacionJInternalFrame(EmbarcadorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmbarcador);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmbarcador);
				this.jInternalFrameImportacionEmbarcador.setVisible(false);
				this.jInternalFrameImportacionEmbarcador.setSelected(false);


				this.jInternalFrameImportacionEmbarcador.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmbarcador"));
				this.jInternalFrameImportacionEmbarcador.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmbarcador"));
				this.jInternalFrameImportacionEmbarcador.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmbarcador"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmbarcador() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmbarcador==null) {
				this.jInternalFrameReporteDinamicoEmbarcador=new ReporteDinamicoJInternalFrame(EmbarcadorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmbarcador);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmbarcador);
				this.jInternalFrameReporteDinamicoEmbarcador.setVisible(false);
				this.jInternalFrameReporteDinamicoEmbarcador.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmbarcador.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmbarcador"));
				this.jInternalFrameReporteDinamicoEmbarcador.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmbarcador"));
				this.jInternalFrameReporteDinamicoEmbarcador.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmbarcador"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmbarcador();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroCompra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.jScrollPanelDatosParametroCompra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEmbarcador.jContentPaneDetalleEmbarcador.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.jScrollPanelDatosParametroCompra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.jScrollPanelDatosParametroCompra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.jScrollPanelDatosParametroCompra.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPedidoCompraImpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEmbarcador.jContentPaneDetalleEmbarcador.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEmbarcador() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmbarcador);
			
	       	this.jInternalFrameDetalleFormEmbarcador.setVisible(false);
	        this.jInternalFrameDetalleFormEmbarcador.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmbarcador.dispose();
			//this.jInternalFrameDetalleFormEmbarcador=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmbarcador() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmbarcador.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmbarcador.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmbarcador() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmbarcador.setVisible(true);
	        this.jInternalFrameImportacionEmbarcador.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmbarcador() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmbarcador.setVisible(true);
	        this.jInternalFrameOrderByEmbarcador.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmbarcador() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmbarcador.setVisible(false);
	        this.jInternalFrameOrderByEmbarcador.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmbarcador() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmbarcador.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmbarcador.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmbarcador() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmbarcador.setVisible(false);
	        this.jInternalFrameImportacionEmbarcador.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmbarcador(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmbarcador(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmbarcador(true);
			//this.isEsNuevoEmbarcador=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmbarcador("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmbarcador(false) ;
			
			if(embarcadorSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.getEsGuardarRelacionado() && PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoCompraImporActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.getEsGuardarRelacionado() && ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCompraActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EmbarcadorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmbarcador(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmbarcador(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmbarcadorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmbarcador(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmbarcador(true);
			//this.isEsNuevoEmbarcador=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.embarcador.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmbarcador("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmbarcador(false) ;
			
			if(EmbarcadorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmbarcador(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmbarcador(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.embarcadorConstantesFunciones.cargarid_empleadoEmbarcador) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingEmbarcador(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoViaTransporte(List<TipoViaTransporte> tipoviatransportesForeignKey)throws Exception{
		TableColumn tableColumnTipoViaTransporte=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE));
		TableCellEditor tableCellEditorTipoViaTransporte =tableColumnTipoViaTransporte.getCellEditor();

		TipoViaTransporteTableCell tipoviatransporteTableCellFk=(TipoViaTransporteTableCell)tableCellEditorTipoViaTransporte;

		if(tipoviatransporteTableCellFk!=null) {
			tipoviatransporteTableCellFk.settipoviatransportesForeignKey(tipoviatransportesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmbarcador.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoviatransporteTableCellFk.setRowActual(intSelectedRow);
			//tipoviatransporteTableCellFk.settipoviatransportesForeignKeyActual(tipoviatransportesForeignKey);
		//}


		if(tipoviatransporteTableCellFk!=null) {
			tipoviatransporteTableCellFk.RecargarTipoViaTransportesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPuerto(List<Puerto> puertosForeignKey)throws Exception{
		TableColumn tableColumnPuerto=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDPUERTO));
		TableCellEditor tableCellEditorPuerto =tableColumnPuerto.getCellEditor();

		PuertoTableCell puertoTableCellFk=(PuertoTableCell)tableCellEditorPuerto;

		if(puertoTableCellFk!=null) {
			puertoTableCellFk.setpuertosForeignKey(puertosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmbarcador.getSelectedRow();

		//if(intSelectedRow<=0) {
			//puertoTableCellFk.setRowActual(intSelectedRow);
			//puertoTableCellFk.setpuertosForeignKeyActual(puertosForeignKey);
		//}


		if(puertoTableCellFk!=null) {
			puertoTableCellFk.RecargarPuertosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmbarcador.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmbarcador.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmbarcador.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmbarcador(false);
			
			//if(!this.isEsNuevoEmbarcador) {								
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				
			}
			
			if(this.permiteMantenimiento(this.embarcador)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmbarcador=true;
					this.inicializarActualizarBindingTablaEmbarcador(false);
					this.isEsNuevoEmbarcador=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmbarcador=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmbarcador=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmbarcador(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmbarcador(false);
				
				this.habilitarDeshabilitarControlesEmbarcador(false);
			
												
				
				if(EmbarcadorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmbarcador();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmbarcadorActionPerformed(evt,embarcadorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmbarcador(this.embarcador,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmbarcador.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,embarcadorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.embarcador.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmbarcadorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				this.embarcador.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				this.embarcador.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.embarcador)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmbarcadorModel) this.jTableDatosEmbarcador.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmbarcador=true;
				this.inicializarActualizarBindingTablaEmbarcador(false);
				this.isEsNuevoEmbarcador=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmbarcador(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmbarcador(false);
				
				this.habilitarDeshabilitarControlesEmbarcador(false);
				
				
				
				if(EmbarcadorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmbarcador();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmbarcadorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmbarcador.getRowCount()>=1) {
				jTableDatosEmbarcador.removeRowSelectionInterval(0, jTableDatosEmbarcador.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmbarcador(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmbarcador(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmbarcador(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmbarcador(false) ;
			
			this.isEsNuevoEmbarcador=false;
			
			if(EmbarcadorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmbarcador();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmbarcadorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmbarcador(false);
				
				//SI ES MANUAL
				if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmbarcador();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmbarcadorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmbarcador--;			
			//Embarcador embarcadorAux= new Embarcador();			
			//embarcadorAux.setId(this.iIdNuevoEmbarcador);
			
			if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmbarcador();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
			
			this.embarcador.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.embarcadorLogic.getEmbarcadors().add(this.embarcadorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.embarcadors.add(this.embarcadorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmbarcador(false);
			
			this.jTableDatosEmbarcador.setRowSelectionInterval(this.getIndiceNuevoEmbarcador(), this.getIndiceNuevoEmbarcador());
			
			int iLastRow =  this.jTableDatosEmbarcador.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmbarcador.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmbarcador.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmbarcador(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmbarcadorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmbarcador(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmbarcador(false);
			
			//SI ES MANUAL
			if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmbarcador();
			}
			
			//this.abrirFrameTreeEmbarcador();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmbarcadorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE EmbarcadorES ?", "MANTENIMIENTO DE Embarcador", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmbarcador.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmbarcador();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.embarcadorReturnGeneral=embarcadorLogic.procesarImportacionEmbarcadorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.embarcadorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmbarcadorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmbarcadorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmbarcador.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmbarcador.setFileImportacion(this.jInternalFrameImportacionEmbarcador.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmbarcador.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmbarcador.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmbarcador.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmbarcador.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmbarcadorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();		

		embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmbarcadorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmbarcadorBaseDesign.jrxml";
			
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
			
			this.generarReporteEmbarcadors("Todos",embarcadorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Embarcador",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmbarcadorConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_CONTACTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntacto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntacto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntacto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntacto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_FAX:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_x_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_x_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_x_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_x_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoViaTransporte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoViaTransporte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoViaTransporte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoViaTransporte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_IDPUERTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Puerto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Puerto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Puerto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Puerto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmbarcadorConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEmbarcador.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmbarcadorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmbarcadorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EmbarcadorConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case EmbarcadorConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case EmbarcadorConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case EmbarcadorConstantesFunciones.LABEL_CONTACTO:
					sNombreCampoCategoria="contacto";
					break;

				case EmbarcadorConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="e_mail";
					break;

				case EmbarcadorConstantesFunciones.LABEL_FAX:
					sNombreCampoCategoria="fax";
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					sNombreCampoCategoria="id_tipo_via_transporte";
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDPUERTO:
					sNombreCampoCategoria="id_puerto";
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="id_ciudad";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmbarcadorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmbarcadorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EmbarcadorConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case EmbarcadorConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case EmbarcadorConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case EmbarcadorConstantesFunciones.LABEL_CONTACTO:
					sNombreCampoCategoriaValor="contacto";
					break;

				case EmbarcadorConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="e_mail";
					break;

				case EmbarcadorConstantesFunciones.LABEL_FAX:
					sNombreCampoCategoriaValor="fax";
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					sNombreCampoCategoriaValor="id_tipo_via_transporte";
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDPUERTO:
					sNombreCampoCategoriaValor="id_puerto";
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="id_ciudad";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmbarcadorConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmbarcadorConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EmbarcadorConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case EmbarcadorConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case EmbarcadorConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case EmbarcadorConstantesFunciones.LABEL_CONTACTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Contacto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"contacto");
					break;

				case EmbarcadorConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"E Mail",sNombreCampoCategoria,sNombreCampoCategoriaValor,"e_mail");
					break;

				case EmbarcadorConstantesFunciones.LABEL_FAX:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fax",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fax");
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Via Transporte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_via_transporte");
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDPUERTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Puerto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_puerto");
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ciudad");
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
	
	public void jButtonGenerarExcelReporteDinamicoEmbarcadorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();		
		
		embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"embarcador";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Embarcadors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmbarcadorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_RUC);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_CONTACTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_CONTACTO);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.getcontacto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.gete_mail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_FAX:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_FAX);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.getfax());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.gettipoviatransporte_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDPUERTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDPUERTO);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.getpuerto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmbarcadorConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(Embarcador embarcador:embarcadorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(embarcador.getciudad_descripcion());
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
			//	this.getFilaCabeceraExportarExcelEmbarcador(row);				
			//	iRow++;
			//}				
			
			//for(Embarcador embarcadorAux:embarcadorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmbarcador(embarcadorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Embarcador",JOptionPane.INFORMATION_MESSAGE);
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
				this.embarcadorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmbarcador(false);
			
			//SI ES MANUAL
			if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmbarcador();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmbarcadorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmbarcador(false);
			
			//SI ES MANUAL
			if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmbarcador();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmbarcadorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmbarcador(false);
			
			//SI ES MANUAL
			if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmbarcador();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmbarcador() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmbarcador.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmbarcador.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmbarcador.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmbarcador.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmbarcador.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmbarcador.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmbarcador.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmbarcador(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmbarcador(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmbarcador(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmbarcador(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmbarcador(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmbarcador(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmbarcador(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmbarcador(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmbarcador() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmbarcador();
		
		this.inicializarActualizarBindingBotonesManualEmbarcador(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmbarcador();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmbarcador() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmbarcador(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmbarcador(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmbarcador.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmbarcador.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmbarcador.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmbarcador!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmbarcador.jCheckBoxPostAccionNuevoEmbarcador.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmbarcador.jCheckBoxPostAccionSinCerrarEmbarcador.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmbarcador.jCheckBoxPostAccionSinMensajeEmbarcador.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmbarcador.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmbarcador.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmbarcador.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmbarcador!=null) {
				this.jInternalFrameDetalleFormEmbarcador.jCheckBoxPostAccionNuevoEmbarcador.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmbarcador.jCheckBoxPostAccionSinCerrarEmbarcador.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmbarcador.jCheckBoxPostAccionSinMensajeEmbarcador.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmbarcador.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmbarcador.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmbarcador.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmbarcador!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmbarcador.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmbarcador.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmbarcador.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmbarcador.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmbarcador!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmbarcador.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmbarcador.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmbarcador(Boolean esInicializar) throws Exception {
		try	{	
			if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmbarcador(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmbarcador() throws Exception {
		try	{
			if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmbarcador();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmbarcador() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmbarcador() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmbarcador.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmbarcador.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmbarcador.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmbarcador.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmbarcador.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmbarcador.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmbarcador.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmbarcador.addItem(reporte);
			}
			
			
			if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmbarcador.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmbarcador.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmbarcador.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmbarcador.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmbarcador.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmbarcador.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmbarcador.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmbarcador.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmbarcador.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmbarcador();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmbarcador() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmbarcador!=null) {
				this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmbarcador!=null) {
				this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmbarcador.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmbarcador!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmbarcador.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmbarcador.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmbarcador.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmbarcador.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmbarcador()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.contactoBusquedaPorContacto=this.jTextAreacontactoBusquedaPorContactoEmbarcador.getText();
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreEmbarcador.getText();
		this.telefonoBusquedaPorTelefono=this.jTextFieldtelefonoBusquedaPorTelefonoEmbarcador.getText();
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.getSelectedItem()).getId();}
		if(this.jComboBoxid_puertoFK_IdPuertoEmbarcador.getSelectedItem()!=null){this.id_puertoFK_IdPuerto=((Puerto)this.jComboBoxid_puertoFK_IdPuertoEmbarcador.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmbarcador(Boolean esInicializar) throws Exception {				
		if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmbarcador();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmbarcador() throws Exception {
		this.inicializarActualizarBindingTablaEmbarcador(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmbarcador() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmbarcadorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcadorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmbarcador(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=embarcadorLogic.getEmbarcadors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=embarcadors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmbarcador.setModel(new EmbarcadorModel(this.embarcadorLogic.getEmbarcadors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmbarcador.setModel(new EmbarcadorModel(this.embarcadors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmbarcador!=null && this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmbarcador();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO,embarcadorConstantesFunciones.resaltarSeleccionarEmbarcador,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO,embarcadorConstantesFunciones.resaltarSeleccionarEmbarcador,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_ID));

		if(this.embarcadorConstantesFunciones.mostraridEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.embarcadorConstantesFunciones.resaltaridEmbarcador,this.embarcadorConstantesFunciones.activaridEmbarcador,this,true,"idEmbarcador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.embarcadorConstantesFunciones.resaltaridEmbarcador,this.embarcadorConstantesFunciones.activaridEmbarcador,this,true,"idEmbarcador","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDEMPRESA));

		if(this.embarcadorConstantesFunciones.mostrarid_empresaEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.embarcadorConstantesFunciones.resaltarid_empresaEmbarcador,this,this.embarcadorConstantesFunciones.activarid_empresaEmbarcador));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.embarcadorConstantesFunciones.resaltarid_empresaEmbarcador,this,this.embarcadorConstantesFunciones.activarid_empresaEmbarcador,false,"id_empresaEmbarcador","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_NOMBRE));

		if(this.embarcadorConstantesFunciones.mostrarnombreEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.embarcadorConstantesFunciones.resaltarnombreEmbarcador,this.embarcadorConstantesFunciones.activarnombreEmbarcador,this,true,"nombreEmbarcador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.embarcadorConstantesFunciones.resaltarnombreEmbarcador,this.embarcadorConstantesFunciones.activarnombreEmbarcador,this,true,"nombreEmbarcador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_RUC));

		if(this.embarcadorConstantesFunciones.mostrarrucEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.embarcadorConstantesFunciones.resaltarrucEmbarcador,this.embarcadorConstantesFunciones.activarrucEmbarcador,this,true,"rucEmbarcador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.embarcadorConstantesFunciones.resaltarrucEmbarcador,this.embarcadorConstantesFunciones.activarrucEmbarcador,this,true,"rucEmbarcador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_DIRECCION));

		if(this.embarcadorConstantesFunciones.mostrardireccionEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.embarcadorConstantesFunciones.resaltardireccionEmbarcador,this.embarcadorConstantesFunciones.activardireccionEmbarcador,this,true,"direccionEmbarcador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.embarcadorConstantesFunciones.resaltardireccionEmbarcador,this.embarcadorConstantesFunciones.activardireccionEmbarcador,this,true,"direccionEmbarcador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_TELEFONO));

		if(this.embarcadorConstantesFunciones.mostrartelefonoEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.embarcadorConstantesFunciones.resaltartelefonoEmbarcador,this.embarcadorConstantesFunciones.activartelefonoEmbarcador,this,true,"telefonoEmbarcador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.embarcadorConstantesFunciones.resaltartelefonoEmbarcador,this.embarcadorConstantesFunciones.activartelefonoEmbarcador,this,true,"telefonoEmbarcador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_CONTACTO));

		if(this.embarcadorConstantesFunciones.mostrarcontactoEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_CONTACTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.embarcadorConstantesFunciones.resaltarcontactoEmbarcador,this.embarcadorConstantesFunciones.activarcontactoEmbarcador,this,true,"contactoEmbarcador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.embarcadorConstantesFunciones.resaltarcontactoEmbarcador,this.embarcadorConstantesFunciones.activarcontactoEmbarcador,this,true,"contactoEmbarcador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_EMAIL));

		if(this.embarcadorConstantesFunciones.mostrare_mailEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.embarcadorConstantesFunciones.resaltare_mailEmbarcador,this.embarcadorConstantesFunciones.activare_mailEmbarcador,this,true,"e_mailEmbarcador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.embarcadorConstantesFunciones.resaltare_mailEmbarcador,this.embarcadorConstantesFunciones.activare_mailEmbarcador,this,true,"e_mailEmbarcador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_FAX));

		if(this.embarcadorConstantesFunciones.mostrarfaxEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_FAX,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.embarcadorConstantesFunciones.resaltarfaxEmbarcador,this.embarcadorConstantesFunciones.activarfaxEmbarcador,this,true,"faxEmbarcador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.embarcadorConstantesFunciones.resaltarfaxEmbarcador,this.embarcadorConstantesFunciones.activarfaxEmbarcador,this,true,"faxEmbarcador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE));

		if(this.embarcadorConstantesFunciones.mostrarid_tipo_via_transporteEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoViaTransporteTableCell(this.tipoviatransportesForeignKey,this.embarcadorConstantesFunciones.resaltarid_tipo_via_transporteEmbarcador,this,this.embarcadorConstantesFunciones.activarid_tipo_via_transporteEmbarcador));
			tableColumn.setCellEditor(new TipoViaTransporteTableCell(this.tipoviatransportesForeignKey,this.embarcadorConstantesFunciones.resaltarid_tipo_via_transporteEmbarcador,this,this.embarcadorConstantesFunciones.activarid_tipo_via_transporteEmbarcador,true,"id_tipo_via_transporteEmbarcador","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDPUERTO));

		if(this.embarcadorConstantesFunciones.mostrarid_puertoEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_IDPUERTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PuertoTableCell(this.puertosForeignKey,this.embarcadorConstantesFunciones.resaltarid_puertoEmbarcador,this,this.embarcadorConstantesFunciones.activarid_puertoEmbarcador));
			tableColumn.setCellEditor(new PuertoTableCell(this.puertosForeignKey,this.embarcadorConstantesFunciones.resaltarid_puertoEmbarcador,this,this.embarcadorConstantesFunciones.activarid_puertoEmbarcador,true,"id_puertoEmbarcador","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.embarcadorConstantesFunciones.mostrarid_empleadoEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.embarcadorConstantesFunciones.resaltarid_empleadoEmbarcador,this,this.embarcadorConstantesFunciones.activarid_empleadoEmbarcador));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.embarcadorConstantesFunciones.resaltarid_empleadoEmbarcador,this,this.embarcadorConstantesFunciones.activarid_empleadoEmbarcador,true,"id_empleadoEmbarcador","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDPAIS));

		if(this.embarcadorConstantesFunciones.mostrarid_paisEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.embarcadorConstantesFunciones.resaltarid_paisEmbarcador,this,this.embarcadorConstantesFunciones.activarid_paisEmbarcador));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.embarcadorConstantesFunciones.resaltarid_paisEmbarcador,this,this.embarcadorConstantesFunciones.activarid_paisEmbarcador,true,"id_paisEmbarcador","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,EmbarcadorConstantesFunciones.LABEL_IDCIUDAD));

		if(this.embarcadorConstantesFunciones.mostrarid_ciudadEmbarcador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmbarcadorConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.embarcadorConstantesFunciones.resaltarid_ciudadEmbarcador,this,this.embarcadorConstantesFunciones.activarid_ciudadEmbarcador));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.embarcadorConstantesFunciones.resaltarid_ciudadEmbarcador,this,this.embarcadorConstantesFunciones.activarid_ciudadEmbarcador,true,"id_ciudadEmbarcador","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmbarcadorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPedidoCompraImpor && this.embarcadorConstantesFunciones.mostrarPedidoCompraImporEmbarcador && !EmbarcadorConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Compras");
				tableColumn.setHeaderValue("Pedido Compras");
				tableColumn.setCellRenderer(new PedidoCompraImporTableCell(embarcadorConstantesFunciones.resaltarPedidoCompraImporEmbarcador,this,this.embarcadorConstantesFunciones.activarPedidoCompraImporEmbarcador));
				tableColumn.setCellEditor(new PedidoCompraImporTableCell(embarcadorConstantesFunciones.resaltarPedidoCompraImporEmbarcador,this,this.embarcadorConstantesFunciones.activarPedidoCompraImporEmbarcador));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEmbarcador.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroCompra && this.embarcadorConstantesFunciones.mostrarParametroCompraEmbarcador && !EmbarcadorConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Compraes");
				tableColumn.setHeaderValue("Parametro Compraes");
				tableColumn.setCellRenderer(new ParametroCompraTableCell(embarcadorConstantesFunciones.resaltarParametroCompraEmbarcador,this,this.embarcadorConstantesFunciones.activarParametroCompraEmbarcador));
				tableColumn.setCellEditor(new ParametroCompraTableCell(embarcadorConstantesFunciones.resaltarParametroCompraEmbarcador,this,this.embarcadorConstantesFunciones.activarParametroCompraEmbarcador));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEmbarcador.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.embarcadorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.embarcadorSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmbarcador.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.embarcadorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.embarcadorSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmbarcador.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmbarcador && this.isPermisoGuardarCambiosEmbarcador) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.embarcadorSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.embarcadorSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmbarcador.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.embarcadorSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEmbarcador.addColumn(tableColumn);
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
			
			this.jTableDatosEmbarcador.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmbarcador && this.isPermisoGuardarCambiosEmbarcador) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.embarcadorSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmbarcador && this.isPermisoGuardarCambiosEmbarcador) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmbarcador.moveColumn(this.jTableDatosEmbarcador.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmbarcador.moveColumn(this.jTableDatosEmbarcador.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.embarcadorSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEmbarcador.moveColumn(this.jTableDatosEmbarcador.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmbarcador.moveColumn(this.jTableDatosEmbarcador.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmbarcador.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmbarcador.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmbarcador,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmbarcador.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmbarcador.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmbarcador.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmbarcador.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmbarcador.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=embarcadorLogic.getEmbarcadors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=embarcadors.size()-1;
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
		//this.jTableDatosEmbarcador.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmbarcador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmbarcador();
			
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
				
				//this.isEsNuevoEmbarcador=false;
					
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
				if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmbarcador==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmbarcador.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmbarcador.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.embarcador.getsType().equals("DUPLICADO")
				   || this.embarcador.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmbarcador=true;
				
				} else {
					this.isEsNuevoEmbarcador=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
					if(this.embarcador.getId()>=0 && !this.embarcador.getIsNew()) {						
						this.isEsNuevoEmbarcador=false;
						
					} else {
						this.isEsNuevoEmbarcador=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmbarcador(esRelaciones);						
				
				this.seleccionarEmbarcador(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.embarcador.getId()<0) {
					this.isEsNuevoEmbarcador=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmbarcador(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmbarcador(evt,rowIndex);
				}	
				
				if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Embarcador: " + this.dDif); 
					}
				}								
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmbarcador(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.embarcador)) {
					if(this.embarcador.getId()>0) {
						this.embarcador.setIsDeleted(true);
						
						this.embarcadorsEliminados.add(this.embarcador);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.embarcadorLogic.getEmbarcadors().remove(this.embarcador);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.embarcadors.remove(this.embarcador);				
					}
					
					
					((EmbarcadorModel) this.jTableDatosEmbarcador.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmbarcador(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmbarcador(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmbarcador) {
			
			if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmbarcador.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmbarcador.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmbarcador(this.embarcador);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.embarcadorConstantesFunciones.cargarid_empresaEmbarcador || this.embarcadorConstantesFunciones.event_dependid_empresaEmbarcador) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.embarcador.getid_empresa());
									//this.inicializarActualizarBindingEmbarcador(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(embarcador.getEmpresa()!=null) {
							this.empresasForeignKey.add(embarcador.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.embarcador.getid_empresa(),false,"Formulario");

					//TipoViaTransporte
					if(!this.embarcadorConstantesFunciones.cargarid_tipo_via_transporteEmbarcador || this.embarcadorConstantesFunciones.event_dependid_tipo_via_transporteEmbarcador) {
						//this.cargarCombosTipoViaTransportesForeignKeyLista(" where id="+this.embarcador.getid_tipo_via_transporte());
									//this.inicializarActualizarBindingEmbarcador(false,false);
						this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>();

						if(embarcador.getTipoViaTransporte()!=null) {
							this.tipoviatransportesForeignKey.add(embarcador.getTipoViaTransporte());
						}

						this.addItemDefectoCombosForeignKeyTipoViaTransporte();
						this.cargarCombosFrameTipoViaTransportesForeignKey("Todos");
					}
					this.setActualTipoViaTransporteForeignKey(this.embarcador.getid_tipo_via_transporte(),false,"Formulario");

					//Puerto
					if(!this.embarcadorConstantesFunciones.cargarid_puertoEmbarcador || this.embarcadorConstantesFunciones.event_dependid_puertoEmbarcador) {
						//this.cargarCombosPuertosForeignKeyLista(" where id="+this.embarcador.getid_puerto());
									//this.inicializarActualizarBindingEmbarcador(false,false);
						this.puertosForeignKey=new ArrayList<Puerto>();

						if(embarcador.getPuerto()!=null) {
							this.puertosForeignKey.add(embarcador.getPuerto());
						}

						this.addItemDefectoCombosForeignKeyPuerto();
						this.cargarCombosFramePuertosForeignKey("Todos");
					}
					this.setActualPuertoForeignKey(this.embarcador.getid_puerto(),false,"Formulario");

					//Empleado
					if(!this.embarcadorConstantesFunciones.cargarid_empleadoEmbarcador || this.embarcadorConstantesFunciones.event_dependid_empleadoEmbarcador) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.embarcador.getid_empleado());
									//this.inicializarActualizarBindingEmbarcador(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(embarcador.getEmpleado()!=null) {
							this.empleadosForeignKey.add(embarcador.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.embarcador.getid_empleado(),false,"Formulario");

					//Pais
					if(!this.embarcadorConstantesFunciones.cargarid_paisEmbarcador || this.embarcadorConstantesFunciones.event_dependid_paisEmbarcador) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.embarcador.getid_pais());
									//this.inicializarActualizarBindingEmbarcador(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(embarcador.getPais()!=null) {
							this.paissForeignKey.add(embarcador.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.embarcador.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.embarcadorConstantesFunciones.cargarid_ciudadEmbarcador || this.embarcadorConstantesFunciones.event_dependid_ciudadEmbarcador) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.embarcador.getid_ciudad());
									//this.inicializarActualizarBindingEmbarcador(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(embarcador.getCiudad()!=null) {
							this.ciudadsForeignKey.add(embarcador.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.embarcador.getid_ciudad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmbarcador("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmbarcador(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmbarcador() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmbarcador(Embarcador embarcador) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmbarcador(embarcador,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmbarcador(Embarcador embarcador,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmbarcador(embarcador);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmbarcador(embarcador,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmbarcador(embarcador);
	}
	
	public void setVariablesObjetoActualToFormularioEmbarcador(Embarcador embarcador) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.setText(embarcador.getId().toString());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldnombreEmbarcador.setText(embarcador.getnombre());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldrucEmbarcador.setText(embarcador.getruc());
			this.jInternalFrameDetalleFormEmbarcador.jTextAreadireccionEmbarcador.setText(embarcador.getdireccion());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldtelefonoEmbarcador.setText(embarcador.gettelefono());
			this.jInternalFrameDetalleFormEmbarcador.jTextAreacontactoEmbarcador.setText(embarcador.getcontacto());
			this.jInternalFrameDetalleFormEmbarcador.jTextFielde_mailEmbarcador.setText(embarcador.gete_mail());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldfaxEmbarcador.setText(embarcador.getfax());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Embarcador embarcadorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,embarcadorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Embarcador embarcadorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				embarcadorLocal=this.embarcador;
			} else {
				embarcadorLocal=this.embarcadorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(embarcadorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmbarcador(embarcadorLocal,true);
					
					if(embarcadorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(embarcadorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.embarcadorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(embarcadorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmbarcador(Embarcador embarcador,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmbarcador(embarcador,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(embarcador);
	}
	
	public void setVariablesFormularioToObjetoActualEmbarcador(Embarcador embarcador,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmbarcador(embarcador,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmbarcador(Embarcador embarcador,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.getText()==null || this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.getText()=="" || this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.getText()=="Id") {
				this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.setText("0");
			}

			if(conColumnasBase) {embarcador.setId(Long.parseLong(this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmbarcadorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelIdEmbarcador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			embarcador.setnombre(this.jInternalFrameDetalleFormEmbarcador.jTextFieldnombreEmbarcador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmbarcadorConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelnombreEmbarcador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			embarcador.setruc(this.jInternalFrameDetalleFormEmbarcador.jTextFieldrucEmbarcador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmbarcadorConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelrucEmbarcador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			embarcador.setdireccion(this.jInternalFrameDetalleFormEmbarcador.jTextAreadireccionEmbarcador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmbarcadorConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabeldireccionEmbarcador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			embarcador.settelefono(this.jInternalFrameDetalleFormEmbarcador.jTextFieldtelefonoEmbarcador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmbarcadorConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabeltelefonoEmbarcador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			embarcador.setcontacto(this.jInternalFrameDetalleFormEmbarcador.jTextAreacontactoEmbarcador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmbarcadorConstantesFunciones.LABEL_CONTACTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelcontactoEmbarcador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			embarcador.sete_mail(this.jInternalFrameDetalleFormEmbarcador.jTextFielde_mailEmbarcador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmbarcadorConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabele_mailEmbarcador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			embarcador.setfax(this.jInternalFrameDetalleFormEmbarcador.jTextFieldfaxEmbarcador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmbarcadorConstantesFunciones.LABEL_FAX+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmbarcador.jLabelfaxEmbarcador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmbarcador(Embarcador embarcadorBean,Embarcador embarcador,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && embarcadorBean.getid_tipo_via_transporte()!=null && !embarcadorBean.getid_tipo_via_transporte().equals(-1L))) {embarcador.setid_tipo_via_transporte(embarcadorBean.getid_tipo_via_transporte());}
			if(conDefault || (!conDefault && embarcadorBean.getid_puerto()!=null && !embarcadorBean.getid_puerto().equals(-1L))) {embarcador.setid_puerto(embarcadorBean.getid_puerto());}
			if(conDefault || (!conDefault && embarcadorBean.getid_empleado()!=null && !embarcadorBean.getid_empleado().equals(-1L))) {embarcador.setid_empleado(embarcadorBean.getid_empleado());}
			if(conDefault || (!conDefault && embarcadorBean.getid_pais()!=null && !embarcadorBean.getid_pais().equals(-1L))) {embarcador.setid_pais(embarcadorBean.getid_pais());}
			if(conDefault || (!conDefault && embarcadorBean.getid_ciudad()!=null && !embarcadorBean.getid_ciudad().equals(null))) {embarcador.setid_ciudad(embarcadorBean.getid_ciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmbarcador(Embarcador embarcadorOrigen,Embarcador embarcador,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && embarcadorOrigen.getId()!=null && !embarcadorOrigen.getId().equals(0L))) {embarcador.setId(embarcadorOrigen.getId());}}
			if(conDefault || (!conDefault && embarcadorOrigen.getnombre()!=null && !embarcadorOrigen.getnombre().equals(""))) {embarcador.setnombre(embarcadorOrigen.getnombre());}
			if(conDefault || (!conDefault && embarcadorOrigen.getruc()!=null && !embarcadorOrigen.getruc().equals(""))) {embarcador.setruc(embarcadorOrigen.getruc());}
			if(conDefault || (!conDefault && embarcadorOrigen.getdireccion()!=null && !embarcadorOrigen.getdireccion().equals(""))) {embarcador.setdireccion(embarcadorOrigen.getdireccion());}
			if(conDefault || (!conDefault && embarcadorOrigen.gettelefono()!=null && !embarcadorOrigen.gettelefono().equals(""))) {embarcador.settelefono(embarcadorOrigen.gettelefono());}
			if(conDefault || (!conDefault && embarcadorOrigen.getcontacto()!=null && !embarcadorOrigen.getcontacto().equals(""))) {embarcador.setcontacto(embarcadorOrigen.getcontacto());}
			if(conDefault || (!conDefault && embarcadorOrigen.gete_mail()!=null && !embarcadorOrigen.gete_mail().equals(""))) {embarcador.sete_mail(embarcadorOrigen.gete_mail());}
			if(conDefault || (!conDefault && embarcadorOrigen.getfax()!=null && !embarcadorOrigen.getfax().equals(""))) {embarcador.setfax(embarcadorOrigen.getfax());}
			if(conDefault || (!conDefault && embarcadorOrigen.getid_tipo_via_transporte()!=null && !embarcadorOrigen.getid_tipo_via_transporte().equals(-1L))) {embarcador.setid_tipo_via_transporte(embarcadorOrigen.getid_tipo_via_transporte());}
			if(conDefault || (!conDefault && embarcadorOrigen.getid_puerto()!=null && !embarcadorOrigen.getid_puerto().equals(-1L))) {embarcador.setid_puerto(embarcadorOrigen.getid_puerto());}
			if(conDefault || (!conDefault && embarcadorOrigen.getid_empleado()!=null && !embarcadorOrigen.getid_empleado().equals(-1L))) {embarcador.setid_empleado(embarcadorOrigen.getid_empleado());}
			if(conDefault || (!conDefault && embarcadorOrigen.getid_pais()!=null && !embarcadorOrigen.getid_pais().equals(-1L))) {embarcador.setid_pais(embarcadorOrigen.getid_pais());}
			if(conDefault || (!conDefault && embarcadorOrigen.getid_ciudad()!=null && !embarcadorOrigen.getid_ciudad().equals(null))) {embarcador.setid_ciudad(embarcadorOrigen.getid_ciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmbarcador(Embarcador embarcador) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.setText(embarcador.getId().toString());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldnombreEmbarcador.setText(embarcador.getnombre());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldrucEmbarcador.setText(embarcador.getruc());
			this.jInternalFrameDetalleFormEmbarcador.jTextAreadireccionEmbarcador.setText(embarcador.getdireccion());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldtelefonoEmbarcador.setText(embarcador.gettelefono());
			this.jInternalFrameDetalleFormEmbarcador.jTextAreacontactoEmbarcador.setText(embarcador.getcontacto());
			this.jInternalFrameDetalleFormEmbarcador.jTextFielde_mailEmbarcador.setText(embarcador.gete_mail());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldfaxEmbarcador.setText(embarcador.getfax());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmbarcador(EmbarcadorBean embarcadorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.setText(embarcadorBean.getId().toString());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldnombreEmbarcador.setText(embarcadorBean.getnombre());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldrucEmbarcador.setText(embarcadorBean.getruc());
			this.jInternalFrameDetalleFormEmbarcador.jTextAreadireccionEmbarcador.setText(embarcadorBean.getdireccion());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldtelefonoEmbarcador.setText(embarcadorBean.gettelefono());
			this.jInternalFrameDetalleFormEmbarcador.jTextAreacontactoEmbarcador.setText(embarcadorBean.getcontacto());
			this.jInternalFrameDetalleFormEmbarcador.jTextFielde_mailEmbarcador.setText(embarcadorBean.gete_mail());
			this.jInternalFrameDetalleFormEmbarcador.jTextFieldfaxEmbarcador.setText(embarcadorBean.getfax());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmbarcador(EmbarcadorParameterReturnGeneral embarcadorReturnGeneral,EmbarcadorBean embarcadorBean,Boolean conDefault) throws Exception { 
		try {
			Embarcador embarcadorLocal=new Embarcador();
			
			embarcadorLocal=embarcadorReturnGeneral.getEmbarcador();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && embarcadorLocal.getId()!=null && !embarcadorLocal.getId().equals(0L))) {embarcadorBean.setId(embarcadorLocal.getId());}}
			if(conDefault || (!conDefault && embarcadorLocal.getnombre()!=null && !embarcadorLocal.getnombre().equals(""))) {embarcadorBean.setnombre(embarcadorLocal.getnombre());}
			if(conDefault || (!conDefault && embarcadorLocal.getruc()!=null && !embarcadorLocal.getruc().equals(""))) {embarcadorBean.setruc(embarcadorLocal.getruc());}
			if(conDefault || (!conDefault && embarcadorLocal.getdireccion()!=null && !embarcadorLocal.getdireccion().equals(""))) {embarcadorBean.setdireccion(embarcadorLocal.getdireccion());}
			if(conDefault || (!conDefault && embarcadorLocal.gettelefono()!=null && !embarcadorLocal.gettelefono().equals(""))) {embarcadorBean.settelefono(embarcadorLocal.gettelefono());}
			if(conDefault || (!conDefault && embarcadorLocal.getcontacto()!=null && !embarcadorLocal.getcontacto().equals(""))) {embarcadorBean.setcontacto(embarcadorLocal.getcontacto());}
			if(conDefault || (!conDefault && embarcadorLocal.gete_mail()!=null && !embarcadorLocal.gete_mail().equals(""))) {embarcadorBean.sete_mail(embarcadorLocal.gete_mail());}
			if(conDefault || (!conDefault && embarcadorLocal.getfax()!=null && !embarcadorLocal.getfax().equals(""))) {embarcadorBean.setfax(embarcadorLocal.getfax());}
			if(conDefault || (!conDefault && embarcadorLocal.getid_tipo_via_transporte()!=null && !embarcadorLocal.getid_tipo_via_transporte().equals(-1L))) {embarcadorBean.setid_tipo_via_transporte(embarcadorLocal.getid_tipo_via_transporte());}
			if(conDefault || (!conDefault && embarcadorLocal.getid_puerto()!=null && !embarcadorLocal.getid_puerto().equals(-1L))) {embarcadorBean.setid_puerto(embarcadorLocal.getid_puerto());}
			if(conDefault || (!conDefault && embarcadorLocal.getid_empleado()!=null && !embarcadorLocal.getid_empleado().equals(-1L))) {embarcadorBean.setid_empleado(embarcadorLocal.getid_empleado());}
			if(conDefault || (!conDefault && embarcadorLocal.getid_pais()!=null && !embarcadorLocal.getid_pais().equals(-1L))) {embarcadorBean.setid_pais(embarcadorLocal.getid_pais());}
			if(conDefault || (!conDefault && embarcadorLocal.getid_ciudad()!=null && !embarcadorLocal.getid_ciudad().equals(null))) {embarcadorBean.setid_ciudad(embarcadorLocal.getid_ciudad());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmbarcadorGenerico(Long idEmbarcadorSeleccionado,JComboBox jComboBoxEmbarcador,List<Embarcador> embarcadorsLocal)throws Exception {
		try {
			Embarcador  embarcadorTemp=null;

			for(Embarcador embarcadorAux:embarcadorsLocal) {
				if(embarcadorAux.getId()!=null && embarcadorAux.getId().equals(idEmbarcadorSeleccionado)) {
					embarcadorTemp=embarcadorAux;
					break;
				}
			}

			jComboBoxEmbarcador.setSelectedItem(embarcadorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmbarcadorGenerico(JComboBox jComboBoxEmbarcador,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmbarcador.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmbarcador.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmbarcador.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmbarcador.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmbarcador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmbarcador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PedidoCompraImpor")) {
			jButtonPedidoCompraImporActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroCompra")) {
			jButtonParametroCompraActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			embarcador=(Embarcador) embarcadorLogic.getEmbarcadors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			embarcador =(Embarcador) embarcadors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!embarcador.getIsNew() && !embarcador.getIsChanged() && !embarcador.getIsDeleted()) {
				sDescripcion=embarcador.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=embarcador.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoViaTransporte")) {
			//sDescripcion=this.getActualTipoViaTransporteForeignKeyDescripcion((Long)value);
			if(!embarcador.getIsNew() && !embarcador.getIsChanged() && !embarcador.getIsDeleted()) {
				sDescripcion=embarcador.gettipoviatransporte_descripcion();
			} else {
				//sDescripcion=this.getActualTipoViaTransporteForeignKeyDescripcion((Long)value);
				sDescripcion=embarcador.gettipoviatransporte_descripcion();
			}
		}

		if(sTipo.equals("Puerto")) {
			//sDescripcion=this.getActualPuertoForeignKeyDescripcion((Long)value);
			if(!embarcador.getIsNew() && !embarcador.getIsChanged() && !embarcador.getIsDeleted()) {
				sDescripcion=embarcador.getpuerto_descripcion();
			} else {
				//sDescripcion=this.getActualPuertoForeignKeyDescripcion((Long)value);
				sDescripcion=embarcador.getpuerto_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!embarcador.getIsNew() && !embarcador.getIsChanged() && !embarcador.getIsDeleted()) {
				sDescripcion=embarcador.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=embarcador.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!embarcador.getIsNew() && !embarcador.getIsChanged() && !embarcador.getIsDeleted()) {
				sDescripcion=embarcador.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=embarcador.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!embarcador.getIsNew() && !embarcador.getIsChanged() && !embarcador.getIsDeleted()) {
				sDescripcion=embarcador.getciudad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=embarcador.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Embarcador embarcadorRow=new Embarcador();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			embarcadorRow=(Embarcador) embarcadorLogic.getEmbarcadors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			embarcadorRow=(Embarcador) embarcadors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPedidoCompraImporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Embarcador embarcador) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEmbarcador==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador = (Embarcador)this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.embarcador = (Embarcador)this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(embarcador!=null) {
						this.embarcador = embarcador;
					} else {
						this.embarcador = new Embarcador();
					}
				}

				if(this.isTienePermisosPedidoCompraImpor && this.permiteMantenimiento(this.embarcador)) {
					PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFramePopup=new PedidoCompraImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidocompraimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFramePopup;
					} else {
						pedidocompraimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame;
					}

					List<Embarcador> embarcadors=new ArrayList<Embarcador>();
					embarcadors.add(this.embarcador);
					if(!esRelacionado) {
						//pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setConGuardarRelaciones(false);
						//pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidocompraimporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEmbarcador.cargarPedidoCompraImporBeanSwingJInternalFrame(embarcadors,this.embarcador,pedidocompraimporBeanSwingJInternalFrame,/*conInicializar,*/pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.getConGuardarRelaciones(),pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.getEsGuardarRelacionado());
					pedidocompraimporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoCompraImpor("no_relacionado");

						pedidocompraimporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoCompraImporConstantesFunciones.ITAMANIOFILATABLA + (PedidoCompraImporConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidocompraimporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEmbarcador=(TitledBorder)this.jScrollPanelDatosEmbarcador.getBorder();
						TitledBorder titledBorderPedidoCompraImpor=(TitledBorder)pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.getBorder();

						titledBorderPedidoCompraImpor.setTitle(titledBorderEmbarcador.getTitle() + " -> Pedido Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidocompraimporBeanSwingJInternalFrame);
						}

						pedidocompraimporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidocompraimporBeanSwingJInternalFrame);

						pedidocompraimporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.embarcadorSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroCompraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Embarcador embarcador) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEmbarcador==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador = (Embarcador)this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.embarcador = (Embarcador)this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(embarcador!=null) {
						this.embarcador = embarcador;
					} else {
						this.embarcador = new Embarcador();
					}
				}

				if(this.isTienePermisosParametroCompra && this.permiteMantenimiento(this.embarcador)) {
					ParametroCompraBeanSwingJInternalFrame parametrocompraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFramePopup=new ParametroCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFramePopup;
					} else {
						parametrocompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame;
					}

					List<Embarcador> embarcadors=new ArrayList<Embarcador>();
					embarcadors.add(this.embarcador);
					if(!esRelacionado) {
						//parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setConGuardarRelaciones(false);
						//parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocompraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEmbarcador.cargarParametroCompraBeanSwingJInternalFrame(embarcadors,this.embarcador,parametrocompraBeanSwingJInternalFrame,/*conInicializar,*/parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.getConGuardarRelaciones(),parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.getEsGuardarRelacionado());
					parametrocompraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocompraBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCompra("no_relacionado");

						parametrocompraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCompraConstantesFunciones.ITAMANIOFILATABLA + (ParametroCompraConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocompraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEmbarcador=(TitledBorder)this.jScrollPanelDatosEmbarcador.getBorder();
						TitledBorder titledBorderParametroCompra=(TitledBorder)parametrocompraBeanSwingJInternalFrame.jScrollPanelDatosParametroCompra.getBorder();

						titledBorderParametroCompra.setTitle(titledBorderEmbarcador.getTitle() + " -> Parametro Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocompraBeanSwingJInternalFrame);
						}

						parametrocompraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocompraBeanSwingJInternalFrame);

						parametrocompraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.embarcadorSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmbarcador(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmbarcador.setVisible((this.isVisibilidadCeldaNuevoEmbarcador && this.isPermisoNuevoEmbarcador));			
			this.jButtonDuplicarEmbarcador.setVisible((this.isVisibilidadCeldaDuplicarEmbarcador && this.isPermisoDuplicarEmbarcador));			
			this.jButtonCopiarEmbarcador.setVisible((this.isVisibilidadCeldaCopiarEmbarcador && this.isPermisoCopiarEmbarcador));
			this.jButtonVerFormEmbarcador.setVisible((this.isVisibilidadCeldaVerFormEmbarcador && this.isPermisoVerFormEmbarcador));
			
			this.jButtonAbrirOrderByEmbarcador.setVisible((this.isVisibilidadCeldaOrdenEmbarcador && this.isPermisoOrdenEmbarcador));			
			
			this.jButtonNuevoRelacionesEmbarcador.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmbarcador && this.isPermisoNuevoEmbarcador));			
			this.jButtonNuevoGuardarCambiosEmbarcador.setVisible((this.isVisibilidadCeldaNuevoEmbarcador && this.isPermisoNuevoEmbarcador && this.isPermisoGuardarCambiosEmbarcador));
			
			if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonModificarEmbarcador.setVisible((this.isVisibilidadCeldaModificarEmbarcador && this.isPermisoActualizarEmbarcador));	
			this.jInternalFrameDetalleFormEmbarcador.jButtonActualizarEmbarcador.setVisible((this.isVisibilidadCeldaActualizarEmbarcador && this.isPermisoActualizarEmbarcador));	
			this.jInternalFrameDetalleFormEmbarcador.jButtonEliminarEmbarcador.setVisible((this.isVisibilidadCeldaEliminarEmbarcador && this.isPermisoEliminarEmbarcador));
			this.jInternalFrameDetalleFormEmbarcador.jButtonCancelarEmbarcador.setVisible(this.isVisibilidadCeldaCancelarEmbarcador);							
			this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosEmbarcador.setVisible((this.isVisibilidadCeldaGuardarEmbarcador && this.isPermisoGuardarCambiosEmbarcador));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmbarcador.setVisible((this.isVisibilidadCeldaGuardarCambiosEmbarcador && this.isPermisoGuardarCambiosEmbarcador));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmbarcador.setVisible((this.isVisibilidadCeldaNuevoEmbarcador && this.isPermisoNuevoEmbarcador));						
			this.jButtonDuplicarToolBarEmbarcador.setVisible((this.isVisibilidadCeldaDuplicarEmbarcador && this.isPermisoDuplicarEmbarcador));						
			this.jButtonCopiarToolBarEmbarcador.setVisible((this.isVisibilidadCeldaCopiarEmbarcador && this.isPermisoCopiarEmbarcador));			
			this.jButtonVerFormToolBarEmbarcador.setVisible((this.isVisibilidadCeldaVerFormEmbarcador && this.isPermisoVerFormEmbarcador));			
			this.jButtonAbrirOrderByToolBarEmbarcador.setVisible((this.isVisibilidadCeldaOrdenEmbarcador && this.isPermisoOrdenEmbarcador));
			this.jButtonNuevoRelacionesToolBarEmbarcador.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmbarcador && this.isPermisoNuevoEmbarcador));			
			this.jButtonNuevoGuardarCambiosToolBarEmbarcador.setVisible((this.isVisibilidadCeldaNuevoEmbarcador && this.isPermisoNuevoEmbarcador && this.isPermisoGuardarCambiosEmbarcador));			
			
			if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonModificarToolBarEmbarcador.setVisible((this.isVisibilidadCeldaModificarEmbarcador && this.isPermisoActualizarEmbarcador));	
			this.jInternalFrameDetalleFormEmbarcador.jButtonActualizarToolBarEmbarcador.setVisible((this.isVisibilidadCeldaActualizarEmbarcador  && this.isPermisoActualizarEmbarcador));	
			this.jInternalFrameDetalleFormEmbarcador.jButtonEliminarToolBarEmbarcador.setVisible((this.isVisibilidadCeldaEliminarEmbarcador && this.isPermisoEliminarEmbarcador));
			this.jInternalFrameDetalleFormEmbarcador.jButtonCancelarToolBarEmbarcador.setVisible(this.isVisibilidadCeldaCancelarEmbarcador);				
			this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosToolBarEmbarcador.setVisible((this.isVisibilidadCeldaGuardarEmbarcador && this.isPermisoGuardarCambiosEmbarcador));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmbarcador.setVisible((this.isVisibilidadCeldaGuardarCambiosEmbarcador && this.isPermisoGuardarCambiosEmbarcador));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmbarcador.setVisible((this.isVisibilidadCeldaNuevoEmbarcador && this.isPermisoNuevoEmbarcador));			
			this.jMenuItemDuplicarEmbarcador.setVisible((this.isVisibilidadCeldaDuplicarEmbarcador && this.isPermisoDuplicarEmbarcador));			
			this.jMenuItemCopiarEmbarcador.setVisible((this.isVisibilidadCeldaCopiarEmbarcador && this.isPermisoCopiarEmbarcador));			
			this.jMenuItemVerFormEmbarcador.setVisible((this.isVisibilidadCeldaVerFormEmbarcador && this.isPermisoVerFormEmbarcador));			
			this.jMenuItemAbrirOrderByEmbarcador.setVisible((this.isVisibilidadCeldaOrdenEmbarcador && this.isPermisoOrdenEmbarcador));			
			//this.jMenuItemMostrarOcultarEmbarcador.setVisible((this.isVisibilidadCeldaOrdenEmbarcador && this.isPermisoOrdenEmbarcador));
			this.jMenuItemDetalleAbrirOrderByEmbarcador.setVisible((this.isVisibilidadCeldaOrdenEmbarcador && this.isPermisoOrdenEmbarcador));			
			//this.jMenuItemDetalleMostrarOcultarEmbarcador.setVisible((this.isVisibilidadCeldaOrdenEmbarcador && this.isPermisoOrdenEmbarcador));			
			this.jMenuItemNuevoRelacionesEmbarcador.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmbarcador && this.isPermisoNuevoEmbarcador));			
			this.jMenuItemNuevoGuardarCambiosEmbarcador.setVisible((this.isVisibilidadCeldaNuevoEmbarcador && this.isPermisoNuevoEmbarcador && this.isPermisoGuardarCambiosEmbarcador));									
			
			if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			this.jInternalFrameDetalleFormEmbarcador.jMenuItemModificarEmbarcador.setVisible((this.isVisibilidadCeldaModificarEmbarcador && this.isPermisoActualizarEmbarcador));	
			this.jInternalFrameDetalleFormEmbarcador.jMenuItemActualizarEmbarcador.setVisible((this.isVisibilidadCeldaActualizarEmbarcador && this.isPermisoActualizarEmbarcador));	
			this.jInternalFrameDetalleFormEmbarcador.jMenuItemEliminarEmbarcador.setVisible((this.isVisibilidadCeldaEliminarEmbarcador && this.isPermisoEliminarEmbarcador));
			this.jInternalFrameDetalleFormEmbarcador.jMenuItemCancelarEmbarcador.setVisible(this.isVisibilidadCeldaCancelarEmbarcador);				
			}
			
			this.jMenuItemGuardarCambiosEmbarcador.setVisible((this.isVisibilidadCeldaGuardarEmbarcador && this.isPermisoGuardarCambiosEmbarcador));						
			this.jMenuItemGuardarCambiosTablaEmbarcador.setVisible((this.isVisibilidadCeldaGuardarCambiosEmbarcador && this.isPermisoGuardarCambiosEmbarcador));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmbarcador=this.jButtonNuevoEmbarcador.isVisible();
			this.isVisibilidadCeldaDuplicarEmbarcador=this.jButtonDuplicarEmbarcador.isVisible();
			this.isVisibilidadCeldaCopiarEmbarcador=this.jButtonCopiarEmbarcador.isVisible();
			this.isVisibilidadCeldaVerFormEmbarcador=this.jButtonVerFormEmbarcador.isVisible();
			
			this.isVisibilidadCeldaOrdenEmbarcador=this.jButtonAbrirOrderByEmbarcador.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=this.jButtonNuevoRelacionesEmbarcador.isVisible();
			this.isVisibilidadCeldaModificarEmbarcador=this.jButtonModificarEmbarcador.isVisible();
			
			if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			this.isVisibilidadCeldaActualizarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jButtonActualizarEmbarcador.isVisible();
			this.isVisibilidadCeldaEliminarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jButtonEliminarEmbarcador.isVisible();
			this.isVisibilidadCeldaCancelarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jButtonCancelarEmbarcador.isVisible();
			this.isVisibilidadCeldaGuardarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosEmbarcador.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=this.jButtonGuardarCambiosTablaEmbarcador.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmbarcador=this.jButtonNuevoToolBarEmbarcador.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=this.jButtonNuevoRelacionesToolBarEmbarcador.isVisible();
			
			if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			this.isVisibilidadCeldaModificarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jButtonModificarToolBarEmbarcador.isVisible();
			this.isVisibilidadCeldaActualizarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jButtonActualizarToolBarEmbarcador.isVisible();
			this.isVisibilidadCeldaEliminarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jButtonEliminarToolBarEmbarcador.isVisible();
			this.isVisibilidadCeldaCancelarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jButtonCancelarToolBarEmbarcador.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmbarcador=this.jButtonGuardarCambiosToolBarEmbarcador.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=this.jButtonGuardarCambiosTablaToolBarEmbarcador.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmbarcador=this.jMenuItemNuevoEmbarcador.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=this.jMenuItemNuevoRelacionesEmbarcador.isVisible();
			
			if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			this.isVisibilidadCeldaModificarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jMenuItemModificarEmbarcador.isVisible();
			this.isVisibilidadCeldaActualizarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jMenuItemActualizarEmbarcador.isVisible();
			this.isVisibilidadCeldaEliminarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jMenuItemEliminarEmbarcador.isVisible();
			this.isVisibilidadCeldaCancelarEmbarcador=this.jInternalFrameDetalleFormEmbarcador.jMenuItemCancelarEmbarcador.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmbarcador=this.jMenuItemGuardarCambiosEmbarcador.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=this.jMenuItemGuardarCambiosTablaEmbarcador.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmbarcador(Boolean esInicializar) {
		if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
				//if(this.embarcadorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmbarcador();
			}
			
			this.inicializarActualizarBindingBotonesManualEmbarcador(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmbarcador() {
		this.jButtonNuevoEmbarcador.setVisible(this.isPermisoNuevoEmbarcador);			
		this.jButtonDuplicarEmbarcador.setVisible(this.isPermisoDuplicarEmbarcador);			
		this.jButtonCopiarEmbarcador.setVisible(this.isPermisoCopiarEmbarcador);			
		this.jButtonVerFormEmbarcador.setVisible(this.isPermisoVerFormEmbarcador);			
		
		this.jButtonAbrirOrderByEmbarcador.setVisible(this.isPermisoOrdenEmbarcador);					
		
		this.jButtonNuevoRelacionesEmbarcador.setVisible(this.isPermisoNuevoEmbarcador);			
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonModificarEmbarcador.setVisible(this.isPermisoActualizarEmbarcador);	
			this.jInternalFrameDetalleFormEmbarcador.jButtonActualizarEmbarcador.setVisible(this.isPermisoActualizarEmbarcador);	
			this.jInternalFrameDetalleFormEmbarcador.jButtonEliminarEmbarcador.setVisible(this.isPermisoEliminarEmbarcador);
			this.jInternalFrameDetalleFormEmbarcador.jButtonCancelarEmbarcador.setVisible(this.isVisibilidadCeldaCancelarEmbarcador);						
			this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosEmbarcador.setVisible(this.isPermisoGuardarCambiosEmbarcador);							
		}
		
		this.jButtonGuardarCambiosTablaEmbarcador.setVisible(this.isPermisoActualizarEmbarcador);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmbarcador() {
		this.jInternalFrameDetalleFormEmbarcador.jButtonModificarEmbarcador.setVisible(this.isPermisoActualizarEmbarcador);	
		this.jInternalFrameDetalleFormEmbarcador.jButtonActualizarEmbarcador.setVisible(this.isPermisoActualizarEmbarcador);	
		this.jInternalFrameDetalleFormEmbarcador.jButtonEliminarEmbarcador.setVisible(this.isPermisoEliminarEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jButtonCancelarEmbarcador.setVisible(this.isVisibilidadCeldaCancelarEmbarcador);							
		this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosEmbarcador.setVisible((this.isVisibilidadCeldaGuardarEmbarcador && this.isPermisoGuardarCambiosEmbarcador));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmbarcador() {
		if(EmbarcadorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmbarcador();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmbarcador() {
	}
	
	public void jTableDatosEmbarcadorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmbarcador(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.embarcador.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmbarcadorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmbarcador(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmbarcador.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmbarcador.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.embarcadorLogic.getConnexion());

				if(this.embarcador.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.embarcador.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmbarcador=(TitledBorder)this.jScrollPanelDatosEmbarcador.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmbarcador.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.embarcador.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.embarcador.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.embarcador.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.embarcador.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.embarcador.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncontactoEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getcontacto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where contacto like '%"+this.embarcador.getcontacto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtone_mailEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.gete_mail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where e_mail like '%"+this.embarcador.gete_mail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfaxEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getfax()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fax like '%"+this.embarcador.getfax()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_via_transporteEmbarcadorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoviatransporte=true;

			idTienePermisotipoviatransporte=this.tienePermisosUsuarioEnPaginaWebEmbarcador(TipoViaTransporteConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoviatransporte) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmbarcador.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmbarcador.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);

				this.tipoviatransporteBeanSwingJInternalFrame=new TipoViaTransporteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoviatransporteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoviatransporteBeanSwingJInternalFrame.getTipoViaTransporteLogic().setConnexion(this.embarcadorLogic.getConnexion());

				if(this.embarcador.getid_tipo_via_transporte()!=null) {
					this.tipoviatransporteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoviatransporteBeanSwingJInternalFrame.setIdActual(this.embarcador.getid_tipo_via_transporte());
					this.tipoviatransporteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoviatransporteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoviatransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoViaTransporte();
				}

				JInternalFrameBase jinternalFrame =this.tipoviatransporteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmbarcador=(TitledBorder)this.jScrollPanelDatosEmbarcador.getBorder();
				TitledBorder titledBordertipoviatransporte=(TitledBorder)this.tipoviatransporteBeanSwingJInternalFrame.jScrollPanelDatosTipoViaTransporte.getBorder();

				titledBordertipoviatransporte.setTitle(titledBorderEmbarcador.getTitle() + " -> Tipo Via Transporte");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_via_transporteEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getid_tipo_via_transporte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_via_transporte = "+this.embarcador.getid_tipo_via_transporte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_puertoEmbarcadorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopuerto=true;

			idTienePermisopuerto=this.tienePermisosUsuarioEnPaginaWebEmbarcador(PuertoConstantesFunciones.CLASSNAME);

			if(idTienePermisopuerto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmbarcador.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmbarcador.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);

				this.puertoBeanSwingJInternalFrame=new PuertoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.puertoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.puertoBeanSwingJInternalFrame.getPuertoLogic().setConnexion(this.embarcadorLogic.getConnexion());

				if(this.embarcador.getid_puerto()!=null) {
					this.puertoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.puertoBeanSwingJInternalFrame.setIdActual(this.embarcador.getid_puerto());
					this.puertoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.puertoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.puertoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPuerto();
				}

				JInternalFrameBase jinternalFrame =this.puertoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmbarcador=(TitledBorder)this.jScrollPanelDatosEmbarcador.getBorder();
				TitledBorder titledBorderpuerto=(TitledBorder)this.puertoBeanSwingJInternalFrame.jScrollPanelDatosPuerto.getBorder();

				titledBorderpuerto.setTitle(titledBorderEmbarcador.getTitle() + " -> Puerto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_puertoEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getid_puerto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_puerto = "+this.embarcador.getid_puerto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmbarcadorActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderEmbarcador=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosEmbarcador.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderEmbarcador=(TitledBorder)this.jScrollPanelDatosEmbarcador.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmbarcador.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoEmbarcadorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmbarcador(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmbarcador.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmbarcador.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.embarcadorLogic.getConnexion());

				if(this.embarcador.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.embarcador.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmbarcador=(TitledBorder)this.jScrollPanelDatosEmbarcador.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmbarcador.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.embarcador.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisEmbarcadorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebEmbarcador(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmbarcador.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmbarcador.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.embarcadorLogic.getConnexion());

				if(this.embarcador.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.embarcador.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmbarcador=(TitledBorder)this.jScrollPanelDatosEmbarcador.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderEmbarcador.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.embarcador.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadEmbarcadorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebEmbarcador(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmbarcador.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmbarcador.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.embarcadorLogic.getConnexion());

				if(this.embarcador.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.embarcador.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmbarcador=(TitledBorder)this.jScrollPanelDatosEmbarcador.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderEmbarcador.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadEmbarcadorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.getembarcador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.embarcador==null) {
						this.embarcador = new Embarcador();
					}

					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);
				}

				if(this.embarcador.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.embarcador.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmbarcador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorContactoEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsBusquedaPorContacto();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorEMailEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsBusquedaPorEMail();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsBusquedaPorNombre();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorRucEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsBusquedaPorRuc();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorTelefonoEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsBusquedaPorTelefono();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCiudadEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsFK_IdCiudad();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsFK_IdEmpleado();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsFK_IdEmpresa();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsFK_IdPais();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPuertoEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsFK_IdPuerto();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoViaTransporteEmbarcadorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmbarcador(false,false);

			this.getEmbarcadorsFK_IdTipoViaTransporte();

			this.inicializarActualizarBindingEmbarcador(false);

			//if(EmbarcadorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmbarcador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.embarcadorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmbarcador() {
		if(this.jInternalFrameDetalleFormEmbarcador!=null) {
		

		if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) {
			this.jInternalFrameDetalleFormEmbarcador.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmbarcador.dispose();
			this.jInternalFrameDetalleFormEmbarcador=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmbarcador!=null) {
			this.jInternalFrameReporteDinamicoEmbarcador.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmbarcador.dispose();
			this.jInternalFrameReporteDinamicoEmbarcador=null;
		}
		
		if(this.jInternalFrameImportacionEmbarcador!=null) {
			this.jInternalFrameImportacionEmbarcador.setVisible(false);	    			
			this.jInternalFrameImportacionEmbarcador.dispose();
			this.jInternalFrameImportacionEmbarcador=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmbarcador();
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmbarcador")) {
				jButtonNuevoEmbarcadorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmbarcador")) {
				jButtonDuplicarEmbarcadorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmbarcador")) {
				jButtonCopiarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmbarcador")) {
				jButtonVerFormEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmbarcador")) {
				jButtonNuevoEmbarcadorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmbarcador")) {
				jButtonDuplicarEmbarcadorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmbarcador")) {
				jButtonNuevoEmbarcadorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmbarcador")) {
				jButtonDuplicarEmbarcadorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmbarcador")) {
				jButtonNuevoEmbarcadorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmbarcador")) {
				jButtonNuevoEmbarcadorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmbarcador")) {
				jButtonNuevoEmbarcadorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmbarcador")) {
				jButtonModificarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmbarcador")) {
				jButtonModificarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmbarcador")) {
				jButtonModificarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmbarcador")) {
				jButtonActualizarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmbarcador")) {
				jButtonActualizarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmbarcador")) {
				jButtonActualizarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmbarcador")) {
				jButtonEliminarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmbarcador")) {
				jButtonEliminarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmbarcador")) {
				jButtonEliminarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmbarcador")) {
				jButtonCancelarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmbarcador")) {
				jButtonCancelarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmbarcador")) {
				jButtonCancelarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmbarcador")) {
				jButtonCerrarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmbarcador")) {
				jButtonCerrarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmbarcador")) {
				jButtonCerrarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmbarcador")) {
				jButtonMostrarOcultarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmbarcador")) {
				jButtonCancelarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmbarcador")) {
				jButtonGuardarCambiosEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmbarcador")) {
				jButtonGuardarCambiosEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmbarcador")) {
				jButtonCopiarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmbarcador")) {
				jButtonVerFormEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmbarcador")) {
				jButtonGuardarCambiosEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmbarcador")) {
				jButtonCopiarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmbarcador")) {
				jButtonVerFormEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmbarcador")) {
				jButtonGuardarCambiosEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmbarcador")) {
				jButtonGuardarCambiosEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmbarcador")) {
				jButtonGuardarCambiosEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmbarcador")) {
				jButtonRecargarInformacionEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmbarcador")) {
				jButtonRecargarInformacionEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmbarcador")) {
				jButtonRecargarInformacionEmbarcadorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmbarcador")) {
				jButtonAnterioresEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmbarcador")) {
				jButtonAnterioresEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmbarcador")) {
				jButtonAnterioresEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmbarcador")) {
				jButtonSiguientesEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmbarcador")) {
				jButtonSiguientesEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmbarcador")) {
				jButtonSiguientesEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmbarcador") || sTipo.equals("MenuItemDetalleAbrirOrderByEmbarcador")) {
				jButtonAbrirOrderByEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmbarcador") || sTipo.equals("MenuItemDetalleMostrarOcultarEmbarcador")) {
				jButtonMostrarOcultarEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmbarcador")) {
				jButtonNuevoGuardarCambiosEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmbarcador")) {
				jButtonNuevoGuardarCambiosEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmbarcador")) {
				jButtonNuevoGuardarCambiosEmbarcadorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmbarcador")) {
				jButtonCerrarReporteDinamicoEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmbarcador")) {
				jButtonGenerarReporteDinamicoEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmbarcador")) {
				
				jButtonGenerarExcelReporteDinamicoEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmbarcador")) {
				jButtonCerrarImportacionEmbarcadorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmbarcador")) {
				
				jButtonGenerarImportacionEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmbarcador")) {
				
				jButtonAbrirImportacionEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmbarcador")) {
				jComboBoxTiposAccionesEmbarcadorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmbarcador")) {
				jComboBoxTiposRelacionesEmbarcadorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmbarcador")) {
				jComboBoxTiposAccionesEmbarcadorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmbarcador")) {
				
				jComboBoxTiposSeleccionarEmbarcadorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmbarcador")) {
				jTextFieldValorCampoGeneralEmbarcadorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmbarcador")) {
				jButtonAbrirOrderByEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmbarcador")) {
				jButtonAbrirOrderByEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmbarcador")) {
				jButtonCerrarOrderByEmbarcadorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmbarcadorBusqueda")) {
				this.jButtonidEmbarcadorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmbarcadorUpdate")) {
				this.jButtonid_empresaEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmbarcadorBusqueda")) {
				this.jButtonid_empresaEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEmbarcadorBusqueda")) {
				this.jButtonnombreEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucEmbarcadorBusqueda")) {
				this.jButtonrucEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionEmbarcadorBusqueda")) {
				this.jButtondireccionEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoEmbarcadorBusqueda")) {
				this.jButtontelefonoEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contactoEmbarcadorBusqueda")) {
				this.jButtoncontactoEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mailEmbarcadorBusqueda")) {
				this.jButtone_mailEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("faxEmbarcadorBusqueda")) {
				this.jButtonfaxEmbarcadorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_via_transporteEmbarcadorUpdate")) {
				this.jButtonid_tipo_via_transporteEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_via_transporteEmbarcadorBusqueda")) {
				this.jButtonid_tipo_via_transporteEmbarcadorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_puertoEmbarcadorUpdate")) {
				this.jButtonid_puertoEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_puertoEmbarcadorBusqueda")) {
				this.jButtonid_puertoEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmbarcador")) {
				this.jButtonid_empleadoEmbarcadorActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmbarcadorUpdate")) {
				this.jButtonid_empleadoEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmbarcadorBusqueda")) {
				this.jButtonid_empleadoEmbarcadorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisEmbarcadorUpdate")) {
				this.jButtonid_paisEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisEmbarcadorBusqueda")) {
				this.jButtonid_paisEmbarcadorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadEmbarcadorUpdate")) {
				this.jButtonid_ciudadEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadEmbarcadorBusqueda")) {
				this.jButtonid_ciudadEmbarcadorBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoEmbarcador")) {
				this.jButtonid_empleadoEmbarcadorActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorContactoEmbarcador")) {
				this.jButtonBusquedaPorContactoEmbarcadorActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreEmbarcador")) {
				this.jButtonBusquedaPorNombreEmbarcadorActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorTelefonoEmbarcador")) {
				this.jButtonBusquedaPorTelefonoEmbarcadorActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoEmbarcador")) {
				this.jButtonFK_IdEmpleadoEmbarcadorActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPuertoEmbarcador")) {
				this.jButtonFK_IdPuertoEmbarcadorActionPerformed(evt);
			}
			
			;
			
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmbarcador();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmbarcadorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				


				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Embarcador embarcadorLocal=null;
			
			if(!this.getEsControlTabla()) {
				embarcadorLocal=this.embarcador;
			} else {
				embarcadorLocal=this.embarcadorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
							
				
				


				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmbarcadorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorAnterior =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.embarcadorAnterior =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
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
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
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
			
			


			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmbarcadorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
								
						
				


				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
								
				
				


				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmbarcadorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorAnterior =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.embarcadorAnterior =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmbarcadorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorAnterior =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.embarcadorAnterior =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmbarcadorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
			
			this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
							
				
				


				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmbarcadorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcadorAnterior =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.embarcadorAnterior =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
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
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
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
			
			


			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmbarcadorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
			
			this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
								
				
				


				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmbarcadorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorAnterior =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.embarcadorAnterior =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmbarcadorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
			
			this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmbarcadorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmbarcador")) {
					jCheckBoxSeleccionarTodosEmbarcadorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmbarcador")) {
					jCheckBoxSeleccionadosEmbarcadorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmbarcador")) {
					
				}
				
				


				
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
												
				
				


				
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmbarcadorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.embarcadorAnterior =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.embarcadorAnterior =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmbarcadorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
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
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisEmbarcador")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador;
				}

				if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
					//classes=EmbarcadorConstantesFunciones.getClassesRelationshipsOfEmbarcador(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormEmbarcador(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmbarcadorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisEmbarcador")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador;
				}

				if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
					//classes=EmbarcadorConstantesFunciones.getClassesRelationshipsOfEmbarcador(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormEmbarcador(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.embarcador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.embarcador);
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisEmbarcador")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador;
				}

				if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
					//classes=EmbarcadorConstantesFunciones.getClassesRelationshipsOfEmbarcador(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormEmbarcador(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Embarcador.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Embarcador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmbarcadorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.embarcadorAnterior =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.embarcadorAnterior =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmbarcador")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmbarcadorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmbarcador.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.embarcador =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.embarcador =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.embarcador);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmbarcador")) {
				
				}
				
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmbarcador")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmbarcador.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmbarcador")) {
			
			}
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmbarcador();
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
			if(sTipo.equals("NuevoEmbarcador")) {
				jButtonNuevoEmbarcadorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmbarcador")) {
				jButtonDuplicarEmbarcadorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmbarcador")) {
				jButtonCopiarEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmbarcador")) {
				jButtonVerFormEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmbarcador")) {
				jButtonNuevoEmbarcadorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmbarcador")) {
				jButtonModificarEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmbarcador")) {
				jButtonActualizarEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmbarcador")) {
				jButtonEliminarEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmbarcador")) {
				jButtonGuardarCambiosEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmbarcador")) {
				jButtonCancelarEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmbarcador")) {
				jButtonCerrarEmbarcadorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmbarcador")) {
				jButtonGuardarCambiosEmbarcadorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmbarcador")) {
				jButtonNuevoGuardarCambiosEmbarcadorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmbarcador")) {
				jButtonAbrirOrderByEmbarcadorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmbarcador")) {
				jButtonRecargarInformacionEmbarcadorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmbarcador")) {
				jButtonAnterioresEmbarcadorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmbarcador")) {
				jButtonSiguientesEmbarcadorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmbarcadorBusqueda")) {
				this.jButtonidEmbarcadorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmbarcadorUpdate")) {
				this.jButtonid_empresaEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmbarcadorBusqueda")) {
				this.jButtonid_empresaEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEmbarcadorBusqueda")) {
				this.jButtonnombreEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucEmbarcadorBusqueda")) {
				this.jButtonrucEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionEmbarcadorBusqueda")) {
				this.jButtondireccionEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoEmbarcadorBusqueda")) {
				this.jButtontelefonoEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contactoEmbarcadorBusqueda")) {
				this.jButtoncontactoEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mailEmbarcadorBusqueda")) {
				this.jButtone_mailEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("faxEmbarcadorBusqueda")) {
				this.jButtonfaxEmbarcadorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_via_transporteEmbarcadorUpdate")) {
				this.jButtonid_tipo_via_transporteEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_via_transporteEmbarcadorBusqueda")) {
				this.jButtonid_tipo_via_transporteEmbarcadorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_puertoEmbarcadorUpdate")) {
				this.jButtonid_puertoEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_puertoEmbarcadorBusqueda")) {
				this.jButtonid_puertoEmbarcadorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmbarcador")) {
				this.jButtonid_empleadoEmbarcadorActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmbarcadorUpdate")) {
				this.jButtonid_empleadoEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmbarcadorBusqueda")) {
				this.jButtonid_empleadoEmbarcadorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisEmbarcadorUpdate")) {
				this.jButtonid_paisEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisEmbarcadorBusqueda")) {
				this.jButtonid_paisEmbarcadorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadEmbarcadorUpdate")) {
				this.jButtonid_ciudadEmbarcadorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadEmbarcadorBusqueda")) {
				this.jButtonid_ciudadEmbarcadorBusquedaActionPerformed(evt);
			}
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmbarcador();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmbarcador")) {
				closingInternalFrameEmbarcador();
				
			} else if(sTipo.equals("jButtonCancelarEmbarcador")) {
				JInternalFrameBase jInternalFrameDetalleFormEmbarcador = (JInternalFrameBase)evt.getSource();
	            	
	            EmbarcadorBeanSwingJInternalFrame jInternalFrameParent=(EmbarcadorBeanSwingJInternalFrame)jInternalFrameDetalleFormEmbarcador.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmbarcadorActionPerformed(null);
			}
			
			EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.embarcador,new Object(),this.embarcadorParameterGeneral,this.embarcadorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmbarcador(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmbarcador(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmbarcador(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.embarcador)) {
			if(!esControlTabla) {
				if(EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);			
				}
				
				if(this.embarcadorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmbarcador(this.embarcador,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.embarcadorReturnGeneral=embarcadorLogic.procesarEventosEmbarcadorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.embarcadorLogic.getEmbarcadors(),this.embarcador,this.embarcadorParameterGeneral,this.isEsNuevoEmbarcador,classes);//this.embarcadorLogic.getEmbarcador()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmbarcador(this.embarcadorReturnGeneral,this.embarcadorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.embarcadorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmbarcador(classes,this.embarcadorReturnGeneral,this.embarcadorBean,false);
					}
						
					if(this.embarcadorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmbarcador(this.embarcadorReturnGeneral.getEmbarcador());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmbarcador(this.embarcadorReturnGeneral.getEmbarcador());	
					}
						
					if(this.embarcadorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmbarcador(this.embarcadorReturnGeneral.getEmbarcador(),classes);//this.embarcadorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmbarcador(this.embarcador,classes);//this.embarcadorBean);									
				}
			
				if(EmbarcadorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmbarcador(this.embarcador,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmbarcador(this.embarcador);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.embarcadorAnterior!=null) {
						this.embarcador=this.embarcadorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.embarcadorReturnGeneral=embarcadorLogic.procesarEventosEmbarcadorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.embarcadorLogic.getEmbarcadors(),this.embarcador,this.embarcadorParameterGeneral,this.isEsNuevoEmbarcador,classes);//this.embarcadorLogic.getEmbarcador()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.embarcadorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.embarcadorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.embarcadorReturnGeneral.getEmbarcador(),embarcadorLogic.getEmbarcadors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.embarcadorReturnGeneral.getEmbarcador(),this.embarcadors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmbarcador.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmbarcador.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmbarcador();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmbarcador() throws Exception {
		
		EmbarcadorModel embarcadorModel=(EmbarcadorModel)this.jTableDatosEmbarcador.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			embarcadorModel.embarcadors=this.embarcadorLogic.getEmbarcadors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			embarcadorModel.embarcadors=this.embarcadors;
		}
		
		
		((EmbarcadorModel) this.jTableDatosEmbarcador.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmbarcador() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getembarcadorAnterior(),this.embarcadorLogic.getEmbarcadors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getembarcadorAnterior(),this.embarcadors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmbarcador();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmbarcador(Embarcador embarcador,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoCompraImpor.class)) {
					this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.setPedidoCompraImpors(embarcador.getPedidoCompraImpors());
					this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoCompraImpor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCompra.class)) {
					this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.setParametroCompras(embarcador.getParametroCompras());
					this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
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
										
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.embarcador,new Object(),generalEntityParameterGeneral,this.embarcadorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.embarcadorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmbarcadorConstantesFunciones.getClassesRelationshipsOfEmbarcador(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmbarcadorConstantesFunciones.getClassesRelationshipsFromStringsOfEmbarcador(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmbarcador(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmbarcadorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.embarcador,new Object(),generalEntityParameterGeneral,this.embarcadorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmbarcador(EmbarcadorBean embarcadorBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoCompraImpor.class)) {
					this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.setPedidoCompraImpors(embarcador.getPedidoCompraImpors());
					this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoCompraImpor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCompra.class)) {
					this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.setParametroCompras(embarcador.getParametroCompras());
					this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmbarcador(ArrayList<Classe> classes,EmbarcadorReturnGeneral embarcadorReturnGeneral,EmbarcadorBean embarcadorBean,Boolean conDefault) throws Exception {
		
			this.embarcadorBean.setPedidoCompraImpors(embarcadorReturnGeneral.getEmbarcador().getPedidoCompraImpors());
			this.embarcadorBean.setParametroCompras(embarcadorReturnGeneral.getEmbarcador().getParametroCompras());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmbarcador(Embarcador embarcador,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoCompraImpor.class)) {
					embarcador.setPedidoCompraImpors(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporLogic.getPedidoCompraImpors());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCompra.class)) {
					embarcador.setParametroCompras(this.jInternalFrameDetalleFormEmbarcador.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());
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
		if(!paraTabla && !this.permiteMantenimiento(this.embarcador)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmbarcador = new EmbarcadorDetalleFormJInternalFrame(jDesktopPane,this.embarcadorSessionBean.getConGuardarRelaciones(),this.embarcadorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.setVisible(false);
		this.jInternalFrameDetalleFormEmbarcador.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmbarcador.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmbarcador.embarcadorLogic=this.embarcadorLogic;
		
		this.cargarCombosFrameForeignKeyEmbarcador("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmbarcador();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmbarcador();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmbarcador("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmbarcador();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmbarcador.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmbarcador"));
		
		this.jInternalFrameDetalleFormEmbarcador.jButtonModificarEmbarcador.addActionListener(new ButtonActionListener(this,"ModificarEmbarcador"));

		
		this.jInternalFrameDetalleFormEmbarcador.jButtonModificarToolBarEmbarcador.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmbarcador"));
					
		this.jInternalFrameDetalleFormEmbarcador.jMenuItemModificarEmbarcador.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmbarcador"));		
		
		
		
		this.jInternalFrameDetalleFormEmbarcador.jButtonActualizarEmbarcador.addActionListener (new ButtonActionListener(this,"ActualizarEmbarcador"));
		
		
		this.jInternalFrameDetalleFormEmbarcador.jButtonActualizarToolBarEmbarcador.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmbarcador"));
						
		this.jInternalFrameDetalleFormEmbarcador.jMenuItemActualizarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmbarcador"));		
		
		
		
		this.jInternalFrameDetalleFormEmbarcador.jButtonEliminarEmbarcador.addActionListener (new ButtonActionListener(this,"EliminarEmbarcador"));
		
		
		this.jInternalFrameDetalleFormEmbarcador.jButtonEliminarToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmbarcador"));
								
		this.jInternalFrameDetalleFormEmbarcador.jMenuItemEliminarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmbarcador"));		
		
		
		
		this.jInternalFrameDetalleFormEmbarcador.jButtonCancelarEmbarcador.addActionListener (new ButtonActionListener(this,"CancelarEmbarcador"));
		
		
		this.jInternalFrameDetalleFormEmbarcador.jButtonCancelarToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmbarcador"));
					
		this.jInternalFrameDetalleFormEmbarcador.jMenuItemCancelarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmbarcador"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmbarcador.jMenuItemDetalleCerrarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmbarcador"));		
		
		
		
		this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmbarcador"));
		
		
		
		this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmbarcador"));
		
		
		
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmbarcador"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonidEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"idEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empresaEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empresaEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonnombreEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"nombreEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonrucEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"rucEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtondireccionEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"direccionEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtontelefonoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"telefonoEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtoncontactoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"contactoEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtone_mailEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"e_mailEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonfaxEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"faxEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_tipo_via_transporteEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_tipo_via_transporteEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_puertoEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_puertoEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_puertoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_puertoEmbarcadorBusqueda"));
		//jButtonid_empleadoEmbarcador.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmbarcadorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcador.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcador"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_paisEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_paisEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_paisEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_paisEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_ciudadEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_ciudadEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadEmbarcadorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmbarcador"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmbarcador"));
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmbarcador"));
		}
		
		this.jTableDatosEmbarcador.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmbarcador"));
		
		this.jTableDatosEmbarcador.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmbarcador"));
		
		this.jButtonNuevoEmbarcador.addActionListener(new ButtonActionListener(this,"NuevoEmbarcador"));
		
		this.jButtonDuplicarEmbarcador.addActionListener(new ButtonActionListener(this,"DuplicarEmbarcador"));
		
		this.jButtonCopiarEmbarcador.addActionListener(new ButtonActionListener(this,"CopiarEmbarcador"));
		
		this.jButtonVerFormEmbarcador.addActionListener(new ButtonActionListener(this,"VerFormEmbarcador"));
		
		
		this.jButtonNuevoToolBarEmbarcador.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmbarcador"));
			
		this.jButtonDuplicarToolBarEmbarcador.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmbarcador"));
			
		this.jMenuItemNuevoEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmbarcador"));
			
		this.jMenuItemDuplicarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmbarcador"));		
		
		
		this.jButtonNuevoRelacionesEmbarcador.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmbarcador"));
		
		
		this.jButtonNuevoRelacionesToolBarEmbarcador.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmbarcador"));
			
		this.jMenuItemNuevoRelacionesEmbarcador.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmbarcador"));		
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonModificarEmbarcador.addActionListener(new ButtonActionListener(this,"ModificarEmbarcador"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonModificarToolBarEmbarcador.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmbarcador"));
			
			this.jInternalFrameDetalleFormEmbarcador.jMenuItemModificarEmbarcador.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmbarcador"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmbarcador.jButtonActualizarEmbarcador.addActionListener (new ButtonActionListener(this,"ActualizarEmbarcador"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonActualizarToolBarEmbarcador.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmbarcador"));
				
			this.jInternalFrameDetalleFormEmbarcador.jMenuItemActualizarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmbarcador"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonEliminarEmbarcador.addActionListener (new ButtonActionListener(this,"EliminarEmbarcador"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonEliminarToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmbarcador"));
						
			this.jInternalFrameDetalleFormEmbarcador.jMenuItemEliminarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmbarcador"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonCancelarEmbarcador.addActionListener (new ButtonActionListener(this,"CancelarEmbarcador"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonCancelarToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmbarcador"));
			
			this.jInternalFrameDetalleFormEmbarcador.jMenuItemCancelarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmbarcador"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmbarcador"));		
		
		
		this.jButtonCerrarEmbarcador.addActionListener (new ButtonActionListener(this,"CerrarEmbarcador"));
		
		
		this.jButtonCerrarToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmbarcador"));
			
		this.jMenuItemCerrarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmbarcador"));
			
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jMenuItemDetalleCerrarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmbarcador"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosEmbarcador.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmbarcador"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmbarcador"));
		}
		
		this.jButtonCopiarToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmbarcador"));
			
		this.jButtonVerFormToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmbarcador"));
		
		this.jMenuItemGuardarCambiosEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmbarcador"));
			
		this.jMenuItemCopiarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmbarcador"));		
		
		this.jMenuItemVerFormEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmbarcador"));		
		
		
		this.jButtonGuardarCambiosTablaEmbarcador.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmbarcador"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmbarcador"));
			
		this.jMenuItemGuardarCambiosTablaEmbarcador.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmbarcador"));		
		
		
		
		this.jButtonRecargarInformacionEmbarcador.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmbarcador"));
					
		this.jButtonRecargarInformacionToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmbarcador"));
		
		this.jMenuItemRecargarInformacionEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmbarcador"));		
		
		
		
		this.jButtonAnterioresEmbarcador.addActionListener (new ButtonActionListener(this,"AnterioresEmbarcador"));
		
		
		this.jButtonAnterioresToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmbarcador"));
		
		this.jMenuItemAnterioresEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmbarcador"));		
		
		
		this.jButtonSiguientesEmbarcador.addActionListener (new ButtonActionListener(this,"SiguientesEmbarcador"));
		
		
		this.jButtonSiguientesToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmbarcador"));
			
		this.jMenuItemSiguientesEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmbarcador"));
			
		this.jMenuItemAbrirOrderByEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmbarcador"));
			
		this.jMenuItemMostrarOcultarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmbarcador"));
			
		this.jMenuItemDetalleAbrirOrderByEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmbarcador"));
			
		this.jMenuItemDetalleMostarOcultarEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmbarcador"));		
		
		
		this.jButtonNuevoGuardarCambiosEmbarcador.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmbarcador"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmbarcador"));
			
		this.jMenuItemNuevoGuardarCambiosEmbarcador.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmbarcador"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmbarcador.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmbarcador"));

		this.jCheckBoxSeleccionadosEmbarcador.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmbarcador"));
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmbarcador"));
		}
		
		
		this.jComboBoxTiposRelacionesEmbarcador.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmbarcador"));
			
		this.jComboBoxTiposAccionesEmbarcador.addActionListener (new ButtonActionListener(this,"TiposAccionesEmbarcador"));
					
		this.jComboBoxTiposSeleccionarEmbarcador.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmbarcador"));
			
		this.jTextFieldValorCampoGeneralEmbarcador.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmbarcador"));		
		
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonidEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"idEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empresaEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empresaEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonnombreEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"nombreEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonrucEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"rucEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtondireccionEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"direccionEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtontelefonoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"telefonoEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtoncontactoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"contactoEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtone_mailEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"e_mailEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonfaxEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"faxEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_tipo_via_transporteEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_tipo_via_transporteEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_puertoEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_puertoEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_puertoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_puertoEmbarcadorBusqueda"));
		//jButtonid_empleadoEmbarcador.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmbarcadorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcador.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcador"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_paisEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_paisEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_paisEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_paisEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_ciudadEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_ciudadEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadEmbarcadorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorContactoEmbarcador.addActionListener(new ButtonActionListener(this,"BusquedaPorContactoEmbarcador"));

			this.jButtonBusquedaPorNombreEmbarcador.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreEmbarcador"));

			this.jButtonBusquedaPorTelefonoEmbarcador.addActionListener(new ButtonActionListener(this,"BusquedaPorTelefonoEmbarcador"));

			this.jButtonFK_IdEmpleadoEmbarcador.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmbarcador"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcador"));

			this.jButtonFK_IdPuertoEmbarcador.addActionListener(new ButtonActionListener(this,"FK_IdPuertoEmbarcador"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmbarcador!=null) {
				this.jInternalFrameReporteDinamicoEmbarcador.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmbarcador"));
				this.jInternalFrameReporteDinamicoEmbarcador.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmbarcador"));
				this.jInternalFrameReporteDinamicoEmbarcador.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmbarcador"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmbarcador.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmbarcador"));				
			//this.jButtonGenerarReporteDinamicoEmbarcador.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmbarcador"));
			//this.jButtonGenerarExcelReporteDinamicoEmbarcador.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmbarcador"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmbarcador!=null) {
				this.jInternalFrameImportacionEmbarcador.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmbarcador"));
				this.jInternalFrameImportacionEmbarcador.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmbarcador"));
				this.jInternalFrameImportacionEmbarcador.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmbarcador"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmbarcador.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmbarcador"));
			
			this.jButtonAbrirOrderByToolBarEmbarcador.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmbarcador"));			
			
			if(this.jInternalFrameOrderByEmbarcador!=null) {
				this.jInternalFrameOrderByEmbarcador.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmbarcador"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmbarcador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmbarcador.jTabbedPaneRelacionesEmbarcador.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmbarcador"));
		
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
            		closingInternalFrameEmbarcador();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmbarcador.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmbarcador = (JInternalFrameBase)event.getSource();
	            	
	            EmbarcadorBeanSwingJInternalFrame jInternalFrameParent=(EmbarcadorBeanSwingJInternalFrame)jInternalFrameDetalleFormEmbarcador.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmbarcadorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmbarcador.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmbarcadorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmbarcador.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmbarcador.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmbarcadorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmbarcadorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmbarcadorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmbarcador";
		inputMap = this.jButtonNuevoEmbarcador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmbarcador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmbarcadorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmbarcadorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmbarcadorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmbarcadorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmbarcador";
		inputMap = this.jButtonNuevoRelacionesEmbarcador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmbarcador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmbarcadorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmbarcador";
		inputMap = this.jButtonModificarEmbarcador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmbarcador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmbarcadorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmbarcador";
		inputMap = this.jButtonActualizarEmbarcador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmbarcador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmbarcadorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmbarcador";
		inputMap = this.jButtonEliminarEmbarcador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmbarcador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmbarcadorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmbarcador";
		inputMap = this.jButtonCancelarEmbarcador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmbarcador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmbarcadorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmbarcador";
		inputMap = this.jButtonCerrarEmbarcador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmbarcador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmbarcadorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmbarcador";
		inputMap = this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosEmbarcador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmbarcador.jButtonGuardarCambiosEmbarcador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmbarcadorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmbarcador.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmbarcadorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmbarcador.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmbarcadorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmbarcador.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmbarcadorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmbarcador.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmbarcadorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonidEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"idEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empresaEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empresaEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonnombreEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"nombreEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonrucEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"rucEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtondireccionEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"direccionEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtontelefonoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"telefonoEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtoncontactoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"contactoEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtone_mailEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"e_mailEmbarcadorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonfaxEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"faxEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_tipo_via_transporteEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_tipo_via_transporteEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_puertoEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_puertoEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_puertoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_puertoEmbarcadorBusqueda"));
		//jButtonid_empleadoEmbarcador.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmbarcadorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcador.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcador"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_paisEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_paisEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_paisEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_paisEmbarcadorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_ciudadEmbarcadorUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadEmbarcadorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmbarcador.jButtonid_ciudadEmbarcadorBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadEmbarcadorBusqueda"));
		
		
		this.jButtonBusquedaPorContactoEmbarcador.addActionListener(new ButtonActionListener(this,"BusquedaPorContactoEmbarcador"));

		this.jButtonBusquedaPorNombreEmbarcador.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreEmbarcador"));

		this.jButtonBusquedaPorTelefonoEmbarcador.addActionListener(new ButtonActionListener(this,"BusquedaPorTelefonoEmbarcador"));

		this.jButtonFK_IdEmpleadoEmbarcador.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmbarcador"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador.addActionListener(new ButtonActionListener(this,"id_empleadoEmbarcador"));

		this.jButtonFK_IdPuertoEmbarcador.addActionListener(new ButtonActionListener(this,"FK_IdPuertoEmbarcador"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmbarcador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmbarcadorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmbarcadorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmbarcador.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmbarcador(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Embarcador embarcadorAux:this.embarcadorLogic.getEmbarcadors()) {
					embarcadorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Embarcador embarcadorAux:embarcadors) {
					embarcadorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmbarcadorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmbarcador(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Embarcador embarcadorAux:this.embarcadorLogic.getEmbarcadors()) {
						embarcadorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Embarcador embarcadorAux:embarcadors) {
						embarcadorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Embarcador embarcadorAux:this.embarcadorLogic.getEmbarcadors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Embarcador embarcadorAux:embarcadors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmbarcador(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmbarcador.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmbarcador.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmbarcadorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmbarcador(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmbarcador.getSelectedRows();
			
			Embarcador embarcadorLocal=new Embarcador();
			
			//this.seleccionarTodosEmbarcador(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					embarcadorLocal =(Embarcador) this.embarcadorLogic.getEmbarcadors().toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					embarcadorLocal =(Embarcador) this.embarcadors.toArray()[this.jTableDatosEmbarcador.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				embarcadorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Embarcador embarcadorAux:this.embarcadorLogic.getEmbarcadors()) {
						embarcadorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Embarcador embarcadorAux:embarcadors) {
						embarcadorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmbarcador(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmbarcador.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmbarcador.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmbarcador,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmbarcadorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmbarcadorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmbarcadorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmbarcador(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmbarcador.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Embarcador embarcadorAux:this.embarcadorLogic.getEmbarcadors()) {
				
						if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							embarcadorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_RUC)) {
							existe=true;
							embarcadorAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							embarcadorAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							embarcadorAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_CONTACTO)) {
							existe=true;
							embarcadorAux.setcontacto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							embarcadorAux.sete_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_FAX)) {
							existe=true;
							embarcadorAux.setfax(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Embarcador embarcadorAux:embarcadors) {
					
						if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							embarcadorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_RUC)) {
							existe=true;
							embarcadorAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							embarcadorAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							embarcadorAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_CONTACTO)) {
							existe=true;
							embarcadorAux.setcontacto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							embarcadorAux.sete_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_FAX)) {
							existe=true;
							embarcadorAux.setfax(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmbarcador(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmbarcadorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmbarcador(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmbarcador=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmbarcador.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmbarcador) {				
					conSplash=true;//false;										
					
					//this.startProcessEmbarcador(conSplash);
				
					this.generarReporteEmbarcadorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmbarcadorsSeleccionados();
				//this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmbarcadorsSeleccionados(false);
				//this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmbarcadorsSeleccionados(true);
				//this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmbarcador();
				
				this.exportarEmbarcadorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmbarcadors();
				//this.importarEmbarcadors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmbarcador();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmbarcadorsSeleccionados();
				//this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Embarcador", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmbarcador();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmbarcador)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmbarcador(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Embarcador",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.setSelectedIndex(0);					
				}	
			} 			
			else if(EmbarcadorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmbarcador) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmbarcador(conSplash);
					
						//this.actualizarParametrosGeneralEmbarcador();
						
						this.generarReporteProcesoAccionEmbarcadorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmbarcadorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO EmbarcadorES SELECCIONADOS?", "MANTENIMIENTO DE Embarcador", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmbarcador();
				
						this.actualizarParametrosGeneralEmbarcador();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.embarcadorReturnGeneral=embarcadorLogic.procesarAccionEmbarcadorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.embarcadorLogic.getEmbarcadors(),this.embarcadorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmbarcadorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmbarcador();
					
					EmbarcadorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmbarcadorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmbarcador.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmbarcador.jComboBoxTiposAccionesFormularioEmbarcador.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmbarcador(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmbarcadorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmbarcador();
			
			if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();		
			Embarcador embarcador=new Embarcador();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmbarcador(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmbarcador.getSelectedItem();
			
			
			
			
			embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(embarcadorsSeleccionados.size()==1) {
				for(Embarcador embarcadorAux:embarcadorsSeleccionados) {
					embarcador=embarcadorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Pedido Compra")) {
					jButtonPedidoCompraImporActionPerformed(null,rowIndex,true,false,embarcador);
				}
				else if(this.sTipoRelacion.equals("Parametro Compra")) {
					jButtonParametroCompraActionPerformed(null,rowIndex,true,false,embarcador);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmbarcador();
			
      		//this.finishProcessEmbarcador(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmbarcadorReturnGeneral() throws Exception {
		if(this.embarcadorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.embarcadorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.embarcadorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.embarcadorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.embarcadorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.embarcadorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmbarcador(false);
		}
		
		if(this.embarcadorReturnGeneral.getConRetornoLista() || this.embarcadorReturnGeneral.getConRetornoObjeto()) {
			if(this.embarcadorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.embarcadorLogic.setEmbarcadors(this.embarcadorReturnGeneral.getEmbarcadors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.embarcadorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.embarcadorLogic.setEmbarcador(this.embarcadorReturnGeneral.getEmbarcador());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmbarcador(false);
		}
	}
	
	public void actualizarParametrosGeneralEmbarcador() throws Exception {
		
		
	}
	
	public ArrayList<Embarcador> getEmbarcadorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmbarcador) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Embarcador embarcadorAux:embarcadorLogic.getEmbarcadors()) {
					if(embarcadorAux.getIsSelected()) {
						embarcadorsSeleccionados.add(embarcadorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Embarcador embarcadorAux:this.embarcadors) {
					if(embarcadorAux.getIsSelected()) {
						embarcadorsSeleccionados.add(embarcadorAux);				
					}
				}
			}
			
			if(embarcadorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						embarcadorsSeleccionados.addAll(this.embarcadorLogic.getEmbarcadors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						embarcadorsSeleccionados.addAll(this.embarcadors);				
					}
				}
			}
		} else {
			embarcadorsSeleccionados.add(this.embarcador);
		}
		
		return embarcadorsSeleccionados;
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
	
	public void generarReporteEmbarcadorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmbarcadorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmbarcadorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmbarcadorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmbarcadorsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEmbarcadorsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Embarcador",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmbarcadorsSeleccionados() throws Exception {
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();		
		
		embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmbarcadors("Todos",embarcadorsSeleccionados);
		
	}	
	
	public void generarReporteNormalEmbarcadorsSeleccionados() throws Exception {
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();		
		
		embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmbarcadors("Todos",embarcadorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmbarcadorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();
		
		embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmbarcadors("Todos",embarcadorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmbarcadorsSeleccionados() throws Exception {
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmbarcador();
		
		
		embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmbarcador();
		
		
		//this.generarReporteEmbarcadors("Todos",embarcadorsSeleccionados ,embarcadorImplementable,embarcadorImplementableHome);
	}
	
	public void mostrarImportacionEmbarcadors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmbarcador();
		
		this.abrirFrameImportacionEmbarcador();		
		
			
		//this.generarReporteEmbarcadors("Todos",embarcadorsSeleccionados ,embarcadorImplementable,embarcadorImplementableHome);
	}
	
	public void importarEmbarcadors() throws Exception {		
	
	}
	
	public void exportarEmbarcadorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmbarcadorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmbarcadorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmbarcadorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Embarcador",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmbarcadorsSeleccionados() throws Exception {
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();		
		
		embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"embarcador."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmbarcador(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Embarcador embarcadorAux:embarcadorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmbarcador(embarcadorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//embarcadorAux.setsDetalleGeneralEntityReporte(embarcadorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Embarcador",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmbarcador(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_CONTACTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_FAX;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_IDPUERTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmbarcadorConstantesFunciones.LABEL_IDCIUDAD;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmbarcador(Embarcador embarcador,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=embarcador.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getcontacto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.gete_mail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getfax();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.gettipoviatransporte_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getpuerto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=embarcador.getciudad_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmbarcadorsSeleccionados() throws Exception {
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();		
		
		embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"embarcador.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Embarcadors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmbarcador(row);				
				iRow++;
			}				
			
			for(Embarcador embarcadorAux:embarcadorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmbarcador(embarcadorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Embarcador",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmbarcadorsSeleccionados() throws Exception {
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();		
		
		embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"embarcador.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("embarcadors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("embarcador");
			//elementRoot.appendChild(element);
		
			for(Embarcador embarcadorAux:embarcadorsSeleccionados) {
				element = document.createElement("embarcador");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmbarcador(embarcadorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Embarcador",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmbarcador(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_CONTACTO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_FAX);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDPUERTO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(EmbarcadorConstantesFunciones.LABEL_IDCIUDAD);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmbarcador(Embarcador embarcador,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getcontacto());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.gete_mail());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getfax());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.gettipoviatransporte_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getpuerto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(embarcador.getciudad_descripcion());				
	}
	
	public void setFilaDatosExportarXmlEmbarcador(Embarcador embarcador,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmbarcadorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(embarcador.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmbarcadorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(embarcador.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmbarcadorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(embarcador.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(EmbarcadorConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(embarcador.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementruc = document.createElement(EmbarcadorConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(embarcador.getruc().trim()));
		element.appendChild(elementruc);

		Element elementdireccion = document.createElement(EmbarcadorConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(embarcador.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementtelefono = document.createElement(EmbarcadorConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(embarcador.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementcontacto = document.createElement(EmbarcadorConstantesFunciones.CONTACTO);
		elementcontacto.appendChild(document.createTextNode(embarcador.getcontacto().trim()));
		element.appendChild(elementcontacto);

		Element elemente_mail = document.createElement(EmbarcadorConstantesFunciones.EMAIL);
		elemente_mail.appendChild(document.createTextNode(embarcador.gete_mail().trim()));
		element.appendChild(elemente_mail);

		Element elementfax = document.createElement(EmbarcadorConstantesFunciones.FAX);
		elementfax.appendChild(document.createTextNode(embarcador.getfax().trim()));
		element.appendChild(elementfax);

		Element elementtipoviatransporte_descripcion = document.createElement(EmbarcadorConstantesFunciones.IDTIPOVIATRANSPORTE);
		elementtipoviatransporte_descripcion.appendChild(document.createTextNode(embarcador.gettipoviatransporte_descripcion()));
		element.appendChild(elementtipoviatransporte_descripcion);

		Element elementpuerto_descripcion = document.createElement(EmbarcadorConstantesFunciones.IDPUERTO);
		elementpuerto_descripcion.appendChild(document.createTextNode(embarcador.getpuerto_descripcion()));
		element.appendChild(elementpuerto_descripcion);

		Element elementempleado_descripcion = document.createElement(EmbarcadorConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(embarcador.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementpais_descripcion = document.createElement(EmbarcadorConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(embarcador.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(EmbarcadorConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(embarcador.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);
	}
	
	public void generarReporteGroupGenericoEmbarcadorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Embarcador> embarcadorsSeleccionados=new ArrayList<Embarcador>();
		
		embarcadorsSeleccionados=this.getEmbarcadorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmbarcador(embarcadorsSeleccionados);
		
		this.generarReporteEmbarcadors("Todos",embarcadorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmbarcador(ArrayList<Embarcador> embarcadorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Embarcador embarcadorAux:embarcadorsSeleccionados) {
				embarcadorAux.setsDetalleGeneralEntityReporte(embarcadorAux.toString());
			
				if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_RUC)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_CONTACTO)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.getcontacto());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.gete_mail());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_FAX)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.getfax());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.gettipoviatransporte_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_IDPUERTO)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.getpuerto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmbarcadorConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					embarcadorAux.setsDescripcionGeneralEntityReporte1(embarcadorAux.getciudad_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmbarcadorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmbarcador(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmbarcador=true;
				this.isVisibilidadCeldaNuevoRelacionesEmbarcador=true;
				this.isVisibilidadCeldaGuardarCambiosEmbarcador=true;
			}
			
			this.isVisibilidadCeldaModificarEmbarcador=false;
			this.isVisibilidadCeldaActualizarEmbarcador=false;
			this.isVisibilidadCeldaEliminarEmbarcador=false;
			this.isVisibilidadCeldaCancelarEmbarcador=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmbarcador=true;
				} else {
					this.isVisibilidadCeldaGuardarEmbarcador=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmbarcador=false;
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=false;
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=false;
			this.isVisibilidadCeldaModificarEmbarcador=false;
			this.isVisibilidadCeldaActualizarEmbarcador=true;
			this.isVisibilidadCeldaEliminarEmbarcador=false;
			this.isVisibilidadCeldaCancelarEmbarcador=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmbarcador=true;
				} else {
					this.isVisibilidadCeldaGuardarEmbarcador=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmbarcador=false;
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=false;
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=false;
			this.isVisibilidadCeldaModificarEmbarcador=false;
			this.isVisibilidadCeldaActualizarEmbarcador=true;
			this.isVisibilidadCeldaEliminarEmbarcador=true;
			this.isVisibilidadCeldaCancelarEmbarcador=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmbarcador=true;
				} else {
					this.isVisibilidadCeldaGuardarEmbarcador=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmbarcador=false;
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=false;
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=false;
			this.isVisibilidadCeldaModificarEmbarcador=false;
			this.isVisibilidadCeldaActualizarEmbarcador=true;
			this.isVisibilidadCeldaEliminarEmbarcador=false;
			this.isVisibilidadCeldaCancelarEmbarcador=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmbarcador=false;
				} else {
					this.isVisibilidadCeldaGuardarEmbarcador=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmbarcador=true;
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=true;
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=true;
			this.isVisibilidadCeldaModificarEmbarcador=false;
			this.isVisibilidadCeldaActualizarEmbarcador=false;
			this.isVisibilidadCeldaEliminarEmbarcador=false;
			this.isVisibilidadCeldaCancelarEmbarcador=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmbarcador=true;
				} else {
					this.isVisibilidadCeldaGuardarEmbarcador=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmbarcador=false;
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=false;
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=false;
			this.isVisibilidadCeldaActualizarEmbarcador=false;
			this.isVisibilidadCeldaEliminarEmbarcador=false;
			this.isVisibilidadCeldaCancelarEmbarcador=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmbarcador=false;
				} else {
					this.isVisibilidadCeldaGuardarEmbarcador=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmbarcador=false;
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=false;
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=false;
			this.isVisibilidadCeldaModificarEmbarcador=true;
			this.isVisibilidadCeldaActualizarEmbarcador=false;
			this.isVisibilidadCeldaEliminarEmbarcador=false;
			this.isVisibilidadCeldaCancelarEmbarcador=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmbarcador=false;
				} else {
					this.isVisibilidadCeldaGuardarEmbarcador=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmbarcadorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmbarcador=true;
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=true;
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=true;
		} else {
			this.actualizarEstadoPanelsEmbarcador(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmbarcador=false;
			//this.isVisibilidadCeldaVerFormEmbarcador=false;
			this.isVisibilidadCeldaDuplicarEmbarcador=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!embarcadorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=false;
		} else {
			this.isVisibilidadCeldaNuevoEmbarcador=false;
			this.isVisibilidadCeldaGuardarCambiosEmbarcador=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(embarcadorSessionBean.getEsGuardarRelacionado()) {
			if(!embarcadorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmbarcador=false;												
			}
			
			this.jButtonCerrarEmbarcador.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmbarcador=false;
		}
		
		if(!this.permiteMantenimiento(this.embarcador)) {
			this.isVisibilidadCeldaActualizarEmbarcador=false;
			this.isVisibilidadCeldaEliminarEmbarcador=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmbarcador() {
		this.isVisibilidadCeldaNuevoEmbarcador=false;
		this.isVisibilidadCeldaGuardarCambiosEmbarcador=false;
	}
	
	public void actualizarEstadoPanelsEmbarcador(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmbarcador!=null) {
				this.jScrollPanelDatosEdicionEmbarcador.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmbarcador!=null) {
				this.jTabbedPaneBusquedasEmbarcador.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmbarcador!=null) {
				this.jScrollPanelDatosEmbarcador.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmbarcador!=null) {
				this.jPanelPaginacionEmbarcador.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmbarcador!=null) {
				this.jPanelParametrosReportesEmbarcador.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmbarcador!=null) {
				this.jScrollPanelDatosEdicionEmbarcador.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmbarcador!=null) {
				this.jTabbedPaneBusquedasEmbarcador.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmbarcador!=null) {
				this.jScrollPanelDatosEmbarcador.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmbarcador!=null) {
				this.jPanelPaginacionEmbarcador.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmbarcador!=null) {
				this.jPanelParametrosReportesEmbarcador.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmbarcador!=null) {
				this.jScrollPanelDatosEdicionEmbarcador.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmbarcador!=null) {
				this.jTabbedPaneBusquedasEmbarcador.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmbarcador!=null) {
				this.jScrollPanelDatosEmbarcador.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmbarcador!=null) {
				this.jPanelPaginacionEmbarcador.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmbarcador!=null) {
				this.jPanelParametrosReportesEmbarcador.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmbarcador!=null) {
				this.jScrollPanelDatosEdicionEmbarcador.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmbarcador!=null) {
				this.jTabbedPaneBusquedasEmbarcador.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmbarcador!=null) {
				this.jScrollPanelDatosEmbarcador.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmbarcador!=null) {
				this.jPanelPaginacionEmbarcador.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmbarcador!=null) {
				this.jPanelParametrosReportesEmbarcador.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmbarcador!=null) {
				this.jScrollPanelDatosEdicionEmbarcador.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmbarcador!=null) {
				this.jTabbedPaneBusquedasEmbarcador.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmbarcador!=null) {
				this.jScrollPanelDatosEmbarcador.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmbarcador!=null) {
				this.jPanelPaginacionEmbarcador.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmbarcador!=null) {
				this.jPanelParametrosReportesEmbarcador.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmbarcador!=null) {
				this.jScrollPanelDatosEdicionEmbarcador.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmbarcador!=null) {
				this.jTabbedPaneBusquedasEmbarcador.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmbarcador!=null) {
				this.jScrollPanelDatosEmbarcador.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmbarcador!=null) {
				this.jPanelPaginacionEmbarcador.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmbarcador!=null) {
				this.jPanelParametrosReportesEmbarcador.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmbarcador!=null) {
				this.jScrollPanelDatosEdicionEmbarcador.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmbarcador!=null) {
				this.jTabbedPaneBusquedasEmbarcador.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmbarcador!=null) {
				this.jScrollPanelDatosEmbarcador.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmbarcador!=null) {
				this.jPanelPaginacionEmbarcador.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmbarcador!=null) {
				this.jPanelParametrosReportesEmbarcador.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.embarcadorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmbarcador!=null) {
					this.jTabbedPaneBusquedasEmbarcador.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmbarcador!=null) {
				this.jPanelParametrosReportesEmbarcador.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmbarcador!=null) {
				this.jTabbedPaneBusquedasEmbarcador.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmbarcador!=null) {
				this.jPanelParametrosReportesEmbarcador.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorContacto=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorContacto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorContactoEmbarcador);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorNombreEmbarcador);}

			this.isVisibilidadBusquedaPorTelefono=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorTelefonoEmbarcador);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdEmpleadoEmbarcador);}

			this.isVisibilidadFK_IdPuerto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdPuertoEmbarcador);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoViaTransporte(Boolean isParaTipoViaTransporte){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoViaTransporteNegation=!isParaTipoViaTransporte;

			this.isVisibilidadBusquedaPorContacto=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadBusquedaPorContacto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorContactoEmbarcador);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorNombreEmbarcador);}

			this.isVisibilidadBusquedaPorTelefono=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorTelefonoEmbarcador);}

			this.isVisibilidadFK_IdEmpleado=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdEmpleadoEmbarcador);}

			this.isVisibilidadFK_IdPuerto=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdPuertoEmbarcador);}
		}
		
	}

	public void setVisibilidadBusquedasParaPuerto(Boolean isParaPuerto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPuertoNegation=!isParaPuerto;

			this.isVisibilidadBusquedaPorContacto=isParaPuertoNegation;
			if(!this.isVisibilidadBusquedaPorContacto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorContactoEmbarcador);}

			this.isVisibilidadBusquedaPorNombre=isParaPuertoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorNombreEmbarcador);}

			this.isVisibilidadBusquedaPorTelefono=isParaPuertoNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorTelefonoEmbarcador);}

			this.isVisibilidadFK_IdEmpleado=isParaPuertoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdEmpleadoEmbarcador);}

			this.isVisibilidadFK_IdPuerto=isParaPuerto;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdPuertoEmbarcador);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadBusquedaPorContacto=isParaEmpleadoNegation;
			if(!this.isVisibilidadBusquedaPorContacto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorContactoEmbarcador);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpleadoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorNombreEmbarcador);}

			this.isVisibilidadBusquedaPorTelefono=isParaEmpleadoNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorTelefonoEmbarcador);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdEmpleadoEmbarcador);}

			this.isVisibilidadFK_IdPuerto=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdPuertoEmbarcador);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorContacto=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorContacto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorContactoEmbarcador);}

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorNombreEmbarcador);}

			this.isVisibilidadBusquedaPorTelefono=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorTelefonoEmbarcador);}

			this.isVisibilidadFK_IdEmpleado=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdEmpleadoEmbarcador);}

			this.isVisibilidadFK_IdPuerto=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdPuertoEmbarcador);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadBusquedaPorContacto=isParaCiudadNegation;
			if(!this.isVisibilidadBusquedaPorContacto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorContactoEmbarcador);}

			this.isVisibilidadBusquedaPorNombre=isParaCiudadNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorNombreEmbarcador);}

			this.isVisibilidadBusquedaPorTelefono=isParaCiudadNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelBusquedaPorTelefonoEmbarcador);}

			this.isVisibilidadFK_IdEmpleado=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdEmpleadoEmbarcador);}

			this.isVisibilidadFK_IdPuerto=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPuerto) {this.jTabbedPaneBusquedasEmbarcador.remove(jPanelFK_IdPuertoEmbarcador);}
		}
		
	}
	
	

	public String registrarSesionEmbarcadorParaPedidoCompraImpors() throws Exception {
		Boolean isPaginaPopupPedidoCompraImpor=false;

		try {

			if(this.embarcadorSessionBean==null) {
				this.embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			if(this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporSessionBean==null) {
				this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporSessionBean=new PedidoCompraImporSessionBean();
			}

			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporSessionBean.setsPathNavegacionActual(embarcadorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoCompraImpor=this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoCompraImpor(true);
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoCompraImpor(EmbarcadorConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporSessionBean.setisBusquedaDesdeForeignKeySesionEmbarcador(true);
			this.jInternalFrameDetalleFormEmbarcador.pedidocompraimporSessionBean.setlidEmbarcadorActual(this.idEmbarcadorActual);

			embarcadorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmbarcador(true);
			embarcadorSessionBean.setlIdEmbarcadorActualForeignKey(this.idEmbarcadorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEmbarcadorParaParametroCompraes() throws Exception {
		Boolean isPaginaPopupParametroCompra=false;

		try {

			if(this.embarcadorSessionBean==null) {
				this.embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			if(this.jInternalFrameDetalleFormEmbarcador.parametrocompraSessionBean==null) {
				this.jInternalFrameDetalleFormEmbarcador.parametrocompraSessionBean=new ParametroCompraSessionBean();
			}

			this.jInternalFrameDetalleFormEmbarcador.parametrocompraSessionBean.setsPathNavegacionActual(embarcadorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCompra=this.jInternalFrameDetalleFormEmbarcador.parametrocompraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCompra(true);
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCompra(EmbarcadorConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraSessionBean.setisBusquedaDesdeForeignKeySesionEmbarcador(true);
			this.jInternalFrameDetalleFormEmbarcador.parametrocompraSessionBean.setlidEmbarcadorActual(this.idEmbarcadorActual);

			embarcadorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmbarcador(true);
			embarcadorSessionBean.setlIdEmbarcadorActualForeignKey(this.idEmbarcadorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionEmbarcadorParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(embarcadorSessionBean==null) {
				embarcadorSessionBean=new EmbarcadorSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(embarcadorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.embarcadorFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(EmbarcadorConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEmbarcador(true);
			//empleadoSessionBean.setlidEmbarcadorActual(this.idEmbarcadorActual);

			embarcadorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmbarcador(true);
			embarcadorSessionBean.setlIdEmbarcadorActualForeignKey(this.idEmbarcadorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmbarcadorSessionBean embarcadorSessionBean=new EmbarcadorSessionBean();
		
		if(this.embarcadorSessionBean==null) {
			this.embarcadorSessionBean=new EmbarcadorSessionBean();
		}
		
		this.embarcadorSessionBean.setsUltimaBusquedaEmbarcador(this.getsAccionBusqueda());
		this.embarcadorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.embarcadorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorContacto")) {
			embarcadorSessionBean.setcontacto(this.getcontactoBusquedaPorContacto());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			embarcadorSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorTelefono")) {
			embarcadorSessionBean.settelefono(this.gettelefonoBusquedaPorTelefono());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			embarcadorSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			embarcadorSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPuerto")) {
			embarcadorSessionBean.setid_puerto(this.getid_puertoFK_IdPuerto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmbarcadorSessionBean embarcadorSessionBean=new EmbarcadorSessionBean();
		
		if(this.embarcadorSessionBean==null) {
			this.embarcadorSessionBean=new EmbarcadorSessionBean();
		}
		
		if(this.embarcadorSessionBean.getsUltimaBusquedaEmbarcador()!=null&&!this.embarcadorSessionBean.getsUltimaBusquedaEmbarcador().equals("")) {
			this.setsAccionBusqueda(embarcadorSessionBean.getsUltimaBusquedaEmbarcador());
			this.setiNumeroPaginacion(embarcadorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(embarcadorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorContacto")) {
				this.setcontactoBusquedaPorContacto(embarcadorSessionBean.getcontacto());
				embarcadorSessionBean.setcontacto("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(embarcadorSessionBean.getnombre());
				embarcadorSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorTelefono")) {
				this.settelefonoBusquedaPorTelefono(embarcadorSessionBean.gettelefono());
				embarcadorSessionBean.settelefono("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(embarcadorSessionBean.getid_empleado());
				embarcadorSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(embarcadorSessionBean.getid_empresa());
				embarcadorSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPuerto")) {
				this.setid_puertoFK_IdPuerto(embarcadorSessionBean.getid_puerto());
				embarcadorSessionBean.setid_puerto(-1L);
			}
		}
		
		this.embarcadorSessionBean.setsUltimaBusquedaEmbarcador("");
		this.embarcadorSessionBean.setiNumeroPaginacion(EmbarcadorConstantesFunciones.INUMEROPAGINACION);
		this.embarcadorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmbarcador(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmbarcador() {
		this.updateBorderResaltarBusquedasFormularioEmbarcador();
		this.updateVisibilidadBusquedasFormularioEmbarcador();
		this.updateHabilitarBusquedasFormularioEmbarcador();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmbarcador() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmbarcador.getComponents().length>0) {
	

		if(this.embarcadorConstantesFunciones.resaltarBusquedaPorContactoEmbarcador!=null) {
			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorContactoEmbarcador);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
				jPanel.setBorder(this.embarcadorConstantesFunciones.resaltarBusquedaPorContactoEmbarcador);
			}
		}

		if(this.embarcadorConstantesFunciones.resaltarBusquedaPorNombreEmbarcador!=null) {
			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorNombreEmbarcador);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
				jPanel.setBorder(this.embarcadorConstantesFunciones.resaltarBusquedaPorNombreEmbarcador);
			}
		}

		if(this.embarcadorConstantesFunciones.resaltarBusquedaPorTelefonoEmbarcador!=null) {
			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorTelefonoEmbarcador);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
				jPanel.setBorder(this.embarcadorConstantesFunciones.resaltarBusquedaPorTelefonoEmbarcador);
			}
		}

		if(this.embarcadorConstantesFunciones.resaltarFK_IdEmpleadoEmbarcador!=null) {
			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelFK_IdEmpleadoEmbarcador);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
				jPanel.setBorder(this.embarcadorConstantesFunciones.resaltarFK_IdEmpleadoEmbarcador);
			}
		}

		if(this.embarcadorConstantesFunciones.resaltarFK_IdPuertoEmbarcador!=null) {
			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelFK_IdPuertoEmbarcador);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
				jPanel.setBorder(this.embarcadorConstantesFunciones.resaltarFK_IdPuertoEmbarcador);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmbarcador() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmbarcador.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorContactoEmbarcador);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.embarcadorConstantesFunciones.mostrarBusquedaPorContactoEmbarcador);
			if(!this.embarcadorConstantesFunciones.mostrarBusquedaPorContactoEmbarcador && index>-1) {
				this.jTabbedPaneBusquedasEmbarcador.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorNombreEmbarcador);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.embarcadorConstantesFunciones.mostrarBusquedaPorNombreEmbarcador);
			if(!this.embarcadorConstantesFunciones.mostrarBusquedaPorNombreEmbarcador && index>-1) {
				this.jTabbedPaneBusquedasEmbarcador.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorTelefonoEmbarcador);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.embarcadorConstantesFunciones.mostrarBusquedaPorTelefonoEmbarcador);
			if(!this.embarcadorConstantesFunciones.mostrarBusquedaPorTelefonoEmbarcador && index>-1) {
				this.jTabbedPaneBusquedasEmbarcador.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelFK_IdEmpleadoEmbarcador);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.embarcadorConstantesFunciones.mostrarFK_IdEmpleadoEmbarcador);
			if(!this.embarcadorConstantesFunciones.mostrarFK_IdEmpleadoEmbarcador && index>-1) {
				this.jTabbedPaneBusquedasEmbarcador.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelFK_IdPuertoEmbarcador);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.embarcadorConstantesFunciones.mostrarFK_IdPuertoEmbarcador);
			if(!this.embarcadorConstantesFunciones.mostrarFK_IdPuertoEmbarcador && index>-1) {
				this.jTabbedPaneBusquedasEmbarcador.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmbarcador() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmbarcador.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorContactoEmbarcador);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.embarcadorConstantesFunciones.activarBusquedaPorContactoEmbarcador);
				this.jTabbedPaneBusquedasEmbarcador.setEnabledAt(index,this.embarcadorConstantesFunciones.activarBusquedaPorContactoEmbarcador);
			}

			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorNombreEmbarcador);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.embarcadorConstantesFunciones.activarBusquedaPorNombreEmbarcador);
				this.jTabbedPaneBusquedasEmbarcador.setEnabledAt(index,this.embarcadorConstantesFunciones.activarBusquedaPorNombreEmbarcador);
			}

			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorTelefonoEmbarcador);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.embarcadorConstantesFunciones.activarBusquedaPorTelefonoEmbarcador);
				this.jTabbedPaneBusquedasEmbarcador.setEnabledAt(index,this.embarcadorConstantesFunciones.activarBusquedaPorTelefonoEmbarcador);
			}

			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelFK_IdEmpleadoEmbarcador);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.embarcadorConstantesFunciones.activarFK_IdEmpleadoEmbarcador);
				this.jTabbedPaneBusquedasEmbarcador.setEnabledAt(index,this.embarcadorConstantesFunciones.activarFK_IdEmpleadoEmbarcador);
			}

			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelFK_IdPuertoEmbarcador);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.embarcadorConstantesFunciones.activarFK_IdPuertoEmbarcador);
				this.jTabbedPaneBusquedasEmbarcador.setEnabledAt(index,this.embarcadorConstantesFunciones.activarFK_IdPuertoEmbarcador);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmbarcador(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorContacto")) {
			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorContactoEmbarcador);

			this.jTabbedPaneBusquedasEmbarcador.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);

			this.embarcadorConstantesFunciones.setResaltarBusquedaPorContactoEmbarcador(resaltar);

			jPanel.setBorder(this.embarcadorConstantesFunciones.resaltarBusquedaPorContactoEmbarcador);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorNombreEmbarcador);

			this.jTabbedPaneBusquedasEmbarcador.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);

			this.embarcadorConstantesFunciones.setResaltarBusquedaPorNombreEmbarcador(resaltar);

			jPanel.setBorder(this.embarcadorConstantesFunciones.resaltarBusquedaPorNombreEmbarcador);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorTelefono")) {
			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelBusquedaPorTelefonoEmbarcador);

			this.jTabbedPaneBusquedasEmbarcador.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);

			this.embarcadorConstantesFunciones.setResaltarBusquedaPorTelefonoEmbarcador(resaltar);

			jPanel.setBorder(this.embarcadorConstantesFunciones.resaltarBusquedaPorTelefonoEmbarcador);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelFK_IdEmpleadoEmbarcador);

			this.jTabbedPaneBusquedasEmbarcador.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);

			this.embarcadorConstantesFunciones.setResaltarFK_IdEmpleadoEmbarcador(resaltar);

			jPanel.setBorder(this.embarcadorConstantesFunciones.resaltarFK_IdEmpleadoEmbarcador);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPuerto")) {
			index= this.jTabbedPaneBusquedasEmbarcador.indexOfComponent(this.jPanelFK_IdPuertoEmbarcador);

			this.jTabbedPaneBusquedasEmbarcador.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmbarcador.getComponent(index);

			this.embarcadorConstantesFunciones.setResaltarFK_IdPuertoEmbarcador(resaltar);

			jPanel.setBorder(this.embarcadorConstantesFunciones.resaltarFK_IdPuertoEmbarcador);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmbarcador.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmbarcador() throws Exception {

		if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmbarcador();
		this.updateVisibilidadResaltarControlesFormularioEmbarcador();
		this.updateHabilitarResaltarControlesFormularioEmbarcador();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmbarcador() throws Exception {
		if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.embarcadorConstantesFunciones.resaltaridEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltaridEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltarid_empresaEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltarid_empresaEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltarnombreEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jTextFieldnombreEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltarnombreEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltarrucEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jTextFieldrucEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltarrucEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltardireccionEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jTextAreadireccionEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltardireccionEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltartelefonoEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jTextFieldtelefonoEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltartelefonoEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltarcontactoEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jTextAreacontactoEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltarcontactoEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltare_mailEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jTextFielde_mailEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltare_mailEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltarfaxEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jTextFieldfaxEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltarfaxEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltarid_tipo_via_transporteEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltarid_tipo_via_transporteEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltarid_puertoEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltarid_puertoEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltarid_empleadoEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltarid_empleadoEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltarid_paisEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltarid_paisEmbarcador);}
		if(this.embarcadorConstantesFunciones.resaltarid_ciudadEmbarcador!=null && this.jInternalFrameDetalleFormEmbarcador!=null) {this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.setBorder(this.embarcadorConstantesFunciones.resaltarid_ciudadEmbarcador);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmbarcador() throws Exception {		
		if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) {
	
		//this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostraridEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelidEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostraridEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_empresaEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelid_empresaEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_empresaEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jTextFieldnombreEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarnombreEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelnombreEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarnombreEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jTextFieldrucEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarrucEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelrucEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarrucEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jTextAreadireccionEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrardireccionEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPaneldireccionEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrardireccionEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jTextFieldtelefonoEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrartelefonoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPaneltelefonoEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrartelefonoEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jTextAreacontactoEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarcontactoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelcontactoEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarcontactoEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jTextFielde_mailEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrare_mailEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanele_mailEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrare_mailEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jTextFieldfaxEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarfaxEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelfaxEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarfaxEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_tipo_via_transporteEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelid_tipo_via_transporteEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_tipo_via_transporteEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_puertoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelid_puertoEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_puertoEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_empleadoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelid_empleadoEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_empleadoEmbarcador);
			this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_empleadoEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_paisEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelid_paisEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_paisEmbarcador);
		//this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_ciudadEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jPanelid_ciudadEmbarcador.setVisible(this.embarcadorConstantesFunciones.mostrarid_ciudadEmbarcador);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmbarcador() throws Exception {
		if(this.jInternalFrameDetalleFormEmbarcador==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmbarcador!=null) {
	
		this.jInternalFrameDetalleFormEmbarcador.jLabelidEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activaridEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empresaEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarid_empresaEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextFieldnombreEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarnombreEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextFieldrucEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarrucEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextAreadireccionEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activardireccionEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextFieldtelefonoEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activartelefonoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextAreacontactoEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarcontactoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextFielde_mailEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activare_mailEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jTextFieldfaxEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarfaxEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_tipo_via_transporteEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarid_tipo_via_transporteEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_puertoEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarid_puertoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_empleadoEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarid_empleadoEmbarcador);
			this.jInternalFrameDetalleFormEmbarcador.jButtonid_empleadoEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarid_empleadoEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_paisEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarid_paisEmbarcador);
		this.jInternalFrameDetalleFormEmbarcador.jComboBoxid_ciudadEmbarcador.setEnabled(this.embarcadorConstantesFunciones.activarid_ciudadEmbarcador);
		}
	}
	
		
}